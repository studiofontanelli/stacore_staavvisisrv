package it.csi.stacore.staavvisisrv.business.cache;



import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.csi.stacore.staavvisisrv.util.Constants;
import it.csi.stacore.staavvisisrv.util.Tracer;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;
import net.sf.ehcache.ObjectExistsException;
import net.sf.ehcache.config.CacheConfiguration;

public class CacheService {

	private static final String LOGGER_PREFIX = Constants.APPLICATION_CODE + ".business";
	protected final static Logger LOG = LoggerFactory.getLogger(LOGGER_PREFIX);
	

	public final static String CACHE_ANAGRAFICHE =   "cache-anagrafiche-stacore-staavvisisrv";


	private CacheManager cacheManager = null;

	private boolean useCache = true ;

	private boolean instrumentation = true ;

	public boolean isUseCache() {
		return useCache;
	}

	public void setUseCache(boolean useCache) {
		this.useCache = useCache;
	}


	public void create() throws Exception{
		String method = "create";


		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");
		String file = "/ehcache/ehcache.xml";

		Tracer.debug(LOG, getClass().getName(), method, "isUseCache= " + isUseCache());
		Tracer.debug(LOG, getClass().getName(), method, "loading file= " + file);

		try{
			InputStream is = this.getClass().getResourceAsStream(file);
			cacheManager = CacheManager.create(is);
			String [] cacheName = cacheManager.getCacheNames();

			if(LOG.isDebugEnabled()){
				if(cacheName != null){
					Tracer.debug(LOG, getClass().getName(), method, "loaded " + cacheName.length + " cache");
				}
			}
			for(String nameString : cacheName){
				cacheConfiguration(nameString);
			}
		}
		catch(Exception e){
			Tracer.error(LOG, getClass().getName(), method, "Errore in fase di creazione della cache " + e);
		}
		finally{
			Tracer.debug(LOG, getClass().getName(), method, "END");
		}

	}


	private void cacheConfiguration(String name){
		String method = "cacheConfiguration";
		Cache cache  = cacheManager.getCache(name);
		CacheConfiguration config = cache.getCacheConfiguration();
		Tracer.info(LOG, getClass().getName(), method, "[" + name + "]");
		Tracer.info(LOG, getClass().getName(), method, "java.io.tmpdir   = " + System.getProperty("java.io.tmpdir"));
		Tracer.info(LOG, getClass().getName(), method, "timeToIdleSeconds   = " + config.getTimeToIdleSeconds());
		Tracer.info(LOG, getClass().getName(), method, "timeToLiveSeconds   = " + config.getTimeToLiveSeconds());
		Tracer.info(LOG, getClass().getName(), method, "maxElementsInMemory = " + config.getMaxElementsInMemory());
		Tracer.info(LOG, getClass().getName(), method, "maxElementsOnDisk   = " + config.getMaxElementsOnDisk());
		Tracer.info(LOG, getClass().getName(), method, "isEternal           = " + config.isEternal());
		Tracer.info(LOG, getClass().getName(), method, "isFrozen            = " + config.isFrozen());

	}


	public Ehcache getEHcache(){
		return getEHcache(CACHE_ANAGRAFICHE);
	}


	public void getLiveCacheStatisticsInfo() {
		final String method = "getLiveCacheStatisticsInfo";
		try {
			/*
			if(instrumentation) {
				Tracer.debug(LOG, getClass().getName(), method, "hitCount         =" + getEHcache().getLiveCacheStatistics().getCacheHitCount());
				Tracer.debug(LOG, getClass().getName(), method, "InMemoryHitCount =" + getEHcache().getLiveCacheStatistics().getInMemoryHitCount());
				Tracer.debug(LOG, getClass().getName(), method, "InMemorySize     =" + getEHcache().getLiveCacheStatistics().getInMemorySize());
				Tracer.debug(LOG, getClass().getName(), method, "OnDiskHitCount   =" + getEHcache().getLiveCacheStatistics().getOnDiskHitCount());
				Tracer.debug(LOG, getClass().getName(), method, "OnDiskSize       =" + getEHcache().getLiveCacheStatistics().getOnDiskSize());
			}
			*/
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception in getting cache stats");
		}
	}




	public void addElementInCache(String cacheName, String key, Object obj) /*throws Exception*/{
		String method = "addElementInCache";
		try {
			if(isUseCache()){
				if(LOG.isDebugEnabled()){
					Tracer.debug(LOG, getClass().getName(), method, "adding " + key + " in cache " + cacheName);
				}
				Element element = new Element(key, obj);
				getEHcache(cacheName).put(element);

				//getLiveCacheStatisticsInfo();
			}
			else{
				Tracer.info(LOG, getClass().getName(), method, "cache disabled: no element added in cache " + cacheName);
			}
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "error in adding element in cache " + e);
		}
	}

	public void removeElementInCache(String cacheName, String key){
		String method = "removeElementInCache";
		if(isUseCache()){
			if(LOG.isDebugEnabled()){
				Tracer.debug(LOG, getClass().getName(), method, "removing " + key + " in cache " + cacheName);
			}
			getEHcache(cacheName).remove(key);
		}
		else{
			Tracer.info(LOG, getClass().getName(), method, "cache disabled: no element added in cache " + cacheName);
		}
	}


	public Element getElementFromCache(String cacheName, String key){
		String method = "isElementInCache";
		if(LOG.isDebugEnabled()){
			Tracer.debug(LOG, getClass().getName(), method, "cache enabled=  " + isUseCache());
			Tracer.debug(LOG, getClass().getName(), method, "getting " + key + " form cache " + cacheName);
		}
		return (isUseCache())?getEHcache(cacheName).get(key) : null;

	}

	public Ehcache getEHcache(String cacheName){
		String method = "getEHcache";
		Tracer.debug(LOG, getClass().getName(), method, "cacheName= " + cacheName);

		if(cacheManager == null){
			Tracer.debug(LOG, getClass().getName(), method, "creating cache manager");
			try{
				create();
				if(!cacheManager.cacheExists(cacheName)){
					Tracer.warn(LOG, getClass().getName(), method, "cache " + cacheName + " not present: adding default cache");
					cacheManager.addCache(cacheName);
					cacheConfiguration(cacheName);
				}
				else{
					Tracer.debug(LOG, getClass().getName(), method, "cache " + cacheName + " present");
				}
			}catch(ObjectExistsException e){
				Tracer.warn(LOG, getClass().getName(), method, "Exception in create cache manager " + e);
			}
			catch(Exception e){
				Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			}
		}
		else{
			if(!cacheManager.cacheExists(cacheName)){
				Tracer.warn(LOG, getClass().getName(), method, "cache " + cacheName + " not present: adding default cache");
				cacheManager.addCache(cacheName);
				cacheConfiguration(cacheName);
			}
			else{
				Tracer.debug(LOG, getClass().getName(), method, "cache " + cacheName + " present");
			}
		}
		return cacheManager.getEhcache(cacheName);
	}

}

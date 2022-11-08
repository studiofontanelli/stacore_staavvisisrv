package it.csi.stacore.staavvisisrv.business.helper.impl;

import java.util.List;
import java.util.NoSuchElementException;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.csi.stacore.staavvisisrv.api.dto.TipoVeicoloVO;
import it.csi.stacore.staavvisisrv.business.adapter.RicercaAvvisoAccertamentoAdapter;
import it.csi.stacore.staavvisisrv.business.adapter.TipoVeicoloCoreVOAdapter;
import it.csi.stacore.staavvisisrv.business.cache.CacheService;
import it.csi.stacore.staavvisisrv.business.exception.HelperException;
import it.csi.stacore.staavvisisrv.business.exception.NoDataFoundException;
import it.csi.stacore.staavvisisrv.business.exception.ValidationException;
import it.csi.stacore.staavvisisrv.business.helper.DecodificheHelper;
import it.csi.stacore.staavvisisrv.integration.service.StacoresrvService;
import it.csi.stacore.staavvisisrv.util.Tracer;
import net.sf.ehcache.Element;

@Service
public class DecodificheHelperImpl extends CacheService implements DecodificheHelper {


	@Autowired
	RicercaAvvisoAccertamentoAdapter ricercaAvvisoAccertamentoAdapter;


	@Autowired
	private StacoresrvService stacoresrvService;

	@Autowired
	private TipoVeicoloCoreVOAdapter tipoVeicoloVOAdapter;

	@PostConstruct
	public void init() {
		final String method = "init";
		try {
			Tracer.debug(LOG, getClass().getName(), method, "called");
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception "  +e);
		}
		finally {
			//TO DO
		}
	}


	@Override
	public List<TipoVeicoloVO> findTipiVeicolo() throws HelperException, NoDataFoundException, ValidationException {
		final String method = "findTipiVeicolo";
		final String ID_EHC =  createCacheKey(getClass(), method);
		
		List<TipoVeicoloVO> result = null;
		
		try {
			
			
			if(isUseCache()) {
				Element element = getElementFromCache(CACHE_ANAGRAFICHE, ID_EHC);
				if(element != null){
					Tracer.debug(LOG, getClass().getName(), method, "USE CACHE " + ID_EHC);
					result = (List<TipoVeicoloVO>) element.getObjectValue();
				}
				else {
					result = tipoVeicoloVOAdapter.convertFrom(stacoresrvService.getTipiVeicolo());
					if(result != null)
						addElementInCache(CACHE_ANAGRAFICHE, ID_EHC, result);
				}
			}
			else {
				result = tipoVeicoloVOAdapter.convertFrom(stacoresrvService.getTipiVeicolo());
			}
			return result;
		}catch (Exception e) {			
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);			
			throw new HelperException(e.getMessage());
		}finally {

		}

	}


	@Override
	public TipoVeicoloVO findTipiVeicoloByCodice(String codice) throws HelperException, NoDataFoundException {
		final String method = "findTipiVeicoloByCodice";
		try {

			final String ID_EHC = createCacheKey(getClass(), method, codice);
			
			
			Tracer.debug(LOG, getClass().getName(), method, "ID_EHC= " + ID_EHC);	
			
			TipoVeicoloVO vo = null;
			List<it.csi.stacore.stacoresrv.api.dto.TipoVeicoloVO> ll =  stacoresrvService.getTipiVeicolo();

			if(ll != null) {
				it.csi.stacore.stacoresrv.api.dto.TipoVeicoloVO tipoVeicoloCore= ll.stream()
						.filter(param -> StringUtils.equalsIgnoreCase(param.getDecodifica().getCodice(), codice))
						.findFirst().get();

				vo = tipoVeicoloVOAdapter.convertFrom(tipoVeicoloCore);
			}	
			
			return vo;

		}catch(NoSuchElementException e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);			
			throw new NoDataFoundException("Nessu dato trovato");
		}
		catch (Exception e) {			
		Tracer.error(LOG, getClass().getName(), method, "Exception " + e);			
		throw new HelperException(e.getMessage());
	}finally {

	}
}







}

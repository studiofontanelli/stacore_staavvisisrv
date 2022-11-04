package it.csi.stacore.staavvisisrv.api.application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.csi.stacore.staavvisisrv.util.Constants;
import it.csi.stacore.staavvisisrv.util.Tracer;



@ApplicationPath("/api")
public class StacoresrvApplication extends Application {

	protected final static Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_CODE);

	private Set<Object> singletons = new HashSet<>();
	private Set<Class<?>> classes = new HashSet<>();


	private List<Class> getSwaggerList(){
		List<Class> l = new ArrayList<Class>();
		l.add(io.swagger.jaxrs.listing.ApiListingResource.class);
		l.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
		return l;

	}
	
	public StacoresrvApplication() {
		final String method = "CONSTRUCTOR";
		try {			
			Tracer.info(LOG, getClass().getName(), method, "Startup rest services done correctly!");
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception: " + e);
			throw new RuntimeException("Errore in fase di startup configurazione servizi rest", e);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.ws.rs.core.Application#getClasses()
	 */
	@Override
	public Set<Class<?>> getClasses() {
		return this.classes;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.ws.rs.core.Application#getSingletons()
	 */
	@Override
	public Set<Object> getSingletons() {
		return this.singletons;
	}
}

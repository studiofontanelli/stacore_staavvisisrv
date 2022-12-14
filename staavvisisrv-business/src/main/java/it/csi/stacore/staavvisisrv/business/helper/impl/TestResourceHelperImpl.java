package it.csi.stacore.staavvisisrv.business.helper.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.csi.stacore.staavvisisrv.business.exception.HelperException;
import it.csi.stacore.staavvisisrv.business.helper.TestResourceHelper;
import it.csi.stacore.staavvisisrv.integration.service.StacoresrvService;
import it.csi.stacore.staavvisisrv.util.Tracer;

@Service("testResourceHelper")
public class TestResourceHelperImpl extends CommonHelperImpl implements TestResourceHelper {
	
	@Autowired
	private StacoresrvService stacoresrvService;
	
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
			
		}
		
	}

	@Override
	public boolean testResources() throws HelperException {
		final String method = "testResources";
		try {
			Tracer.debug(LOG, getClass().getName(), method, "called");
			
			return true && stacoresrvService.testResource();
			
		} catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new HelperException(e.getMessage());
		}
		finally {
			
		}
		
	}

	

}

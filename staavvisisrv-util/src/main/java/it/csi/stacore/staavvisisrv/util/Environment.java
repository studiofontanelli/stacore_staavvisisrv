package it.csi.stacore.staavvisisrv.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Environment {


	
	
	@Value("${stacoresrv_service_endpoint_url}")
	private String stacoresrvEndpoint;

	public String getStacoresrvEndpoint() {
		return stacoresrvEndpoint;
	}

	public void setStacoresrvEndpoint(String stacoresrvEndpoint) {
		this.stacoresrvEndpoint = stacoresrvEndpoint;
	}

	
	





}

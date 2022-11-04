package it.csi.stacore.staavvisisrv.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Environment {


	//@Value("${gms_service_endpoint_url}")
	private String gmsEndpoint;

	public String getGmsEndpoint() {
		return gmsEndpoint;
	}

	public void setGmsEndpoint(String gmsEndpoint) {
		this.gmsEndpoint = gmsEndpoint;
	}

	





}

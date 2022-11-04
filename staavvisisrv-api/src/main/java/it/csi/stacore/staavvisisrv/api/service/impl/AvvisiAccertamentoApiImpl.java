package it.csi.stacore.staavvisisrv.api.service.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.stacore.staavvisisrv.api.dto.RicercaAvvisoAccertamentoVO;
import it.csi.stacore.staavvisisrv.api.service.AvvisiAccertamentoApi;
import it.csi.stacore.staavvisisrv.business.helper.AvvisiAccertamentoHelper;

@Component("accertamentoApi")
public class AvvisiAccertamentoApiImpl implements AvvisiAccertamentoApi {
	
	
	@Autowired
	AvvisiAccertamentoHelper accertamentoHelper;
	
	
	@Override
	public Response findAvvisiAccertamento(RicercaAvvisoAccertamentoVO searchParams, SecurityContext securityContext, HttpHeaders httpHeaders) {		
		return Response.ok().entity(accertamentoHelper.findAvvisiAccertamento(searchParams)).build();
	}
}

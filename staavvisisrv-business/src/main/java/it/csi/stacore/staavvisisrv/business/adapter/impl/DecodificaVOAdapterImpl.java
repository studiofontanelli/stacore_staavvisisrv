package it.csi.stacore.staavvisisrv.business.adapter.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.staavvisisrv.api.dto.DecodificaVO;
import it.csi.stacore.staavvisisrv.business.adapter.DecodificaVOAdapter;
import it.csi.stacore.staavvisisrv.util.adapter.CommonDtoAdapter;

@Component
public class DecodificaVOAdapterImpl extends CommonDtoAdapter<DecodificaVO,it.csi.stacore.stacoresrv.api.dto.DecodificaVO> implements DecodificaVOAdapter {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Override
	public ApplicationContext getApplicationContext() {		
		return applicationContext;
	}	 
	
	

}

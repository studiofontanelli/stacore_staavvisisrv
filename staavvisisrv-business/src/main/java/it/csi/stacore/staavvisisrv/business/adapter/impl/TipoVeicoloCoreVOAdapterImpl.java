package it.csi.stacore.staavvisisrv.business.adapter.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.staavvisisrv.api.dto.TipoVeicoloVO;
import it.csi.stacore.staavvisisrv.business.adapter.TipoVeicoloCoreVOAdapter;
import it.csi.stacore.staavvisisrv.util.adapter.CommonDtoAdapter;

@Component
public class TipoVeicoloCoreVOAdapterImpl extends CommonDtoAdapter<TipoVeicoloVO,it.csi.stacore.stacoresrv.api.dto.TipoVeicoloVO> implements TipoVeicoloCoreVOAdapter {
	
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

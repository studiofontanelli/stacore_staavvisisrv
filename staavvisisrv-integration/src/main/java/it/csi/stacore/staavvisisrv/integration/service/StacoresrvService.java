package it.csi.stacore.staavvisisrv.integration.service;

import java.util.List;

import it.csi.stacore.staavvisisrv.integration.exception.IntegrationException;
import it.csi.stacore.stacoresrv.api.dto.TipoVeicoloVO;

public interface StacoresrvService {
	
	

	public boolean testResource() throws IntegrationException;
	
	/**
	 * recupera i tipi veicolo
	 * @return
	 * @throws IntegrationException
	 */
	public List<TipoVeicoloVO> getTipiVeicolo()throws IntegrationException;
	
}

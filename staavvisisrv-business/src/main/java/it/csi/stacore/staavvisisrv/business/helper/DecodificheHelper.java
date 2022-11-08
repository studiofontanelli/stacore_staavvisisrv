package it.csi.stacore.staavvisisrv.business.helper;

import java.util.List;

import it.csi.stacore.staavvisisrv.api.dto.TipoVeicoloVO;
import it.csi.stacore.staavvisisrv.business.exception.HelperException;
import it.csi.stacore.staavvisisrv.business.exception.NoDataFoundException;

public interface DecodificheHelper {
	
	public List<TipoVeicoloVO> findTipiVeicolo() throws HelperException, NoDataFoundException;
	
	
	public TipoVeicoloVO findTipiVeicoloByCodice(String codice) throws HelperException, NoDataFoundException;

}

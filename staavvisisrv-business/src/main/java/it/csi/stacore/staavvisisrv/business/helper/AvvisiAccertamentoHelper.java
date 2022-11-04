package it.csi.stacore.staavvisisrv.business.helper;

import java.util.List;

import it.csi.stacore.staavvisisrv.api.dto.AvvisoAccertamentoVO;
import it.csi.stacore.staavvisisrv.api.dto.RicercaAvvisoAccertamentoVO;
import it.csi.stacore.staavvisisrv.business.exception.HelperException;
import it.csi.stacore.staavvisisrv.business.exception.NoDataFoundException;
import it.csi.stacore.staavvisisrv.business.exception.ValidationException;

public interface AvvisiAccertamentoHelper {
	
	public List<AvvisoAccertamentoVO> findAvvisiAccertamento(RicercaAvvisoAccertamentoVO searchParams) throws HelperException, NoDataFoundException, ValidationException;

}

package it.csi.stacore.staavvisisrv.integration.dao;

import java.util.List;

import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.AvvisoAccertamento;
import it.csi.stacore.staavvisisrv.integration.dao.oracle.select.avvisoaccertamento.ricerca.RicercaAvvisoAccertamento;
import it.csi.stacore.staavvisisrv.integration.exception.ResourceAccessException;


public interface AvvisoAccertamentoDAO {

	List<AvvisoAccertamento> findAvvisiAccertamento(RicercaAvvisoAccertamento searchParams) throws ResourceAccessException;
}

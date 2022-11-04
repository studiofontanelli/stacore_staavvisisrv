package it.csi.stacore.staavvisisrv.integration.dao.oracle;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.AvvisoAccertamento;
import it.csi.stacore.staavvisisrv.integration.dao.AbstractDAO;
import it.csi.stacore.staavvisisrv.integration.dao.AvvisoAccertamentoDAO;
import it.csi.stacore.staavvisisrv.integration.dao.oracle.select.avvisoaccertamento.SelectAvvisoAccertamento;
import it.csi.stacore.staavvisisrv.integration.dao.oracle.select.avvisoaccertamento.ricerca.RicercaAvvisoAccertamento;
import it.csi.stacore.staavvisisrv.integration.exception.ResourceAccessException;
import it.csi.stacore.staavvisisrv.util.Tracer;
import it.csi.stacore.staavvisisrv.util.XmlSerializer;

@Repository
public class OracleAvvisoAccertamentoDAO extends AbstractDAO implements AvvisoAccertamentoDAO {

	@Override
	public List<AvvisoAccertamento> findAvvisiAccertamento(RicercaAvvisoAccertamento searchParams) throws ResourceAccessException 
	{
		final String method = "findAvvisiAccertamento";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");
		List<AvvisoAccertamento> risultato = new ArrayList<>();
		
		Connection connection = null;
		try {
			connection = getConnection();

			SelectAvvisoAccertamento select = new SelectAvvisoAccertamento(searchParams);
			risultato =  select.executeMultipla(connection);
			
			Tracer.debug(LOG, getClass().getName(), method, "risultato\n " + XmlSerializer.objectToXml(risultato));
			
			return risultato;
		}catch (Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new ResourceAccessException(e.getMessage(), e);
		}
		finally{
			releaseConnection(connection);
			Tracer.debug(LOG, getClass().getName(), method, "END");
		}
	}

}

package it.csi.stacore.staavvisisrv.integration.bo.credito;

import java.io.Serializable;

import it.csi.stacore.staavvisisrv.integration.bo.common.Decodifica;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdDecodifica;
import it.csi.stacore.staavvisisrv.integration.util.EqualsUtil;

public class TipoCredito extends Decodifica implements Serializable  {
	
	public static final TipoCredito TIPO_CREDITO_1 = new TipoCredito(new IdDecodifica(1), "1", "TIPO 1");
	public static final TipoCredito TIPO_CREDITO_2 = new TipoCredito(new IdDecodifica(2), "2", "TIPO 2");

	public static final String CODICE_TIPO_CREDITO_1 = "1";
	public static final String CODICE_TIPO_CREDITO_2 = "2";

	private static final long serialVersionUID = -8863948928955089611L;

	public TipoCredito(IdDecodifica idDecodifica, String codice, String descrizione) {
		super(idDecodifica, codice, descrizione);
	}

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof TipoCredito) {
			TipoCredito altro = (TipoCredito) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}

}

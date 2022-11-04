package it.csi.stacore.staavvisisrv.integration.bo.credito;

import it.csi.stacore.staavvisisrv.integration.bo.common.Decodifica;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdDecodifica;
import it.csi.stacore.staavvisisrv.integration.util.EqualsUtil;

public class TipoErogazione extends Decodifica {
	
	private static final long serialVersionUID = 8986959706560447855L;

	public static final TipoErogazione TIPO_EROGAZIONE_PAGAMENTO = new TipoErogazione(new IdDecodifica(1), "1", "Pagamento");
	public static final TipoErogazione TIPO_EROGAZIONE_AVV_SCADENZA = new TipoErogazione(new IdDecodifica(2), "2", "Avviso scadenza");
	public static final TipoErogazione TIPO_EROGAZIONE_AVV_ACCERTAMENTO = new TipoErogazione(new IdDecodifica(3), "3", "Avviso accertamento");

	public TipoErogazione(IdDecodifica id, String codice, String descrizione) {
		super(id, codice, descrizione);
	}

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof TipoErogazione) {
			TipoErogazione altro = (TipoErogazione) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}

}

package it.csi.stacore.staavvisisrv.integration.bo.common;

import it.csi.stacore.staavvisisrv.integration.bo.id.IdDecodifica;
import it.csi.stacore.staavvisisrv.integration.util.EqualsUtil;

public class Divisa extends Decodifica {
	//~ Static fields/initializers ===============================================

	/**
	 *
	 */
	private static final long serialVersionUID = -3702202113135720631L;

	/**
	 * DOCUMENT ME!
	 */
	public static final Divisa EURO = new Divisa(new IdDecodifica(1), "EUR", "Euro");

	/**
	 * DOCUMENT ME!
	 */
	public static final Divisa LIRA = new Divisa(new IdDecodifica(2), "LIT", "Lire");

	//~ Constructors =============================================================

	/**
	 * Creates a new Divisa object.
	 *
	 * @param idDecodifica DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 * @param descrizione DOCUMENT ME!
	 */
	public Divisa(IdDecodifica idDecodifica, String codice, String descrizione) {
		super(idDecodifica, codice, descrizione);
	}

	//~ Methods ==================================================================

	/**
	 * DOCUMENT ME!
	 *
	 * @param object DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof Divisa) {
			Divisa altro = (Divisa) object;
			equals = EqualsUtil.objectEquals(getCodice(), altro.getCodice());
		}

		return equals;
	}

}

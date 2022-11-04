package it.csi.stacore.staavvisisrv.integration.bo.common;

import java.io.Serializable;
import java.math.BigDecimal;

import it.csi.stacore.staavvisisrv.integration.bo.AbstractBO;
import it.csi.stacore.staavvisisrv.integration.util.EqualsUtil;

public class Valuta extends AbstractBO implements Serializable {
	//~ Static fields/initializers ===============================================

	/**
	 * DOCUMENT ME!
	 */

	public static final Valuta ZERO_EURO = new Valuta(Divisa.EURO, new BigDecimal("0"));

	static final long serialVersionUID = -2661529122139252680L;

	/**
	 * DOCUMENT ME!
	 */
	public static final int IMPORTO_LENGTH = 10;

	//~ Instance fields ==========================================================

	/**
	 * @uml.property  name="importo"
	 */
	private BigDecimal importo = null;

	/**
	 * @uml.property  name="divisa"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Divisa divisa = null;

	//~ Constructors =============================================================

	/**
	 * Creates a new Valuta object.
	 */
	public Valuta() {
		this.importo = new BigDecimal(0);
		this.divisa = Divisa.EURO;
	}

	/**
	 * Creates a new Valuta object.
	 *
	 * @param divisa DOCUMENT ME!
	 * @param importo DOCUMENT ME!
	 */
	public Valuta(Divisa divisa, BigDecimal importo) {
		this.divisa = divisa;
		// FIXME 10/11/2005 valutare se abilitare/aggoirnare il controllo
		//    if(importo != null) {
		//      verifyLength(importo.toString(), IMPORTO_LENGTH, INVALID_IMPORTO);
		//      this.importo = importo;
		//    }
		this.importo = importo;
	}

	//~ Methods ==================================================================

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="divisa"
	 */
	public Divisa getDivisa() {
		return divisa;
	}

	/**
	 * DOCUMENT ME!
	 * @return  DOCUMENT ME!
	 * @uml.property  name="importo"
	 */
	public BigDecimal getImporto() {
		return importo;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param object DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof Valuta) {
			Valuta altro = (Valuta) object;
			equals = EqualsUtil.objectEquals(getDivisa(), altro.getDivisa()) && EqualsUtil.objectEquals(getImporto(), altro.getImporto());
		}

		return equals;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param valuta DOCUMENT ME!
	 */
	public void add(Valuta valuta) {
		if (valuta != null) {
			if (getDivisa().equals(valuta.getDivisa())) {
				importo = importo.add(valuta.getImporto());
			} else {
				throw new IllegalArgumentException("Conversion between " + getDivisa().getCodice() + " and " + valuta.getDivisa().getCodice()
						+ " currently not supported.");
			}
		}
	}

	public void subtract(Valuta valuta) {
		if (valuta != null) {
			if (getDivisa().equals(valuta.getDivisa())) {
				importo = importo.subtract(valuta.getImporto());
			} else {
				throw new IllegalArgumentException("Conversion between " + getDivisa().getCodice() + " and " + valuta.getDivisa().getCodice()
						+ " currently not supported.");
			}
		}
	}

}

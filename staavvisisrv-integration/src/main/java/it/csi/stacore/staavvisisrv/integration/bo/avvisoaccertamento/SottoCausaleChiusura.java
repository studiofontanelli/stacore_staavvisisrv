package it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento;

import java.io.Serializable;

import it.csi.stacore.staavvisisrv.integration.bo.id.IdCausaleChiusura;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdSottoCausaleChiusura;
import it.csi.stacore.staavvisisrv.integration.util.EqualsUtil;

public class SottoCausaleChiusura implements Serializable {
	
	static final long serialVersionUID = 889959897946401369L;

	/**
	 * @uml.property  name="idSottoCausaleChiusura"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private IdSottoCausaleChiusura idSottoCausaleChiusura = null;

	/**
	 * @uml.property  name="idCausaleChiusura"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private IdCausaleChiusura idCausaleChiusura = null;

	/**
	 * @uml.property  name="descrizione"
	 */
	private String descrizione = null;

	//~ Constructors
	// =============================================================

	public SottoCausaleChiusura(
			IdSottoCausaleChiusura idSottoCausaleChiusura,
			IdCausaleChiusura idCausaleChiusura, String descrizione) {
		this.idSottoCausaleChiusura = idSottoCausaleChiusura;
		this.idCausaleChiusura = idCausaleChiusura;
		this.descrizione = descrizione;
	}

	//~ Methods
	// ==================================================================

	/**
	 * @return  Returns the descrizione.
	 * @uml.property  name="descrizione"
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione  The descrizione to set.
	 * @uml.property  name="descrizione"
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


    /**
		 * @return  Returns the idCausaleChiusura.
		 * @uml.property  name="idCausaleChiusura"
		 */
    public IdCausaleChiusura getIdCausaleChiusura() {
        return idCausaleChiusura;
    }
    /**
		 * @param idCausaleChiusura  The idCausaleChiusura to set.
		 * @uml.property  name="idCausaleChiusura"
		 */
    public void setIdCausaleChiusura(IdCausaleChiusura idCausaleChiusura) {
        this.idCausaleChiusura = idCausaleChiusura;
    }
    /**
		 * @return  Returns the idSottoCausaleChiusura.
		 * @uml.property  name="idSottoCausaleChiusura"
		 */
    public IdSottoCausaleChiusura getIdSottoCausaleChiusura() {
        return idSottoCausaleChiusura;
    }
    /**
		 * @param idSottoCausaleChiusura  The idSottoCausaleChiusura to set.
		 * @uml.property  name="idSottoCausaleChiusura"
		 */
    public void setIdSottoCausaleChiusura(IdSottoCausaleChiusura idSottoCausaleChiusura) {
        this.idSottoCausaleChiusura = idSottoCausaleChiusura;
    }
	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof SottoCausaleChiusura) {
			SottoCausaleChiusura altro = (SottoCausaleChiusura) object;
			equals = EqualsUtil.objectEquals(getIdSottoCausaleChiusura(), altro.getIdSottoCausaleChiusura()) &&
					 EqualsUtil.objectEquals(getIdCausaleChiusura(), altro.getIdCausaleChiusura()) && 
					 EqualsUtil.objectEquals(getDescrizione(), altro.getDescrizione());
		}

		return equals;
	}

}

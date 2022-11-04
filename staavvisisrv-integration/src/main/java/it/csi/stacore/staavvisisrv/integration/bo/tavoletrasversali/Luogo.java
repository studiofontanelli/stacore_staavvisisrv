/*
 * Created on 27-gen-2006
 */
package it.csi.stacore.staavvisisrv.integration.bo.tavoletrasversali;

import java.io.Serializable;

import it.csi.stacore.staavvisisrv.integration.bo.AbstractBO;

/**
 * @author 71025
 */
public class Luogo extends AbstractBO implements Serializable {

    private static final long serialVersionUID = -4608476864003111931L;

		/**
		 * @uml.property  name="comune"
		 * @uml.associationEnd  multiplicity="(1 1)"
		 */
		private final Comune comune;
    /**
		 * @uml.property  name="idNazione"
		 */
    private final Long idNazione;
    /**
		 * @uml.property  name="nazione"
		 */
    private final String nazione;

    public Luogo(Comune comune, Long idNazione, String nazione) {
        this.comune = comune;
        this.idNazione = idNazione;
        this.nazione = nazione;
    }

    /**
		 * @return  Returns the comune.
		 * @uml.property  name="comune"
		 */
    public Comune getComune() {
        return comune;
    }

    /**
		 * @return  Returns the idNazione.
		 * @uml.property  name="idNazione"
		 */
    public Long getIdNazione() {
        return idNazione;
    }

    /**
		 * @return  Returns the nazione.
		 * @uml.property  name="nazione"
		 */
    public String getNazione() {
        return nazione;
    }

    public boolean isLuogoNazionale() {
    	return false;
    }

}

/*
 * Created on 27-gen-2006
 */
package it.csi.stacore.staavvisisrv.integration.bo.tavoletrasversali;

import java.io.Serializable;

import it.csi.stacore.staavvisisrv.integration.bo.AbstractBO;

/**
 * @author 71025
 */
public class Regione extends AbstractBO implements Serializable {

    private static final long serialVersionUID = 7607164883397311348L;

		/**
		 * @uml.property  name="istatRegione"
		 */
		private final String istatRegione;
    /**
		 * @uml.property  name="regione"
		 */
    private final String regione;

    public Regione(String istatRegione, String regione) {
        this.istatRegione = istatRegione;
        this.regione = regione;
    }

    /**
		 * @return  Returns the istatRegione.
		 * @uml.property  name="istatRegione"
		 */
    public String getIstatRegione() {
        return istatRegione;
    }

    /**
		 * @return  Returns the regione.
		 * @uml.property  name="regione"
		 */
    public String getRegione() {
        return regione;
    }

}

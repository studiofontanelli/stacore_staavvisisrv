/*
 * Created on 27-gen-2006
 */
package it.csi.stacore.staavvisisrv.integration.bo.tavoletrasversali;

import java.io.Serializable;

/**
 * @author 71025
 */
public class LuogoNazionale extends Luogo implements Serializable {

    private static final long serialVersionUID = 414293868752550515L;

		/**
		 * @uml.property  name="provincia"
		 * @uml.associationEnd  multiplicity="(1 1)"
		 */
		private final Provincia provincia;
    /**
		 * @uml.property  name="regione"
		 * @uml.associationEnd  multiplicity="(1 1)"
		 */
    private final Regione regione;

    private final String localita;
    private final String frazione;

    public LuogoNazionale(Comune comune, Long idNazione, String nazione, Provincia provincia, Regione regione, String localita, String frazione) {
        super(comune, idNazione, nazione);
        this.provincia = provincia;
        this.regione = regione;
        this.localita = localita;
        this.frazione = frazione;
    }

    /**
		 * @return  Returns the provincia.
		 * @uml.property  name="provincia"
		 */
    public Provincia getProvincia() {
        return provincia;
    }

    /**
		 * @return  Returns the regione.
		 * @uml.property  name="regione"
		 */
    public Regione getRegione() {
        return regione;
    }


    public String getFrazione() {
			return frazione;
		}

		public String getLocalita() {
			return localita;
		}

		public boolean isLuogoNazionale() {
    	return true;
    }
}

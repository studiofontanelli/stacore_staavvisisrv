/*
 * Created on 27-gen-2006
 */
package it.csi.stacore.staavvisisrv.integration.bo.tavoletrasversali;

import java.io.Serializable;
import java.util.Date;

import it.csi.stacore.staavvisisrv.integration.bo.AbstractBO;

/**
 * @author 71025
 */
public class Indirizzo extends AbstractBO implements Serializable {

    private static final long serialVersionUID = 793492137371376545L;
		/**
		 * @uml.property  name="dataValidita"
		 */
    private final Date dataValidita;
    /**
		 * @uml.property  name="cap"
		 */
    private final String cap;
    /**
		 * @uml.property  name="via"
		 * @uml.associationEnd  multiplicity="(1 1)"
		 */
    private final Via via;
    /**
		 * @uml.property  name="civico"
		 * @uml.associationEnd  multiplicity="(1 1)"
		 */
    private final Civico civico;
    /**
		 * @uml.property  name="luogo"
		 * @uml.associationEnd  multiplicity="(1 1)"
		 */
    private final Luogo luogo;
    /**
	 * @uml.property  name="fonteProvenienza"
	 */
    private final String fonteProvenienza;
    /**
	 * @uml.property  name="fonteRiferimento"
	 */
    private final String fonteRiferimento;
    
    private final TipoIndirizzo tipoIndirizzo;

    public Indirizzo(Date dataValidita, String cap, Via via, Civico civico, Luogo luogo, String fonteProvenienza, String fonteRiferimento, TipoIndirizzo tipoIndirizzo) {
        this.dataValidita = dataValidita;
        this.cap = cap;
        this.via = via;
        this.civico = civico;
        this.luogo = luogo;
        this.fonteProvenienza = fonteProvenienza;
        this.fonteRiferimento = fonteRiferimento;
        this.tipoIndirizzo = tipoIndirizzo;
    }

    /**
		 * @return  Returns the fonteProvenienza.
		 * @uml.property  name="fonteProvenienza"
		 */
    public String getFonteProvenienza() {
        return fonteProvenienza;
    }
    
    /**
	 * @return  Returns the fonteRiferimento.
	 * @uml.property  name="fonteRiferimento"
	 */
	public String getFonteRiferimento() {
	    return fonteRiferimento;
	}

    /**
		 * @return  Returns the cap.
		 * @uml.property  name="cap"
		 */
    public String getCap() {
        return cap;
    }

    /**
		 * @return  Returns the civico.
		 * @uml.property  name="civico"
		 */
    public Civico getCivico() {
        return civico;
    }

    /**
		 * @return  Returns the dataValidita.
		 * @uml.property  name="dataValidita"
		 */
    public Date getDataValidita() {
        return dataValidita;
    }

    /**
		 * @return  Returns the luogo.
		 * @uml.property  name="luogo"
		 */
    public Luogo getLuogo() {
        return luogo;
    }

    /**
		 * @return  Returns the via.
		 * @uml.property  name="via"
		 */
    public Via getVia() {
        return via;
    }

	public TipoIndirizzo getTipoIndirizzo() {
		return tipoIndirizzo;
	}

}

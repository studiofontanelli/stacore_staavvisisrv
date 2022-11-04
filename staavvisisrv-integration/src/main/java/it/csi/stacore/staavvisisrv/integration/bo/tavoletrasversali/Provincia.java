/*
 * Created on 27-gen-2006
 */
package it.csi.stacore.staavvisisrv.integration.bo.tavoletrasversali;

import java.io.Serializable;

import it.csi.stacore.staavvisisrv.integration.bo.AbstractBO;

/**
 * @author 71025
 */
public class Provincia extends AbstractBO implements Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -3597882090723164562L;
	/**
	 * @uml.property  name="idProvincia"
	 */
	private final Long idProvincia;
	/**
		 * @uml.property  name="sigla"
		 */
    private final String sigla;
    /**
		 * @uml.property  name="descrizione"
		 */
    private final String descrizione;
    /**
		 * @uml.property  name="istat"
		 */
    private final String istat;

    public Provincia(Long idProvincia, String sigla, String descrizione, String istat) {
    	this.idProvincia = idProvincia;
        this.sigla = sigla;
        this.descrizione = descrizione;
        this.istat = istat;
    }
    
    
    
    /**
		 * @return  Returns the descrizione.
		 * @uml.property  name="descrizione"
		 */
    public String getDescrizione() {
        return descrizione;
    }

    /**
		 * @return  Returns the istat.
		 * @uml.property  name="istat"
		 */
    public String getIstat() {
        return istat;
    }
    
    /**
		 * @return  Returns the sigla.
		 * @uml.property  name="sigla"
		 */
    public String getSigla() {
        return sigla;
    }

	public Long getIdProvincia() {
		return idProvincia;
	}
    
}

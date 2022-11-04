/*
 * Created on 2-feb-2006
 */
package it.csi.stacore.staavvisisrv.integration.bo.tavoletrasversali;

import java.io.Serializable;
import java.util.Date;

import it.csi.stacore.staavvisisrv.integration.bo.AbstractBO;

/**
 * @author 71025
 */
public class NaturaGiuridica extends AbstractBO implements Serializable {

    private static final long serialVersionUID = -3371666469430563480L;
		/**
		 * @uml.property  name="idNaturaGiuridica"
		 */
    private final Long idNaturaGiuridica;
    /**
		 * @uml.property  name="descFormaGiuridica"
		 */
    private final String descFormaGiuridica;
    /**
		 * @uml.property  name="dtInizioVal"
		 */
    private final Date dtInizioVal;
    /**
		 * @uml.property  name="dtFineVal"
		 */
    private final Date dtFineVal;
		private final String codiceFormaGiuridica;

    public NaturaGiuridica(Long idNaturaGiuridica, String codiceFormaGiuridica, String descFormaGiuridica,
            Date dtInizioVal, Date dtFineVal) {
        this.idNaturaGiuridica = idNaturaGiuridica;
				this.codiceFormaGiuridica = codiceFormaGiuridica;
        this.descFormaGiuridica = descFormaGiuridica;
        this.dtInizioVal = dtInizioVal;
        this.dtFineVal = dtFineVal;

    }

    /**
		 * @return  Returns the descFormaGiuridica.
		 * @uml.property  name="descFormaGiuridica"
		 */
    public String getDescFormaGiuridica() {
        return descFormaGiuridica;
    }


    public String getCodiceFormaGiuridica() {
			return codiceFormaGiuridica;
		}

		/**
		 * @return  Returns the dtFineVal.
		 * @uml.property  name="dtFineVal"
		 */
    public Date getDtFineVal() {
        return dtFineVal;
    }

    /**
		 * @return  Returns the dtInizioVal.
		 * @uml.property  name="dtInizioVal"
		 */
    public Date getDtInizioVal() {
        return dtInizioVal;
    }

    /**
		 * @return  Returns the idNaturaGiuridica.
		 * @uml.property  name="idNaturaGiuridica"
		 */
    public Long getIdNaturaGiuridica() {
        return idNaturaGiuridica;
    }

}

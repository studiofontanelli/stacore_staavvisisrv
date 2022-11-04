package it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento;

import it.csi.stacore.staavvisisrv.integration.bo.common.Decodifica;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdDecodifica;
import it.csi.stacore.staavvisisrv.integration.util.EqualsUtil;

public class StatoAccertamento extends Decodifica {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5522065719517188883L;
	//~ Constructors
    // =============================================================
    public static final int ID_STATO_PRATICA_DA_INOLTRARE = 1;
    public static final int ID_STATO_PRATICA_INOLTRATA = 2;
    public static final int ID_STATO_PRATICA_CHIUSA = 3;
    public static final int ID_STATO_PRATICA_ISCRITTA_A_RUOLO = 4;
    public static final int ID_STATO_PRATICA_RATEIZZATA = 5;
    public static final int ID_STATO_PRATICA_SOSPESA = 6;
        

    public StatoAccertamento() {		
	}
	
    public StatoAccertamento(IdDecodifica id, String descrizione) {
        super(id, descrizione);
    }
    
    public StatoAccertamento(IdDecodifica id, String codice, String descrizione) {
		super(id, codice, descrizione);		
	}
    
    

    //~ Methods
    // ==================================================================
	/**
     * DOCUMENT ME!
     *
     * @param object
     *            DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public boolean equals(Object object) {
        boolean equals = false;

        if ((object != null) && object instanceof StatoAccertamento) {
            StatoAccertamento altro = (StatoAccertamento) object;
            equals = EqualsUtil.objectEquals(getId(), altro.getId());
        }

        return equals;
    }

}

package it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento;

import it.csi.stacore.staavvisisrv.integration.bo.common.Decodifica;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdDecodifica;
import it.csi.stacore.staavvisisrv.integration.util.EqualsUtil;

public class CausaleChiusura extends Decodifica implements java.io.Serializable {
	
	//~ Constructors =============================================================

	  /**
		 * 
		 */
		private static final long serialVersionUID = -1927335509202866918L;

	/**
	   * Creates a new Stato object.
	   *
	   * @param id DOCUMENT ME!
	   * @param codice DOCUMENT ME!
	   * @param descrizione DOCUMENT ME!
	   */
	  public CausaleChiusura(IdDecodifica id, String codice, String descrizione) {
	  	super(id, codice, descrizione);
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

	    if((object != null) && object instanceof CausaleChiusura) {
	      CausaleChiusura altro = (CausaleChiusura) object;
	      equals = EqualsUtil.objectEquals(getId(), altro.getId());
	    }

	    return equals;
	  }	  

}

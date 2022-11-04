package it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento;

import java.io.Serializable;

import it.csi.stacore.staavvisisrv.integration.bo.common.Decodifica;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdDecodifica;
import it.csi.stacore.staavvisisrv.integration.util.EqualsUtil;

public class TipoAvvisoAccertamento extends Decodifica implements Serializable {
	//~ Constructors =============================================================

	/**
		 * 
		 */
		private static final long serialVersionUID = 150505795388635893L;

	/**
	   * Creates a new Stato object.
	   *
	   * @param id DOCUMENT ME!
	   * @param codice DOCUMENT ME!
	   * @param descrizione DOCUMENT ME!
	   */
	  public TipoAvvisoAccertamento(IdDecodifica id, String descrizione) {
	    super(id, descrizione);
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

	    if((object != null) && object instanceof TipoAvvisoAccertamento) {
	      TipoAvvisoAccertamento altro = (TipoAvvisoAccertamento) object;
	      equals = EqualsUtil.objectEquals(getId(), altro.getId());
	    }

	    return equals;
	  }

}

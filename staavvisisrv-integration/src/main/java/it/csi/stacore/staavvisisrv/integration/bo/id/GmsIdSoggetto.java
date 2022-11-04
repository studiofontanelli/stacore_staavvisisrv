package it.csi.stacore.staavvisisrv.integration.bo.id;

import java.io.Serializable;

public class GmsIdSoggetto extends LongId implements Serializable {
	  /**
		 * 
		 */
	 private static final long serialVersionUID = 1221464491976120562L;

	/**
	   * Creates a new GmsIdSoggetto object.
	   *
	   * @param id DOCUMENT ME!
	   */
	  public GmsIdSoggetto(long id) {
	    super(id);
	  }

	  public boolean equals(Object object) {
	    boolean equals = false;

	    if((object != null) && object instanceof GmsIdSoggetto) {
	      GmsIdSoggetto altro = (GmsIdSoggetto) object;
	      equals = (this.getId() == altro.getId());
	    }

	    return equals;
	  }

}

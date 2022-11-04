package it.csi.stacore.staavvisisrv.integration.bo.id;

import java.io.Serializable;

public class IdSottoCausaleChiusura extends LongId implements Serializable {
	
	//~ Constructors =============================================================

	/**
	 * 
	 */
	private static final long serialVersionUID = -5091476340480907580L;

	public IdSottoCausaleChiusura(long id) {
		super(id);
	}

	//~ Methods ==================================================================

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof IdSottoCausaleChiusura) {
			IdSottoCausaleChiusura altro = (IdSottoCausaleChiusura) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}

}

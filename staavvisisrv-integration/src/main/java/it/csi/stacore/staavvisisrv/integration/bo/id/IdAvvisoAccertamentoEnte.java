package it.csi.stacore.staavvisisrv.integration.bo.id;

import java.io.Serializable;

public class IdAvvisoAccertamentoEnte extends LongId implements Serializable {
	//~ Constructors =============================================================

	/**
	 * 
	 */
	private static final long serialVersionUID = -2211720625815230671L;

	public IdAvvisoAccertamentoEnte(long id) {
		super(id);
	}

	//~ Methods ==================================================================

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof IdAvvisoAccertamentoEnte) {
			IdAvvisoAccertamentoEnte altro = (IdAvvisoAccertamentoEnte) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}
}

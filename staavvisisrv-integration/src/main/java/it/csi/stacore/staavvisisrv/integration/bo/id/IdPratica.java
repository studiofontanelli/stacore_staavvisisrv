package it.csi.stacore.staavvisisrv.integration.bo.id;

public class IdPratica extends LongId implements java.io.Serializable {
	
	private static final long serialVersionUID = -4497542235444979177L;
	
	public IdPratica(long id) {
		super(id);
	}
	

	public boolean equals(Object object) {
		boolean equals = false;

		if((object != null) && object instanceof IdPratica) {
			IdPratica altro = (IdPratica) object;
			equals = (this.getId() == altro.getId());
		}

		return equals;
	}

}

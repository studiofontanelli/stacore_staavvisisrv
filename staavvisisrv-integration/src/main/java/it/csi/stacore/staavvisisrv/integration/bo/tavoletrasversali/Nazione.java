/*
 * Created on 2-feb-2006
 */
package it.csi.stacore.staavvisisrv.integration.bo.tavoletrasversali;

import java.io.Serializable;

import it.csi.stacore.staavvisisrv.integration.bo.Decodifica;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdDecodifica;
import it.csi.stacore.staavvisisrv.integration.util.EqualsUtil;

/**
 * @author 71025
 */
public class Nazione extends Decodifica implements Serializable {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1267037763236571047L;

/**
	 * @uml.property  name="idNazione"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
  private final IdDecodifica idNazione;

  /**
	 * @uml.property  name="descNazione"
	 */
  private final String descNazione;

  public Nazione(IdDecodifica idNazione, String descNazione) {
    super(idNazione, descNazione);
    this.idNazione = idNazione;
    this.descNazione = descNazione;
  }

  /**
	 * @return  Returns the descNazione.
	 * @uml.property  name="descNazione"
	 */
  public String getDescNazione() {
    return descNazione;
  }

  /**
	 * @return  Returns the idNazione.
	 * @uml.property  name="idNazione"
	 */
  public IdDecodifica getIdNazione() {
    return idNazione;
  }

  public boolean equals(Object object) {
    boolean equals = false;

    if ((object != null) && object instanceof Nazione) {
      Nazione altro = (Nazione) object;
      equals = EqualsUtil.objectEquals(getId(), altro.getId());
    }

    return equals;
  }

}

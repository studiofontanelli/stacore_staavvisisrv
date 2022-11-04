/*
 * Created on 27-gen-2006
 */
package it.csi.stacore.staavvisisrv.integration.bo.tavoletrasversali;

import java.io.Serializable;

import it.csi.stacore.staavvisisrv.integration.bo.AbstractBO;

/**
 * @author 71025
 */
public class Via extends AbstractBO implements Serializable {

	private static final long serialVersionUID = -7227086671522365078L;

	/**
	 * @uml.property  name="sedime"
	 */
	private final String sedime;

	/**
	 * @uml.property  name="nomeVia"
	 */
	private final String nomeVia;

	private final String valoreCompleto;

	public Via(String sedime, String nomeVia, String valoreCompleto) {
		this.sedime = sedime;
		this.nomeVia = nomeVia;
		this.valoreCompleto = valoreCompleto;
	}

	public String getValoreCompleto() {
		return valoreCompleto;
	}

	/**
	 * @return  Returns the nomeVia.
	 * @uml.property  name="nomeVia"
	 */
	public String getNomeVia() {
		return nomeVia;
	}

	/**
	 * @return  Returns the sedime.
	 * @uml.property  name="sedime"
	 */
	public String getSedime() {
		return sedime;
	}

}

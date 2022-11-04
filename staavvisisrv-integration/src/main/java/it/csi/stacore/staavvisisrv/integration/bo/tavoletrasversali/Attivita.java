/*
 * Created on 30-gen-2006
 */
package it.csi.stacore.staavvisisrv.integration.bo.tavoletrasversali;

import java.io.Serializable;

import it.csi.stacore.staavvisisrv.integration.bo.AbstractBO;

/**
 * @author 71025
 */
public class Attivita extends AbstractBO implements Serializable {

    private static final long serialVersionUID = 1134305236381335535L;
		/**
		 * @uml.property  name="id"
		 */
    private final String codiceAteco;
    /**
		 * @uml.property  name="categoria"
		 */
    private final String categoria;

    public Attivita(String id, String categoria) {
        this.codiceAteco = id;
        this.categoria = categoria;
    }

    /**
		 * @return  Returns the categoria.
		 * @uml.property  name="categoria"
		 */
    public String getCategoria() {
        return categoria;
    }

    /**
		 * @return  Returns the id.
		 * @uml.property  name="id"
		 */
    public String getId() {
        return codiceAteco;
    }

}

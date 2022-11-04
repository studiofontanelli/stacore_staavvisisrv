package it.csi.stacore.staavvisisrv.integration.bo;

public class ParametroApplicativo implements java.io.Serializable  {
	private static final long serialVersionUID = 232321L;
	/**
	 * @uml.property  name="nome"
	 */
	private String nome;
	/**
	 * @uml.property  name="valore"
	 */
	private String valore;
	

	public ParametroApplicativo(String nome, String valore) {
		this.nome = nome;
		this.valore = valore;
	}
	
	/**
	 * @return  Returns the nome.
	 * @uml.property  name="nome"
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * @return  Returns the valore.
	 * @uml.property  name="valore"
	 */
	public String getValore() {
		return valore;
	}
}

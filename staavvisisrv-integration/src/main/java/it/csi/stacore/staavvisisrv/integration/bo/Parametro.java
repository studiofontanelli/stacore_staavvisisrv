package it.csi.stacore.staavvisisrv.integration.bo;

public class Parametro implements java.io.Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7317916032016998478L;
	private String codFunzione, codParametro, valore, descrizione;

	public Parametro(String codFunzione, String codParametro, String valore, String descrizione) {
		this.codFunzione = codFunzione;
		this.codParametro = codParametro;
		this.valore = valore;
		this.descrizione = descrizione;
	}

	public String getCodFunzione() {
		return codFunzione;
	}

	public void setCodFunzione(String codFunzione) {
		this.codFunzione = codFunzione;
	}

	public String getCodParametro() {
		return codParametro;
	}

	public void setCodParametro(String codParametro) {
		this.codParametro = codParametro;
	}

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
}

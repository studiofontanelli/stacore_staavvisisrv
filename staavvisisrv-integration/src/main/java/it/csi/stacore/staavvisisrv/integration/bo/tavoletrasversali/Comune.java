/*
 * Created on 27-gen-2006
 */
package it.csi.stacore.staavvisisrv.integration.bo.tavoletrasversali;

import it.csi.stacore.staavvisisrv.integration.bo.AbstractBO;

/**
 * @author 71025
 */
public class Comune extends AbstractBO implements java.io.Serializable {

	private static final long serialVersionUID = -8364608892581929081L;

	/**
	 * @uml.property  name="idComune"
	 */
	private final Long idComune;

	/**
	 * @uml.property  name="descrizione"
	 */
	private final String descrizione;

	/**
	 * @uml.property  name="istat"
	 */
	private final String istat;

	//per combo, esempio MONCALIERI (TO)
	/**
	 * @uml.property  name="descrizioneEstesa"
	 */
	private String descrizioneEstesa;

	/**
	 * @uml.property  name="capRiferimento"
	 */
	private String capRiferimento;

	/**
	 * @uml.property  name="provincia"
	 */
	private String provincia;

	/**
	 * @uml.property  name="codiceCatastale"
	 */
	private String codiceCatastale;

	public Comune(Long idComune, String descrizione, String istat) {
		this.idComune = idComune;
		this.descrizione = descrizione;
		this.istat = istat;
	}

	/**
	 * @param capRiferimento  The capRiferimento to set.
	 * @uml.property  name="capRiferimento"
	 */
	public void setCapRiferimento(String capRiferimento) {
		this.capRiferimento = capRiferimento;
	}

	/**
	 * @return  Returns the capRiferimento.
	 * @uml.property  name="capRiferimento"
	 */
	public String getCapRiferimento() {
		return capRiferimento;
	}

	/**
	 * @return  Returns the descrizione.
	 * @uml.property  name="descrizione"
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @return  Returns the idComune.
	 * @uml.property  name="idComune"
	 */
	public Long getIdComune() {
		return idComune;
	}

	/**
	 * @return  Returns the istat.
	 * @uml.property  name="istat"
	 */
	public String getIstat() {
		return istat;
	}

	/**
	 * @return  Returns the descrizioneEstesa.
	 * @uml.property  name="descrizioneEstesa"
	 */
	public String getDescrizioneEstesa() {
		return descrizioneEstesa;
	}

	/**
	 * @param descrizioneEstesa  The descrizioneEstesa to set.
	 * @uml.property  name="descrizioneEstesa"
	 */
	public void setDescrizioneEstesa(String descrizioneEstesa) {
		this.descrizioneEstesa = descrizioneEstesa;
	}

	/**
	 * @return  Returns the provincia.
	 * @uml.property  name="provincia"
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * @param provincia  The provincia to set.
	 * @uml.property  name="provincia"
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	/**
	 * @return  Returns the codiceCatastale.
	 * @uml.property  name="codiceCatastale"
	 */
	public String getCodiceCatastale() {
		return codiceCatastale;
	}

	/**
	 * @param codiceCatastale  The codiceCatastale to set.
	 * @uml.property  name="codiceCatastale"
	 */
	public void setCodiceCatastale(String codiceCatastale) {
		this.codiceCatastale = codiceCatastale;
	}

}
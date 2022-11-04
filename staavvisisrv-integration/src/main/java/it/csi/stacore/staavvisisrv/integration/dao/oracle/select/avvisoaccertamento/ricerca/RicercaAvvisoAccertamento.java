package it.csi.stacore.staavvisisrv.integration.dao.oracle.select.avvisoaccertamento.ricerca;

import java.io.Serializable;

import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.StatoAccertamento;
import it.csi.stacore.staavvisisrv.integration.bo.veicolo.TipoVeicolo;

public class RicercaAvvisoAccertamento implements Serializable {
	
	private String identificativoFiscale = null;
	private String protocollo = null;
	private String targa = null;
	private TipoVeicolo tipoVeicolo = null;
	private String scadenza = null;
	private Integer validita = null;
	private Integer annoAccertamento = null;
	private String identificativoUtente = null;
	private StatoAccertamento statoAccertamento = null;
	public String getIdentificativoFiscale() {
		return identificativoFiscale;
	}
	public void setIdentificativoFiscale(String identificativoFiscale) {
		this.identificativoFiscale = identificativoFiscale;
	}
	public String getProtocollo() {
		return protocollo;
	}
	public void setProtocollo(String protocollo) {
		this.protocollo = protocollo;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public TipoVeicolo getTipoVeicolo() {
		return tipoVeicolo;
	}
	public void setTipoVeicolo(TipoVeicolo tipoVeicolo) {
		this.tipoVeicolo = tipoVeicolo;
	}
	public String getScadenza() {
		return scadenza;
	}
	public void setScadenza(String scadenza) {
		this.scadenza = scadenza;
	}
	public Integer getValidita() {
		return validita;
	}
	public void setValidita(Integer validta) {
		this.validita = validta;
	}
	public Integer getAnnoAccertamento() {
		return annoAccertamento;
	}
	public void setAnnoAccertamento(Integer annoAccertamento) {
		this.annoAccertamento = annoAccertamento;
	}
	public String getIdentificativoUtente() {
		return identificativoUtente;
	}
	public void setIdentificativoUtente(String identificativoUtente) {
		this.identificativoUtente = identificativoUtente;
	}
	public StatoAccertamento getStatoAccertamento() {
		return statoAccertamento;
	}
	public void setStatoAccertamento(StatoAccertamento statoAccertamento) {
		this.statoAccertamento = statoAccertamento;
	}
}

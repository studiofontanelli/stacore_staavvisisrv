package it.csi.stacore.staavvisisrv.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.csi.stacore.staavvisisrv.api.dto.AvvisoAccertamentoEnteVO;
import it.csi.stacore.staavvisisrv.api.dto.CausaleSospensioneVO;
import it.csi.stacore.staavvisisrv.api.dto.ValutaVO;

@ApiModel(description="accertamento")

public class AvvisoAccertamentoVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Long idAvvisoAccertamento = null;
  private Long idPratica = null;
  private Integer annoAccertamento = null;
  private TipoIrregAccertamentoVO tipoIrregAccertamento = null;
  private Long idPosizione = null;
  private CausaleChiusuraVO causaleChiusura = null;
  private SottoCausaleChiusuraVO sottoCausaleChiusura = null;
  private TipoPeriodicitaVO tipoPeriodicita = null;
  private AvvisoAccertamentoEnteVO avvisoAccertamentoEnte = null;
  private String numeroProtocollo = null;
  private Date dataInvioUltimoFlusso = null;
  private Date dataNotifica = null;
  private String irregAccertamento = null;
  private String periodicita = null;
  private Integer scadenza = null;
  private Integer validita = null;
  private Date dataPagVersInsuff = null;
  private String propTipoPersona = null;
  private String propCodFiscale = null;
  private String propNome = null;
  private String propCognome = null;
  private String propDenominazione = null;
  private Date propDataNascita = null;
  private String propComuneNascita = null;
  private String propComuneSpedizione = null;
  private String propStatoEsteroNascita = null;
  private String propProvSpedizione = null;
  private String propSesso = null;
  private String propIndSpedizioneNom = null;
  private String propSedime = null;
  private String propCivico = null;
  private String propCap = null;
  private String veicTarga = null;
  private TipoVeicoloVO veicTipoVeicolo = null;
  private String veicDescTipoVeicolo = null;
  private Date veicDataImmatric = null;
  private Long veicIdDestinazione = null;
  private String veicDescDestinazione = null;
  private Long veicIdUso = null;
  private Long veicIdTipoRiduzione = null;
  private String veicDescUso = null;
  private Long veicIdAlimentazione = null;
  private String veicDescAlimentazione = null;
  private String veicFlagEcodiesel = null;
  private Long idStatoPratica = null;
  private String statoNote = null;
  private Date statoDataRegolarizzazione = null;
  private String statoDescCausaleChiusura = null;
  private String statoDescSottoCausaleChiusura = null;
  private Date statoData1Chiusura = null;
  private Date statoData2Chiusura = null;
  private ValutaVO versatoTassa = null;
  private ValutaVO versatoSanzioni = null;
  private ValutaVO versatoInteresse = null;
  private ValutaVO versatoTotale = null;
  private ValutaVO dovutoTassa = null;
  private ValutaVO dovutoSanzioni = null;
  private ValutaVO dovutoInteresse = null;
  private ValutaVO dovutoTotale = null;
  private ValutaVO dovutoImportoCompensato = null;
  private ValutaVO dovutoSemestriInteressi = null;
  private Date ruoloDataInvioFlusso = null;
  private ValutaVO calcTassaNeiTermini = null;
  private Integer ruoloSemestri = null;
  private ValutaVO ruoloTassa = null;
  private ValutaVO ruoloSanzioni = null;
  private ValutaVO ruoloInteresse = null;
  private ValutaVO ruoloTotale = null;
  private Long gmsIdSoggetto = null;
  private String identificativoUtente = null;
  private Date dataRiferimentoCalcolo = null;
  private String ctCodiceRegola = null;
  private Integer numeroPosti = null;
  private Integer numeroAssi = null;
  private String veicKW = null;
  private String veicMassaComplessiva = null;
  private String veicPortata = null;
  private String categoriaEuro = null;
  private String veicDescRiduzione = null;
  private ValutaVO veicTassaNoRiduz = null;
  private ValutaVO veicSanzioniNoRiduz = null;
  private ValutaVO veicInteressiNoRiduz = null;
  private ValutaVO veicTotaleNoRiduz = null;
  private Integer veicNumMensilitaRidotte = null;
  private Date veicDataEvento = null;
  private String codTipoComunicazione = null;
  private String codStatoPratica = null;
  private String descStatoPratica = null;
  private ValutaVO dovutoRimorchiabilita = null;
  private Long idStatoSpedizione = null;
  private Long rinotificaIdStato = null;
  private Date rinotificaDataRicalcInteressi = null;
  private Long idCodElab = null;
  private CausaleSospensioneVO causaleSospensione = null;
  private String esitoNotifica = null;
  private Boolean isRuoloEQ = null;
  private String descrizioneRuoloEQ = null;
  private Date uguVer = null;
  private Date uguPag = null;
  private String pec = null;
  private String fonteRiferimentoPec = null;
  private Long cdFonteRiferimentoPec = null;
  private Long idStatoInvio = null;
  private Long idStatoIndirizzo = null;
  private String iuv = null;
  private String aux = null;
  private String cod = null;
  private String codiceIdenEnte = null;
  private Integer statoMdp = null;
  private String descrizioneErrore = null;
  private ValutaVO dovutoSpeseRac = null;
  private String emissCo2 = null;
  private String dataInstGpl = null;
  private String flagRim = null;
  private String flagSosp = null;
  private String codCategoria = null;
  private Long idVeicolo = null;
  private Long idProprietario = null;
  private String ingiunzionePianoRata = null;
  private Date dataPagamentoIngiunzione = null;
  private Date dataAcquisizionePagamentoIngiunzione = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_avviso_accertamento") 
 
  public Long getIdAvvisoAccertamento() {
    return idAvvisoAccertamento;
  }
  public void setIdAvvisoAccertamento(Long idAvvisoAccertamento) {
    this.idAvvisoAccertamento = idAvvisoAccertamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_pratica") 
 
  public Long getIdPratica() {
    return idPratica;
  }
  public void setIdPratica(Long idPratica) {
    this.idPratica = idPratica;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("anno_accertamento") 
 
  public Integer getAnnoAccertamento() {
    return annoAccertamento;
  }
  public void setAnnoAccertamento(Integer annoAccertamento) {
    this.annoAccertamento = annoAccertamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_irreg_accertamento") 
 
  public TipoIrregAccertamentoVO getTipoIrregAccertamento() {
    return tipoIrregAccertamento;
  }
  public void setTipoIrregAccertamento(TipoIrregAccertamentoVO tipoIrregAccertamento) {
    this.tipoIrregAccertamento = tipoIrregAccertamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_posizione") 
 
  public Long getIdPosizione() {
    return idPosizione;
  }
  public void setIdPosizione(Long idPosizione) {
    this.idPosizione = idPosizione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("causale_chiusura") 
 
  public CausaleChiusuraVO getCausaleChiusura() {
    return causaleChiusura;
  }
  public void setCausaleChiusura(CausaleChiusuraVO causaleChiusura) {
    this.causaleChiusura = causaleChiusura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sotto_causale_chiusura") 
 
  public SottoCausaleChiusuraVO getSottoCausaleChiusura() {
    return sottoCausaleChiusura;
  }
  public void setSottoCausaleChiusura(SottoCausaleChiusuraVO sottoCausaleChiusura) {
    this.sottoCausaleChiusura = sottoCausaleChiusura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_periodicita") 
 
  public TipoPeriodicitaVO getTipoPeriodicita() {
    return tipoPeriodicita;
  }
  public void setTipoPeriodicita(TipoPeriodicitaVO tipoPeriodicita) {
    this.tipoPeriodicita = tipoPeriodicita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("avviso_accertamento_ente") 
 
  public AvvisoAccertamentoEnteVO getAvvisoAccertamentoEnte() {
    return avvisoAccertamentoEnte;
  }
  public void setAvvisoAccertamentoEnte(AvvisoAccertamentoEnteVO avvisoAccertamentoEnte) {
    this.avvisoAccertamentoEnte = avvisoAccertamentoEnte;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numero_protocollo") 
 
  public String getNumeroProtocollo() {
    return numeroProtocollo;
  }
  public void setNumeroProtocollo(String numeroProtocollo) {
    this.numeroProtocollo = numeroProtocollo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_invio_ultimo_flusso") 
 
  public Date getDataInvioUltimoFlusso() {
    return dataInvioUltimoFlusso;
  }
  public void setDataInvioUltimoFlusso(Date dataInvioUltimoFlusso) {
    this.dataInvioUltimoFlusso = dataInvioUltimoFlusso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_notifica") 
 
  public Date getDataNotifica() {
    return dataNotifica;
  }
  public void setDataNotifica(Date dataNotifica) {
    this.dataNotifica = dataNotifica;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("irreg_accertamento") 
 
  public String getIrregAccertamento() {
    return irregAccertamento;
  }
  public void setIrregAccertamento(String irregAccertamento) {
    this.irregAccertamento = irregAccertamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("periodicita") 
 
  public String getPeriodicita() {
    return periodicita;
  }
  public void setPeriodicita(String periodicita) {
    this.periodicita = periodicita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scadenza") 
 
  public Integer getScadenza() {
    return scadenza;
  }
  public void setScadenza(Integer scadenza) {
    this.scadenza = scadenza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("validita") 
 
  public Integer getValidita() {
    return validita;
  }
  public void setValidita(Integer validita) {
    this.validita = validita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_pag_vers_insuff") 
 
  public Date getDataPagVersInsuff() {
    return dataPagVersInsuff;
  }
  public void setDataPagVersInsuff(Date dataPagVersInsuff) {
    this.dataPagVersInsuff = dataPagVersInsuff;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prop_tipo_persona") 
 
  public String getPropTipoPersona() {
    return propTipoPersona;
  }
  public void setPropTipoPersona(String propTipoPersona) {
    this.propTipoPersona = propTipoPersona;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prop_cod_fiscale") 
 
  public String getPropCodFiscale() {
    return propCodFiscale;
  }
  public void setPropCodFiscale(String propCodFiscale) {
    this.propCodFiscale = propCodFiscale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prop_nome") 
 
  public String getPropNome() {
    return propNome;
  }
  public void setPropNome(String propNome) {
    this.propNome = propNome;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prop_cognome") 
 
  public String getPropCognome() {
    return propCognome;
  }
  public void setPropCognome(String propCognome) {
    this.propCognome = propCognome;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prop_denominazione") 
 
  public String getPropDenominazione() {
    return propDenominazione;
  }
  public void setPropDenominazione(String propDenominazione) {
    this.propDenominazione = propDenominazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prop_data_nascita") 
 
  public Date getPropDataNascita() {
    return propDataNascita;
  }
  public void setPropDataNascita(Date propDataNascita) {
    this.propDataNascita = propDataNascita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prop_comune_nascita") 
 
  public String getPropComuneNascita() {
    return propComuneNascita;
  }
  public void setPropComuneNascita(String propComuneNascita) {
    this.propComuneNascita = propComuneNascita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prop_comune_spedizione") 
 
  public String getPropComuneSpedizione() {
    return propComuneSpedizione;
  }
  public void setPropComuneSpedizione(String propComuneSpedizione) {
    this.propComuneSpedizione = propComuneSpedizione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prop_stato_estero_nascita") 
 
  public String getPropStatoEsteroNascita() {
    return propStatoEsteroNascita;
  }
  public void setPropStatoEsteroNascita(String propStatoEsteroNascita) {
    this.propStatoEsteroNascita = propStatoEsteroNascita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prop_prov_spedizione") 
 
  public String getPropProvSpedizione() {
    return propProvSpedizione;
  }
  public void setPropProvSpedizione(String propProvSpedizione) {
    this.propProvSpedizione = propProvSpedizione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prop_sesso") 
 
  public String getPropSesso() {
    return propSesso;
  }
  public void setPropSesso(String propSesso) {
    this.propSesso = propSesso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prop_ind_spedizione_nom") 
 
  public String getPropIndSpedizioneNom() {
    return propIndSpedizioneNom;
  }
  public void setPropIndSpedizioneNom(String propIndSpedizioneNom) {
    this.propIndSpedizioneNom = propIndSpedizioneNom;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prop_sedime") 
 
  public String getPropSedime() {
    return propSedime;
  }
  public void setPropSedime(String propSedime) {
    this.propSedime = propSedime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prop_civico") 
 
  public String getPropCivico() {
    return propCivico;
  }
  public void setPropCivico(String propCivico) {
    this.propCivico = propCivico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prop_cap") 
 
  public String getPropCap() {
    return propCap;
  }
  public void setPropCap(String propCap) {
    this.propCap = propCap;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_targa") 
 
  public String getVeicTarga() {
    return veicTarga;
  }
  public void setVeicTarga(String veicTarga) {
    this.veicTarga = veicTarga;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_tipo_veicolo") 
 
  public TipoVeicoloVO getVeicTipoVeicolo() {
    return veicTipoVeicolo;
  }
  public void setVeicTipoVeicolo(TipoVeicoloVO veicTipoVeicolo) {
    this.veicTipoVeicolo = veicTipoVeicolo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_desc_tipo_veicolo") 
 
  public String getVeicDescTipoVeicolo() {
    return veicDescTipoVeicolo;
  }
  public void setVeicDescTipoVeicolo(String veicDescTipoVeicolo) {
    this.veicDescTipoVeicolo = veicDescTipoVeicolo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_data_immatric") 
 
  public Date getVeicDataImmatric() {
    return veicDataImmatric;
  }
  public void setVeicDataImmatric(Date veicDataImmatric) {
    this.veicDataImmatric = veicDataImmatric;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_id_destinazione") 
 
  public Long getVeicIdDestinazione() {
    return veicIdDestinazione;
  }
  public void setVeicIdDestinazione(Long veicIdDestinazione) {
    this.veicIdDestinazione = veicIdDestinazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_desc_destinazione") 
 
  public String getVeicDescDestinazione() {
    return veicDescDestinazione;
  }
  public void setVeicDescDestinazione(String veicDescDestinazione) {
    this.veicDescDestinazione = veicDescDestinazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_id_uso") 
 
  public Long getVeicIdUso() {
    return veicIdUso;
  }
  public void setVeicIdUso(Long veicIdUso) {
    this.veicIdUso = veicIdUso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_id_tipo_riduzione") 
 
  public Long getVeicIdTipoRiduzione() {
    return veicIdTipoRiduzione;
  }
  public void setVeicIdTipoRiduzione(Long veicIdTipoRiduzione) {
    this.veicIdTipoRiduzione = veicIdTipoRiduzione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_desc_uso") 
 
  public String getVeicDescUso() {
    return veicDescUso;
  }
  public void setVeicDescUso(String veicDescUso) {
    this.veicDescUso = veicDescUso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_id_alimentazione") 
 
  public Long getVeicIdAlimentazione() {
    return veicIdAlimentazione;
  }
  public void setVeicIdAlimentazione(Long veicIdAlimentazione) {
    this.veicIdAlimentazione = veicIdAlimentazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_desc_alimentazione") 
 
  public String getVeicDescAlimentazione() {
    return veicDescAlimentazione;
  }
  public void setVeicDescAlimentazione(String veicDescAlimentazione) {
    this.veicDescAlimentazione = veicDescAlimentazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_flag_ecodiesel") 
 
  public String getVeicFlagEcodiesel() {
    return veicFlagEcodiesel;
  }
  public void setVeicFlagEcodiesel(String veicFlagEcodiesel) {
    this.veicFlagEcodiesel = veicFlagEcodiesel;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_stato_pratica") 
 
  public Long getIdStatoPratica() {
    return idStatoPratica;
  }
  public void setIdStatoPratica(Long idStatoPratica) {
    this.idStatoPratica = idStatoPratica;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato_note") 
 
  public String getStatoNote() {
    return statoNote;
  }
  public void setStatoNote(String statoNote) {
    this.statoNote = statoNote;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato_data_regolarizzazione") 
 
  public Date getStatoDataRegolarizzazione() {
    return statoDataRegolarizzazione;
  }
  public void setStatoDataRegolarizzazione(Date statoDataRegolarizzazione) {
    this.statoDataRegolarizzazione = statoDataRegolarizzazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato_desc_causale_chiusura") 
 
  public String getStatoDescCausaleChiusura() {
    return statoDescCausaleChiusura;
  }
  public void setStatoDescCausaleChiusura(String statoDescCausaleChiusura) {
    this.statoDescCausaleChiusura = statoDescCausaleChiusura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato_desc_sotto_causale_chiusura") 
 
  public String getStatoDescSottoCausaleChiusura() {
    return statoDescSottoCausaleChiusura;
  }
  public void setStatoDescSottoCausaleChiusura(String statoDescSottoCausaleChiusura) {
    this.statoDescSottoCausaleChiusura = statoDescSottoCausaleChiusura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato_data1_chiusura") 
 
  public Date getStatoData1Chiusura() {
    return statoData1Chiusura;
  }
  public void setStatoData1Chiusura(Date statoData1Chiusura) {
    this.statoData1Chiusura = statoData1Chiusura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato_data2_chiusura") 
 
  public Date getStatoData2Chiusura() {
    return statoData2Chiusura;
  }
  public void setStatoData2Chiusura(Date statoData2Chiusura) {
    this.statoData2Chiusura = statoData2Chiusura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("versato_tassa") 
 
  public ValutaVO getVersatoTassa() {
    return versatoTassa;
  }
  public void setVersatoTassa(ValutaVO versatoTassa) {
    this.versatoTassa = versatoTassa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("versato_sanzioni") 
 
  public ValutaVO getVersatoSanzioni() {
    return versatoSanzioni;
  }
  public void setVersatoSanzioni(ValutaVO versatoSanzioni) {
    this.versatoSanzioni = versatoSanzioni;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("versato_interesse") 
 
  public ValutaVO getVersatoInteresse() {
    return versatoInteresse;
  }
  public void setVersatoInteresse(ValutaVO versatoInteresse) {
    this.versatoInteresse = versatoInteresse;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("versato_totale") 
 
  public ValutaVO getVersatoTotale() {
    return versatoTotale;
  }
  public void setVersatoTotale(ValutaVO versatoTotale) {
    this.versatoTotale = versatoTotale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dovuto_tassa") 
 
  public ValutaVO getDovutoTassa() {
    return dovutoTassa;
  }
  public void setDovutoTassa(ValutaVO dovutoTassa) {
    this.dovutoTassa = dovutoTassa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dovuto_sanzioni") 
 
  public ValutaVO getDovutoSanzioni() {
    return dovutoSanzioni;
  }
  public void setDovutoSanzioni(ValutaVO dovutoSanzioni) {
    this.dovutoSanzioni = dovutoSanzioni;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dovuto_interesse") 
 
  public ValutaVO getDovutoInteresse() {
    return dovutoInteresse;
  }
  public void setDovutoInteresse(ValutaVO dovutoInteresse) {
    this.dovutoInteresse = dovutoInteresse;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dovuto_totale") 
 
  public ValutaVO getDovutoTotale() {
    return dovutoTotale;
  }
  public void setDovutoTotale(ValutaVO dovutoTotale) {
    this.dovutoTotale = dovutoTotale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dovuto_importo_compensato") 
 
  public ValutaVO getDovutoImportoCompensato() {
    return dovutoImportoCompensato;
  }
  public void setDovutoImportoCompensato(ValutaVO dovutoImportoCompensato) {
    this.dovutoImportoCompensato = dovutoImportoCompensato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dovuto_semestri_interessi") 
 
  public ValutaVO getDovutoSemestriInteressi() {
    return dovutoSemestriInteressi;
  }
  public void setDovutoSemestriInteressi(ValutaVO dovutoSemestriInteressi) {
    this.dovutoSemestriInteressi = dovutoSemestriInteressi;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ruolo_data_invio_flusso") 
 
  public Date getRuoloDataInvioFlusso() {
    return ruoloDataInvioFlusso;
  }
  public void setRuoloDataInvioFlusso(Date ruoloDataInvioFlusso) {
    this.ruoloDataInvioFlusso = ruoloDataInvioFlusso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("calc_tassa_nei_termini") 
 
  public ValutaVO getCalcTassaNeiTermini() {
    return calcTassaNeiTermini;
  }
  public void setCalcTassaNeiTermini(ValutaVO calcTassaNeiTermini) {
    this.calcTassaNeiTermini = calcTassaNeiTermini;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ruolo_semestri") 
 
  public Integer getRuoloSemestri() {
    return ruoloSemestri;
  }
  public void setRuoloSemestri(Integer ruoloSemestri) {
    this.ruoloSemestri = ruoloSemestri;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ruolo_tassa") 
 
  public ValutaVO getRuoloTassa() {
    return ruoloTassa;
  }
  public void setRuoloTassa(ValutaVO ruoloTassa) {
    this.ruoloTassa = ruoloTassa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ruolo_sanzioni") 
 
  public ValutaVO getRuoloSanzioni() {
    return ruoloSanzioni;
  }
  public void setRuoloSanzioni(ValutaVO ruoloSanzioni) {
    this.ruoloSanzioni = ruoloSanzioni;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ruolo_interesse") 
 
  public ValutaVO getRuoloInteresse() {
    return ruoloInteresse;
  }
  public void setRuoloInteresse(ValutaVO ruoloInteresse) {
    this.ruoloInteresse = ruoloInteresse;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ruolo_totale") 
 
  public ValutaVO getRuoloTotale() {
    return ruoloTotale;
  }
  public void setRuoloTotale(ValutaVO ruoloTotale) {
    this.ruoloTotale = ruoloTotale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gms_id_soggetto") 
 
  public Long getGmsIdSoggetto() {
    return gmsIdSoggetto;
  }
  public void setGmsIdSoggetto(Long gmsIdSoggetto) {
    this.gmsIdSoggetto = gmsIdSoggetto;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("identificativo_utente") 
 
  public String getIdentificativoUtente() {
    return identificativoUtente;
  }
  public void setIdentificativoUtente(String identificativoUtente) {
    this.identificativoUtente = identificativoUtente;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_riferimento_calcolo") 
 
  public Date getDataRiferimentoCalcolo() {
    return dataRiferimentoCalcolo;
  }
  public void setDataRiferimentoCalcolo(Date dataRiferimentoCalcolo) {
    this.dataRiferimentoCalcolo = dataRiferimentoCalcolo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ct_codice_regola") 
 
  public String getCtCodiceRegola() {
    return ctCodiceRegola;
  }
  public void setCtCodiceRegola(String ctCodiceRegola) {
    this.ctCodiceRegola = ctCodiceRegola;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numero_posti") 
 
  public Integer getNumeroPosti() {
    return numeroPosti;
  }
  public void setNumeroPosti(Integer numeroPosti) {
    this.numeroPosti = numeroPosti;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numero_assi") 
 
  public Integer getNumeroAssi() {
    return numeroAssi;
  }
  public void setNumeroAssi(Integer numeroAssi) {
    this.numeroAssi = numeroAssi;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_KW") 
 
  public String getVeicKW() {
    return veicKW;
  }
  public void setVeicKW(String veicKW) {
    this.veicKW = veicKW;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_massa_complessiva") 
 
  public String getVeicMassaComplessiva() {
    return veicMassaComplessiva;
  }
  public void setVeicMassaComplessiva(String veicMassaComplessiva) {
    this.veicMassaComplessiva = veicMassaComplessiva;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_portata") 
 
  public String getVeicPortata() {
    return veicPortata;
  }
  public void setVeicPortata(String veicPortata) {
    this.veicPortata = veicPortata;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("categoria_euro") 
 
  public String getCategoriaEuro() {
    return categoriaEuro;
  }
  public void setCategoriaEuro(String categoriaEuro) {
    this.categoriaEuro = categoriaEuro;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_desc_riduzione") 
 
  public String getVeicDescRiduzione() {
    return veicDescRiduzione;
  }
  public void setVeicDescRiduzione(String veicDescRiduzione) {
    this.veicDescRiduzione = veicDescRiduzione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_tassa_no_riduz") 
 
  public ValutaVO getVeicTassaNoRiduz() {
    return veicTassaNoRiduz;
  }
  public void setVeicTassaNoRiduz(ValutaVO veicTassaNoRiduz) {
    this.veicTassaNoRiduz = veicTassaNoRiduz;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_sanzioni_no_riduz") 
 
  public ValutaVO getVeicSanzioniNoRiduz() {
    return veicSanzioniNoRiduz;
  }
  public void setVeicSanzioniNoRiduz(ValutaVO veicSanzioniNoRiduz) {
    this.veicSanzioniNoRiduz = veicSanzioniNoRiduz;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_interessi_no_riduz") 
 
  public ValutaVO getVeicInteressiNoRiduz() {
    return veicInteressiNoRiduz;
  }
  public void setVeicInteressiNoRiduz(ValutaVO veicInteressiNoRiduz) {
    this.veicInteressiNoRiduz = veicInteressiNoRiduz;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_totale_no_riduz") 
 
  public ValutaVO getVeicTotaleNoRiduz() {
    return veicTotaleNoRiduz;
  }
  public void setVeicTotaleNoRiduz(ValutaVO veicTotaleNoRiduz) {
    this.veicTotaleNoRiduz = veicTotaleNoRiduz;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_num_mensilita_ridotte") 
 
  public Integer getVeicNumMensilitaRidotte() {
    return veicNumMensilitaRidotte;
  }
  public void setVeicNumMensilitaRidotte(Integer veicNumMensilitaRidotte) {
    this.veicNumMensilitaRidotte = veicNumMensilitaRidotte;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("veic_data_evento") 
 
  public Date getVeicDataEvento() {
    return veicDataEvento;
  }
  public void setVeicDataEvento(Date veicDataEvento) {
    this.veicDataEvento = veicDataEvento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cod_tipo_comunicazione") 
 
  public String getCodTipoComunicazione() {
    return codTipoComunicazione;
  }
  public void setCodTipoComunicazione(String codTipoComunicazione) {
    this.codTipoComunicazione = codTipoComunicazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cod_stato_pratica") 
 
  public String getCodStatoPratica() {
    return codStatoPratica;
  }
  public void setCodStatoPratica(String codStatoPratica) {
    this.codStatoPratica = codStatoPratica;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("desc_stato_pratica") 
 
  public String getDescStatoPratica() {
    return descStatoPratica;
  }
  public void setDescStatoPratica(String descStatoPratica) {
    this.descStatoPratica = descStatoPratica;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dovuto_rimorchiabilita") 
 
  public ValutaVO getDovutoRimorchiabilita() {
    return dovutoRimorchiabilita;
  }
  public void setDovutoRimorchiabilita(ValutaVO dovutoRimorchiabilita) {
    this.dovutoRimorchiabilita = dovutoRimorchiabilita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_stato_spedizione") 
 
  public Long getIdStatoSpedizione() {
    return idStatoSpedizione;
  }
  public void setIdStatoSpedizione(Long idStatoSpedizione) {
    this.idStatoSpedizione = idStatoSpedizione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rinotifica_id_stato") 
 
  public Long getRinotificaIdStato() {
    return rinotificaIdStato;
  }
  public void setRinotificaIdStato(Long rinotificaIdStato) {
    this.rinotificaIdStato = rinotificaIdStato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rinotifica_data_ricalc_interessi") 
 
  public Date getRinotificaDataRicalcInteressi() {
    return rinotificaDataRicalcInteressi;
  }
  public void setRinotificaDataRicalcInteressi(Date rinotificaDataRicalcInteressi) {
    this.rinotificaDataRicalcInteressi = rinotificaDataRicalcInteressi;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_cod_elab") 
 
  public Long getIdCodElab() {
    return idCodElab;
  }
  public void setIdCodElab(Long idCodElab) {
    this.idCodElab = idCodElab;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("causale_sospensione") 
 
  public CausaleSospensioneVO getCausaleSospensione() {
    return causaleSospensione;
  }
  public void setCausaleSospensione(CausaleSospensioneVO causaleSospensione) {
    this.causaleSospensione = causaleSospensione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("esito_notifica") 
 
  public String getEsitoNotifica() {
    return esitoNotifica;
  }
  public void setEsitoNotifica(String esitoNotifica) {
    this.esitoNotifica = esitoNotifica;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("is_ruolo_EQ") 
 
  public Boolean isIsRuoloEQ() {
    return isRuoloEQ;
  }
  public void setIsRuoloEQ(Boolean isRuoloEQ) {
    this.isRuoloEQ = isRuoloEQ;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("descrizione_ruolo_EQ") 
 
  public String getDescrizioneRuoloEQ() {
    return descrizioneRuoloEQ;
  }
  public void setDescrizioneRuoloEQ(String descrizioneRuoloEQ) {
    this.descrizioneRuoloEQ = descrizioneRuoloEQ;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ugu_ver") 
 
  public Date getUguVer() {
    return uguVer;
  }
  public void setUguVer(Date uguVer) {
    this.uguVer = uguVer;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ugu_pag") 
 
  public Date getUguPag() {
    return uguPag;
  }
  public void setUguPag(Date uguPag) {
    this.uguPag = uguPag;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pec") 
 
  public String getPec() {
    return pec;
  }
  public void setPec(String pec) {
    this.pec = pec;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fonte_riferimento_pec") 
 
  public String getFonteRiferimentoPec() {
    return fonteRiferimentoPec;
  }
  public void setFonteRiferimentoPec(String fonteRiferimentoPec) {
    this.fonteRiferimentoPec = fonteRiferimentoPec;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cd_fonte_riferimento_pec") 
 
  public Long getCdFonteRiferimentoPec() {
    return cdFonteRiferimentoPec;
  }
  public void setCdFonteRiferimentoPec(Long cdFonteRiferimentoPec) {
    this.cdFonteRiferimentoPec = cdFonteRiferimentoPec;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_stato_invio") 
 
  public Long getIdStatoInvio() {
    return idStatoInvio;
  }
  public void setIdStatoInvio(Long idStatoInvio) {
    this.idStatoInvio = idStatoInvio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_stato_indirizzo") 
 
  public Long getIdStatoIndirizzo() {
    return idStatoIndirizzo;
  }
  public void setIdStatoIndirizzo(Long idStatoIndirizzo) {
    this.idStatoIndirizzo = idStatoIndirizzo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("iuv") 
 
  public String getIuv() {
    return iuv;
  }
  public void setIuv(String iuv) {
    this.iuv = iuv;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("aux") 
 
  public String getAux() {
    return aux;
  }
  public void setAux(String aux) {
    this.aux = aux;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cod") 
 
  public String getCod() {
    return cod;
  }
  public void setCod(String cod) {
    this.cod = cod;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_iden_ente") 
 
  public String getCodiceIdenEnte() {
    return codiceIdenEnte;
  }
  public void setCodiceIdenEnte(String codiceIdenEnte) {
    this.codiceIdenEnte = codiceIdenEnte;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato_mdp") 
 
  public Integer getStatoMdp() {
    return statoMdp;
  }
  public void setStatoMdp(Integer statoMdp) {
    this.statoMdp = statoMdp;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("descrizione_errore") 
 
  public String getDescrizioneErrore() {
    return descrizioneErrore;
  }
  public void setDescrizioneErrore(String descrizioneErrore) {
    this.descrizioneErrore = descrizioneErrore;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dovuto_spese_rac") 
 
  public ValutaVO getDovutoSpeseRac() {
    return dovutoSpeseRac;
  }
  public void setDovutoSpeseRac(ValutaVO dovutoSpeseRac) {
    this.dovutoSpeseRac = dovutoSpeseRac;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emiss_co2") 
 
  public String getEmissCo2() {
    return emissCo2;
  }
  public void setEmissCo2(String emissCo2) {
    this.emissCo2 = emissCo2;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_inst_gpl") 
 
  public String getDataInstGpl() {
    return dataInstGpl;
  }
  public void setDataInstGpl(String dataInstGpl) {
    this.dataInstGpl = dataInstGpl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flag_rim") 
 
  public String getFlagRim() {
    return flagRim;
  }
  public void setFlagRim(String flagRim) {
    this.flagRim = flagRim;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flag_sosp") 
 
  public String getFlagSosp() {
    return flagSosp;
  }
  public void setFlagSosp(String flagSosp) {
    this.flagSosp = flagSosp;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cod_categoria") 
 
  public String getCodCategoria() {
    return codCategoria;
  }
  public void setCodCategoria(String codCategoria) {
    this.codCategoria = codCategoria;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_veicolo") 
 
  public Long getIdVeicolo() {
    return idVeicolo;
  }
  public void setIdVeicolo(Long idVeicolo) {
    this.idVeicolo = idVeicolo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_proprietario") 
 
  public Long getIdProprietario() {
    return idProprietario;
  }
  public void setIdProprietario(Long idProprietario) {
    this.idProprietario = idProprietario;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ingiunzione_piano_rata") 
 
  public String getIngiunzionePianoRata() {
    return ingiunzionePianoRata;
  }
  public void setIngiunzionePianoRata(String ingiunzionePianoRata) {
    this.ingiunzionePianoRata = ingiunzionePianoRata;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_pagamento_ingiunzione") 
 
  public Date getDataPagamentoIngiunzione() {
    return dataPagamentoIngiunzione;
  }
  public void setDataPagamentoIngiunzione(Date dataPagamentoIngiunzione) {
    this.dataPagamentoIngiunzione = dataPagamentoIngiunzione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_acquisizione_pagamento_ingiunzione") 
 
  public Date getDataAcquisizionePagamentoIngiunzione() {
    return dataAcquisizionePagamentoIngiunzione;
  }
  public void setDataAcquisizionePagamentoIngiunzione(Date dataAcquisizionePagamentoIngiunzione) {
    this.dataAcquisizionePagamentoIngiunzione = dataAcquisizionePagamentoIngiunzione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvvisoAccertamentoVO avvisoAccertamentoVO = (AvvisoAccertamentoVO) o;
    return Objects.equals(idAvvisoAccertamento, avvisoAccertamentoVO.idAvvisoAccertamento) &&
        Objects.equals(idPratica, avvisoAccertamentoVO.idPratica) &&
        Objects.equals(annoAccertamento, avvisoAccertamentoVO.annoAccertamento) &&
        Objects.equals(tipoIrregAccertamento, avvisoAccertamentoVO.tipoIrregAccertamento) &&
        Objects.equals(idPosizione, avvisoAccertamentoVO.idPosizione) &&
        Objects.equals(causaleChiusura, avvisoAccertamentoVO.causaleChiusura) &&
        Objects.equals(sottoCausaleChiusura, avvisoAccertamentoVO.sottoCausaleChiusura) &&
        Objects.equals(tipoPeriodicita, avvisoAccertamentoVO.tipoPeriodicita) &&
        Objects.equals(avvisoAccertamentoEnte, avvisoAccertamentoVO.avvisoAccertamentoEnte) &&
        Objects.equals(numeroProtocollo, avvisoAccertamentoVO.numeroProtocollo) &&
        Objects.equals(dataInvioUltimoFlusso, avvisoAccertamentoVO.dataInvioUltimoFlusso) &&
        Objects.equals(dataNotifica, avvisoAccertamentoVO.dataNotifica) &&
        Objects.equals(irregAccertamento, avvisoAccertamentoVO.irregAccertamento) &&
        Objects.equals(periodicita, avvisoAccertamentoVO.periodicita) &&
        Objects.equals(scadenza, avvisoAccertamentoVO.scadenza) &&
        Objects.equals(validita, avvisoAccertamentoVO.validita) &&
        Objects.equals(dataPagVersInsuff, avvisoAccertamentoVO.dataPagVersInsuff) &&
        Objects.equals(propTipoPersona, avvisoAccertamentoVO.propTipoPersona) &&
        Objects.equals(propCodFiscale, avvisoAccertamentoVO.propCodFiscale) &&
        Objects.equals(propNome, avvisoAccertamentoVO.propNome) &&
        Objects.equals(propCognome, avvisoAccertamentoVO.propCognome) &&
        Objects.equals(propDenominazione, avvisoAccertamentoVO.propDenominazione) &&
        Objects.equals(propDataNascita, avvisoAccertamentoVO.propDataNascita) &&
        Objects.equals(propComuneNascita, avvisoAccertamentoVO.propComuneNascita) &&
        Objects.equals(propComuneSpedizione, avvisoAccertamentoVO.propComuneSpedizione) &&
        Objects.equals(propStatoEsteroNascita, avvisoAccertamentoVO.propStatoEsteroNascita) &&
        Objects.equals(propProvSpedizione, avvisoAccertamentoVO.propProvSpedizione) &&
        Objects.equals(propSesso, avvisoAccertamentoVO.propSesso) &&
        Objects.equals(propIndSpedizioneNom, avvisoAccertamentoVO.propIndSpedizioneNom) &&
        Objects.equals(propSedime, avvisoAccertamentoVO.propSedime) &&
        Objects.equals(propCivico, avvisoAccertamentoVO.propCivico) &&
        Objects.equals(propCap, avvisoAccertamentoVO.propCap) &&
        Objects.equals(veicTarga, avvisoAccertamentoVO.veicTarga) &&
        Objects.equals(veicTipoVeicolo, avvisoAccertamentoVO.veicTipoVeicolo) &&
        Objects.equals(veicDescTipoVeicolo, avvisoAccertamentoVO.veicDescTipoVeicolo) &&
        Objects.equals(veicDataImmatric, avvisoAccertamentoVO.veicDataImmatric) &&
        Objects.equals(veicIdDestinazione, avvisoAccertamentoVO.veicIdDestinazione) &&
        Objects.equals(veicDescDestinazione, avvisoAccertamentoVO.veicDescDestinazione) &&
        Objects.equals(veicIdUso, avvisoAccertamentoVO.veicIdUso) &&
        Objects.equals(veicIdTipoRiduzione, avvisoAccertamentoVO.veicIdTipoRiduzione) &&
        Objects.equals(veicDescUso, avvisoAccertamentoVO.veicDescUso) &&
        Objects.equals(veicIdAlimentazione, avvisoAccertamentoVO.veicIdAlimentazione) &&
        Objects.equals(veicDescAlimentazione, avvisoAccertamentoVO.veicDescAlimentazione) &&
        Objects.equals(veicFlagEcodiesel, avvisoAccertamentoVO.veicFlagEcodiesel) &&
        Objects.equals(idStatoPratica, avvisoAccertamentoVO.idStatoPratica) &&
        Objects.equals(statoNote, avvisoAccertamentoVO.statoNote) &&
        Objects.equals(statoDataRegolarizzazione, avvisoAccertamentoVO.statoDataRegolarizzazione) &&
        Objects.equals(statoDescCausaleChiusura, avvisoAccertamentoVO.statoDescCausaleChiusura) &&
        Objects.equals(statoDescSottoCausaleChiusura, avvisoAccertamentoVO.statoDescSottoCausaleChiusura) &&
        Objects.equals(statoData1Chiusura, avvisoAccertamentoVO.statoData1Chiusura) &&
        Objects.equals(statoData2Chiusura, avvisoAccertamentoVO.statoData2Chiusura) &&
        Objects.equals(versatoTassa, avvisoAccertamentoVO.versatoTassa) &&
        Objects.equals(versatoSanzioni, avvisoAccertamentoVO.versatoSanzioni) &&
        Objects.equals(versatoInteresse, avvisoAccertamentoVO.versatoInteresse) &&
        Objects.equals(versatoTotale, avvisoAccertamentoVO.versatoTotale) &&
        Objects.equals(dovutoTassa, avvisoAccertamentoVO.dovutoTassa) &&
        Objects.equals(dovutoSanzioni, avvisoAccertamentoVO.dovutoSanzioni) &&
        Objects.equals(dovutoInteresse, avvisoAccertamentoVO.dovutoInteresse) &&
        Objects.equals(dovutoTotale, avvisoAccertamentoVO.dovutoTotale) &&
        Objects.equals(dovutoImportoCompensato, avvisoAccertamentoVO.dovutoImportoCompensato) &&
        Objects.equals(dovutoSemestriInteressi, avvisoAccertamentoVO.dovutoSemestriInteressi) &&
        Objects.equals(ruoloDataInvioFlusso, avvisoAccertamentoVO.ruoloDataInvioFlusso) &&
        Objects.equals(calcTassaNeiTermini, avvisoAccertamentoVO.calcTassaNeiTermini) &&
        Objects.equals(ruoloSemestri, avvisoAccertamentoVO.ruoloSemestri) &&
        Objects.equals(ruoloTassa, avvisoAccertamentoVO.ruoloTassa) &&
        Objects.equals(ruoloSanzioni, avvisoAccertamentoVO.ruoloSanzioni) &&
        Objects.equals(ruoloInteresse, avvisoAccertamentoVO.ruoloInteresse) &&
        Objects.equals(ruoloTotale, avvisoAccertamentoVO.ruoloTotale) &&
        Objects.equals(gmsIdSoggetto, avvisoAccertamentoVO.gmsIdSoggetto) &&
        Objects.equals(identificativoUtente, avvisoAccertamentoVO.identificativoUtente) &&
        Objects.equals(dataRiferimentoCalcolo, avvisoAccertamentoVO.dataRiferimentoCalcolo) &&
        Objects.equals(ctCodiceRegola, avvisoAccertamentoVO.ctCodiceRegola) &&
        Objects.equals(numeroPosti, avvisoAccertamentoVO.numeroPosti) &&
        Objects.equals(numeroAssi, avvisoAccertamentoVO.numeroAssi) &&
        Objects.equals(veicKW, avvisoAccertamentoVO.veicKW) &&
        Objects.equals(veicMassaComplessiva, avvisoAccertamentoVO.veicMassaComplessiva) &&
        Objects.equals(veicPortata, avvisoAccertamentoVO.veicPortata) &&
        Objects.equals(categoriaEuro, avvisoAccertamentoVO.categoriaEuro) &&
        Objects.equals(veicDescRiduzione, avvisoAccertamentoVO.veicDescRiduzione) &&
        Objects.equals(veicTassaNoRiduz, avvisoAccertamentoVO.veicTassaNoRiduz) &&
        Objects.equals(veicSanzioniNoRiduz, avvisoAccertamentoVO.veicSanzioniNoRiduz) &&
        Objects.equals(veicInteressiNoRiduz, avvisoAccertamentoVO.veicInteressiNoRiduz) &&
        Objects.equals(veicTotaleNoRiduz, avvisoAccertamentoVO.veicTotaleNoRiduz) &&
        Objects.equals(veicNumMensilitaRidotte, avvisoAccertamentoVO.veicNumMensilitaRidotte) &&
        Objects.equals(veicDataEvento, avvisoAccertamentoVO.veicDataEvento) &&
        Objects.equals(codTipoComunicazione, avvisoAccertamentoVO.codTipoComunicazione) &&
        Objects.equals(codStatoPratica, avvisoAccertamentoVO.codStatoPratica) &&
        Objects.equals(descStatoPratica, avvisoAccertamentoVO.descStatoPratica) &&
        Objects.equals(dovutoRimorchiabilita, avvisoAccertamentoVO.dovutoRimorchiabilita) &&
        Objects.equals(idStatoSpedizione, avvisoAccertamentoVO.idStatoSpedizione) &&
        Objects.equals(rinotificaIdStato, avvisoAccertamentoVO.rinotificaIdStato) &&
        Objects.equals(rinotificaDataRicalcInteressi, avvisoAccertamentoVO.rinotificaDataRicalcInteressi) &&
        Objects.equals(idCodElab, avvisoAccertamentoVO.idCodElab) &&
        Objects.equals(causaleSospensione, avvisoAccertamentoVO.causaleSospensione) &&
        Objects.equals(esitoNotifica, avvisoAccertamentoVO.esitoNotifica) &&
        Objects.equals(isRuoloEQ, avvisoAccertamentoVO.isRuoloEQ) &&
        Objects.equals(descrizioneRuoloEQ, avvisoAccertamentoVO.descrizioneRuoloEQ) &&
        Objects.equals(uguVer, avvisoAccertamentoVO.uguVer) &&
        Objects.equals(uguPag, avvisoAccertamentoVO.uguPag) &&
        Objects.equals(pec, avvisoAccertamentoVO.pec) &&
        Objects.equals(fonteRiferimentoPec, avvisoAccertamentoVO.fonteRiferimentoPec) &&
        Objects.equals(cdFonteRiferimentoPec, avvisoAccertamentoVO.cdFonteRiferimentoPec) &&
        Objects.equals(idStatoInvio, avvisoAccertamentoVO.idStatoInvio) &&
        Objects.equals(idStatoIndirizzo, avvisoAccertamentoVO.idStatoIndirizzo) &&
        Objects.equals(iuv, avvisoAccertamentoVO.iuv) &&
        Objects.equals(aux, avvisoAccertamentoVO.aux) &&
        Objects.equals(cod, avvisoAccertamentoVO.cod) &&
        Objects.equals(codiceIdenEnte, avvisoAccertamentoVO.codiceIdenEnte) &&
        Objects.equals(statoMdp, avvisoAccertamentoVO.statoMdp) &&
        Objects.equals(descrizioneErrore, avvisoAccertamentoVO.descrizioneErrore) &&
        Objects.equals(dovutoSpeseRac, avvisoAccertamentoVO.dovutoSpeseRac) &&
        Objects.equals(emissCo2, avvisoAccertamentoVO.emissCo2) &&
        Objects.equals(dataInstGpl, avvisoAccertamentoVO.dataInstGpl) &&
        Objects.equals(flagRim, avvisoAccertamentoVO.flagRim) &&
        Objects.equals(flagSosp, avvisoAccertamentoVO.flagSosp) &&
        Objects.equals(codCategoria, avvisoAccertamentoVO.codCategoria) &&
        Objects.equals(idVeicolo, avvisoAccertamentoVO.idVeicolo) &&
        Objects.equals(idProprietario, avvisoAccertamentoVO.idProprietario) &&
        Objects.equals(ingiunzionePianoRata, avvisoAccertamentoVO.ingiunzionePianoRata) &&
        Objects.equals(dataPagamentoIngiunzione, avvisoAccertamentoVO.dataPagamentoIngiunzione) &&
        Objects.equals(dataAcquisizionePagamentoIngiunzione, avvisoAccertamentoVO.dataAcquisizionePagamentoIngiunzione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAvvisoAccertamento, idPratica, annoAccertamento, tipoIrregAccertamento, idPosizione, causaleChiusura, sottoCausaleChiusura, tipoPeriodicita, avvisoAccertamentoEnte, numeroProtocollo, dataInvioUltimoFlusso, dataNotifica, irregAccertamento, periodicita, scadenza, validita, dataPagVersInsuff, propTipoPersona, propCodFiscale, propNome, propCognome, propDenominazione, propDataNascita, propComuneNascita, propComuneSpedizione, propStatoEsteroNascita, propProvSpedizione, propSesso, propIndSpedizioneNom, propSedime, propCivico, propCap, veicTarga, veicTipoVeicolo, veicDescTipoVeicolo, veicDataImmatric, veicIdDestinazione, veicDescDestinazione, veicIdUso, veicIdTipoRiduzione, veicDescUso, veicIdAlimentazione, veicDescAlimentazione, veicFlagEcodiesel, idStatoPratica, statoNote, statoDataRegolarizzazione, statoDescCausaleChiusura, statoDescSottoCausaleChiusura, statoData1Chiusura, statoData2Chiusura, versatoTassa, versatoSanzioni, versatoInteresse, versatoTotale, dovutoTassa, dovutoSanzioni, dovutoInteresse, dovutoTotale, dovutoImportoCompensato, dovutoSemestriInteressi, ruoloDataInvioFlusso, calcTassaNeiTermini, ruoloSemestri, ruoloTassa, ruoloSanzioni, ruoloInteresse, ruoloTotale, gmsIdSoggetto, identificativoUtente, dataRiferimentoCalcolo, ctCodiceRegola, numeroPosti, numeroAssi, veicKW, veicMassaComplessiva, veicPortata, categoriaEuro, veicDescRiduzione, veicTassaNoRiduz, veicSanzioniNoRiduz, veicInteressiNoRiduz, veicTotaleNoRiduz, veicNumMensilitaRidotte, veicDataEvento, codTipoComunicazione, codStatoPratica, descStatoPratica, dovutoRimorchiabilita, idStatoSpedizione, rinotificaIdStato, rinotificaDataRicalcInteressi, idCodElab, causaleSospensione, esitoNotifica, isRuoloEQ, descrizioneRuoloEQ, uguVer, uguPag, pec, fonteRiferimentoPec, cdFonteRiferimentoPec, idStatoInvio, idStatoIndirizzo, iuv, aux, cod, codiceIdenEnte, statoMdp, descrizioneErrore, dovutoSpeseRac, emissCo2, dataInstGpl, flagRim, flagSosp, codCategoria, idVeicolo, idProprietario, ingiunzionePianoRata, dataPagamentoIngiunzione, dataAcquisizionePagamentoIngiunzione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvvisoAccertamentoVO {\n");
    
    sb.append("    idAvvisoAccertamento: ").append(toIndentedString(idAvvisoAccertamento)).append("\n");
    sb.append("    idPratica: ").append(toIndentedString(idPratica)).append("\n");
    sb.append("    annoAccertamento: ").append(toIndentedString(annoAccertamento)).append("\n");
    sb.append("    tipoIrregAccertamento: ").append(toIndentedString(tipoIrregAccertamento)).append("\n");
    sb.append("    idPosizione: ").append(toIndentedString(idPosizione)).append("\n");
    sb.append("    causaleChiusura: ").append(toIndentedString(causaleChiusura)).append("\n");
    sb.append("    sottoCausaleChiusura: ").append(toIndentedString(sottoCausaleChiusura)).append("\n");
    sb.append("    tipoPeriodicita: ").append(toIndentedString(tipoPeriodicita)).append("\n");
    sb.append("    avvisoAccertamentoEnte: ").append(toIndentedString(avvisoAccertamentoEnte)).append("\n");
    sb.append("    numeroProtocollo: ").append(toIndentedString(numeroProtocollo)).append("\n");
    sb.append("    dataInvioUltimoFlusso: ").append(toIndentedString(dataInvioUltimoFlusso)).append("\n");
    sb.append("    dataNotifica: ").append(toIndentedString(dataNotifica)).append("\n");
    sb.append("    irregAccertamento: ").append(toIndentedString(irregAccertamento)).append("\n");
    sb.append("    periodicita: ").append(toIndentedString(periodicita)).append("\n");
    sb.append("    scadenza: ").append(toIndentedString(scadenza)).append("\n");
    sb.append("    validita: ").append(toIndentedString(validita)).append("\n");
    sb.append("    dataPagVersInsuff: ").append(toIndentedString(dataPagVersInsuff)).append("\n");
    sb.append("    propTipoPersona: ").append(toIndentedString(propTipoPersona)).append("\n");
    sb.append("    propCodFiscale: ").append(toIndentedString(propCodFiscale)).append("\n");
    sb.append("    propNome: ").append(toIndentedString(propNome)).append("\n");
    sb.append("    propCognome: ").append(toIndentedString(propCognome)).append("\n");
    sb.append("    propDenominazione: ").append(toIndentedString(propDenominazione)).append("\n");
    sb.append("    propDataNascita: ").append(toIndentedString(propDataNascita)).append("\n");
    sb.append("    propComuneNascita: ").append(toIndentedString(propComuneNascita)).append("\n");
    sb.append("    propComuneSpedizione: ").append(toIndentedString(propComuneSpedizione)).append("\n");
    sb.append("    propStatoEsteroNascita: ").append(toIndentedString(propStatoEsteroNascita)).append("\n");
    sb.append("    propProvSpedizione: ").append(toIndentedString(propProvSpedizione)).append("\n");
    sb.append("    propSesso: ").append(toIndentedString(propSesso)).append("\n");
    sb.append("    propIndSpedizioneNom: ").append(toIndentedString(propIndSpedizioneNom)).append("\n");
    sb.append("    propSedime: ").append(toIndentedString(propSedime)).append("\n");
    sb.append("    propCivico: ").append(toIndentedString(propCivico)).append("\n");
    sb.append("    propCap: ").append(toIndentedString(propCap)).append("\n");
    sb.append("    veicTarga: ").append(toIndentedString(veicTarga)).append("\n");
    sb.append("    veicTipoVeicolo: ").append(toIndentedString(veicTipoVeicolo)).append("\n");
    sb.append("    veicDescTipoVeicolo: ").append(toIndentedString(veicDescTipoVeicolo)).append("\n");
    sb.append("    veicDataImmatric: ").append(toIndentedString(veicDataImmatric)).append("\n");
    sb.append("    veicIdDestinazione: ").append(toIndentedString(veicIdDestinazione)).append("\n");
    sb.append("    veicDescDestinazione: ").append(toIndentedString(veicDescDestinazione)).append("\n");
    sb.append("    veicIdUso: ").append(toIndentedString(veicIdUso)).append("\n");
    sb.append("    veicIdTipoRiduzione: ").append(toIndentedString(veicIdTipoRiduzione)).append("\n");
    sb.append("    veicDescUso: ").append(toIndentedString(veicDescUso)).append("\n");
    sb.append("    veicIdAlimentazione: ").append(toIndentedString(veicIdAlimentazione)).append("\n");
    sb.append("    veicDescAlimentazione: ").append(toIndentedString(veicDescAlimentazione)).append("\n");
    sb.append("    veicFlagEcodiesel: ").append(toIndentedString(veicFlagEcodiesel)).append("\n");
    sb.append("    idStatoPratica: ").append(toIndentedString(idStatoPratica)).append("\n");
    sb.append("    statoNote: ").append(toIndentedString(statoNote)).append("\n");
    sb.append("    statoDataRegolarizzazione: ").append(toIndentedString(statoDataRegolarizzazione)).append("\n");
    sb.append("    statoDescCausaleChiusura: ").append(toIndentedString(statoDescCausaleChiusura)).append("\n");
    sb.append("    statoDescSottoCausaleChiusura: ").append(toIndentedString(statoDescSottoCausaleChiusura)).append("\n");
    sb.append("    statoData1Chiusura: ").append(toIndentedString(statoData1Chiusura)).append("\n");
    sb.append("    statoData2Chiusura: ").append(toIndentedString(statoData2Chiusura)).append("\n");
    sb.append("    versatoTassa: ").append(toIndentedString(versatoTassa)).append("\n");
    sb.append("    versatoSanzioni: ").append(toIndentedString(versatoSanzioni)).append("\n");
    sb.append("    versatoInteresse: ").append(toIndentedString(versatoInteresse)).append("\n");
    sb.append("    versatoTotale: ").append(toIndentedString(versatoTotale)).append("\n");
    sb.append("    dovutoTassa: ").append(toIndentedString(dovutoTassa)).append("\n");
    sb.append("    dovutoSanzioni: ").append(toIndentedString(dovutoSanzioni)).append("\n");
    sb.append("    dovutoInteresse: ").append(toIndentedString(dovutoInteresse)).append("\n");
    sb.append("    dovutoTotale: ").append(toIndentedString(dovutoTotale)).append("\n");
    sb.append("    dovutoImportoCompensato: ").append(toIndentedString(dovutoImportoCompensato)).append("\n");
    sb.append("    dovutoSemestriInteressi: ").append(toIndentedString(dovutoSemestriInteressi)).append("\n");
    sb.append("    ruoloDataInvioFlusso: ").append(toIndentedString(ruoloDataInvioFlusso)).append("\n");
    sb.append("    calcTassaNeiTermini: ").append(toIndentedString(calcTassaNeiTermini)).append("\n");
    sb.append("    ruoloSemestri: ").append(toIndentedString(ruoloSemestri)).append("\n");
    sb.append("    ruoloTassa: ").append(toIndentedString(ruoloTassa)).append("\n");
    sb.append("    ruoloSanzioni: ").append(toIndentedString(ruoloSanzioni)).append("\n");
    sb.append("    ruoloInteresse: ").append(toIndentedString(ruoloInteresse)).append("\n");
    sb.append("    ruoloTotale: ").append(toIndentedString(ruoloTotale)).append("\n");
    sb.append("    gmsIdSoggetto: ").append(toIndentedString(gmsIdSoggetto)).append("\n");
    sb.append("    identificativoUtente: ").append(toIndentedString(identificativoUtente)).append("\n");
    sb.append("    dataRiferimentoCalcolo: ").append(toIndentedString(dataRiferimentoCalcolo)).append("\n");
    sb.append("    ctCodiceRegola: ").append(toIndentedString(ctCodiceRegola)).append("\n");
    sb.append("    numeroPosti: ").append(toIndentedString(numeroPosti)).append("\n");
    sb.append("    numeroAssi: ").append(toIndentedString(numeroAssi)).append("\n");
    sb.append("    veicKW: ").append(toIndentedString(veicKW)).append("\n");
    sb.append("    veicMassaComplessiva: ").append(toIndentedString(veicMassaComplessiva)).append("\n");
    sb.append("    veicPortata: ").append(toIndentedString(veicPortata)).append("\n");
    sb.append("    categoriaEuro: ").append(toIndentedString(categoriaEuro)).append("\n");
    sb.append("    veicDescRiduzione: ").append(toIndentedString(veicDescRiduzione)).append("\n");
    sb.append("    veicTassaNoRiduz: ").append(toIndentedString(veicTassaNoRiduz)).append("\n");
    sb.append("    veicSanzioniNoRiduz: ").append(toIndentedString(veicSanzioniNoRiduz)).append("\n");
    sb.append("    veicInteressiNoRiduz: ").append(toIndentedString(veicInteressiNoRiduz)).append("\n");
    sb.append("    veicTotaleNoRiduz: ").append(toIndentedString(veicTotaleNoRiduz)).append("\n");
    sb.append("    veicNumMensilitaRidotte: ").append(toIndentedString(veicNumMensilitaRidotte)).append("\n");
    sb.append("    veicDataEvento: ").append(toIndentedString(veicDataEvento)).append("\n");
    sb.append("    codTipoComunicazione: ").append(toIndentedString(codTipoComunicazione)).append("\n");
    sb.append("    codStatoPratica: ").append(toIndentedString(codStatoPratica)).append("\n");
    sb.append("    descStatoPratica: ").append(toIndentedString(descStatoPratica)).append("\n");
    sb.append("    dovutoRimorchiabilita: ").append(toIndentedString(dovutoRimorchiabilita)).append("\n");
    sb.append("    idStatoSpedizione: ").append(toIndentedString(idStatoSpedizione)).append("\n");
    sb.append("    rinotificaIdStato: ").append(toIndentedString(rinotificaIdStato)).append("\n");
    sb.append("    rinotificaDataRicalcInteressi: ").append(toIndentedString(rinotificaDataRicalcInteressi)).append("\n");
    sb.append("    idCodElab: ").append(toIndentedString(idCodElab)).append("\n");
    sb.append("    causaleSospensione: ").append(toIndentedString(causaleSospensione)).append("\n");
    sb.append("    esitoNotifica: ").append(toIndentedString(esitoNotifica)).append("\n");
    sb.append("    isRuoloEQ: ").append(toIndentedString(isRuoloEQ)).append("\n");
    sb.append("    descrizioneRuoloEQ: ").append(toIndentedString(descrizioneRuoloEQ)).append("\n");
    sb.append("    uguVer: ").append(toIndentedString(uguVer)).append("\n");
    sb.append("    uguPag: ").append(toIndentedString(uguPag)).append("\n");
    sb.append("    pec: ").append(toIndentedString(pec)).append("\n");
    sb.append("    fonteRiferimentoPec: ").append(toIndentedString(fonteRiferimentoPec)).append("\n");
    sb.append("    cdFonteRiferimentoPec: ").append(toIndentedString(cdFonteRiferimentoPec)).append("\n");
    sb.append("    idStatoInvio: ").append(toIndentedString(idStatoInvio)).append("\n");
    sb.append("    idStatoIndirizzo: ").append(toIndentedString(idStatoIndirizzo)).append("\n");
    sb.append("    iuv: ").append(toIndentedString(iuv)).append("\n");
    sb.append("    aux: ").append(toIndentedString(aux)).append("\n");
    sb.append("    cod: ").append(toIndentedString(cod)).append("\n");
    sb.append("    codiceIdenEnte: ").append(toIndentedString(codiceIdenEnte)).append("\n");
    sb.append("    statoMdp: ").append(toIndentedString(statoMdp)).append("\n");
    sb.append("    descrizioneErrore: ").append(toIndentedString(descrizioneErrore)).append("\n");
    sb.append("    dovutoSpeseRac: ").append(toIndentedString(dovutoSpeseRac)).append("\n");
    sb.append("    emissCo2: ").append(toIndentedString(emissCo2)).append("\n");
    sb.append("    dataInstGpl: ").append(toIndentedString(dataInstGpl)).append("\n");
    sb.append("    flagRim: ").append(toIndentedString(flagRim)).append("\n");
    sb.append("    flagSosp: ").append(toIndentedString(flagSosp)).append("\n");
    sb.append("    codCategoria: ").append(toIndentedString(codCategoria)).append("\n");
    sb.append("    idVeicolo: ").append(toIndentedString(idVeicolo)).append("\n");
    sb.append("    idProprietario: ").append(toIndentedString(idProprietario)).append("\n");
    sb.append("    ingiunzionePianoRata: ").append(toIndentedString(ingiunzionePianoRata)).append("\n");
    sb.append("    dataPagamentoIngiunzione: ").append(toIndentedString(dataPagamentoIngiunzione)).append("\n");
    sb.append("    dataAcquisizionePagamentoIngiunzione: ").append(toIndentedString(dataAcquisizionePagamentoIngiunzione)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import it.csi.stacore.staavvisisrv.integration.bo.common.Valuta;
import it.csi.stacore.staavvisisrv.integration.bo.credito.Compensato;
import it.csi.stacore.staavvisisrv.integration.bo.credito.TipoErogazione;
import it.csi.stacore.staavvisisrv.integration.bo.id.GmsIdSoggetto;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdAvvisoAccertamento;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdPosizione;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdPratica;
import it.csi.stacore.staavvisisrv.integration.bo.id.LongId;
import it.csi.stacore.staavvisisrv.integration.bo.veicolo.TipoVeicolo;
import it.csi.stacore.staavvisisrv.integration.util.EqualsUtil;

public class AvvisoAccertamento implements Serializable, Compensato {
	
	static final long serialVersionUID = 889959897946401370L;

	private IdAvvisoAccertamento idAvvisoAccertamento = null;

	private IdPratica idPratica;
	
	private Integer annoAccertamento = null;

	private TipoIrregAccertamento tipoIrregAccertamento = null;

	private IdPosizione idPosizione = null;

	private CausaleChiusura causaleChiusura;

	private SottoCausaleChiusura sottoCausaleChiusura;

	private TipoPeriodicita tipoPeriodicita;

	private AvvisoAccertamentoEnte avvisoAccertamentoEnte;

	private String numeroProtocollo;

	private Date dataInvioUltimoFlusso;

	private Date dataNotifica;

	private String irregAccertamento;

	private String periodicita;

	private Integer scadenza;

	private Integer validita;

	private Date dataPagVersInsuff;

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

	private TipoVeicolo veicTipoVeicolo = null;

	private String veicDescTipoVeicolo = null;

	private Date veicDataImmatric;

	private Integer veicIdDestinazione;

	private String veicDescDestinazione = null;

	private Integer veicIdUso, idTipoRiduzione;

	private String veicDescUso = null;

	private Integer veicIdAlimentazione;

	private String veicDescAlimentazione = null;

	private String veicFlagEcodiesel = null;

	private Integer idStatoPratica;

	private String statoNote = null;

	private Date statoDataRegolarizzazione = null;

	private String statoDescCausaleChiusura = null;

	private String statoDescSottoCausaleChiusura = null;

	private Date statoData1Chiusura = null;

	private Date statoData2Chiusura = null;

	private Valuta versatoTassa = null;

	private Valuta versatoSanzioni = null;

	private Valuta versatoInteresse = null;

	private Valuta versatoTotale = null;

	private Valuta dovutoTassa = null;

	private Valuta dovutoSanzioni = null;

	private Valuta dovutoInteresse = null;

	private Valuta dovutoTotale = null;

	private Valuta dovutoImportoCompensato = null;

	private Integer dovutoSemestriInteressi = null;

	private Date ruoloDataInvioFlusso = null;

	private Valuta calcTassaNeiTermini = null;

	private Integer ruoloSemestri = null;

	private Valuta ruoloTassa = null;

	private Valuta ruoloSanzioni = null;

	private Valuta ruoloInteresse = null;

	private Valuta ruoloTotale = null;

	private GmsIdSoggetto gmsIdSoggetto = null;
	private String identificativoUtente = null;
	private Date dataRiferimentoCalcolo = null;

	private String ctCodiceRegola = null;
	private Map mappaTipoAlgoritmoDatiTecnici = new HashMap(); 

	private Integer numeroPosti,numeroAssi;
	private String veicKW,veicMassaComplessiva,veicPortata,categoriaEuro,veicDescRiduzione; 

	private Valuta veicTassaNoRiduz = null;
	private Valuta veicSanzioniNoRiduz = null;
	private Valuta veicInteresseNoRiduz = null;
	private Valuta veicTotaleNoRiduz = null;
	private Integer veicNumMensilitaRidotte = null;
	private Date  	veicDataEvento = null;
	
	private String codTipoComunicazione = null;

	private String codStatoPratica = null, descStatoPatica;
	
	private Valuta dovutoRimorchiabilita = null;
	
	private Integer idStatoSpedizione = null;
	
	private Integer rinotificaIdStato = null;
	
	private Integer rinotificaDataRicalcInteressi = null;

	private Long idCodElab;

	private CausaleSospensione causaleSospensione;
	
	private String esitoNotifica;
	
	private boolean isRuoloEQ;
	
	private String descrizioneRuoloEQ;
	
	private Date uguVer;
	private Date uguPag;
	
	private String pec;
	private String fonteRiferimentoPec;
	private Integer cdFonteRiferimentoPec = null;
	private Integer idStatoInvio = null;
	private Integer idStatoIndirizzo = null;

	//SB50
	private String iuv;
	private String aux;
	private String cod;
	private String codiceIdenEnte;
	private Integer StatoMdp;
	private String DescrizioneErrore;
	private Valuta dovutoSpeseRac;
	private String emissCo2;
	private String dataInstGpl;
	private String flagRim;
	private String flagSosp;
	private String codCategoria;
	
	private Long idVeicolo;
	private Long idProprietario;
	private String ingiunzionePianoRata;

	private Date dataPagamentoIngiunzione = null;
	private Date dataAcquisizionePagamentoIngiunzione = null;
	
	public Date getUguVer() {
		return uguVer;
	}

	public void setUguVer(Date uguVer) {
		this.uguVer = uguVer;
	}

	public Date getUguPag() {
		return uguPag;
	}

	public void setUguPag(Date uguPag) {
		this.uguPag = uguPag;
	}

	public Integer getIdTipoRiduzione() {
		return idTipoRiduzione;
	}

	public void setIdTipoRiduzione(Integer idTipoRiduzione) {
		this.idTipoRiduzione = idTipoRiduzione;
	}

	public String getDescStatoPatica() {
		return descStatoPatica;
	}

	public void setDescStatoPatica(String descStatoPatica) {
		this.descStatoPatica = descStatoPatica;
	}

	public Valuta getDovutoRimorchiabilita() {
		return dovutoRimorchiabilita;
	}

	public void setDovutoRimorchiabilita(Valuta dovutoRimorchiabilita) {
		this.dovutoRimorchiabilita = dovutoRimorchiabilita;
	}

	public String getCodStatoPratica() {
		return codStatoPratica;
	}

	public void setCodStatoPratica(String codStatoPratica) {
		this.codStatoPratica = codStatoPratica;
	}

	public String getCodTipoComunicazione() {
		return codTipoComunicazione;
	}

	public void setCodTipoComunicazione(String codTipoComunicazione) {
		this.codTipoComunicazione = codTipoComunicazione;
	}

	public String getVeicDescRiduzione() {
		return veicDescRiduzione;
	}

	public void setVeicDescRiduzione(String veicDescRiduzione) {
		this.veicDescRiduzione = veicDescRiduzione;
	}

	public Integer getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(Integer numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	public Integer getNumeroAssi() {
		return numeroAssi;
	}

	public void setNumeroAssi(Integer numeroAssi) {
		this.numeroAssi = numeroAssi;
	}

	public String getVeicKW() {
		return veicKW;
	}

	public void setVeicKW(String veicKW) {
		this.veicKW = veicKW;
	}

	public String getVeicMassaComplessiva() {
		return veicMassaComplessiva;
	}

	public void setVeicMassaComplessiva(String veicMassaComplessiva) {
		this.veicMassaComplessiva = veicMassaComplessiva;
	}

	public String getVeicPortata() {
		return veicPortata;
	}

	public void setVeicPortata(String portata) {
		veicPortata = portata;
	}

	public String getCategoriaEuro() {
		return categoriaEuro;
	}

	public void setCategoriaEuro(String categoriaEuro) {
		this.categoriaEuro = categoriaEuro;
	}

	public String getCtCodiceRegola() {
		return ctCodiceRegola;
	}

	public void setCtCodiceRegola(String ctCodiceRegola) {
		this.ctCodiceRegola = ctCodiceRegola;
	}

	public Map getMappaTipoAlgoritmoDatiTecnici() {
		return mappaTipoAlgoritmoDatiTecnici;
	}

	public void setMappaTipoAlgoritmoDatiTecnici(Map mappaTipoAlgoritmoDatiTecnici) {
		this.mappaTipoAlgoritmoDatiTecnici = mappaTipoAlgoritmoDatiTecnici;
	}

	public Date getDataRiferimentoCalcolo() {
		return dataRiferimentoCalcolo;
	}

	public void setDataRiferimentoCalcolo(Date dataRiferimentoCalcolo) {
		this.dataRiferimentoCalcolo = dataRiferimentoCalcolo;
	}

	public GmsIdSoggetto getGmsIdSoggetto() {
		return gmsIdSoggetto;
	}

	public void setGmsIdSoggetto(GmsIdSoggetto gmsIdSoggetto) {
		this.gmsIdSoggetto = gmsIdSoggetto;
	}

	public String getIdentificativoUtente() {
		return identificativoUtente;
	}

	public void setIdentificativoUtente(String identificativoUtente) {
		this.identificativoUtente = identificativoUtente;
	}

	public AvvisoAccertamento() {
	}
	
	public void setIdAvvisoAccertamento(IdAvvisoAccertamento idAvvisoAccertamento) {
		this.idAvvisoAccertamento = idAvvisoAccertamento;
	}

	public void setAnnoAccertamento(Integer annoAccertamento) {
		this.annoAccertamento = annoAccertamento;
	}

	public void setTipoIrregAccertamento(TipoIrregAccertamento tipoIrregAccertamento) {
		this.tipoIrregAccertamento = tipoIrregAccertamento;
	}

	public void setIdPosizione(IdPosizione idPosizione) {
		this.idPosizione = idPosizione;
	}

	public void setCausaleChiusura(CausaleChiusura causaleChiusura) {
		this.causaleChiusura = causaleChiusura;
	}

	public void setSottoCausaleChiusura(SottoCausaleChiusura sottoCausaleChiusura) {
		this.sottoCausaleChiusura = sottoCausaleChiusura;
	}

	public void setTipoPeriodicita(TipoPeriodicita tipoPeriodicita) {
		this.tipoPeriodicita = tipoPeriodicita;
	}

	public void setAvvisoAccertamentoEnte(AvvisoAccertamentoEnte avvisoAccertamentoEnte) {
		this.avvisoAccertamentoEnte = avvisoAccertamentoEnte;
	}

	public void setNumeroProtocollo(String numeroProtocollo) {
		this.numeroProtocollo = numeroProtocollo;
	}

	public void setDataInvioUltimoFlusso(Date dataInvioUltimoFlusso) {
		this.dataInvioUltimoFlusso = dataInvioUltimoFlusso;
	}

	public void setDataNotifica(Date dataNotifica) {
		this.dataNotifica = dataNotifica;
	}

	public void setIrregAccertamento(String irregAccertamento) {
		this.irregAccertamento = irregAccertamento;
	}

	public void setPeriodicita(String periodicita) {
		this.periodicita = periodicita;
	}

	public void setScadenza(Integer scadenza) {
		this.scadenza = scadenza;
	}

	public void setValidita(Integer validita) {
		this.validita = validita;
	}

	public void setDataPagVersInsuff(Date dataPagVersInsuff) {
		this.dataPagVersInsuff = dataPagVersInsuff;
	}

	public void setPropTipoPersona(String propTipoPersona) {
		this.propTipoPersona = propTipoPersona;
	}

	public void setPropCodFiscale(String propCodFiscale) {
		this.propCodFiscale = propCodFiscale;
	}

	public void setPropNome(String propNome) {
		this.propNome = propNome;
	}

	public void setPropCognome(String propCognome) {
		this.propCognome = propCognome;
	}

	public void setPropDenominazione(String propDenominazione) {
		this.propDenominazione = propDenominazione;
	}

	public void setPropDataNascita(Date propDataNascita) {
		this.propDataNascita = propDataNascita;
	}

	public void setPropComuneNascita(String propComuneNascita) {
		this.propComuneNascita = propComuneNascita;
	}

	public void setPropComuneSpedizione(String propComuneSpedizione) {
		this.propComuneSpedizione = propComuneSpedizione;
	}

	public void setPropStatoEsteroNascita(String propStatoEsteroNascita) {
		this.propStatoEsteroNascita = propStatoEsteroNascita;
	}

	public void setPropProvSpedizione(String propProvSpedizione) {
		this.propProvSpedizione = propProvSpedizione;
	}

	public void setPropSesso(String propSesso) {
		this.propSesso = propSesso;
	}

	public void setPropIndSpedizioneNom(String propIndSpedizioneNom) {
		this.propIndSpedizioneNom = propIndSpedizioneNom;
	}

	public void setPropSedime(String propSedime) {
		this.propSedime = propSedime;
	}

	public void setPropCivico(String propCivico) {
		this.propCivico = propCivico;
	}

	public void setPropCap(String propCap) {
		this.propCap = propCap;
	}

	public void setVeicTarga(String veicTarga) {
		this.veicTarga = veicTarga;
	}

	public void setVeicTipoVeicolo(TipoVeicolo veicTipoVeicolo) {
		this.veicTipoVeicolo = veicTipoVeicolo;
	}

	public void setVeicDescTipoVeicolo(String veicDescTipoVeicolo) {
		this.veicDescTipoVeicolo = veicDescTipoVeicolo;
	}

	public void setVeicDataImmatric(Date veicDataImmatric) {
		this.veicDataImmatric = veicDataImmatric;
	}

	public void setVeicIdDestinazione(Integer veicIdDestinazione) {
		this.veicIdDestinazione = veicIdDestinazione;
	}

	public void setVeicDescDestinazione(String veicDescDestinazione) {
		this.veicDescDestinazione = veicDescDestinazione;
	}

	public void setVeicIdUso(Integer veicIdUso) {
		this.veicIdUso = veicIdUso;
	}

	public void setVeicDescUso(String veicDescUso) {
		this.veicDescUso = veicDescUso;
	}

	public void setVeicIdAlimentazione(Integer veicIdAlimentazione) {
		this.veicIdAlimentazione = veicIdAlimentazione;
	}

	public void setVeicDescAlimentazione(String veicDescAlimentazione) {
		this.veicDescAlimentazione = veicDescAlimentazione;
	}

	public void setVeicFlagEcodiesel(String veicFlagEcodiesel) {
		this.veicFlagEcodiesel = veicFlagEcodiesel;
	}

	public void setIdStatoPratica(Integer idStatoPratica) {
		this.idStatoPratica = idStatoPratica;
	}

	public void setStatoNote(String statoNote) {
		this.statoNote = statoNote;
	}

	public void setStatoDataRegolarizzazione(Date statoDataRegolarizzazione) {
		this.statoDataRegolarizzazione = statoDataRegolarizzazione;
	}

	public void setStatoDescCausaleChiusura(String statoDescCausaleChiusura) {
		this.statoDescCausaleChiusura = statoDescCausaleChiusura;
	}

	public void setStatoDescSottoCausaleChiusura(String statoDescSottoCausaleChiusura) {
		this.statoDescSottoCausaleChiusura = statoDescSottoCausaleChiusura;
	}

	public void setStatoData1Chiusura(Date statoData1Chiusura) {
		this.statoData1Chiusura = statoData1Chiusura;
	}

	public void setStatoData2Chiusura(Date statoData2Chiusura) {
		this.statoData2Chiusura = statoData2Chiusura;
	}

	public void setVersatoTassa(Valuta versatoTassa) {
		this.versatoTassa = versatoTassa;
	}

	public void setVersatoSanzioni(Valuta versatoSanzioni) {
		this.versatoSanzioni = versatoSanzioni;
	}

	public void setVersatoInteresse(Valuta versatoInteresse) {
		this.versatoInteresse = versatoInteresse;
	}

	public void setVersatoTotale(Valuta versatoTotale) {
		this.versatoTotale = versatoTotale;
	}

	public void setDovutoTassa(Valuta dovutoTassa) {
		this.dovutoTassa = dovutoTassa;
	}

	public void setDovutoSanzioni(Valuta dovutoSanzioni) {
		this.dovutoSanzioni = dovutoSanzioni;
	}

	public void setDovutoInteresse(Valuta dovutoInteresse) {
		this.dovutoInteresse = dovutoInteresse;
	}

	public void setDovutoTotale(Valuta dovutoTotale) {
		this.dovutoTotale = dovutoTotale;
	}

	public void setDovutoImportoCompensato(Valuta dovutoImportoCompensato) {
		this.dovutoImportoCompensato = dovutoImportoCompensato;
	}

	public void setDovutoSemestriInteressi(Integer dovutoSemestriInteressi) {
		this.dovutoSemestriInteressi = dovutoSemestriInteressi;
	}

	public void setRuoloDataInvioFlusso(Date ruoloDataInvioFlusso) {
		this.ruoloDataInvioFlusso = ruoloDataInvioFlusso;
	}

	public void setCalcTassaNeiTermini(Valuta calcTassaNeiTermini) {
		this.calcTassaNeiTermini = calcTassaNeiTermini;
	}

	public void setRuoloSemestri(Integer ruoloSemestri) {
		this.ruoloSemestri = ruoloSemestri;
	}

	public void setRuoloTassa(Valuta ruoloTassa) {
		this.ruoloTassa = ruoloTassa;
	}

	public void setRuoloSanzioni(Valuta ruoloSanzioni) {
		this.ruoloSanzioni = ruoloSanzioni;
	}

	public void setRuoloInteresse(Valuta ruoloInteresse) {
		this.ruoloInteresse = ruoloInteresse;
	}

	public void setRuoloTotale(Valuta ruoloTotale) {
		this.ruoloTotale = ruoloTotale;
	}

	public AvvisoAccertamento(IdAvvisoAccertamento idAvvisoAccertamento, IdPratica idPratica, Integer annoAccertamento,
			TipoIrregAccertamento tipoIrregAccertamento, IdPosizione idPosizione, CausaleChiusura causaleChiusura,
			SottoCausaleChiusura sottoCausaleChiusura, TipoPeriodicita tipoPeriodicita, AvvisoAccertamentoEnte avvisoAccertamentoEnte,
			String numeroProtocollo, Date dataInvioUltimoFlusso, Date dataNotifica, String irregAccertamento, String periodicita, Integer scadenza,
			Integer validita, Date dataPagVersInsuff, String propTipoPersona, String propCodFiscale, String propNome, String propCognome,
			String propDenominazione, Date propDataNascita, String propComuneNascita, String propComuneSpedizione, String propStatoEsteroNascita,
			String propProvSpedizione, String propSesso, String propIndSpedizioneNom, String propSedime, String propCivico, String propCap,
			String veicTarga, TipoVeicolo veicTipoVeicolo, String veicDescTipoVeicolo, Date veicDataImmatric, Integer veicIdDestinazione,
			String veicDescDestinazione, Integer veicIdUso, String veicDescUso, Integer veicIdAlimentazione, String veicDescAlimentazione,
			String veicFlagEcodiesel, Integer idStatoPratica, String statoNote,
			Date statoDataRegolarizzazione, String statoDescCausaleChiusura, String statoDescSottoCausaleChiusura, Date statoData1Chiusura,
			Date statoData2Chiusura, Valuta versatoTassa, Valuta versatoSanzioni, Valuta versatoInteresse, Valuta versatoTotale, Valuta dovutoTassa,
			Valuta dovutoSanzioni, Valuta dovutoInteresse, Valuta dovutoTotale, Valuta dovutoImportoCompensato, Integer dovutoSemestriInteressi,
			Date ruoloDataInvioFlusso, Valuta calcTassaNeiTermini, Integer ruoloSemestri, Valuta ruoloTassa, Valuta ruoloSanzioni,
			Valuta ruoloInteresse, Valuta ruoloTotale) {
		
		super();

		this.idAvvisoAccertamento = idAvvisoAccertamento;
		this.idPratica  = idPratica;
		this.annoAccertamento = annoAccertamento;
		this.tipoIrregAccertamento = tipoIrregAccertamento;
		this.idPosizione = idPosizione;
		this.causaleChiusura = causaleChiusura;
		this.sottoCausaleChiusura = sottoCausaleChiusura;
		this.tipoPeriodicita = tipoPeriodicita;
		this.avvisoAccertamentoEnte = avvisoAccertamentoEnte;
		this.numeroProtocollo = numeroProtocollo;
		this.dataInvioUltimoFlusso = dataInvioUltimoFlusso;
		this.dataNotifica = dataNotifica;
		this.irregAccertamento = irregAccertamento;
		this.periodicita = periodicita;
		this.scadenza = scadenza;
		this.validita = validita;
		this.dataPagVersInsuff = dataPagVersInsuff;
		this.propTipoPersona = propTipoPersona;
		this.propCodFiscale = propCodFiscale;
		this.propNome = propNome;
		this.propCognome = propCognome;
		this.propDenominazione = propDenominazione;
		this.propDataNascita = propDataNascita;
		this.propComuneNascita = propComuneNascita;
		this.propComuneSpedizione = propComuneSpedizione;
		this.propStatoEsteroNascita = propStatoEsteroNascita;
		this.propProvSpedizione = propProvSpedizione;
		this.propSesso = propSesso;
		this.propIndSpedizioneNom = propIndSpedizioneNom;
		this.propSedime = propSedime;
		this.propCivico = propCivico;
		this.propCap = propCap;
		this.veicTarga = veicTarga;
		this.veicTipoVeicolo = veicTipoVeicolo;
		this.veicDescTipoVeicolo = veicDescTipoVeicolo;
		this.veicDataImmatric = veicDataImmatric;
		this.veicIdDestinazione = veicIdDestinazione;
		this.veicDescDestinazione = veicDescDestinazione;
		this.veicIdUso = veicIdUso;
		this.veicDescUso = veicDescUso;
		this.veicIdAlimentazione = veicIdAlimentazione;
		this.veicDescAlimentazione = veicDescAlimentazione;
		this.veicFlagEcodiesel = veicFlagEcodiesel;
		this.idStatoPratica = idStatoPratica;
		this.statoNote = statoNote;
		this.statoDataRegolarizzazione = statoDataRegolarizzazione;
		this.statoDescCausaleChiusura = statoDescCausaleChiusura;
		this.statoDescSottoCausaleChiusura = statoDescSottoCausaleChiusura;
		this.statoData1Chiusura = statoData1Chiusura;
		this.statoData2Chiusura = statoData2Chiusura;
		this.versatoTassa = versatoTassa;
		this.versatoSanzioni = versatoSanzioni;
		this.versatoInteresse = versatoInteresse;
		this.versatoTotale = versatoTotale;
		this.dovutoTassa = dovutoTassa;
		this.dovutoSanzioni = dovutoSanzioni;
		this.dovutoInteresse = dovutoInteresse;
		this.dovutoTotale = dovutoTotale;
		this.dovutoImportoCompensato = dovutoImportoCompensato;
		this.dovutoSemestriInteressi = dovutoSemestriInteressi;
		this.ruoloDataInvioFlusso = ruoloDataInvioFlusso;
		this.calcTassaNeiTermini = calcTassaNeiTermini;
		this.ruoloSemestri = ruoloSemestri;
		this.ruoloTassa = ruoloTassa;
		this.ruoloSanzioni = ruoloSanzioni;
		this.ruoloInteresse = ruoloInteresse;
		this.ruoloTotale = ruoloTotale;
	}

	public Integer getAnnoAccertamento() {
		return annoAccertamento;
	}

	public AvvisoAccertamentoEnte getAvvisoAccertamentoEnte() {
		return avvisoAccertamentoEnte;
	}

	public Valuta getCalcTassaNeiTermini() {
		return calcTassaNeiTermini;
	}

	public CausaleChiusura getCausaleChiusura() {
		return causaleChiusura;
	}

	public Date getDataInvioUltimoFlusso() {
		return dataInvioUltimoFlusso;
	}

	public Date getDataNotifica() {
		return dataNotifica;
	}

	public Date getDataPagVersInsuff() {
		return dataPagVersInsuff;
	}

	public Valuta getDovutoImportoCompensato() {
		return dovutoImportoCompensato;
	}

	public Valuta getDovutoInteresse() {
		return dovutoInteresse;
	}

	public Valuta getDovutoSanzioni() {
		return dovutoSanzioni;
	}

	public Integer getDovutoSemestriInteressi() {
		return dovutoSemestriInteressi;
	}

	public Valuta getDovutoTassa() {
		return dovutoTassa;
	}

	public Valuta getDovutoTotale() {
		return dovutoTotale;
	}

	public IdAvvisoAccertamento getIdAvvisoAccertamento() {
		return idAvvisoAccertamento;
	}

	public IdPosizione getIdPosizione() {
		return idPosizione;
	}

	public Integer getIdStatoPratica() {
		return idStatoPratica;
	}

	public String getIrregAccertamento() {
		return irregAccertamento;
	}

	public String getNumeroProtocollo() {
		return numeroProtocollo;
	}

	public String getPeriodicita() {
		return periodicita;
	}

	public String getPropCap() {
		return propCap;
	}

	public String getPropCivico() {
		return propCivico;
	}

	public String getPropCodFiscale() {
		return propCodFiscale;
	}

	public String getPropCognome() {
		return propCognome;
	}

	public String getPropComuneNascita() {
		return propComuneNascita;
	}

	public String getPropComuneSpedizione() {
		return propComuneSpedizione;
	}

	public Date getPropDataNascita() {
		return propDataNascita;
	}

	public String getPropDenominazione() {
		return propDenominazione;
	}

	public String getPropIndSpedizioneNom() {
		return propIndSpedizioneNom;
	}

	public String getPropNome() {
		return propNome;
	}

	public String getPropProvSpedizione() {
		return propProvSpedizione;
	}

	public String getPropSedime() {
		return propSedime;
	}

	public String getPropSesso() {
		return propSesso;
	}

	public String getPropStatoEsteroNascita() {
		return propStatoEsteroNascita;
	}

	public String getPropTipoPersona() {
		return propTipoPersona;
	}

	public Date getRuoloDataInvioFlusso() {
		return ruoloDataInvioFlusso;
	}

	public Valuta getRuoloInteresse() {
		return ruoloInteresse;
	}

	public Valuta getRuoloSanzioni() {
		return ruoloSanzioni;
	}

	public Integer getRuoloSemestri() {
		return ruoloSemestri;
	}

	public Valuta getRuoloTassa() {
		return ruoloTassa;
	}

	public Valuta getRuoloTotale() {
		return ruoloTotale;
	}

	public Integer getScadenza() {
		return scadenza;
	}

	public SottoCausaleChiusura getSottoCausaleChiusura() {
		return sottoCausaleChiusura;
	}

	public Date getStatoData1Chiusura() {
		return statoData1Chiusura;
	}

	public Date getStatoData2Chiusura() {
		return statoData2Chiusura;
	}

	public Date getStatoDataRegolarizzazione() {
		return statoDataRegolarizzazione;
	}

	public String getStatoDescCausaleChiusura() {
		return statoDescCausaleChiusura;
	}

	public String getStatoDescSottoCausaleChiusura() {
		return statoDescSottoCausaleChiusura;
	}

	public String getStatoNote() {
		return statoNote;
	}

	public TipoIrregAccertamento getTipoIrregAccertamento() {
		return tipoIrregAccertamento;
	}

	public TipoPeriodicita getTipoPeriodicita() {
		return tipoPeriodicita;
	}

	public Integer getValidita() {
		return validita;
	}

	public Date getVeicDataImmatric() {
		return veicDataImmatric;
	}

	public String getVeicDescAlimentazione() {
		return veicDescAlimentazione;
	}

	public String getVeicDescDestinazione() {
		return veicDescDestinazione;
	}

	public String getVeicDescTipoVeicolo() {
		return veicDescTipoVeicolo;
	}

	public String getVeicDescUso() {
		return veicDescUso;
	}

	public String getVeicFlagEcodiesel() {
		return veicFlagEcodiesel;
	}

	public Integer getVeicIdAlimentazione() {
		return veicIdAlimentazione;
	}

	public Integer getVeicIdDestinazione() {
		return veicIdDestinazione;
	}

	public TipoVeicolo getVeicTipoVeicolo() {
		return veicTipoVeicolo;
	}

	public Integer getVeicIdUso() {
		return veicIdUso;
	}

	public String getVeicTarga() {
		return veicTarga;
	}

	public Valuta getVersatoInteresse() {
		return versatoInteresse;
	}

	public Valuta getVersatoSanzioni() {
		return versatoSanzioni;
	}

	public Valuta getVersatoTassa() {
		return versatoTassa;
	}

	public Valuta getVersatoTotale() {
		return versatoTotale;
	}

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof AvvisoAccertamento) {
			AvvisoAccertamento altro = (AvvisoAccertamento) object;
			equals = EqualsUtil.objectEquals(getIdAvvisoAccertamento(), altro.getIdAvvisoAccertamento());
		}

		return equals;
	}

	public LongId getIdCompensato() {
		return idAvvisoAccertamento;
	}

	public TipoErogazione getTipoErogazione() {
		return TipoErogazione.TIPO_EROGAZIONE_AVV_ACCERTAMENTO;
	}

	public String getTargaCompensato() {
		return getVeicTarga();
	}

	public TipoVeicolo getTipoVeicoloCompensato() {
		return getVeicTipoVeicolo();
	}

	public Integer getScadenzaCompensato() {
		return getScadenza();
	}

	public Integer getValiditaCompensato() {
		return getValidita();
	}

	public String getCognomeDenominazione() {
		if (StringUtils.isNotBlank(propCognome)) {
			return propCognome;
		}

		return StringUtils.trimToEmpty(propDenominazione);
	}
	
	public Valuta getVeicTassaNoRiduz() {
		return veicTassaNoRiduz;
	}

	public void setVeicTassaNoRiduz(Valuta veicTassaNoRiduz) {
		this.veicTassaNoRiduz = veicTassaNoRiduz;
	}

	public Valuta getVeicSanzioniNoRiduz() {
		return veicSanzioniNoRiduz;
	}

	public void setVeicSanzioniNoRiduz(Valuta veicSanzioniNoRiduz) {
		this.veicSanzioniNoRiduz = veicSanzioniNoRiduz;
	}

	public Valuta getVeicInteresseNoRiduz() {
		return veicInteresseNoRiduz;
	}

	public void setVeicInteresseNoRiduz(Valuta veicInteresseNoRiduz) {
		this.veicInteresseNoRiduz = veicInteresseNoRiduz;
	}

	public Valuta getVeicTotaleNoRiduz() {
		return veicTotaleNoRiduz;
	}

	public void setVeicTotaleNoRiduz(Valuta veicTotaleNoRiduz) {
		this.veicTotaleNoRiduz = veicTotaleNoRiduz;
	}

	public Integer getVeicNumMensilitaRidotte() {
		return veicNumMensilitaRidotte;
	}

	public void setVeicNumMensilitaRidotte(Integer veicNumMensilitaRidotte) {
		this.veicNumMensilitaRidotte = veicNumMensilitaRidotte;
	}

	public Date getVeicDataEvento() {
		return veicDataEvento;
	}

	public void setVeicDataEvento(Date veicDataEvento) {
		this.veicDataEvento = veicDataEvento;
	}

	public void setIdStatoSpedizione(Integer idStatoSpedizione) {
		this.idStatoSpedizione = idStatoSpedizione;
	}

	public Integer getIdStatoSpedizione() {
		return idStatoSpedizione;
	}

	public void setIdCodElab(Long idCodElab) {
		this.idCodElab = idCodElab;
	}

	public Long getIdCodElab() {
		return idCodElab;
	}

	public void setRinotificaIdStato(Integer rinotificaIdStato) {
		this.rinotificaIdStato = rinotificaIdStato;
	}

	public Integer getRinotificaIdStato() {
		return rinotificaIdStato;
	}

	public void setRinotificaDataRicalcInteressi(
			Integer rinotificaDataRicalcInteressi) {
		this.rinotificaDataRicalcInteressi = rinotificaDataRicalcInteressi;
	}

	public Integer getRinotificaDataRicalcInteressi() {
		return rinotificaDataRicalcInteressi;
	}

	public CausaleSospensione getCausaleSospensione() {
		return causaleSospensione;
	}

	public void setCausaleSospensione(CausaleSospensione causaleSospensione) {
		this.causaleSospensione = causaleSospensione;
	}

	public IdPratica getIdPratica() {
		return idPratica;
	}

	public void setIdPratica(IdPratica idPratica) {
		this.idPratica = idPratica;
	}

	public String getEsitoNotifica() {
		return esitoNotifica;
	}

	public void setEsitoNotifica(String esitoNotifica) {
		this.esitoNotifica = esitoNotifica;
	}

	public boolean isRuoloEQ() {
		return isRuoloEQ;
	}

	public void setRuoloEQ(boolean isRuoloEQ) {
		this.isRuoloEQ = isRuoloEQ;
	}

	public String getDescrizioneRuoloEQ() {
		return descrizioneRuoloEQ;
	}

	public void setDescrizioneRuoloEQ(String descrizioneRuoloEQ) {
		this.descrizioneRuoloEQ = descrizioneRuoloEQ;
	}


	public String getPec() {
		return pec;
	}

	public void setPec(String pec) {
		this.pec = pec;
	}

	public String getFonteRiferimentoPec() {
		return fonteRiferimentoPec;
	}

	public void setFonteRiferimentoPec(String fonteRiferimentoPec) {
		this.fonteRiferimentoPec = fonteRiferimentoPec;
	}

	public Integer getCdFonteRiferimentoPec() {
		return cdFonteRiferimentoPec;
	}

	public void setCdFonteRiferimentoPec(Integer cdFonteRiferimentoPec) {
		this.cdFonteRiferimentoPec = cdFonteRiferimentoPec;
	}

	public Integer getIdStatoInvio() {
		return idStatoInvio;
	}

	public void setIdStatoInvio(Integer idStatoInvio) {
		this.idStatoInvio = idStatoInvio;
	}

	public Integer getIdStatoIndirizzo() {
		return idStatoIndirizzo;
	}

	public void setIdStatoIndirizzo(Integer idStatoIndirizzo) {
		this.idStatoIndirizzo = idStatoIndirizzo;
	}

	public String getIuv() {
		return iuv;
	}

	public void setIuv(String iuv) {
		this.iuv = iuv;
	}

	public Integer getStatoMdp() {
		return StatoMdp;
	}

	public void setStatoMdp(Integer statoMdp) {
		StatoMdp = statoMdp;
	}

	public String getDescrizioneErrore() {
		return DescrizioneErrore;
	}

	public void setDescrizioneErrore(String descrizioneErrore) {
		DescrizioneErrore = descrizioneErrore;
	}

	public String getAux() {
		return aux;
	}

	public void setAux(String aux) {
		this.aux = aux;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getCodiceIdenEnte() {
		return codiceIdenEnte;
	}

	public void setCodiceIdenEnte(String codiceIdenEnte) {
		this.codiceIdenEnte = codiceIdenEnte;
	}

	public Valuta getDovutoSpeseRac() {
		return dovutoSpeseRac;
	}

	public void setDovutoSpeseRac(Valuta dovutoSpeseRac) {
		this.dovutoSpeseRac = dovutoSpeseRac;
	}

	public String getEmissCo2() {
		return emissCo2;
	}

	public void setEmissCo2(String emissCo2) {
		this.emissCo2 = emissCo2;
	}

	public String getDataInstGpl() {
		return dataInstGpl;
	}

	public void setDataInstGpl(String dataInstGpl) {
		this.dataInstGpl = dataInstGpl;
	}

	public String getFlagRim() {
		return flagRim;
	}

	public void setFlagRim(String flagRim) {
		this.flagRim = flagRim;
	}

	public String getFlagSosp() {
		return flagSosp;
	}

	public void setFlagSosp(String flagSosp) {
		this.flagSosp = flagSosp;
	}

	public String getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(String codCategoria) {
		this.codCategoria = codCategoria;
	}

	public Long getIdVeicolo() {
		return idVeicolo;
	}

	public void setIdVeicolo(Long idVeicolo) {
		this.idVeicolo = idVeicolo;
	}

	public Long getIdProprietario() {
		return idProprietario;
	}

	public void setIdProprietario(Long idProprietario) {
		this.idProprietario = idProprietario;
	}

	public String getIngiunzionePianoRata() {
		return ingiunzionePianoRata;
	}

	public void setIngiunzionePianoRata(String ingiunzionePianoRata) {
		this.ingiunzionePianoRata = ingiunzionePianoRata;
	}

	public Date getDataPagamentoIngiunzione() {
		return dataPagamentoIngiunzione;
	}

	public void setDataPagamentoIngiunzione(Date dataPagamentoIngiunzione) {
		this.dataPagamentoIngiunzione = dataPagamentoIngiunzione;
	}

	public Date getDataAcquisizionePagamentoIngiunzione() {
		return dataAcquisizionePagamentoIngiunzione;
	}

	public void setDataAcquisizionePagamentoIngiunzione(Date dataAcquisizionePagamentoIngiunzione) {
		this.dataAcquisizionePagamentoIngiunzione = dataAcquisizionePagamentoIngiunzione;
	}

}

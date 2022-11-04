package it.csi.stacore.staavvisisrv.integration.bo.factory;

import java.io.Serializable;

import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.CausaleChiusura;
import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.CausaleSospensione;
import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.StatoAccertamento;
import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.TipoAvvisoAccertamento;
import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.TipoIrregAccertamento;
import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.TipoPeriodicita;
import it.csi.stacore.staavvisisrv.integration.bo.common.Divisa;
import it.csi.stacore.staavvisisrv.integration.bo.credito.TipoCredito;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdDecodifica;
import it.csi.stacore.staavvisisrv.integration.bo.veicolo.TipoVeicolo;
/*
import it.csi.stacore.staconsultsrv.integration.bo.agevolazione.TipoAgevolazione;
import it.csi.stacore.staconsultsrv.integration.bo.avvisoscadenza.StatoAvvisoScadenza;
import it.csi.stacore.staconsultsrv.integration.bo.avvisoscadenza.TipoAvvisoScadenza;
import it.csi.stacore.staconsultsrv.integration.bo.common.Annotazione;
import it.csi.stacore.staconsultsrv.integration.bo.common.Categoria;
import it.csi.stacore.staconsultsrv.integration.bo.common.Fonte;
import it.csi.stacore.staconsultsrv.integration.bo.common.Integrazione;
import it.csi.stacore.staconsultsrv.integration.bo.common.Regione;
import it.csi.stacore.staconsultsrv.integration.bo.common.Specialita;
import it.csi.stacore.staconsultsrv.integration.bo.common.StatoRuolo;
import it.csi.stacore.staconsultsrv.integration.bo.common.StatoTributo;
import it.csi.stacore.staconsultsrv.integration.bo.common.TipoAggregazione;
import it.csi.stacore.staconsultsrv.integration.bo.common.TipoContributo;
import it.csi.stacore.staconsultsrv.integration.bo.common.TipoEvento;
import it.csi.stacore.staconsultsrv.integration.bo.common.TipoLettera;
import it.csi.stacore.staconsultsrv.integration.bo.common.TipoOperazione;
import it.csi.stacore.staconsultsrv.integration.bo.common.TipoOperazioneLogica;
import it.csi.stacore.staconsultsrv.integration.bo.common.TipoOperazioneTabella;
import it.csi.stacore.staconsultsrv.integration.bo.common.TipoSanzionamento;
import it.csi.stacore.staconsultsrv.integration.bo.common.TipoTassazione;
import it.csi.stacore.staconsultsrv.integration.bo.common.Uso;
import it.csi.stacore.staconsultsrv.integration.bo.id.IdFonte;
import it.csi.stacore.staconsultsrv.integration.bo.id.IdRegione;
import it.csi.stacore.staconsultsrv.integration.bo.id.IdTipoEvento;
import it.csi.stacore.staconsultsrv.integration.bo.intermediario.TipoIntermediario;
import it.csi.stacore.staconsultsrv.integration.bo.notifica.EsitoNotifica;
import it.csi.stacore.staconsultsrv.integration.bo.notifica.TipoNotifica;
import it.csi.stacore.staconsultsrv.integration.bo.riduzione.TipoRiduzione;
import it.csi.stacore.staconsultsrv.integration.bo.segnalazione.CausaleSegnalazione;
import it.csi.stacore.staconsultsrv.integration.bo.segnalazione.MotivoSegnalazione;
import it.csi.stacore.staconsultsrv.integration.bo.segnalazione.StatoSegnalazione;
import it.csi.stacore.staconsultsrv.integration.bo.segnalazione.TipoAvvisoSegnalazione;
import it.csi.stacore.staconsultsrv.integration.bo.veicolo.Alimentazione;
import it.csi.stacore.staconsultsrv.integration.bo.veicolo.Carrozzeria;
import it.csi.stacore.staconsultsrv.integration.bo.veicolo.CategoriaEuro;
import it.csi.stacore.staconsultsrv.integration.bo.veicolo.Combustibile;
import it.csi.stacore.staconsultsrv.integration.bo.veicolo.DestinazioneVeicolo;
import it.csi.stacore.staconsultsrv.integration.bo.veicolo.UsoVeicolo;
*/


public class DecodificaFactory implements Serializable {
	
	private static final long serialVersionUID = -5715257629958678871L;

	private static DecodificaFactory istance = new DecodificaFactory();

	private static final int TIPO_VEICOLO = 1;

	private static final int TIPO_USO_VEICOLO = 2;

	private static final int TIPO_CARROZZERIA = 3;

	private static final int TIPO_COMBUSTIBILE = 4;

	private static final int TIPO_DESTINAZIONE_VEICOLO = 5;

	private static final int TIPO_DIVISA = 6;

	private static final int TIPO_FONTE = 7;

	private static final int TIPO_REGIONE = 8;

	private static final int TIPO_EVENTO = 9;

	private static final int TIPO_AGEVOLAZIONE = 10;

	private static final int TIPO_RIDUZIONE = 11;

	private static final int TIPO_INTERMEDIARIO = 12;

	private static final int TIPO_SANZIONAMENTO = 13;

	private static final int TIPO_CONTRIBUTO = 14;

	private static final int TIPO_OPERAZIONE_LOGICA = 15;

	private static final int TIPO_OPERAZIONE = 16;

	private static final int TIPO_OPERAZIONE_TABELLA = 17;

	private static final int TIPO_AGGREGAZIONE = 18;

	private static final int ALIMENTAZIONE = 19;

	private static final int USO = 20;

	private static final int CATEGORIA = 21;

	private static final int ANNOTAZIONE = 22;

	private static final int INTEGRAZIONE = 23;

	private static final int STATO_SEGNALAZIONE = 24;

	private static final int TIPO_AVVISO_SEGNALAZIONE = 25;

	private static final int MOTIVO_SEGNALAZIONE = 26;

	private static final int CAUSALE_SEGNALAZIONE = 27;

	private static final int TIPO_AVVISO_SCADENZA = 28;

	private static final int STATO_AVVISO_SCADENZA = 29;

	private static final int STATO_ACCERTAMENTO = 30;

	private static final int CAUSALE_CHIUSURA = 31;

	private static final int TIPO_AVVISO_ACCERTAMENTO = 32;

	private static final int TIPO_PERIODICITA = 33;

	private static final int TIPO_TASSAZIONE = 34;

	private static final int STATO_TRIBUTO = 35;

	private static final int STATO_RUOLO = 36;

	private static final int TIPO_CREDITO = 37;

	private static final int TIPO_IRREG_ACCERTAMENTO = 38;

	private static final int CATEGORIA_EURO = 39;

	private static final int SPECIALITA = 40;
	
	private static final int CAUSALE_SOSPENSIONE = 41;

	private static final int TIPO_LETTERA = 42;

	private static final int ESITO_NOTIFICA = 43;

	private static final int TIPO_NOTIFICA = 44;
	
	private DecodificaFactory() {
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public static DecodificaFactory getInstance() {
		if (istance == null) {
			istance = new DecodificaFactory();
		}

		return istance;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param id DOCUMENT ME!
	 * @param codice DOCUMENT ME!
	 * @param descrizione DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public TipoVeicolo getTipoVeicolo(Long id, String codice, String descrizione) {
		return (TipoVeicolo) get(TIPO_VEICOLO, id, codice, descrizione);
	}

	public TipoCredito getTipoCredito(Long id, String codice, String descrizione) {
		return (TipoCredito) get(TIPO_CREDITO, id, codice, descrizione);
	}

	/*
	public UsoVeicolo getTipoUsoVeicolo(Long id, String codice, String descrizione) {
		return (UsoVeicolo) get(TIPO_USO_VEICOLO, id, codice, descrizione);
	}

	
	public Carrozzeria getTipoCarrozzeria(Long id, String codice, String descrizione) {
		return (Carrozzeria) get(TIPO_CARROZZERIA, id, codice, descrizione);
	}
	*/
	/*
	public Combustibile getTipoCombustibile(Long id, String codice, String descrizione) {
		return (Combustibile) get(TIPO_COMBUSTIBILE, id, codice, descrizione);
	}
	*/
	
	/*
	public DestinazioneVeicolo getDestinazioneVeicolo(Long id, String codice, String descrizione) {
		return (DestinazioneVeicolo) get(TIPO_DESTINAZIONE_VEICOLO, id, codice, descrizione);
	}

	*/
	
	public Divisa getDivisa(Long id, String codice, String descrizione) {
		return (Divisa) get(TIPO_DIVISA, id, codice, descrizione);
	}

	/*
	public Fonte getFonte(Long id, String codice, String descrizione) {
		return (Fonte) get(TIPO_FONTE, id, codice, descrizione);
	}

	
	public Regione getRegione(Long id, String codice, String descrizione) {
		return (Regione) get(TIPO_REGIONE, id, codice, descrizione);
	}

	
	public TipoEvento getTipoEvento(Long id, String codice, String descrizione) {
		return (TipoEvento) get(TIPO_EVENTO, id, codice, descrizione);
	}

	
	public TipoAgevolazione getTipoAgevolazione(Long id, String codice, String descrizione) {
		return (TipoAgevolazione) get(TIPO_AGEVOLAZIONE, id, codice, descrizione);
	}

	
	public TipoRiduzione getTipoRiduzione(Long id, String codice, String descrizione, Date dataInizio, Date dataFine) {
		return (TipoRiduzione) get(TIPO_RIDUZIONE, id, codice, descrizione, dataInizio, dataFine);
	}

	
	public TipoIntermediario getTipoIntermediario(Long id, String codice, String descrizione) {
		return (TipoIntermediario) get(TIPO_INTERMEDIARIO, id, codice, descrizione);
	}

	
	public TipoSanzionamento getTipoSanzionamento(Long id, String codice, String descrizione) {
		return (TipoSanzionamento) get(TIPO_SANZIONAMENTO, id, codice, descrizione);
	}

	
	public TipoContributo getTipoContributo(Long id, String codice, String descrizione) {
		return (TipoContributo) get(TIPO_CONTRIBUTO, id, codice, descrizione);
	}

	
	public TipoOperazioneLogica getTipoOperazioneLogica(Long id, String codice, String descrizione) {
		return (TipoOperazioneLogica) get(TIPO_OPERAZIONE_LOGICA, id, codice, descrizione);
	}

	
	public TipoOperazione getTipoOperazione(Long id, String codice, String descrizione) {
		return (TipoOperazione) get(TIPO_OPERAZIONE, id, codice, descrizione);
	}

	
	public TipoOperazioneTabella getTipoOperazioneTabella(Long id, String codice, String descrizione) {
		return (TipoOperazioneTabella) get(TIPO_OPERAZIONE_TABELLA, id, codice, descrizione);
	}

	
	public TipoAggregazione getTipoAggregazione(Long id, String codice, String descrizione) {
		return (TipoAggregazione) get(TIPO_AGGREGAZIONE, id, codice, descrizione);
	}

	public Annotazione getAnnotazione(Long id, String codice, String descrizione) {

		return (Annotazione) get(ANNOTAZIONE, id, codice, descrizione);

	}

	public Categoria getCategoria(Long id, String codice, String descrizione) {
		return (Categoria) get(CATEGORIA, id, codice, descrizione);
	}

	public CategoriaEuro getCategoriaEuro(Long id, String codice, String descrizione) {
		return (CategoriaEuro) get(CATEGORIA_EURO, id, codice, descrizione);
	}

	public Integrazione getIntegrazione(Long id, String codice, String descrizione) {
		return (Integrazione) get(INTEGRAZIONE, id, codice, descrizione);
	}

	public Specialita getSpecialita(Long id, String codice, String descrizione) {
		return (Specialita) get(SPECIALITA, id, codice, descrizione);
	}

	public Alimentazione getAlimentazione(Long id, String codice, String descrizione) {
		return (Alimentazione) get(ALIMENTAZIONE, id, codice, descrizione);
	}

	public Uso getUso(Long id, String codice, String descrizione) {
		return (Uso) get(USO, id, codice, descrizione);
	}
	*/
	public TipoPeriodicita getTipoPeriodicita(Long id, String codice, String descrizione) {
		return (TipoPeriodicita) get(TIPO_PERIODICITA, id, codice, descrizione);
	}
	/*
	public TipoTassazione getTipoTassazione(Long id, String codice, String descrizione) {
		return (TipoTassazione) get(TIPO_TASSAZIONE, id, codice, descrizione);
	}
	
	

	private Object get(int kindDecodifica, Long id, String codice,
			String descrizione, Date dataInizio, Date dataFine) {
		Object objRet = null;

		if (id != null) {
			IdDecodifica idDecod = new IdDecodifica(id.longValue());

			switch (kindDecodifica) {
			case TIPO_RIDUZIONE:
				objRet = new TipoRiduzione(idDecod, codice, descrizione, dataInizio, dataFine);

				break;
			default:
				throw new IllegalArgumentException(
						"Decodifica non riconosciuta dal sistema");
			}
		}

		return objRet;
	}
	*/
	
	private Object get(int kindDecodifica, Long id, String codice, String descrizione) {
		Object objRet = null;

		if (id != null) {
			// esiste l'id per cui posso creare l'oggetto tipoVeicolo
			IdDecodifica idDecod = new IdDecodifica(id.longValue());

			switch (kindDecodifica) {
			case TIPO_VEICOLO:
				objRet = new TipoVeicolo(idDecod, codice, descrizione);

				break;

			case TIPO_CREDITO:
				objRet = new TipoCredito(idDecod, codice, descrizione);

				break;
			
			/*
			case TIPO_USO_VEICOLO:
				objRet = new UsoVeicolo(idDecod, codice, descrizione);

				break;

			case TIPO_CARROZZERIA:
				objRet = new Carrozzeria(idDecod, codice, descrizione);

				break;

			case TIPO_COMBUSTIBILE:
				objRet = new Combustibile(idDecod, codice, descrizione);

				break;

			case TIPO_DESTINAZIONE_VEICOLO:
				objRet = new DestinazioneVeicolo(idDecod, codice, descrizione);

				break;
			*/
				
				
				
			case TIPO_DIVISA:
				objRet = new Divisa(idDecod, codice, descrizione);

				break;
/*
			case TIPO_FONTE:
				objRet = new Fonte(new IdFonte(id.longValue()), codice, descrizione);

				break;

			case TIPO_REGIONE:
				objRet = new Regione(new IdRegione(id.longValue()), codice, descrizione);

				break;

			case TIPO_EVENTO:
				objRet = new TipoEvento(new IdTipoEvento(id.longValue()), codice, descrizione);

				break;

			case TIPO_AGEVOLAZIONE:
				objRet = new TipoAgevolazione(idDecod, codice, descrizione);

				break;

			case TIPO_INTERMEDIARIO:
				objRet = new TipoIntermediario(idDecod, codice, descrizione);

				break;

			case TIPO_SANZIONAMENTO:
				objRet = new TipoSanzionamento(idDecod, codice, descrizione);

				break;

			case TIPO_CONTRIBUTO:
				objRet = new TipoContributo(idDecod, codice, descrizione);

				break;

			case TIPO_OPERAZIONE_LOGICA:
				objRet = new TipoOperazioneLogica(idDecod, codice, descrizione);

				break;

			case TIPO_OPERAZIONE:
				objRet = new TipoOperazione(idDecod, codice, descrizione);

				break;

			case TIPO_OPERAZIONE_TABELLA:
				objRet = new TipoOperazioneTabella(idDecod, codice, descrizione);

				break;

			case TIPO_AGGREGAZIONE:
				objRet = new TipoAggregazione(idDecod, codice, descrizione);

				break;

			case USO:
				objRet = new Uso(idDecod, codice, descrizione);

				break;

			case ALIMENTAZIONE:
				objRet = new Alimentazione(idDecod, codice, descrizione);

				break;

			case ANNOTAZIONE:
				objRet = new Annotazione(idDecod, codice, descrizione);

				break;

			case INTEGRAZIONE:
				objRet = new Integrazione(idDecod, codice, descrizione);

				break;

			case SPECIALITA:
				objRet = new Specialita(idDecod, codice, descrizione);

				break;

			case CATEGORIA:
				objRet = new Categoria(idDecod, codice, descrizione);

				break;
			*/
			case TIPO_PERIODICITA:
				objRet = new TipoPeriodicita(idDecod, codice, descrizione);

				break;
			/*
			case TIPO_TASSAZIONE:
				objRet = new TipoTassazione(idDecod, codice, descrizione);

				break;
*/
			case CAUSALE_CHIUSURA:
				objRet = new CausaleChiusura(idDecod, codice, descrizione);
				break;

			case CAUSALE_SOSPENSIONE:
				objRet = new CausaleSospensione(idDecod, codice, descrizione);
				break;

			case TIPO_IRREG_ACCERTAMENTO:
				objRet = new TipoIrregAccertamento(idDecod, codice, descrizione);
				break;
			/*
			case CATEGORIA_EURO:
				objRet = new CategoriaEuro(idDecod, codice, descrizione);
				break;

			case TIPO_LETTERA:
				objRet = new TipoLettera(idDecod, codice, descrizione);
				break;

			case ESITO_NOTIFICA:
				objRet = new EsitoNotifica(idDecod, codice, descrizione);
				break;

			case TIPO_NOTIFICA:
				objRet = new TipoNotifica(idDecod, codice, descrizione);
				break;
			*/	
			default:
				throw new IllegalArgumentException("Decodifica non riconosciuta dal sistema");

			}
		}

		return objRet;
	}
	
	
	/*
	public StatoSegnalazione getStatoSegnalazione(Long id, String descrizione) {
		return (StatoSegnalazione) get(STATO_SEGNALAZIONE, id, descrizione);
	}

	public MotivoSegnalazione getMotivoSegnalazione(Long id, String descrizione) {
		return (MotivoSegnalazione) get(MOTIVO_SEGNALAZIONE, id, descrizione);
	}

	public StatoAvvisoScadenza getStatoAvvisoScadenza(Long id, String descrizione) {
		return (StatoAvvisoScadenza) get(STATO_AVVISO_SCADENZA, id, descrizione);
	}

	public TipoAvvisoSegnalazione getTipoAvvisoSegnalazione(Long id, String descrizione) {
		return (TipoAvvisoSegnalazione) get(TIPO_AVVISO_SEGNALAZIONE, id, descrizione);
	}

	public TipoAvvisoScadenza getTipoAvvisoScadenza(Long id, String descrizione) {
		return (TipoAvvisoScadenza) get(TIPO_AVVISO_SCADENZA, id, descrizione);
	}

	public CausaleSegnalazione getCausaleSegnalazione(Long id, String descrizione) {
		return (CausaleSegnalazione) get(CAUSALE_SEGNALAZIONE, id, descrizione);
	}
	*/
	public StatoAccertamento getStatoAccertamento(Long id, String descrizione) {
		return (StatoAccertamento) get(STATO_ACCERTAMENTO, id, descrizione);
	}

	public CausaleChiusura getCausaleChiusura(Long id, String codice, String descrizione) {
		return (CausaleChiusura) get(CAUSALE_CHIUSURA, id, codice, descrizione);
	}

	public CausaleSospensione getCausaleSospensione(Long id, String codice, String descrizione) {
		return (CausaleSospensione) get(CAUSALE_SOSPENSIONE, id, codice, descrizione);
	}

	public TipoAvvisoAccertamento getTipoAvvisoAccertamento(Long id, String descrizione) {
		return (TipoAvvisoAccertamento) get(TIPO_AVVISO_ACCERTAMENTO, id, descrizione);
	}

	public TipoIrregAccertamento getTipoIrregAccertamento(Long id, String codice, String descrizione) {
		return (TipoIrregAccertamento) get(TIPO_IRREG_ACCERTAMENTO, id, codice, descrizione);
	}

	/*
	public StatoTributo getStatoTributo(Long id, String descrizione) {
		return (StatoTributo) get(STATO_TRIBUTO, id, descrizione);
	}

	public StatoRuolo getStatoRuolo(Long id, String descrizione) {
		return (StatoRuolo) get(STATO_RUOLO, id, descrizione);
	}
	
	public TipoLettera getTipoLettera(Long id, String codice, String descrizione) {
		return (TipoLettera) get(TIPO_LETTERA, id, codice, descrizione);
	}

	public EsitoNotifica getEsitoNotifica(Long id, String codice, String descrizione) {
		return (EsitoNotifica) get(ESITO_NOTIFICA, id, codice, descrizione);
	}

	public TipoNotifica getTipoNotifica(Long id, String codice, String descrizione) {
		return (TipoNotifica) get(TIPO_NOTIFICA, id, codice, descrizione);
	}
	*/
	
	private Object get(int kindDecodifica, Long id, String descrizione) {
		Object objRet = null;

		if (id != null) {
			// esiste l'id per cui posso creare l'oggetto tipoVeicolo
			IdDecodifica idDecod = new IdDecodifica(id.longValue());

			switch (kindDecodifica) {
			/*
			case STATO_SEGNALAZIONE:
				objRet = new StatoSegnalazione(idDecod, descrizione);
				break;
			case MOTIVO_SEGNALAZIONE:
				objRet = new MotivoSegnalazione(idDecod, descrizione);
				break;
			case STATO_AVVISO_SCADENZA:
				objRet = new StatoAvvisoScadenza(idDecod, descrizione);
				break;
			case TIPO_AVVISO_SEGNALAZIONE:
				objRet = new TipoAvvisoSegnalazione(idDecod, descrizione);
				break;
			case TIPO_AVVISO_SCADENZA:
				objRet = new TipoAvvisoScadenza(idDecod, descrizione);
				break;
			case CAUSALE_SEGNALAZIONE:
				objRet = new CausaleSegnalazione(idDecod, descrizione);
				break;
			*/	
			case STATO_ACCERTAMENTO:
				objRet = new StatoAccertamento(idDecod, descrizione);
				break;
			
			case TIPO_AVVISO_ACCERTAMENTO:
				objRet = new TipoAvvisoAccertamento(idDecod, descrizione);
				break;
			/*
			case STATO_TRIBUTO:
				objRet = new StatoTributo(idDecod, descrizione);
				break;
			case STATO_RUOLO:
				objRet = new StatoRuolo(idDecod, descrizione);
				break;
			*/	
			default:
				throw new IllegalArgumentException("Decodifica non riconosciuta dal sistema");
			}
		}

		return objRet;
	}

}

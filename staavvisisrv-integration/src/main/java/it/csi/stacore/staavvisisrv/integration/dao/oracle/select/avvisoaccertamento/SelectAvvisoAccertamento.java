package it.csi.stacore.staavvisisrv.integration.dao.oracle.select.avvisoaccertamento;

import java.sql.SQLException;
import java.util.Date;

import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.AvvisoAccertamento;
import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.AvvisoAccertamentoEnte;
import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.CausaleChiusura;
import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.CausaleSospensione;
import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.SottoCausaleChiusura;
import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.TipoAvvisoAccertamento;
import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.TipoIrregAccertamento;
import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.TipoPeriodicita;
import it.csi.stacore.staavvisisrv.integration.bo.common.Divisa;
import it.csi.stacore.staavvisisrv.integration.bo.factory.DecodificaFactory;
import it.csi.stacore.staavvisisrv.integration.bo.id.GmsIdSoggetto;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdAvvisoAccertamento;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdAvvisoAccertamentoEnte;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdCausaleChiusura;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdPosizione;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdPratica;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdSottoCausaleChiusura;
import it.csi.stacore.staavvisisrv.integration.bo.veicolo.TipoVeicolo;
import it.csi.stacore.staavvisisrv.integration.dao.oracle.select.AbstractSelect;
import it.csi.stacore.staavvisisrv.integration.dao.oracle.select.TauPreparedStatement;
import it.csi.stacore.staavvisisrv.integration.dao.oracle.select.TauResultSet;
import it.csi.stacore.staavvisisrv.integration.dao.oracle.select.avvisoaccertamento.ricerca.RicercaAvvisoAccertamento;
import it.csi.stacore.staavvisisrv.integration.dao.oracle.util.OracleQuery;
import it.csi.stacore.staavvisisrv.integration.dao.oracle.util.OracleQueryList;
import it.csi.stacore.staavvisisrv.integration.exception.InvalidSearchObjectException;

public class SelectAvvisoAccertamento extends AbstractSelect {
	
	private RicercaAvvisoAccertamento ricercaAvvisoAccertamento;
	
	public SelectAvvisoAccertamento() {
		super();
	}

	public SelectAvvisoAccertamento(RicercaAvvisoAccertamento ricercaAvvisoAccertamento) {
		super();
		this.ricercaAvvisoAccertamento = ricercaAvvisoAccertamento;
	}

	public Object createBO(TauResultSet rs) throws SQLException {
		AvvisoAccertamentoEnte avvisoAccertamentoEnte = null;
		AvvisoAccertamento avvisoAccertamento = null;

		DecodificaFactory decodificaFactory = DecodificaFactory.getInstance();
		TipoIrregAccertamento tipoIrregAccertamento = decodificaFactory.getTipoIrregAccertamento(rs.getLong("ID_TIPO_IRREG_ACCERTAMENTO"), rs.getString("CODICE_IRREG_ACCERTAMENTO") , rs
				.getString("DESC_TIPO_IRREG_ACCERTAMENTO"));
		TipoAvvisoAccertamento tipoAvvisoAccertamento = null;

		Integer annoAccertamentoEnte = rs.getInteger("ANNO_ACCERTAMENTO_ENTE");
		Integer annoAccertamento = rs.getInteger("ANNO_ACCERTAMENTO");
		avvisoAccertamentoEnte = new AvvisoAccertamentoEnte(new IdAvvisoAccertamentoEnte(rs.getLong("ID_AVVISO_ACCERTAMENTO_ENTE").longValue()), rs
				.getInteger("ID_ENTE"), annoAccertamentoEnte, tipoAvvisoAccertamento, rs.getDate("DATA_ELABORAZIONE"));

		IdAvvisoAccertamento idAvvisoAccertamento = new IdAvvisoAccertamento(rs.getLong("ID_AVVISO_ACCERTAMENTO").longValue());

		Divisa divisa = decodificaFactory.getDivisa(rs.getLong("ID_DIVISA"), rs.getString("COD_DIVISA"), rs.getString("DESC_DIVISA"));

		TipoVeicolo tipoVeicolo = decodificaFactory.getTipoVeicolo(rs.getLong("ID_TIPO_VEICOLO"), rs.getString("CODICE_TIPO_VEICOLO"), rs
				.getString("DESC_TIPO_VEICOLO"));

		TipoPeriodicita tipoPeriodicita = null;
		if (rs.getLong("ID_TIPO_PERIODICITA") != null) {
			tipoPeriodicita = decodificaFactory.getTipoPeriodicita(rs.getLong("ID_TIPO_PERIODICITA"), rs.getString("COD_TIPO_PERIODICITA"), rs
					.getString("DESC_TIPO_PERIODICITA"));
		}

		CausaleChiusura causaleChiusura = null;
		if (rs.getLong("ID_CAUSALE_CHIUSURA") != null) {
			causaleChiusura = decodificaFactory.getCausaleChiusura(rs.getLong("ID_CAUSALE_CHIUSURA"), rs.getString("COD_CAUSALE_CHIUSURA"), rs.getString("DESC_CAUSALE_CHIUSURA"));
		}

		SottoCausaleChiusura sottoCausaleChiusura = null;
		if (causaleChiusura != null) {
			if (rs.getLong("ID_SOTTOCAUSALE_CHIUSURA") != null) {
				IdCausaleChiusura idCausaleChiusura = new IdCausaleChiusura(causaleChiusura.getId().getId());

				IdSottoCausaleChiusura idSottoCausaleChiusura = new IdSottoCausaleChiusura(rs.getLong("ID_SOTTOCAUSALE_CHIUSURA").longValue());

				sottoCausaleChiusura = new SottoCausaleChiusura(idSottoCausaleChiusura, idCausaleChiusura, rs.getString("DESC_SOTTOCAUSALE_CHIUSURA"));
			}
		}

		IdPosizione idPosizione = null;
		if (rs.getLong("ID_POSIZIONE") != null) {
			idPosizione = new IdPosizione(rs.getLong("ID_POSIZIONE").longValue());
		}
		String numeroProtocollo = rs.getString("NUMERO_PROTOCOLLO");
		Date dataInvioUltimoFlusso = rs.getDate("DATA_INVIO_ULTIMO_FLUSSO");
		
		CausaleSospensione causaleSospensione = null;
		if (rs.getLong("ID_CAUSALE_SOSPENSIONE") != null) {
			causaleSospensione = decodificaFactory.getCausaleSospensione(
					rs.getLong("ID_CAUSALE_SOSPENSIONE"),
					rs.getString("COD_CAUSALE_SOSPENSIONE"),
					rs.getString("DESCR_CAUSALE_SOSPENSIONE"));
		}
		
		IdPratica idPratica = null;
		if (rs.getLong("ID_PRATICA") != null) {
			idPratica = new IdPratica(rs.getLong("ID_PRATICA").longValue());
		}
		avvisoAccertamento = new AvvisoAccertamento(idAvvisoAccertamento, idPratica, annoAccertamento, tipoIrregAccertamento, idPosizione,
				causaleChiusura, sottoCausaleChiusura, tipoPeriodicita, avvisoAccertamentoEnte, numeroProtocollo, dataInvioUltimoFlusso, rs.getDate("DATA_NOTIFICA"), rs.getString("DESC_TIPO_IRREG_ACCERTAMENTO"), rs.getString("DESC_TIPO_PERIODICITA"),
				rs.getInteger("SCADENZA"), rs.getInteger("VALIDITA"), rs.getDate("DATA_PAG_VERS_INSUFF"), rs.getString("PROP_TIPO_PERSONA"), rs
						.getString("PROP_COD_FISCALE"), rs.getString("PROP_NOME"), rs.getString("PROP_COGNOME"), rs.getString("PROP_DENOMINAZIONE"), rs
						.getDate("PROP_DATA_NASCITA"), rs.getString("PROP_COMUNE_NASCITA"), rs.getString("PROP_COMUNE_SPEDIZIONE"), rs
						.getString("PROP_STATO_ESTERO_NASCITA"), rs.getString("PROP_PROV_SPEDIZIONE"), rs.getString("PROP_SESSO"), rs
						.getString("PROP_IND_SPEDIZIONE_NOM"), rs.getString("PROP_SEDIME"), rs.getString("PROP_CIVICO"), rs.getString("PROP_CAP"), rs
						.getString("VEIC_TARGA"), tipoVeicolo, rs.getString("VEIC_DESC_TIPO_VEICOLO"), rs.getDate("VEIC_DATA_IMMATRIC"), rs
						.getInteger("VEIC_ID_DESTINAZIONE"), rs.getString("VEIC_DESC_DESTINAZIONE"), rs.getInteger("VEIC_ID_USO"), rs
						.getString("VEIC_DESC_USO"), rs.getInteger("VEIC_ID_ALIMENTAZIONE"), rs.getString("VEIC_DESC_ALIMENTAZIONE"), rs
						.getString("VEIC_FLAG_ECODIESEL"), rs.getInteger("ID_STATO_PRATICA"), rs.getString("STATO_NOTE"), rs.getDate("STATO_DATA_REGOLARIZZAZIONE"), rs
						.getString("STATO_DESC_CAUSALE_CHIUSURA"), rs.getString("STATO_DESC_SOTTOCAUSALE_CHIUSU"), rs.getDate("STATO_DATA1_CHIUSURA"), rs
						.getDate("STATO_DATA2_CHIUSURA"), rs.getValuta(divisa, "VERSATO_TASSA_VERSATA"), rs.getValuta(divisa, "VERSATO_SANZIONI_VERSATE"),
				rs.getValuta(divisa, "VERSATO_INTERESSI_VERSATI"), rs.getValuta(divisa, "VERSATO_TOTALE_VERSATO"), rs.getValuta(divisa,
						"DOVUTO_TASSA_ANCORA_DOVUTA"), rs.getValuta(divisa, "DOVUTO_SANZIONI_ANCORA_DOVUTE"), rs.getValuta(divisa,
						"DOVUTO_INTERESSI_ANCORA_DOVUTI"), rs.getValuta(divisa, "DOVUTO_TOTALE_ANCORA_DOVUTO"), rs.getValuta(divisa,
						"DOVUTO_IMPORTO_COMPENSATO"), rs.getInteger("DOVUTO_SEMESTRI_INTERESSI"), rs.getDate("RUOLO_DATA_INVIO_FLUSSO"), rs
						.getValuta(divisa, "CALC_TASSA_NEI_TERMINI"), rs.getInteger("RUOLO_SEMESTRI"), rs.getValuta(divisa, "RUOLO_TASSA_ANCORA_DOVUTA"), rs
						.getValuta(divisa, "RUOLO_SANZIONI_ANCORA_DOVUTE"), rs.getValuta(divisa, "RUOLO_INTERESSI_ANCORA_DOVUTI"), rs.getValuta(divisa,
						"RUOLO_TOTALE_ANCORA_DOVUTO"));

		avvisoAccertamento.setCodStatoPratica(rs.getString("CODICE_STATO_PRATICA"));
		avvisoAccertamento.setCodTipoComunicazione(rs.getString("COD_TIPO_COMUNICAZIONE"));
		avvisoAccertamento.setVeicDescRiduzione(rs.getString("VEIC_DESC_RIDUZIONE"));
		avvisoAccertamento.setVeicMassaComplessiva(rs.getString("VEIC_MASSA_COMPLESSIVA"));
		avvisoAccertamento.setVeicPortata(rs.getString("VEIC_PORTATA"));
		avvisoAccertamento.setVeicKW(rs.getString("VEIC_KW"));
		avvisoAccertamento.setCategoriaEuro(rs.getString("DESC_CATEGORIA_EURO"));
		avvisoAccertamento.setDescStatoPatica(rs.getString("DESC_STATO_PRATICA"));
		avvisoAccertamento.setNumeroAssi(rs.getInteger("VEIC_NUMERO_ASSI"));
		avvisoAccertamento.setNumeroPosti(rs.getInteger("VEIC_NUMERO_POSTI"));
		avvisoAccertamento.setVeicTassaNoRiduz(rs.getValuta(divisa, "VEIC_TASSA_NO_RIDUZ"));
		avvisoAccertamento.setDovutoRimorchiabilita(rs.getValuta(divisa, "DOVUTO_RIMORCHIABILITA"));
		

		GmsIdSoggetto gmsIdSoggetto = null;
		Long long1 = rs.getLong("PROP_ID_GMS");
		if (long1!=null) {
			gmsIdSoggetto = new GmsIdSoggetto(long1.longValue());
		}
		avvisoAccertamento.setGmsIdSoggetto(gmsIdSoggetto);

		avvisoAccertamento.setIdStatoSpedizione(rs.getInteger("ID_STATO_SPEDIZIONE"));
		
		avvisoAccertamento.setIdCodElab(rs.getLong("ID_COD_ELAB"));
		avvisoAccertamento.setRinotificaIdStato(rs.getInteger("RINOTIFICA_ID_STATO"));
		avvisoAccertamento.setRinotificaDataRicalcInteressi(rs.getInteger("RINOTIFICA_DATA_RICALC_INTERES"));
		
		avvisoAccertamento.setIdentificativoUtente(rs.getString("IDENTIFICATIVO_UTENTE"));
		
		avvisoAccertamento.setCausaleSospensione(causaleSospensione);
		
		return avvisoAccertamento;
	}

	public String getSQLStatement() throws InvalidSearchObjectException {
		if (ricercaAvvisoAccertamento == null) {
			throw new InvalidSearchObjectException("Ricerca Avviso di accertamento: ricercaAvvisoAccertamento non pu� essere null");
		}
		OracleQuery q = OracleQueryList.getInstance().getQuery(getClass().getName());

		String query = q.getBody() + q.getWhere();

		boolean bInsertParameter = false;

		if (ricercaAvvisoAccertamento.getIdentificativoFiscale() != null && ricercaAvvisoAccertamento.getIdentificativoFiscale().length() != 0) {
			bInsertParameter = true;
			query += q.getParamWhere("codiceFiscale");
		}
		if (ricercaAvvisoAccertamento.getProtocollo() != null && ricercaAvvisoAccertamento.getProtocollo().length() != 0) {
			bInsertParameter = true;
			query += q.getParamWhere("numeroProtocollo");
		}
		if (ricercaAvvisoAccertamento.getTarga() != null && ricercaAvvisoAccertamento.getTarga().length() != 0) {
			bInsertParameter = true;
			query += q.getParamWhere("targa");
		}

		TipoVeicolo tipoVeicolo = ricercaAvvisoAccertamento.getTipoVeicolo();
		if ((tipoVeicolo != null) && (tipoVeicolo.getId() != null)) {
			bInsertParameter = true;
			query += q.getParamWhere("tipoVeicolo");
		}
		if (ricercaAvvisoAccertamento.getScadenza() != null && ricercaAvvisoAccertamento.getScadenza().length() != 0) {
			bInsertParameter = true;
			query += q.getParamWhere("scadenza");
		}
		if (ricercaAvvisoAccertamento.getValidita() != null) {
			bInsertParameter = true;
			query += q.getParamWhere("validita");
		}

		if (!bInsertParameter) {
			throw new InvalidSearchObjectException(
					"Ricerca Avviso di accertamento: ricercaAvvisoAccertamento popolare almeno uno dei campi di ricerca");
		}

		return query;
	}	

	@Override
	protected void setPreparedStatement(TauPreparedStatement stmt) throws SQLException {
		int iPos = 1;

		if (ricercaAvvisoAccertamento.getIdentificativoFiscale() != null && ricercaAvvisoAccertamento.getIdentificativoFiscale().length() != 0) {
			stmt.setUpperCaseString(iPos++, ricercaAvvisoAccertamento.getIdentificativoFiscale());
		}
		if (ricercaAvvisoAccertamento.getProtocollo() != null && ricercaAvvisoAccertamento.getProtocollo().length() != 0) {
			stmt.setUpperCaseString(iPos++, ricercaAvvisoAccertamento.getProtocollo());
		}
		if (ricercaAvvisoAccertamento.getTarga() != null && ricercaAvvisoAccertamento.getTarga().length() != 0) {
			stmt.setUpperCaseString(iPos++, ricercaAvvisoAccertamento.getTarga());
		}

		TipoVeicolo tipoVeicolo = ricercaAvvisoAccertamento.getTipoVeicolo();
		if ((tipoVeicolo != null) && (tipoVeicolo.getId() != null)) {
			stmt.setLongId(iPos++, tipoVeicolo.getId());
		}

		if (ricercaAvvisoAccertamento.getScadenza() != null && ricercaAvvisoAccertamento.getScadenza().length() != 0) {
			stmt.setUpperCaseString(iPos++, ricercaAvvisoAccertamento.getScadenza());
		}
		if (ricercaAvvisoAccertamento.getValidita() != null) {
			stmt.setInt(iPos++, ricercaAvvisoAccertamento.getValidita());
		}
		
	}

}

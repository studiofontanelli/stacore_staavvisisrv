package it.csi.stacore.staavvisisrv.business.helper.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.csi.stacore.staavvisisrv.api.dto.AvvisoAccertamentoEnteVO;
import it.csi.stacore.staavvisisrv.api.dto.AvvisoAccertamentoVO;
import it.csi.stacore.staavvisisrv.api.dto.CausaleChiusuraVO;
import it.csi.stacore.staavvisisrv.api.dto.CausaleSospensioneVO;
import it.csi.stacore.staavvisisrv.api.dto.DecodificaVO;
import it.csi.stacore.staavvisisrv.api.dto.DivisaVO;
import it.csi.stacore.staavvisisrv.api.dto.RicercaAvvisoAccertamentoVO;
import it.csi.stacore.staavvisisrv.api.dto.TipoAvvisoAccertamentoVO;
import it.csi.stacore.staavvisisrv.api.dto.TipoIrregAccertamentoVO;
import it.csi.stacore.staavvisisrv.api.dto.TipoPeriodicitaVO;
import it.csi.stacore.staavvisisrv.api.dto.ValutaVO;
import it.csi.stacore.staavvisisrv.business.adapter.AvvisoAccertamentoAdapter;
import it.csi.stacore.staavvisisrv.business.adapter.RicercaAvvisoAccertamentoAdapter;
import it.csi.stacore.staavvisisrv.business.dto.ErrorDetailDto;
import it.csi.stacore.staavvisisrv.business.exception.HelperException;
import it.csi.stacore.staavvisisrv.business.exception.NoDataFoundException;
import it.csi.stacore.staavvisisrv.business.exception.ValidationException;
import it.csi.stacore.staavvisisrv.business.helper.AvvisiAccertamentoHelper;
import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.AvvisoAccertamento;
import it.csi.stacore.staavvisisrv.integration.dao.AvvisoAccertamentoDAO;
import it.csi.stacore.staavvisisrv.integration.dao.oracle.select.avvisoaccertamento.ricerca.RicercaAvvisoAccertamento;
import it.csi.stacore.staavvisisrv.util.DataDictionary;
import it.csi.stacore.staavvisisrv.util.Tracer;
import it.csi.stacore.staavvisisrv.util.XmlSerializer;

@Service
public class AvvisiAccertamentoHelperImpl extends CommonHelperImpl implements AvvisiAccertamentoHelper {
	
	@Autowired
	private AvvisoAccertamentoDAO avvisoAccertamentoDAO;
	
	@Autowired
	private DataDictionary dataDictionary;
	
	@Autowired
<<<<<<< HEAD
	private AvvisoAccertamentoAdapter avvisoAccertamentoAdapter;
	
	@Autowired
	RicercaAvvisoAccertamentoAdapter ricercaAvvisoAccertamentoAdapter;
	
	@PostConstruct
	public void init() {
		final String method = "init";
		try {
			Tracer.debug(LOG, getClass().getName(), method, "called");
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception "  +e);
		}
		finally {
			//TO DO
		}
	}

	@Override
	public List<AvvisoAccertamentoVO> findAvvisiAccertamento(RicercaAvvisoAccertamentoVO searchParams)	throws HelperException, NoDataFoundException, ValidationException {
		final String method = "findAvvisiAccertamento";
		
		List<AvvisoAccertamentoVO> result = new ArrayList<>();
		List<ErrorDetailDto> errorDetails = new ArrayList<>();
		Tracer.debug(LOG, getClass().getName(), method, "START");
		
		try {
			
			//*****************************************************************
			//Controlli formali
			//*****************************************************************
			if(searchParams==null){
				ErrorDetailDto errorDetailDto = new ErrorDetailDto("searchParams", "parametro non deve essere vuoto");
				errorDetails.add(errorDetailDto);				
			}
			if(searchParams.getIdentificativoFiscale() == null &&
			   searchParams.getIdentificativoUtente() == null &&
			   searchParams.getProtocollo() == null &&
			   searchParams.getScadenza() == null &&
			   searchParams.getTarga() == null && 
			   searchParams.getCodiceTipoVeicolo() == null &&
			   searchParams.getValidta() == null)
			{
				ErrorDetailDto errorDetailDto = new ErrorDetailDto("searchParams", "almeno uno dei parametri di ricerca non deve essere vuoto");
				errorDetails.add(errorDetailDto);				
			}
			if(searchParams.getCodiceTipoVeicolo()!=null &&
			   !dataDictionary.getTipoVeicoloDictionary()
			   				  .containsKey(searchParams.getCodiceTipoVeicolo())) 
			{				
					ErrorDetailDto errorDetailDto = new ErrorDetailDto("Tipo Veicolo", "valore non presente del dictionary");
					errorDetails.add(errorDetailDto);				
			}
			if(searchParams.getCodiceStatoAccertamento()!=null &&
			   !dataDictionary.getStatoAccertamentoDictionary()
					   		  .containsKey(searchParams.getCodiceStatoAccertamento())) 
=======
	AvvisoAccertamentoAdapter avvisoAccertamentoAdapter;
	
	@Autowired
	RicercaAvvisoAccertamentoAdapter ricercaAvvisoAccertamentoAdapter;
	
	@PostConstruct
	public void init() {
		final String method = "init";
		try {
			Tracer.debug(LOG, getClass().getName(), method, "called");
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception "  +e);
		}
		finally {
			//TO DO
		}
	}

	@Override
	public List<AvvisoAccertamentoVO> findAvvisiAccertamento(RicercaAvvisoAccertamentoVO searchParams)	throws HelperException, NoDataFoundException, ValidationException {
		final String method = "findAvvisiAccertamento";
		
		List<AvvisoAccertamentoVO> result = new ArrayList<>();
		List<ErrorDetailDto> errorDetails = new ArrayList<>();
		Tracer.debug(LOG, getClass().getName(), method, "START");
		
		try {
			
			//*****************************************************************
			//Controlli formali
			//*****************************************************************
			if(searchParams==null){
				ErrorDetailDto errorDetailDto = new ErrorDetailDto("searchParams", "parametro non deve essere vuoto");
				errorDetails.add(errorDetailDto);				
			}
			if(searchParams.getIdentificativoFiscale() == null &&
			   searchParams.getIdentificativoUtente() == null &&
			   searchParams.getProtocollo() == null &&
			   searchParams.getScadenza() == null &&
			   searchParams.getTarga() == null && 
			   searchParams.getTipoVeicolo() == null &&
			   searchParams.getValidta() == null)
			{
				ErrorDetailDto errorDetailDto = new ErrorDetailDto("searchParams", "almeno uno dei parametri di ricerca non deve essere vuoto");
				errorDetails.add(errorDetailDto);				
			}
			if(searchParams.getTipoVeicolo()!=null &&
			   !dataDictionary.getTipoVeicoloDictionary()
			   				  .containsKey(searchParams.getTipoVeicolo())) 
			{				
					ErrorDetailDto errorDetailDto = new ErrorDetailDto("Tipo Veicolo", "valore non presente del dictionary");
					errorDetails.add(errorDetailDto);				
			}
			if(searchParams.getStatoAccertamento()!=null &&
			   !dataDictionary.getStatoAccertamentoDictionary()
					   		  .containsKey(searchParams.getStatoAccertamento())) 
>>>>>>> branch 'main' of https://github.com/studiofontanelli/stacore_staavvisisrv.git
			{				
					ErrorDetailDto errorDetailDto = new ErrorDetailDto("Stato Accertamento", "valore non presente del dictionary");
					errorDetails.add(errorDetailDto);				
			}
			//*******************************************************************
			
			if(errorDetails.isEmpty()) {
				RicercaAvvisoAccertamento ricercaAvvisoAccertamento = ricercaAvvisoAccertamentoAdapter.convertTo(searchParams);
				List<AvvisoAccertamento> avvisoAccertamentoList = avvisoAccertamentoDAO.findAvvisiAccertamento(ricercaAvvisoAccertamento);
				if(avvisoAccertamentoList!=null && !avvisoAccertamentoList.isEmpty()) {
					Tracer.debug(LOG, getClass().getName(), method, "found lista avviso accertamento\n " + XmlSerializer.objectToXml(avvisoAccertamentoList));					
					result = this.avvisoAccertamentoAdapter.convertFrom(avvisoAccertamentoList);
				}				
			}		
			
		}catch (Exception e) {			
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);			
			ErrorDetailDto errorDetailDto = new ErrorDetailDto("Unexpected error", e.getMessage());
			errorDetails.add(errorDetailDto);
			throw new HelperException(method,errorDetails);
		}finally {
			if(!errorDetails.isEmpty()) {
				throw new ValidationException(method, errorDetails);
			}						
		}
		return result;
	}
	
	/****************************************************************
	 *  FUNZIONALITA MOCK
	 ****************************************************************/
	private AvvisoAccertamentoVO creaAvvisoAccertamentoVOMOCK() {
		AvvisoAccertamentoVO avvisoAccertamentoVO = new AvvisoAccertamentoVO();
		Date date = Calendar.getInstance().getTime();
		
		avvisoAccertamentoVO.setAnnoAccertamento(2022);
		avvisoAccertamentoVO.setAux("aux");
		
		AvvisoAccertamentoEnteVO avvisoAccertamentoEnteVO = new AvvisoAccertamentoEnteVO();
		avvisoAccertamentoEnteVO.setAnnoAccertamento(2022);
		avvisoAccertamentoEnteVO.setDataElaborazione(date);
		avvisoAccertamentoEnteVO.setIdAvvisoAccertamentoEnte(1L);
		
		TipoAvvisoAccertamentoVO tipoAvvisoAccertamentoVO = new TipoAvvisoAccertamentoVO();
		DecodificaVO decodificaVO = new DecodificaVO();		
		decodificaVO.setCodice("cod decodifica");
		decodificaVO.setDescrizione("descr decodifica");
		decodificaVO.setIdDecodifica(1L);
		tipoAvvisoAccertamentoVO.setDecodifica(decodificaVO);		
		avvisoAccertamentoEnteVO.setTipoAvvisoAccertamento(tipoAvvisoAccertamentoVO);
		
		ValutaVO valutaVO = new ValutaVO();
		DivisaVO divisaVO = new DivisaVO();
		divisaVO.setDecodifica(decodificaVO);
		valutaVO.setDivisa(divisaVO);
		Double imp = 12.45;
		valutaVO.setImporto(imp);
		avvisoAccertamentoVO.setCalcTassaNeiTermini(valutaVO);				
		avvisoAccertamentoVO.setCategoriaEuro("categoria euro");
		
		CausaleChiusuraVO causaleChiusuraVO = new CausaleChiusuraVO();
		causaleChiusuraVO.setDecodifica(decodificaVO);
		avvisoAccertamentoVO.setCausaleChiusura(causaleChiusuraVO);
		
		CausaleSospensioneVO causaleSospensioneVO = new CausaleSospensioneVO();
		causaleSospensioneVO.setDecodifica(decodificaVO);
		avvisoAccertamentoVO.setCausaleSospensione(causaleSospensioneVO);
		
		avvisoAccertamentoVO.setCdFonteRiferimentoPec(1L);
		avvisoAccertamentoVO.setCod("cod");
		avvisoAccertamentoVO.setCodCategoria("cod categoria");
		avvisoAccertamentoVO.setCodiceIdenEnte("cod iden ente");
		avvisoAccertamentoVO.setCodStatoPratica("cod stato pratica");
		avvisoAccertamentoVO.setCodTipoComunicazione("cod tipo comunicazione");
		avvisoAccertamentoVO.setCtCodiceRegola("ct codice regola");
		avvisoAccertamentoVO.setDataAcquisizionePagamentoIngiunzione(date);
		avvisoAccertamentoVO.setDataInstGpl("12-12-2022");
		avvisoAccertamentoVO.setDataInvioUltimoFlusso(date);
		avvisoAccertamentoVO.setDataNotifica(date);
		avvisoAccertamentoVO.setDataPagamentoIngiunzione(date);
		avvisoAccertamentoVO.setDataPagVersInsuff(date);
		avvisoAccertamentoVO.setDataRiferimentoCalcolo(date);
		avvisoAccertamentoVO.setDescStatoPratica("decs stato pratica");
		avvisoAccertamentoVO.setDovutoImportoCompensato(valutaVO);
		avvisoAccertamentoVO.setDovutoInteresse(valutaVO);
		avvisoAccertamentoVO.setDovutoRimorchiabilita(valutaVO);
		avvisoAccertamentoVO.setDovutoSanzioni(valutaVO);
		avvisoAccertamentoVO.setDovutoSemestriInteressi(valutaVO);
		avvisoAccertamentoVO.setDovutoSpeseRac(valutaVO);
		avvisoAccertamentoVO.setDovutoTassa(valutaVO);
		avvisoAccertamentoVO.setDovutoTotale(valutaVO);
		avvisoAccertamentoVO.setEmissCo2("emissioni co2");
		avvisoAccertamentoVO.setEsitoNotifica("esito notifica");		
		avvisoAccertamentoVO.setDescrizioneRuoloEQ("descrizione ruolo EQ");
		avvisoAccertamentoVO.setFlagRim("true");
		avvisoAccertamentoVO.setGmsIdSoggetto(1l);
		avvisoAccertamentoVO.setIdAvvisoAccertamento(1L);
		avvisoAccertamentoVO.setIdStatoPratica(1l);
		avvisoAccertamentoVO.setIdProprietario(1l);
		avvisoAccertamentoVO.setIdPratica(1L);
		avvisoAccertamentoVO.setIdVeicolo(1L);
		avvisoAccertamentoVO.setIuv("IUV");
		avvisoAccertamentoVO.setNumeroAssi(4);
		avvisoAccertamentoVO.setNumeroPosti(6);
		avvisoAccertamentoVO.setNumeroProtocollo("12587854/2022");
		avvisoAccertamentoVO.setPropCap("cap");
		avvisoAccertamentoVO.setPropCivico("civico");
		avvisoAccertamentoVO.setPropCodFiscale("cf");
		avvisoAccertamentoVO.setPropCognome("cognome");
		avvisoAccertamentoVO.setPropComuneNascita("comune");
		avvisoAccertamentoVO.setPropNome("nome");
		avvisoAccertamentoVO.setPropDataNascita(date);
		avvisoAccertamentoVO.setRinotificaDataRicalcInteressi(date);
		avvisoAccertamentoVO.setScadenza(2022);
		avvisoAccertamentoVO.setStatoMdp(1);
		
		TipoIrregAccertamentoVO tipoIrregAccertamentoVO = new TipoIrregAccertamentoVO();
		tipoIrregAccertamentoVO.setDecodifica(decodificaVO);		
		avvisoAccertamentoVO.setTipoIrregAccertamento(tipoIrregAccertamentoVO);
		
		TipoPeriodicitaVO tipoPeriodicitaVO = new TipoPeriodicitaVO();
		tipoPeriodicitaVO.setDecodifica(decodificaVO);
		avvisoAccertamentoVO.setTipoPeriodicita(tipoPeriodicitaVO);
		
		avvisoAccertamentoVO.setUguPag(date);
		avvisoAccertamentoVO.setUguVer(date);
		avvisoAccertamentoVO.setValidita(12);
		avvisoAccertamentoVO.setVeicDataImmatric(date);
		avvisoAccertamentoVO.setVeicIdDestinazione(1L);		
		
		avvisoAccertamentoVO.setAvvisoAccertamentoEnte(avvisoAccertamentoEnteVO);
		
		return avvisoAccertamentoVO;
	}

}

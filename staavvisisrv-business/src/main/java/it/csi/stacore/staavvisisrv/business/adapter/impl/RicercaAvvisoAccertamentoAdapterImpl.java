package it.csi.stacore.staavvisisrv.business.adapter.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.staavvisisrv.api.dto.DecodificaVO;
import it.csi.stacore.staavvisisrv.api.dto.RicercaAvvisoAccertamentoVO;
import it.csi.stacore.staavvisisrv.api.dto.StatoAccertamentoVO;
import it.csi.stacore.staavvisisrv.api.dto.TipoVeicoloVO;
import it.csi.stacore.staavvisisrv.business.adapter.RicercaAvvisoAccertamentoAdapter;
import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.StatoAccertamento;
import it.csi.stacore.staavvisisrv.integration.bo.veicolo.TipoVeicolo;
import it.csi.stacore.staavvisisrv.integration.dao.oracle.select.avvisoaccertamento.ricerca.RicercaAvvisoAccertamento;
import it.csi.stacore.staavvisisrv.util.DataDictionary;
import it.csi.stacore.staavvisisrv.util.Tracer;
import it.csi.stacore.staavvisisrv.util.adapter.CommonDtoAdapter;
import it.csi.stacore.staavvisisrv.util.adapter.exception.DtoConversionException;

@Component
public class RicercaAvvisoAccertamentoAdapterImpl extends CommonDtoAdapter<RicercaAvvisoAccertamentoVO,RicercaAvvisoAccertamento> implements RicercaAvvisoAccertamentoAdapter {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private DataDictionary dataDictionary;
	
	@Override
	public ApplicationContext getApplicationContext() {		
		return applicationContext;
	}	 
	
	@Override
	public RicercaAvvisoAccertamento convertTo(RicercaAvvisoAccertamentoVO t) throws DtoConversionException {
		final String method = "convertTo";
		RicercaAvvisoAccertamento output = super.convertTo(t);			
		try {			
			
			if(t.getTipoVeicolo()!=null) {
				//Gestione TipoVeicolo
				//String tipoVeicoloDescrizione = t.getTipoVeicolo().getDecodifica().getDescrizione();			
				//String tipoVeicoloCode = dataDictionary.getValueByMapAndDescription(dataDictionary.getTipoVeicoloDictionary(), tipoVeicoloDescrizione);
				
				/* AF DA MOFIFICARE
				TipoVeicolo tipoVeicolo = GenericCreatorDecodifica.createIstanzeForBO(TipoVeicolo.class,
																				      serialVersionUID,
																				      tipoVeicoloDescrizione,
																				      tipoVeicoloCode);			
				*/
				
				TipoVeicolo tipoVeicolo = new TipoVeicolo(null, t.getTipoVeicolo(), "-");
				
				output.setTipoVeicolo(tipoVeicolo);
			}			
			
			if(t.getStatoAccertamento()!=null) {
				//Stato Accertamento
				//String statoAccertamentoDescrizione = t.getStatoAccertamento().getDecodifica().getDescrizione();
				//String statoAccertamentoCode = String.valueOf(dataDictionary.getValueByMapAndDescription(dataDictionary.getStatoAccertamentoDictionary(), statoAccertamentoDescrizione));
				/*
				StatoAccertamento statoAccertamento  = GenericCreatorDecodifica.createIstanzeForBO(StatoAccertamento.class, 
																							  	   serialVersionUID, 
																							  	   statoAccertamentoDescrizione, 
																							  	   statoAccertamentoCode);
				*/
				
				StatoAccertamento statoAccertamento  = new StatoAccertamento(null, t.getStatoAccertamento(), "-");

				
				output.setStatoAccertamento(statoAccertamento);
			}			
			
		} catch (IllegalArgumentException  e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException(e.getMessage());
		}
		
		return output;
	}

	@Override
	public RicercaAvvisoAccertamentoVO convertFrom(RicercaAvvisoAccertamento v) throws DtoConversionException {
		final String method = "convertTo";
		RicercaAvvisoAccertamentoVO ricercaAvvisoAccertamentoVO = super.convertFrom(v);
		try {
			
			//Gestione tipo veicolo VO
			if(v.getTipoVeicolo()!=null) {
				String codice = v.getTipoVeicolo().getCodice();
				String descrizione = dataDictionary.getKeyByMapAndCode(dataDictionary.getTipoVeicoloDictionary(), codice);
				DecodificaVO decodificaVO = new DecodificaVO();
				decodificaVO.setCodice(codice);
				decodificaVO.setDescrizione(descrizione);
				decodificaVO.setIdDecodifica(v.getTipoVeicolo().getId().getId());
				TipoVeicoloVO tipoVeicoloVO = new TipoVeicoloVO();
				tipoVeicoloVO.setDecodifica(decodificaVO);
				ricercaAvvisoAccertamentoVO.setTipoVeicolo(tipoVeicoloVO.getDecodifica().getCodice());
			}
			
			//Gestion stato accertamento
			if(v.getStatoAccertamento()!=null) {
				String codice = v.getStatoAccertamento().getCodice();
				String descrizione = dataDictionary.getKeyByMapAndCode(dataDictionary.getStatoAccertamentoDictionary(), Integer.valueOf(codice));
				DecodificaVO decodificaVO = new DecodificaVO();
				decodificaVO.setCodice(codice);
				decodificaVO.setDescrizione(descrizione);
				decodificaVO.setIdDecodifica(v.getStatoAccertamento().getId().getId());
				StatoAccertamentoVO statoAccertamentoVO = new StatoAccertamentoVO();
				statoAccertamentoVO.setDecodifica(decodificaVO);
				ricercaAvvisoAccertamentoVO.setStatoAccertamento(statoAccertamentoVO.getDecodifica().getCodice());
			}			
			
			
		} catch (IllegalArgumentException | SecurityException e) 
		{
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException(e.getMessage());
		}
		
		return ricercaAvvisoAccertamentoVO;
	}

	@Override
	public List<RicercaAvvisoAccertamento> convertTo(List<RicercaAvvisoAccertamentoVO> tList) throws DtoConversionException {		
		return super.convertTo(tList);
	}

	@Override
	public List<RicercaAvvisoAccertamentoVO> convertFrom(List<RicercaAvvisoAccertamento> vList)	throws DtoConversionException {		
		return super.convertFrom(vList);
	}

}

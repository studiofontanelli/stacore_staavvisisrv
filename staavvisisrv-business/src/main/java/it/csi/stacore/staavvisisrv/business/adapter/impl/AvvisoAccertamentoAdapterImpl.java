package it.csi.stacore.staavvisisrv.business.adapter.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.staavvisisrv.api.dto.AvvisoAccertamentoVO;
import it.csi.stacore.staavvisisrv.api.dto.CausaleChiusuraVO;
import it.csi.stacore.staavvisisrv.api.dto.TipoAvvisoAccertamentoVO;
import it.csi.stacore.staavvisisrv.api.dto.TipoIrregAccertamentoVO;
import it.csi.stacore.staavvisisrv.api.dto.TipoPeriodicitaVO;
import it.csi.stacore.staavvisisrv.api.dto.TipoVeicoloVO;
import it.csi.stacore.staavvisisrv.business.adapter.AvvisoAccertamentoAdapter;
import it.csi.stacore.staavvisisrv.business.adapter.GenericCreatorDecodifica;
import it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento.AvvisoAccertamento;
import it.csi.stacore.staavvisisrv.util.Tracer;
import it.csi.stacore.staavvisisrv.util.adapter.CommonDtoAdapter;
import it.csi.stacore.staavvisisrv.util.adapter.exception.DtoConversionException;

@Component
public class AvvisoAccertamentoAdapterImpl extends CommonDtoAdapter<AvvisoAccertamentoVO,AvvisoAccertamento> implements AvvisoAccertamentoAdapter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ApplicationContext applicationContext;

	@Override
	public AvvisoAccertamento convertTo(AvvisoAccertamentoVO t) throws DtoConversionException {				
		return super.convertTo(t);
	}

	@Override
	public AvvisoAccertamentoVO convertFrom(AvvisoAccertamento v) throws DtoConversionException {		
		return convertAndSetAdditionalInfo(v);
	}

	@Override
	public List<AvvisoAccertamento> convertTo(List<AvvisoAccertamentoVO> tList) throws DtoConversionException {		
		return super.convertTo(tList);
	}

	@Override
	public List<AvvisoAccertamentoVO> convertFrom(List<AvvisoAccertamento> vList) throws DtoConversionException {		
		List<AvvisoAccertamentoVO> output = new ArrayList<>();
		if(vList!=null) {
			vList.forEach(item->{
				if(item!=null) {
					AvvisoAccertamentoVO avvisoAccertamentoVO = convertAndSetAdditionalInfo(item);
					output.add(avvisoAccertamentoVO);
				}	
				
			});
		}		
		return output;
	}

	@Override
	public ApplicationContext getApplicationContext() {		
		return applicationContext;
	}
	
	private AvvisoAccertamentoVO convertAndSetAdditionalInfo(AvvisoAccertamento v) {
		final String method = "convertTo";
		AvvisoAccertamentoVO output = super.convertFrom(v);
		
		try {
			
			//Gestione tipo_irreg_accertamento
			if(v.getTipoIrregAccertamento() != null) {
				TipoIrregAccertamentoVO tipoIrregAccertamentoVO = GenericCreatorDecodifica.createIstanzeForVO(TipoIrregAccertamentoVO.class,
																											  v.getTipoIrregAccertamento().getId().getId(),
																											  v.getTipoIrregAccertamento().getCodice(), 
																											  v.getTipoIrregAccertamento().getDescrizione());			
				output.setTipoIrregAccertamento(tipoIrregAccertamentoVO);
			}			
			//Gestione TipoVeiccolo
			if(v.getVeicTipoVeicolo() != null) {
				TipoVeicoloVO tipoVeicoloVO = GenericCreatorDecodifica.createIstanzeForVO(TipoVeicoloVO.class,
																					 	  v.getVeicTipoVeicolo().getIdTipoVeicolo().getId(),
																					      v.getVeicTipoVeicolo().getCodice(), 
																					      v.getVeicTipoVeicolo().getDescrizione());			
				output.setVeicTipoVeicolo(tipoVeicoloVO);
			}
			//Gestione Causale Chiusura
			if(v.getCausaleChiusura()!= null) {
				CausaleChiusuraVO causaleChiusuraVO = GenericCreatorDecodifica.createIstanzeForVO(CausaleChiusuraVO.class,
																								  v.getCausaleChiusura().getId().getId(),
																								  v.getCausaleChiusura().getCodice(), 
																								  v.getCausaleChiusura().getDescrizione());
				output.setCausaleChiusura(causaleChiusuraVO);
			}
			
			//Gestione Sotto Causale Chiusura
			if(v.getSottoCausaleChiusura()!=null && output.getSottoCausaleChiusura() != null ) {
				output.getSottoCausaleChiusura().setIdCausaleChiusura(v.getSottoCausaleChiusura().getIdSottoCausaleChiusura().getId());
				if(v.getSottoCausaleChiusura().getIdCausaleChiusura()!=null) {
					output.getSottoCausaleChiusura().setIdCausaleChiusura(v.getSottoCausaleChiusura().getIdCausaleChiusura().getId());
				}
				
			}
			//Gestione Tipo Periodicita
			if(v.getTipoPeriodicita() != null) {
				TipoPeriodicitaVO tipoPeriodicitaVO = GenericCreatorDecodifica.createIstanzeForVO(TipoPeriodicitaVO.class,
																								  v.getTipoPeriodicita().getId().getId(),
																								  v.getTipoPeriodicita().getCodice(), 
																								  v.getTipoPeriodicita().getDescrizione());			
				output.setTipoPeriodicita(tipoPeriodicitaVO);
			}
			//Gestione Avviso Accertamento Ente -> Tipo
			if(v.getAvvisoAccertamentoEnte() != null && v.getAvvisoAccertamentoEnte().getTipoAvvisoAccertamento() != null ) {
				TipoAvvisoAccertamentoVO tipoAvvisoAccertamentoVO = GenericCreatorDecodifica.createIstanzeForVO(TipoAvvisoAccertamentoVO.class,
																												v.getAvvisoAccertamentoEnte().getTipoAvvisoAccertamento().getId().getId(),
																												v.getAvvisoAccertamentoEnte().getTipoAvvisoAccertamento().getCodice(), 
																												v.getAvvisoAccertamentoEnte().getTipoAvvisoAccertamento().getDescrizione());			
				 output.getAvvisoAccertamentoEnte().setTipoAvvisoAccertamento(tipoAvvisoAccertamentoVO);
			}
			
			//Gestione Field di tipo Valuta
			GenericCreatorDecodifica.createIstanzeForValutaVOList(v, output);
			
		} catch (IllegalArgumentException | InvocationTargetException | NoSuchMethodException | 
				 SecurityException | InstantiationException | IllegalAccessException e) 
		{
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException(e.getMessage());
		}		
		
		return output;
	}

}

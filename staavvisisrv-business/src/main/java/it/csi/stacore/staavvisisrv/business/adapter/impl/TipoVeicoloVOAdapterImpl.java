package it.csi.stacore.staavvisisrv.business.adapter.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.stacore.staavvisisrv.api.dto.DecodificaVO;
import it.csi.stacore.staavvisisrv.api.dto.TipoVeicoloVO;
import it.csi.stacore.staavvisisrv.business.adapter.TipoVeicoloAdapter;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdDecodifica;
import it.csi.stacore.staavvisisrv.integration.bo.veicolo.TipoVeicolo;
import it.csi.stacore.staavvisisrv.integration.dao.oracle.select.avvisoaccertamento.ricerca.RicercaAvvisoAccertamento;
import it.csi.stacore.staavvisisrv.util.Tracer;
import it.csi.stacore.staavvisisrv.util.adapter.CommonDtoAdapter;
import it.csi.stacore.staavvisisrv.util.adapter.exception.DtoConversionException;

@Component
public class TipoVeicoloVOAdapterImpl extends CommonDtoAdapter<TipoVeicoloVO,TipoVeicolo> implements TipoVeicoloAdapter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private ApplicationContext applicationContext;

	@Override
	public ApplicationContext getApplicationContext() {		
		return applicationContext;
	}

	@Override
	public TipoVeicolo convertTo(TipoVeicoloVO t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			if(t== null)
				return null;
			TipoVeicolo tipoVeicolo =   new TipoVeicolo(new IdDecodifica(t.getDecodifica().getIdDecodifica()), 
					t.getDecodifica().getCodice(), 
					t.getDecodifica().getDescrizione()) ;
			
			
			return tipoVeicolo;
		} catch (Exception  e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException(e.getMessage());

		}	 

	}

	@Override
	public TipoVeicoloVO convertFrom(TipoVeicolo v) throws DtoConversionException {
		final String method = "convertFrom";
		try {
			if(v == null)
				return null;
			TipoVeicoloVO tipoVeicoloVo =   new TipoVeicoloVO();
			tipoVeicoloVo.setDecodifica(new DecodificaVO());
			tipoVeicoloVo.getDecodifica().setIdDecodifica(v.getId().getId());
			tipoVeicoloVo.getDecodifica().setCodice(v.getCodice());
			tipoVeicoloVo.getDecodifica().setDescrizione(v.getDescrizione());
			
			return tipoVeicoloVo;
		} catch (Exception  e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException(e.getMessage());

		}	
	}
}

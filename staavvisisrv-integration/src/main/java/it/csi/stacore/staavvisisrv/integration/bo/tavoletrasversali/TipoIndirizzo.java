package it.csi.stacore.staavvisisrv.integration.bo.tavoletrasversali;

import java.io.Serializable;

public class TipoIndirizzo implements Serializable {
	
	private static final long serialVersionUID = 5545686296338578521L;
	
	private static final int TIPO_001 = 1;
	private static final int TIPO_002 = 2;
	private static final int TIPO_003 = 3;
	private static final int TIPO_004 = 4;
	private static final int TIPO_008 = 8;
	
	private Long tipoIndirizzo;
	private String descrizione;
	
	
	public TipoIndirizzo(Long tipoIndirizzo, String descrizione) {
		super();
		this.tipoIndirizzo = tipoIndirizzo;
		this.descrizione = descrizione;
	}


	public Long getTipoIndirizzo() {
		return tipoIndirizzo;
	}


	public String getDescrizione() {
		return descrizione;
	}
	
	public boolean isTipo_001(){
		boolean result = false;
		if(TIPO_001 == tipoIndirizzo.intValue())
			result=true;
		
		return result;
	}
	public boolean isTipo_002(){
		boolean result = false;
		if(TIPO_002 == tipoIndirizzo.intValue())
			result=true;
		
		return result;
	}
	public boolean isTipo_003(){
		boolean result = false;
		if(TIPO_003 == tipoIndirizzo.intValue())
			result=true;
		
		return result;
	}
	public boolean isTipo_004(){
		boolean result = false;
		if(TIPO_004 == tipoIndirizzo.intValue())
			result=true;
		
		return result;
	}
	public boolean isTipo_008(){
		boolean result = false;
		if(TIPO_008 == tipoIndirizzo.intValue())
			result=true;
		
		return result;
	}
}

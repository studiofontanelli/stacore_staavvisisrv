package it.csi.stacore.staavvisisrv.business.adapter;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import it.csi.stacore.staavvisisrv.api.dto.DecodificaVO;
import it.csi.stacore.staavvisisrv.api.dto.DivisaVO;
import it.csi.stacore.staavvisisrv.api.dto.ValutaVO;
import it.csi.stacore.staavvisisrv.integration.bo.common.Valuta;
import it.csi.stacore.staavvisisrv.integration.bo.id.IdDecodifica;

public class GenericCreatorDecodifica {
	
	private GenericCreatorDecodifica() {
	    throw new IllegalStateException("Utility class");
	}

	
	public static <T> T createIstanzeForBO(Class<T> t, 
										   long idDecodificaValue, 
										   String desDecodifica, 
										   String codDecodifica) throws IllegalArgumentException,InvocationTargetException, 
														  				   NoSuchMethodException,SecurityException, 
														  				   InstantiationException,IllegalAccessException 
	{
		
		Class[] cArg = new Class[3]; 
		cArg[0] = IdDecodifica.class; 
		cArg[1] = String.class; 
		cArg[2] = String.class; 
		
		IdDecodifica idDecodificaObject = new IdDecodifica(idDecodificaValue);
		return t.getDeclaredConstructor(cArg).newInstance(idDecodificaObject, codDecodifica, desDecodifica);
	}
	
	public static <T> T createIstanzeForVO(Class<T> t, 
										   long idDecodificaValue, 
										   String desDecodifica, 
										   String codDecodifica) throws IllegalArgumentException,InvocationTargetException, 
														  				NoSuchMethodException,SecurityException, 
														  				InstantiationException,IllegalAccessException 
	{
		T lclcIst = t.getDeclaredConstructor().newInstance();
		try {
			
			Field decodificaField = t.getDeclaredField("decodifica");
			decodificaField.setAccessible(true);
			
			DecodificaVO decodificaVO = new DecodificaVO();
			decodificaVO.setCodice(codDecodifica);
			decodificaVO.setDescrizione(desDecodifica);
			decodificaVO.setIdDecodifica(idDecodificaValue);
			
			decodificaField.set(lclcIst, decodificaVO);
			
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lclcIst;
	}
	
	public static <T> void createIstanzeForValutaVOList(T t_BO,										   	   
										   	      		T t_VO) throws IllegalArgumentException,InvocationTargetException, 
														  		 NoSuchMethodException,SecurityException, 
														  		 InstantiationException,IllegalAccessException 
	{		
		try {
		
		Field[] voFields = t_VO.getClass().getDeclaredFields();		
		for(int i=0; i< voFields.length; i++) {
			if(voFields[i].getType().equals(ValutaVO.class)) {
				Field boField = t_BO.getClass().getDeclaredField(voFields[i].getName());				
				boField.setAccessible(true);				
				Valuta boFieldObject = (Valuta)boField.get(t_BO);
				if(boFieldObject != null) {
					
					DecodificaVO decodificaVO = new DecodificaVO();
					decodificaVO.setDescrizione(boFieldObject.getDivisa().getDescrizione());
					decodificaVO.setCodice(boFieldObject.getDivisa().getCodice());
					decodificaVO.setIdDecodifica(boFieldObject.getDivisa().getId().getId());
					
					DivisaVO divisaVO = new DivisaVO();
					divisaVO.setDecodifica(decodificaVO);
					
					Field voField = t_VO.getClass().getDeclaredField(voFields[i].getName());
					voField.setAccessible(true);
					ValutaVO voFieldObject = (ValutaVO)voField.get(t_VO);
					
					voFieldObject.setDivisa(divisaVO);					
				}		
							
			}
		}		
		
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}

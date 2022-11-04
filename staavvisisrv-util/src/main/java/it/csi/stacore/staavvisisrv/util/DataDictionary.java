package it.csi.stacore.staavvisisrv.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component("dataDictionary")
public class DataDictionary {
	
	private Map<String, Integer> tipoContributoDictionary = new HashMap<>();
	
	private Map<String, String> contributoDictionary = new HashMap<>();
	
	private Map<String, String> posizioneDictionary = new HashMap<>();
	
	private Map<String, String> tipoIrregAccertamentoDictionary = new HashMap<>();
	
	private Map<String, Integer> statoAccertamentoDictionary = new HashMap<>();
	
	private Map<String, String> tipoVeicoloDictionary = new HashMap<>();
	
	private Map<String, String> fonteDictionary = new HashMap<>();
	
	private Map<String, String> tipoAgevolazioneDictionary = new HashMap<>();
		
	private Map<String, String> destinazioneVeicoloDictionary = new HashMap<>();
	
	private Map<String, String> usoVeicoloDictionary = new HashMap<>();
	
	private Map<String, String> carrozzeriaDictionary = new HashMap<>();
	
	private Map<String, String> combustibileDictionary = new HashMap<>();
	
	private Map<String, String> categoriaEuroDictionary = new HashMap<>();
	
		
	public Map<String, String> getCategoriaEuroDictionary() {
		return categoriaEuroDictionary;
	}

	public void setCategoriaEuroDictionary(Map<String, String> categoriaEuroDictionary) {
		this.categoriaEuroDictionary = categoriaEuroDictionary;
	}

	public Map<String, String> getCombustibileDictionary() {
		return combustibileDictionary;
	}

	public void setCombustibileDictionary(Map<String, String> combustibileDictionary) {
		this.combustibileDictionary = combustibileDictionary;
	}

	public Map<String, String> getCarrozzeriaDictionary() {
		return carrozzeriaDictionary;
	}

	public void setCarrozzeriaDictionary(Map<String, String> carrozzeriaDictionary) {
		this.carrozzeriaDictionary = carrozzeriaDictionary;
	}

	public Map<String, String> getUsoVeicoloDictionary() {
		return usoVeicoloDictionary;
	}

	public void setUsoVeicoloDictionary(Map<String, String> usoVeicoloDictionary) {
		this.usoVeicoloDictionary = usoVeicoloDictionary;
	}

	public Map<String, String> getDestinazioneVeicoloDictionary() {
		return destinazioneVeicoloDictionary;
	}

	public void setDestinazioneVeicoloDictionary(Map<String, String> destinazioneVeicoloDictionary) {
		this.destinazioneVeicoloDictionary = destinazioneVeicoloDictionary;
	}

	public Map<String, String> getTipoAgevolazioneDictionary() {
		return tipoAgevolazioneDictionary;
	}

	public void setTipoAgevolazioneDictionary(Map<String, String> tipoAgevolazioneDictionary) {
		this.tipoAgevolazioneDictionary = tipoAgevolazioneDictionary;
	}

	public Map<String, String> getFonteDictionary() {
		return fonteDictionary;
	}

	public void setFonteDictionary(Map<String, String> fonteDictionary) {
		this.fonteDictionary = fonteDictionary;
	}

	public Map<String, String> getTipoVeicoloDictionary() {
		return tipoVeicoloDictionary;
	}

	public void setTipoVeicoloDictionary(Map<String, String> tipoVeicoloDictionary) {
		this.tipoVeicoloDictionary = tipoVeicoloDictionary;
	}

	public Map<String, Integer> getStatoAccertamentoDictionary() {
		return statoAccertamentoDictionary;
	}

	public void setStatoAccertamentoDictionary(Map<String, Integer> statoAccertamentoDictionary) {
		this.statoAccertamentoDictionary = statoAccertamentoDictionary;
	}

	public Map<String, String> getTipoIrregAccertamentoDictionary() {
		return tipoIrregAccertamentoDictionary;
	}

	public void setTipoIrregAccertamentoDictionary(Map<String, String> tipoIrregAccertamentoDictionary) {
		this.tipoIrregAccertamentoDictionary = tipoIrregAccertamentoDictionary;
	}

	public Map<String, String> getPosizioneDictionary() {
		return posizioneDictionary;
	}

	public void setPosizioneDictionary(Map<String, String> posizioneDictionary) {
		this.posizioneDictionary = posizioneDictionary;
	}

	public Map<String, String> getContributoDictionary() {
		return contributoDictionary;
	}

	public void setContributoDictionary(Map<String, String> contributoDictionary) {
		this.contributoDictionary = contributoDictionary;
	}

	public Map<String, Integer> getTipoContributoDictionary() {
		return tipoContributoDictionary;
	}

	public void setTipoContributoDictionary(Map<String, Integer> tipoContributoDictionary) {
		this.tipoContributoDictionary = tipoContributoDictionary;
	}
	
	public <K, V> Stream<K> keys(Map<K, V> map, V value) {
	    return map.entrySet()
	    		  .stream()
	    		  .filter(entry -> value.equals(entry.getValue()))
	    		  .map(Map.Entry::getKey);
	}
		

	public <K, V> V getValueByMapAndDescription(Map<K, V> map, K descrizione) {
		return map.entrySet()
	    		  .stream()
	    		  .filter(entry -> descrizione.equals(entry.getKey()))
			      .map(Map.Entry::getValue)				    		   
			      .findFirst().get();		
	}
	
	public <K, V> K getKeyByMapAndCode(Map<K, V> map, V code) {
		return map.entrySet()
	    		  .stream()
	    		  .filter(entry -> code.equals(entry.getValue()))
			      .map(Map.Entry::getKey)				    		   
			      .findFirst().get();		
	}
}

package it.csi.stacore.staavvisisrv.integration.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.csi.stacore.staavvisisrv.integration.exception.IntegrationException;
import it.csi.stacore.staavvisisrv.integration.service.ParentIntegrationServiceImpl;
import it.csi.stacore.staavvisisrv.integration.service.StacoresrvService;
import it.csi.stacore.staavvisisrv.util.Environment;
import it.csi.stacore.staavvisisrv.util.Tracer;
import it.csi.stacore.staavvisisrv.util.XmlSerializer;
import it.csi.stacore.stacoresrv.api.dto.ErrorDto;
import it.csi.stacore.stacoresrv.api.dto.TipoVeicoloVO;

@Service
public class StacoresrvServiceImpl extends ParentIntegrationServiceImpl implements StacoresrvService {

	@Autowired
	private Environment environment;
	
	
	@PostConstruct
	public void init() {
		final String method = "init";
		try {
			
			Tracer.info(LOG, getClass().getName(), method, "stacoresrv endpoint "  + environment.getStacoresrvEndpoint());
			
			
		
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception "  +e);
		}
		finally {

		}

	}
	
	public boolean testResource() throws IntegrationException {
		final String method = "testResource";
		boolean result = false;
		try {
			RestTemplate restTemplate = new RestTemplate();
			String resourceUrl = environment.getStacoresrvEndpoint() + "/test/resources";
		
			Tracer.debug(LOG, getClass().getName(), method, "resourceUrl= "  + resourceUrl);
			
			
			String response = restTemplate.getForObject(resourceUrl, String.class);
			
			Tracer.debug(LOG, getClass().getName(), method, "response "  +response);
			
			if(StringUtils.isNotBlank(response)){
				result = true;
			}
			
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception "  +e);
			throw new IntegrationException(e.getMessage(), e);
			
			
		}
		finally {

		}
		return result;
	}

	@Override
	public List<TipoVeicoloVO> getTipiVeicolo() throws IntegrationException {
		final String method = "\n"
				+ "	public";
		List<TipoVeicoloVO> result = new ArrayList<TipoVeicoloVO>();
		try {
			RestTemplate restTemplate = new RestTemplate();
			String resourceUrl = environment.getStacoresrvEndpoint() + "/decodifiche/tipi-veicolo/list";
			
			Tracer.debug(LOG, getClass().getName(), method, "resourceUrl= "  + resourceUrl);
			
			
			ResponseEntity<String> response  = restTemplate.getForEntity(resourceUrl, String.class);
			
			Tracer.debug(LOG, getClass().getName(), method, "response= "  + response);
			
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			
			ObjectMapper mapper = new ObjectMapper();
			if(response.getStatusCode() == HttpStatus.OK) {
				Tracer.debug(LOG, getClass().getName(), method, "RESPONSE OK");
				mapper.setDateFormat(df);
				TipoVeicoloVO [] array =  mapper.readValue(response.getBody(), TipoVeicoloVO[].class);
				
				result = Arrays.stream(array)
					      .collect(Collectors.toList());
				
			}
			else {	
				ErrorDto errodDto =  mapper.readValue(response.getBody(), ErrorDto.class);
				Tracer.debug(LOG, getClass().getName(), method, "ErrorDto\n " + XmlSerializer.objectToXml(errodDto));
				throw new IntegrationException(errodDto.getDescription());

			}
			Tracer.debug(LOG, getClass().getName(), method, "TIPI VEICOLO\n "  +XmlSerializer.objectToXml(result));
			
			
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception "  +e);
			throw new IntegrationException(e.getMessage(), e);
			
			
		}
		finally {

		}
		return result;
	}

	/*
	public Proprietario loadByIdProprietario(Long idProprietario) throws IntegrationException {
		final String method = "loadByIdProprietario";
		Proprietario result = null;
		try {
			RestTemplate restTemplate = new RestTemplate();
			String resourceUrl = environment.getStasoggEndpoint() + "/soggetto/proprietario/"+idProprietario;
			
			Tracer.debug(LOG, getClass().getName(), method, "resourceUrl= "  + resourceUrl);
			
			
			ResponseEntity<String> response  = restTemplate.getForEntity(resourceUrl, String.class);
			
			Tracer.debug(LOG, getClass().getName(), method, "response= "  + response);
			
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			
			ObjectMapper mapper = new ObjectMapper();
			if(response.getStatusCode() == HttpStatus.OK) {
				Tracer.debug(LOG, getClass().getName(), method, "RESPONSE OK");
				mapper.setDateFormat(df);
				result =  mapper.readValue(response.getBody(), Proprietario.class);
			}
			else {	
				ErrorDto errodDto =  mapper.readValue(response.getBody(), ErrorDto.class);
				Tracer.debug(LOG, getClass().getName(), method, "ErrorDto\n " + XmlSerializer.objectToXml(errodDto));
				throw new IntegrationException(errodDto.getDescription());

			}
			Tracer.debug(LOG, getClass().getName(), method, "Proprietario\n "  +XmlSerializer.objectToXml(result));
			
			
		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception "  +e);
			throw new IntegrationException(e.getMessage(), e);
			
			
		}
		finally {

		}
		return result;
	}
	*/
}

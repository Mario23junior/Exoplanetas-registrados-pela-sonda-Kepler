package com.v1.api.exoplanet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.v1.api.exoplanet.model.Exoplanetas;

import reactor.core.publisher.Mono;

@Service
public class ExoplanetServiceAcess {
   
	@Autowired
	private WebClient webClient;
 	
//	public ExoplanetServiceAcess(WebClient webClient) {
//		this.webClient = webClient;
//	}
	
	public Exoplanetas detailsApiParameter() throws JsonMappingException, JsonProcessingException {
    
 	String StringUrl = "/TAP/sync?query=select+pl_name,pl_masse,ra,dec+from+ps+pl_orbper+where+upper(soltype)+like+'%CONF%'+and+pl_masse+between+0.5+and+2.0&format=json";
	
    Mono<Exoplanetas> monoRequest = this.webClient
    		.method(HttpMethod.GET)
     		.uri(StringUrl)
    		.retrieve()
    		.bodyToMono(Exoplanetas.class);
   
    Exoplanetas responseBody = monoRequest.block();
    System.out.println(responseBody.toString());
    
    
	return responseBody;
	}	
} 

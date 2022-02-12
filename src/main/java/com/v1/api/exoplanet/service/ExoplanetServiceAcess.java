package com.v1.api.exoplanet.service;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.v1.api.exoplanet.model.Exoplanetas;

import reactor.core.publisher.Mono;

@Service
public class ExoplanetServiceAcess {
   
	private WebClient webClient;
	
	public ExoplanetServiceAcess(WebClient webClient) {
		this.webClient = webClient;
	}
	
	
	public Exoplanetas detailsApiParameter() {
	String StringUrl = "https://exoplanetarchive.ipac.caltech.edu/TAP/sync?query=select+pl_name,"
			+ "pl_masse,ra,dec+from+ps+where+upper(soltype)+like+%27%CONF%%27+and+pl_masse+between+0.5+and+2.0&format=json";
	
	Mono<Exoplanetas> bodyResponseExopl = this.webClient
			    .method(HttpMethod.GET)
			    .uri(StringUrl)
			    .retrieve()
			    .bodyToMono(Exoplanetas.class);
	Exoplanetas exo = bodyResponseExopl.block();
	return exo;
	
	}
	
} 

package com.v1.api.exoplanet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.v1.api.exoplanet.model.ExoplanetDataResponse;

import reactor.core.publisher.Mono;

@Service
public class ExoplanetServiceAcess {
   
	@Autowired
	private WebClient webClient;
	
//	public ExoplanetServiceAcess(WebClient webClient) {
//		this.webClient = webClient;
//	}
	
	public ExoplanetDataResponse detailsApiParameter() {
    
 	String StringUrl = "/TAP/sync?query=select+pl_name,pl_masse,ra,dec+from+ps+pl_orbper+where+upper(soltype)+like+'%CONF%'+and+pl_masse+between+0.5+and+2.0&format=json";
	
    Mono<ExoplanetDataResponse> monoRequest = this.webClient
    		.method(HttpMethod.GET)
     		.uri(StringUrl)
    		.retrieve()
    		.bodyToMono(ExoplanetDataResponse.class);
    
    ExoplanetDataResponse responseBody = monoRequest.block();
    System.out.println(responseBody);
	return responseBody;
 	
	}
	
} 

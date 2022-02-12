package com.v1.api.exoplanet.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
   
	@Bean
	public WebClient webClient(WebClient.Builder builder) {
		return builder
				   .baseUrl("https://exoplanetarchive.ipac.caltech.edu/")
 				   .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				   .build();
	}
}

package com.v1.api.exoplanet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.v1.api.exoplanet.model.ExoplanetaResponse;
import com.v1.api.exoplanet.service.ExoplanetServiceAcess;

@RestController
@RequestMapping("/api/v1/nasa/exoplanet")
public class ControllerExoplanet { 
	
	@Autowired
 	private ExoplanetServiceAcess service;
    	
 
	@GetMapping
	public ExoplanetaResponse listAll() throws JsonMappingException, JsonProcessingException {
		ExoplanetaResponse bodyResponse = service.detailsApiParameter();
	return bodyResponse;

	}

}


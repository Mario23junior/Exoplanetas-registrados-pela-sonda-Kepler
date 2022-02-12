package com.v1.api.exoplanet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v1.api.exoplanet.model.Exoplanetas;
import com.v1.api.exoplanet.service.ExoplanetServiceAcess;

@RestController
@RequestMapping("/api/v1/nasa/exoplanet")
public class ControllerExoplanet { 
	
	@Autowired
	private ExoplanetServiceAcess service;
	
//	public void setService(ExoplanetServiceAcess service) {
//		this.service = service;
//	}

	@GetMapping("/info")
	public Exoplanetas listAll() {
	Exoplanetas bodyResponse = service.detailsApiParameter();
	return bodyResponse;

	}

}

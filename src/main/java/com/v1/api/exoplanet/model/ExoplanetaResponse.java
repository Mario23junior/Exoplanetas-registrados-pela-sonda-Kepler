package com.v1.api.exoplanet.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;

public class ExoplanetaResponse implements Serializable {
	private static final long serialVersionUID = -3674587803513941984L;
	
	private List<Exoplanetas> exoplanets;
 	
	@JsonCreator
	public ExoplanetaResponse(List<Exoplanetas> exoplanets) {
		this.exoplanets = exoplanets;
 	}

	public List<Exoplanetas> getExoplanets() {
		return exoplanets;
	}

	public void setExoplanets(List<Exoplanetas> exoplanets) {
		this.exoplanets = exoplanets;
	}
	
	
	
}

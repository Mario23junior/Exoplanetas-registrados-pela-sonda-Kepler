package com.v1.api.exoplanet.model;

import java.util.ArrayList;
import java.util.List;

public class ExoplanetDataResponse {
  
	List<Exoplanetas> DataExoplanets = new ArrayList<Exoplanetas>();

	@Override
	public String toString() {
		return "ExoplanetDataResponse [DataExoplanets=" + DataExoplanets + "]";
	}

	public List<Exoplanetas> getDataExoplanets() {
		return DataExoplanets;
	}
}

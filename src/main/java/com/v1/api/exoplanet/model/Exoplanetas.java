package com.v1.api.exoplanet.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Exoplanetas {
   
	private Long id;
	
	@JsonProperty("pl_name")
	private String nome;
	
	@JsonProperty("pl_masse")
	private Double massa;
	
	@JsonProperty("ra")
	private Integer ra;
	
	@JsonProperty("dec")
	private Double dec;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getMassa() {
		return massa;
	}

	public void setMassa(Double massa) {
		this.massa = massa;
	}

	public Integer getRa() {
		return ra;
	}

	public void setRa(Integer ra) {
		this.ra = ra;
	}

	public Double getDec() {
		return dec;
	}

	public void setDec(Double dec) {
		this.dec = dec;
	}
	
	
	
}

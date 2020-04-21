package com.hetelsantos.poo2semestre.domain;

import java.io.Serializable;

public class Carro implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String marca;
	private String modelo;
	private Integer numPassageiros;  // número de passageiros
	private Double capCombustivel;   // capacidade do tanque de combustível
	private Double consumoCombustivel; // consumo de combustível por km
	
	public Carro() {
	}
	
	public Carro(Integer id, String marca, String modelo, Integer numPassageiros, Double capCombustivel,
			Double consumoCombustivel) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(Integer numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	public Double getCapCombustivel() {
		return capCombustivel;
	}

	public void setCapCombustivel(Double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}

	public Double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(Double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}

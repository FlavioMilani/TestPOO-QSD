package com.fj.flightplan.entities;


public abstract class Aircraft{
	private String name;
	private Double maxFuel;
	private Integer maxPassengers;
	private Double consumptionPerKm;
	
	public Aircraft(String name, Double maxFuel, Integer maxPassengers, Double consumptionPerKm) {
		super();
		this.name = name;
		this.maxFuel = maxFuel;
		this.maxPassengers = maxPassengers;
		this.consumptionPerKm = consumptionPerKm;
	}

	public String getName() {
		return name;
	}

	public Double getMaxFuel() {
		return maxFuel;
	}

	public Integer getMaxPassengers() {
		return maxPassengers;
	}

	public Double getConsumptionPerKm() {
		return consumptionPerKm;
	}
}

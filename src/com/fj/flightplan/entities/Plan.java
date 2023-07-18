package com.fj.flightplan.entities;

public class Plan {
	private String company;
	private String airplaneName;
	private Integer passengers;
	private Double totalDistance;
	private Double consuptionPerKm;
	private Double consuptionPerPassenger;
	private Double totalConsuption;
	
	
	public Plan(String company, String airplaneName, Integer passengers, Double totalDistance, Double consuptionPerKm,
			Double consuptionPerPassenger, Double totalConsuption) {
		this.company = company;
		this.airplaneName = airplaneName;
		this.passengers = passengers;
		this.totalDistance = totalDistance;
		this.consuptionPerKm = consuptionPerKm;
		this.consuptionPerPassenger = consuptionPerPassenger;
		this.totalConsuption = totalConsuption;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAirplaneName() {
		return airplaneName;
	}

	public void setAirplaneName(String airplaneName) {
		this.airplaneName = airplaneName;
	}

	public Integer getPassengers() {
		return passengers;
	}

	public void setPassengers(Integer passengers) {
		this.passengers = passengers;
	}

	public Double getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(Double totalDistance) {
		this.totalDistance = totalDistance;
	}

	public Double getConsuptionPerKm() {
		return consuptionPerKm;
	}

	public void setConsuptionPerKm(Double consuptionPerKm) {
		this.consuptionPerKm = consuptionPerKm;
	}

	public Double getConsuptionPerPassenger() {
		return consuptionPerPassenger;
	}

	public void setConsuptionPerPassenger(Double consuptionPerPassenger) {
		this.consuptionPerPassenger = consuptionPerPassenger;
	}

	public Double getTotalConsuption() {
		return totalConsuption;
	}

	public void setTotalConsuption(Double totalConsuption) {
		this.totalConsuption = totalConsuption;
	}
		
	
}

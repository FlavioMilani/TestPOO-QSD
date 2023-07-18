package com.fj.flightplan.services;


import com.fj.flightplan.entities.Aircraft;
import com.fj.flightplan.entities.Plan;

public class PlanCreatorService {
	
	AircraftService service;

	public PlanCreatorService(AircraftService service) {
		this.service = service;
	}
	
	public Plan create(Aircraft aircraft,Double mileage, Integer passengers) {
		
		String company = "QSD Airlines";
		String airplaneName = aircraft.getName();
		Integer totalPassengers = passengers;
		Double totalDistance = mileage;
		Double consuptionPerKm = service.consuptionPerKm(aircraft, mileage, passengers);
		Double consuptionPerPassenger = service.consuptionPerPassenger(aircraft, mileage, passengers);
		Double totalConsuption = service.totalConsumption(aircraft, mileage, passengers);
		
		return new Plan(company, airplaneName, totalPassengers, totalDistance, consuptionPerKm,
				consuptionPerPassenger, totalConsuption);
	}
}

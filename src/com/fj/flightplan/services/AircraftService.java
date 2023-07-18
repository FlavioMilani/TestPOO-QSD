package com.fj.flightplan.services;

import com.fj.flightplan.entities.Aircraft;

public interface AircraftService {
	
	Double consuptionPerKm(Aircraft air, Double mileage, Integer passengers);
	Double consuptionPerPassenger(Aircraft air, Double mileage, Integer passengers);
	Double totalConsumption(Aircraft air, Double mileage, Integer passengers);
}

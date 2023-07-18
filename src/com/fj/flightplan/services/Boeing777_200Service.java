package com.fj.flightplan.services;

import com.fj.flightplan.entities.Aircraft;

public class Boeing777_200Service implements AircraftService{

	Aircraft boeing;
	
	@Override
	public Double consuptionPerKm(Aircraft boeing, Double mileage, Integer passengers) {
			if(!passengers.equals(boeing.getMaxPassengers())) {
				return boeing.getConsumptionPerKm();
			} else {
				return totalConsumption(boeing, mileage, passengers) / mileage;
			}
	}

	@Override
	public Double consuptionPerPassenger(Aircraft boeing, Double mileage, Integer passengers) {
		if(!passengers.equals(boeing.getMaxPassengers())) {
			return 0.0;
		} else {
			return totalConsumption(boeing, mileage, passengers) * 0.2 / passengers / mileage;
		}
	}

	@Override
	public Double totalConsumption(Aircraft boeing, Double mileage, Integer passengers) {
		if(!passengers.equals(boeing.getMaxPassengers())) {
			return boeing.getConsumptionPerKm() * mileage;
		} else {
			return boeing.getConsumptionPerKm() * mileage * 1.2;
		}
	}
	
}

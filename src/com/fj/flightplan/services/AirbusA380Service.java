package com.fj.flightplan.services;

import com.fj.flightplan.entities.Aircraft;

public class AirbusA380Service implements AircraftService{
	
	@Override
	public Double consuptionPerKm(Aircraft a380, Double mileage, Integer passengers) {
			if(!passengers.equals(a380.getMaxPassengers())) {
				return a380.getConsumptionPerKm();
			} else {
				return totalConsumption(a380, mileage, passengers) / mileage;
			}
	}

	@Override
	public Double consuptionPerPassenger(Aircraft a380, Double mileage, Integer passengers) {
		if(!passengers.equals(a380.getMaxPassengers())) {
			return 0.0;
		} else {
			return totalConsumption(a380, mileage, passengers) * 0.15 / a380.getMaxPassengers() / mileage;
		}
	}

	@Override
	public Double totalConsumption(Aircraft a380, Double mileage, Integer passengers) {
		if(!passengers.equals(a380.getMaxPassengers())) {
			return a380.getConsumptionPerKm() * mileage;
		} else {
			return a380.getConsumptionPerKm() * mileage * 1.15;
		}
	}

}

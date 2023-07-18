package com.fj.flightplan.services;

import com.fj.flightplan.entities.Aircraft;

public class AirbusA350_900Service implements AircraftService{

	Aircraft a350_900;
	
	@Override
	public Double consuptionPerKm(Aircraft a350_900, Double mileage, Integer passengers) {
			if(!passengers.equals(a350_900.getMaxPassengers())) {
				return a350_900.getConsumptionPerKm();
			} else {
				return totalConsumption(a350_900, mileage, passengers) / mileage;
			}
	}

	@Override
	public Double consuptionPerPassenger(Aircraft a350_900, Double mileage, Integer passengers) {
		if(!passengers.equals(a350_900.getMaxPassengers())) {
			return 0.0;
		} else {
			return totalConsumption(a350_900, mileage, passengers) * 0.12 / passengers / mileage;
		}
	}

	@Override
	public Double totalConsumption(Aircraft a350_900, Double mileage, Integer passengers) {
		if(!passengers.equals(a350_900.getMaxPassengers())) {
			return a350_900.getConsumptionPerKm() * mileage;
		} else {
			return a350_900.getConsumptionPerKm() * mileage * 1.12;
		}
	}
	
}

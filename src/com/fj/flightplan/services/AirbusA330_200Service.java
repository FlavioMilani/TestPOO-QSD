package com.fj.flightplan.services;

import com.fj.flightplan.entities.Aircraft;

public class AirbusA330_200Service implements AircraftService{

	@Override
	public Double consuptionPerKm(Aircraft a330_200, Double mileage, Integer passengers) {
			if(!passengers.equals(a330_200.getMaxPassengers())) {
				return a330_200.getConsumptionPerKm();
			} else {
				return totalConsumption(a330_200, mileage, passengers) / mileage;
			}
	}

	@Override
	public Double consuptionPerPassenger(Aircraft a330_200, Double mileage, Integer passengers) {
		if(!passengers.equals(a330_200.getMaxPassengers())) {
			return 0.0;
		} else {
			return totalConsumption(a330_200, mileage, passengers) * 0.1 / passengers / mileage;
		}
	}

	@Override
	public Double totalConsumption(Aircraft a330_200, Double mileage, Integer passengers) {
		if(!passengers.equals(a330_200.getMaxPassengers())) {
			return a330_200.getConsumptionPerKm() * mileage;
		} else {
			return a330_200.getConsumptionPerKm() * mileage * 1.1;
		}
	}
	
}

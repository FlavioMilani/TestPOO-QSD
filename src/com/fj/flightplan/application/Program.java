package com.fj.flightplan.application;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.fj.flightplan.entities.AirbusA330_200;
import com.fj.flightplan.entities.AirbusA350_900;
import com.fj.flightplan.entities.AirbusA380;
import com.fj.flightplan.entities.Aircraft;
import com.fj.flightplan.entities.Boeing777_200;
import com.fj.flightplan.entities.Plan;
import com.fj.flightplan.services.AirbusA330_200Service;
import com.fj.flightplan.services.AirbusA350_900Service;
import com.fj.flightplan.services.AirbusA380Service;
import com.fj.flightplan.services.Boeing777_200Service;
import com.fj.flightplan.services.PlanCreatorService;

public class Program {

	public static void main(String[] args) {
		
		Aircraft airbusA380 = new AirbusA380("Airbus A380", 323000.0, 470, 13.02);
		Aircraft airbusA330_200 = new AirbusA330_200("Airbus A330-200", 140000.0, 290, 6.11);
		Aircraft airbusA350_900 = new AirbusA350_900("Airbus A350-900", 141000.0, 325, 5.85);
		Aircraft boeing777_200 = new Boeing777_200("Boeing 777-200", 117500.0, 370, 6.38);
		
		List<Aircraft> aircrafts = new ArrayList<>();
		
		
		aircrafts.add(airbusA380);
		aircrafts.add(airbusA330_200);
		aircrafts.add(airbusA350_900);
		aircrafts.add(boeing777_200);
		
		
		System.out.println("Companhia QSD Airlines:\n");
		
		for(Aircraft air : aircrafts) {
			System.out.println("-------------------------------------------------------------------------" 
								+ "--------------------------------------------------------------");
			System.out.println("Aeronave: " + air.getName() 
								+ " | Capacidade de combustível: " + air.getMaxFuel()
								+ " | Capacidade máxima de passageiros: " + air.getMaxPassengers()
								+ " | Consumo por Kilometros: " + air.getConsumptionPerKm());
		}
		
		System.out.println("-------------------------------------------------------------------------"
							+ "--------------------------------------------------------------\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quais aeronave serão usadas? \n" 
							+ "1- Airbus A380\n"
							+ "2- Airbus A330-200\n"
							+ "3- Airbus A350-900\n"
							+ "4- Boeing 777-200\n");
		
		List<String> selectedPlanes = new ArrayList<>();
		Map<String, Plan> plans = new LinkedHashMap<>();
		
		
		try {
			for(int i = 0; i < 3; i++) {		
				System.out.print((i+1) + "a Aeronave(Nome ou número): ");
				String ap = sc.nextLine();
				selectedPlanes.add(ap);
				
				System.out.print("Quantidade de passageiros: ");
				Integer passengers = sc.nextInt();
				
				System.out.print("Distância em KM: ");
				Double mileage = sc.nextDouble();
				sc.nextLine();
				
				if(ap.equals("Airbus A380") || ap.equals("A380") || ap.equals("1")) {
					if(passengers <= airbusA380.getMaxPassengers()) {
						PlanCreatorService service = new PlanCreatorService(new AirbusA380Service());
						plans.put(airbusA380.getName(), service.create(airbusA380, mileage, passengers));
					} else {
						while (passengers > airbusA380.getMaxPassengers()) {
							System.out.println("Limite de passageiros para o vôo na aeronave " + airbusA380.getName()
												+ " é de " + airbusA380.getMaxPassengers() + " passageiros!");
							System.out.print("Insira novamente: ");
							passengers = sc.nextInt();
							sc.nextLine();
						}
						PlanCreatorService service = new PlanCreatorService(new AirbusA380Service());
						plans.put(airbusA380.getName(), service.create(airbusA380, mileage, passengers));
					}			
				} else if (ap.equals("Airbus A330-200") || ap.equals("A330-200") || ap.equals("2")) {
					if(passengers <= airbusA330_200.getMaxPassengers()) {
						PlanCreatorService service = new PlanCreatorService(new AirbusA330_200Service());
						plans.put(airbusA330_200.getName(), service.create(airbusA330_200, mileage, passengers));
					} else {
						while (passengers > airbusA330_200.getMaxPassengers()) {
							System.out.println("Limite de passageiros para o vôo na aeronave " + airbusA330_200.getName()
												+ " é de " + airbusA330_200.getMaxPassengers() + " passageiros!");
							System.out.print("Insira novamente: ");
							passengers = sc.nextInt();
							sc.nextLine();
						}
						PlanCreatorService service = new PlanCreatorService(new AirbusA330_200Service());
						plans.put(airbusA330_200.getName(), service.create(airbusA330_200, mileage, passengers));
					}		
				}  else if (ap.equals("Airbus A350-900") || ap.equals("A350-900") || ap.equals("3")) {
					if(passengers <= airbusA350_900.getMaxPassengers()) {
						PlanCreatorService service = new PlanCreatorService(new AirbusA350_900Service());
						plans.put(airbusA350_900.getName(), service.create(airbusA350_900, mileage, passengers));
					} else {
						while (passengers > airbusA350_900.getMaxPassengers()) {
							System.out.println("Limite de passageiros para o vôo na aeronave " + airbusA350_900.getName()
												+ " é de " + airbusA350_900.getMaxPassengers() + " passageiros!");
							System.out.print("Insira novamente: ");
							passengers = sc.nextInt();
							sc.nextLine();
						}
						PlanCreatorService service = new PlanCreatorService(new AirbusA350_900Service());
						plans.put(airbusA350_900.getName(), service.create(airbusA350_900, mileage, passengers));
					}		
				} else if (ap.equals("Boeing 777-200") || ap.equals("Boeing") || ap.equals("4")) {
					if(passengers <= boeing777_200.getMaxPassengers()) {
						PlanCreatorService service = new PlanCreatorService(new Boeing777_200Service());
						plans.put(boeing777_200.getName(), service.create(boeing777_200, mileage, passengers));
					} else {
						while (passengers > boeing777_200.getMaxPassengers()) {
							System.out.println("Limite de passageiros para o vôo na aeronave " + boeing777_200.getName()
												+ " é de " + boeing777_200.getMaxPassengers() + " passageiros!");
							System.out.print("Insira novamente: ");
							passengers = sc.nextInt();
							sc.nextLine();
						}
						PlanCreatorService service = new PlanCreatorService(new Boeing777_200Service());
						plans.put(boeing777_200.getName(), service.create(boeing777_200, mileage, passengers));
					}		
					
				} else {
					System.out.println("Aeronave inexistente.");
				}
			}
			
		} catch (NullPointerException e) { 
			System.out.println("Um ou mais parâmetros nulos: " + e.getMessage());
	    } catch (RuntimeException e) {
			System.out.println("Erro inesperado: " + e.getMessage());
		}
	
		
		System.out.println("\n====================================================================================================\n"
								+ "Companhia - QSD AirLines\n====================================================================================================");
			
		for(Entry<String, Plan> result: plans.entrySet()) {
			System.out.print("\nAeronave " + result.getKey());
			System.out.println("\nPlano de voo - \n"
								+ "Passageiros: " + result.getValue().getPassengers() 
								+ "\nDistância: " + result.getValue().getTotalDistance()
								+ "\nCombustível consumida por km: " + String.format("%.2f",result.getValue().getConsuptionPerKm())
								+ "L\nCombustível que precisou ser acrescentada por passageiro: " + String.format("%.4f", result.getValue().getConsuptionPerPassenger())  
								+ "L\nCombustível total que será consumida durante o voo: " + String.format("%.2f",result.getValue().getTotalConsuption())
								+ "L\n====================================================================================================");
		}
		
		sc.close();
	}
}

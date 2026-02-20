package example_inheritance;

public class Main {

	public static void main(String[] args) {
		
		
		//creating two person objects
		Person nipun = new Person("Nipun", "980073533V");
		Person nandun = new Person("Nandun", "982109455V");
		
		//two vehicle objects for testing vehicle class methods
		Vehicle car1 = new Vehicle("BMW M3", nipun);
		Vehicle car2 = new Vehicle("Lancer 2007", nandun);
		
		//two truck objects in different type of constructors 
		Truck truck1 = new Truck("Ram 3500", nipun, 3484.00, 22100);
		Truck truck2 = new Truck();

		car1.setNumberOfCylinders(6);
		
		car2.setNumberOfCylinders(7);
		
		truck1.setNumberOfCylinders(12);
		
		//testing truck class getters and setters
		truck2.setManufactureName("Ram 3500");
		truck2.setNumberOfCylinders(12);
		truck2.setLoadCapacity(3484.00);
		truck2.setTowingCapacity(22100);
		truck2.setOwner(nandun);
		
		System.out.println("");
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println("");
		System.out.println(truck1.toString());
		System.out.println(truck2.toString());
		System.out.println("");
		
		//testing of equal method in vehicle class
		if(car1.equals(car2)) {
			System.out.println("Both Cars are same");
		}
		else
			System.out.println("Cars are not same");
		
		//testing of override equal methods in truck class
		if(truck1.equals(truck2)) {
			System.out.println("Both Trucks are same");
		}
		else
			System.out.println("Truks are not same");
		
		//testing of equal method in person class
		if(car1.getOwner().equals(truck1.getOwner())) {
			System.out.println("Owner of the car1 and truck1 are same person");
		}
		else
			System.out.println("Owner of the car1 and truck1 are not the same person");
		
	}

}

//sample output
/*
BMW M3; 6 Cylinders; Owner:Nipun
Lancer 2007; 7 Cylinders; Owner:Nandun

Ram 3500; 12 Cylinders; Owner:Nipun; load capacity(KG): 3484.0; towing capacity(Pounds):22100;
Ram 3500; 12 Cylinders; Owner:Nandun; load capacity(KG): 3484.0; towing capacity(Pounds):22100;

Cars are not same
Both Trucks are same
Owner of the car1 and truck1 are same person
*/



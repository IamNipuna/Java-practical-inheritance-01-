package example_inheritance;

public class Vehicle {
	
	private String manufactureName;
	private int numberOf_cylinder;
	private Person owner;
	
	public Vehicle(){
			
	}
	
	public Vehicle(String manufactureName){
		
		this.manufactureName = manufactureName;
	}
	
	public Vehicle(String manufactureName, Person owner){
		
		this.manufactureName = manufactureName;
		this.owner = owner;
	}
	
	public Vehicle(String manufactureName,int numberOf_cylinder, Person owner){
		
		this.manufactureName = manufactureName;
		this.numberOf_cylinder =numberOf_cylinder;
		this.owner = owner;
	}
	
	public void setManufactureName(String newManufactureName) {
		manufactureName = newManufactureName;
	}
	
	public void setNumberOfCylinders(int x) {
		numberOf_cylinder = x;
	}
	
	public void setOwner(Person newOwner) {
		owner = newOwner;
	}
	
	public String getManufactureName() {
		return manufactureName;
	}
	
	public int getNumberOfCylinders() {
		return numberOf_cylinder;
	}
	
	public Person getOwner() {
		return owner;
	}
	
	public String toString() {
		
		return (manufactureName + "; " + numberOf_cylinder +" Cylinders; "+ "Owner:"+ owner.getName());
	}
	
	public boolean equals(Vehicle otherVehicle) {
		
		if (manufactureName.equals(otherVehicle.getManufactureName()) && numberOf_cylinder == otherVehicle.numberOf_cylinder) 
			return true;
		else
			return false;
	}
}

































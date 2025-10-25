package example_inheritance;

public class Truck extends Vehicle{
	
	private double loadCapacity;
	private int towingCapacity; //in pounds
	
	public Truck() {
			
	}
	
	public Truck(String manufactureName, Person owner) {
		super(manufactureName,owner);
	}
	public Truck(double loadCapacity, int towingCapacity) {
		this.loadCapacity = loadCapacity;
		this.towingCapacity = towingCapacity;
	}
	public Truck(String manufactureName, double loadCapacity, int towingCapacity) {
		super(manufactureName);
		this.loadCapacity = loadCapacity;
		this.towingCapacity = towingCapacity;
	}
	public Truck(String manufactureName, Person owner, double loadCapacity, int towingCapacity) {
		super(manufactureName,owner);
		this.loadCapacity = loadCapacity;
		this.towingCapacity = towingCapacity;
		
	}
	
	public void setLoadCapacity(double x) {
		loadCapacity = x;
	}
	
	public void setTowingCapacity(int y) {
		towingCapacity = y;
	}
	public double getLoadCapacity() {
		return loadCapacity;
	}
	
	public int getTowingCapacity() {
		return towingCapacity;
	}
	
	//replace toString method in Vehicle class for Truck class
	public String toString() {
		
		return (
				super.getManufactureName()+"; "+ 
				super.getNumberOfCylinders()+" Cylinders; "+ 
				"Owner:"+super.getOwner().getName() +"; "+ 
				"load capacity(KG): "+loadCapacity +"; "+
				"towing capacity(Pounds):" +towingCapacity+";");
				
	}
	
	public boolean equals(Truck otherTruck) {
		
		if (super.equals(otherTruck) && loadCapacity == otherTruck.getLoadCapacity() && 
				towingCapacity == otherTruck.getTowingCapacity())
			return true;
		else
			return false;
	}
}

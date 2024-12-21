package example_inheritance;

public class Person {
	private String name;
	private String idNo;
	
//	PreCondition: Should not be able to create a Person without ID Number	
	public Person(String name, String idNo) {
		this.name = name;
		this.idNo = idNo;
	}
	
	public Person(Person theObject) {
		
		name = theObject.getName();
		idNo = theObject.getId();
	}
//	PostCondition: Every person has a ID Number
	
	public void setName(String newName) {
		name = newName;
	}
	public void setId(String newId) {
		idNo = newId;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return idNo;
	}
	
	public String toString() {
		return (name +" "+ idNo);
	}
	
	public boolean equals (Person other) {
		if (idNo.equals(other.getId()))
			return true;
		else
			return false;
	}
}

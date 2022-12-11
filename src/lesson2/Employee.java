package lesson2;

public class Employee extends Person {
	String name;
	int id;
	public Employee(int id,String name,String fatherName) {	
		super(fatherName);
		this.name = name;
		this.id = id;
		
	}
	public Employee() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

}

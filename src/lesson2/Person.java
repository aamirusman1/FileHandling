package lesson2;

import java.io.Serializable;

public class Person implements  Serializable {
	private String name;
	public String fatherName;
	private String race ;
	public Person() {
		this.name = "Daniel";
		this.fatherName = "John";
		this.race = "human";
	}
	public Person(String fatherName) {
		this.fatherName = fatherName;
	}
	

	
	

}

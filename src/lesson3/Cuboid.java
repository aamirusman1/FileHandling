package lesson3;

import java.io.Serializable;

public class Cuboid extends Rectangle implements Serializable {
	int height;
	Cuboid(int length, int breadth, int height){
		super(length,breadth);
		this.height = height;
	}

}

/*
 * here length and breadth are defined in parent class(rectangle) which does not implements Serializable interface
 * So values of these during deserialization is taken from parent class constructor(no argument constructor)
 * 
 * Refer : https://www.geeksforgeeks.org/object-serialization-inheritance-java/
 */


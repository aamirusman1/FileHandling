package lesson1;

import java.io.Serializable;

public class Employee implements Serializable {
    int id;
    String name;
    // Transient variables
    transient int tr;
    
    static int s = 100;
    final int f = 200;
  
    // Use of transient has no impact here
    transient static int ts = 40;
    transient final int tf = 50;

    public Employee() {
    	this.id = 500;
    	this.name = "Pickashow";
    }
    public Employee(int id, String name, int tr) {
          this.id = id;
          this.name = name; 
          this.tr = tr;
    }


}

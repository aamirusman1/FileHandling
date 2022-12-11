package lesson2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Parent class- extends serializable
 * child class - not extends serializable
 * in this case we can serialize objects of both the classes
 */

public class Lesson2Test {

	public static void main(String[] args) {
		 try{
             Employee emp1 =new Employee(100,"John","Manuel");
             Employee emp2 =new Employee(101,"Jerry","Samuel");
             Employee emp3 =new Employee(102,"Sam","Rancho");
             FileOutputStream fout=new FileOutputStream("output.txt");
             ObjectOutputStream out=new ObjectOutputStream(fout);
             out.writeObject(emp1);
             out.writeObject(emp2);
             out.writeObject(emp3);
             out.flush();
             out.close();
             System.out.println("Serialization  is been successfully executed");
      }
      catch(Exception e){
             System.out.println(e);}
		 
		 try{
	          ObjectInputStream in=new ObjectInputStream(new FileInputStream("output.txt"));
	          Employee e1=(Employee)in.readObject();
	          Employee e2=(Employee)in.readObject();
	          Employee e3=(Employee)in.readObject();
	          System.out.println(e1.id+" "+e1.name +" "+ e1.fatherName);
	          System.out.println(e2.id+" "+e2.name +" "+ e2.fatherName);
	          System.out.println(e3.id+" "+e3.name +" "+ e3.fatherName);
	          in.close();
	    }
	    catch(Exception e){
	          System.out.println(e);}

	}

}

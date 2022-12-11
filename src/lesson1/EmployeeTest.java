package lesson1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) {
		
		 try{
             Employee emp1 =new Employee(100,"John",1);
             Employee emp2 =new Employee(101,"Jerry",2);
             Employee emp3 =new Employee(102,"Sam",3);
             Employee emp4 = new Employee();

             FileOutputStream fout=new FileOutputStream("output.txt");
             ObjectOutputStream out=new ObjectOutputStream(fout);
             out.writeObject(emp1);
             out.writeObject(emp2);
             out.writeObject(emp3);
             out.writeObject(emp4);
             out.flush();
             out.close();
             fout.close();
             System.out.println("Serialization  is been successfully executed");
      }
      catch(Exception e){
             System.out.println(e);}
      
	
	  try{
		  FileInputStream finp= new FileInputStream("output.txt");
          ObjectInputStream in=new ObjectInputStream(finp);
          Employee e1=(Employee)in.readObject();
          Employee e2=(Employee)in.readObject();
          Employee e3=(Employee)in.readObject();
          Employee e4=(Employee)in.readObject();
          System.out.println(e1.id+" "+e1.name + " tr: "+ e1.tr +" s: "+e1.s + " f "+e1.f + " ts "+e1.ts);
          System.out.println(e2.id+" "+e2.name + " tr: "+ e2.tr +" s: "+e2.s + " f "+e2.f+ " tf "+e2.tf);
          System.out.println(e3.id+" "+e3.name + " tr: "+ e3.tr +" s: "+e3.s + " f "+e3.f+ " ts "+e3.ts);
          System.out.println(e4.id+" "+e4.name + " tr: "+ e4.tr +" s: "+e4.s + " f "+e4.f+ " tf "+e4.tf);
          in.close();
          finp.close();
    }
    catch(Exception e){
          System.out.println(e);}

}
}
/*
 * Here we are providing different values for the transient field tr but in output we get 0 for all objects
 * Transient Keyword:-
 * -At the time of serialization, if we don’t want to save value of a particular variable in a file, 
 * -then we use transient keyword. When JVM comes across transient keyword, 
 * -it ignores original value of the variable and save default value of that variable data type.
 * Static:-
 * static fields belong to a class (as opposed to an object) and are not serialized.
 */
/*
 * source: https://stackoverflow.com/questions/11000975/are-static-variables-serialized-in-serialization-process
 * - Instance Variables: These variables are serialized, so during deserialization we will get back the 
 * serialized state.
 * - Static Variables: These variables are not serialized, So during deserialization static variable 
 * value will loaded from the class.(Current value will be loaded.) 
 * - transient Variables: transient variables are not serialized, so during deserialization those 
 * variables will be initialized with corresponding default values (ex: for objects null, int 0).
 * - Super class variables: If super class also implemented Serializable interface then those 
 * variables will be serialized, otherwise it won't serialize the super class variables. 
 * and while deserializing, JVM will run default constructor in super class and populates the default values. 
 * Same thing will happen for all superclasses.
 */


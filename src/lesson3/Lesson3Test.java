package lesson3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import lesson2.Employee;

public class Lesson3Test {

	public static void main(String[] args) {
		try{
			Cuboid cb1 = new Cuboid(1,2,3);
			Cuboid cb2 = new Cuboid(4,5,6);
			Cuboid cb3 = new Cuboid(7,8,9);
          
            FileOutputStream fout=new FileOutputStream("output.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(cb1);
            out.writeObject(cb2);
            out.writeObject(cb3);
            out.flush();
            out.close();
            System.out.println("Serialization  is been successfully executed");
     }
     catch(Exception e){
            System.out.println(e);}
		 
		 try{
	          ObjectInputStream in=new ObjectInputStream(new FileInputStream("output.txt"));
	          Cuboid c1=(Cuboid)in.readObject();
	          Cuboid c2=(Cuboid)in.readObject();
	          Cuboid c3=(Cuboid)in.readObject();
	          System.out.println(c1.length+" "+c1.breadth +" "+ c1.height);
	          System.out.println(c2.length+" "+c2.breadth +" "+ c2.height);
	          System.out.println(c3.length+" "+c3.breadth +" "+ c3.height);
	          in.close();
	    }
	    catch(Exception e){
	          System.out.println(e);}

	}

}

/* Output: when parent constructor does not give any value to length and breadth
 * 0 0 3
   0 0 6
   0 0 9
 */

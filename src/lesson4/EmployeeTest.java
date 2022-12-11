package lesson4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Serialize
		Employee e = new Employee();
		e.setId(1);
		e.setName("Aamir");
		FileOutputStream fout = new FileOutputStream("output.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(e);
		out.close();
		fout.close();
		
		//Deserialize
		FileInputStream fin = new FileInputStream("output.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		Employee e1 = (Employee)in.readObject();
		System.out.println("Name: "+ e1.getName());
		System.out.println("Id: "+ e1.getId());
		

	}

}

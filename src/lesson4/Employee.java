package lesson4;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	
	private int id;
	private String name;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
	//Write fields which you have to add to the byte stream	
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = in.readInt();
	//Write fields which you have to read from the byte stream
	}

}
/*
 * - here we have not used transient keyword for name but even then this
 * field will be ignored because that is not mentioned in writeExternal method.
 * - So if we want to not serialize say 100 fields then we should not 
 * include them in the writeExternal or readExternal methods.
 */

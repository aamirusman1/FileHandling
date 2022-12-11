package buffer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOutput {

	public static void main(String[] args) {
	       String data = "This is a demo of the flush method";

	        try {
	            // Creates a FileOutputStream
	            FileOutputStream file = new FileOutputStream(" flush.txt");

	            // Creates a BufferedOutputStream
	            BufferedOutputStream buffer = new BufferedOutputStream(file);

	            // Writes data to the output stream
	            buffer.write(data.getBytes());
	            
	            

	            // Flushes data to the destination
	            buffer.flush();
	            System.out.println("Data is flushed to the file.");
	            buffer.close();
	        }

	        catch(Exception e) {
	            e.getStackTrace();
	        }

	}

}

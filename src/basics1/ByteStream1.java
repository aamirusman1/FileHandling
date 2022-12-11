package basics1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream1 {

	public static void main(String[] args) {
	       FileInputStream in=null;
	        FileOutputStream out=null;
	        
	        try{
	            in=new FileInputStream("E:\\Wile Training\\File Handling\\input.txt");
	            out=new FileOutputStream("E:\\Wile Training\\File Handling\\output.txt");
	            int c;
	            while((c=in.read())!=-1){
	            	System.out.print((char)c);
	                out.write(c);
	            }
	            in.close();
	            out.close();
	        }
	        catch(FileNotFoundException e)
	        {
	            System.out.println(e);
	        }
	        catch(IOException e)
	        {
	            System.out.println(e);
	        }

	}

}

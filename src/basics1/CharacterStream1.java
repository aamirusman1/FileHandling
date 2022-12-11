package basics1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharacterStream1 {

	public static void main(String[] args) {
        FileReader in=null;
        //FileWriter out=null;
        
        try{
            in=new FileReader("E:\\Wile Training\\File Handling\\input.txt");
            FileWriter out=new FileWriter("E:\\Wile Training\\File Handling\\output.txt");
            out.write("Here we writing with character steam.");
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

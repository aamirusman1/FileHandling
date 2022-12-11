package basics1;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		File file = new File("E:\\Wile Training\\File Handling\\myfile.txt");
		try {
			if(file.createNewFile())
				System.out.println("File created");
			else
				System.out.println("File already exits");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
/* createNewFile():-
 * It atomically creates a new, empty file named by this abstract pathname if and only if a file 
 * with this name does not yet exist.
 */

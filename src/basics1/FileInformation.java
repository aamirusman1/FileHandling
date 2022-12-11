package basics1;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		
		File file = new File("E:\\Wile Training\\File Handling\\myfile.txt");
		if(file.exists()) {
			System.out.println("File exists");
			System.out.println("File Name: "+file.getName());
			System.out.println("Absolute File Path: "+file.getAbsolutePath());
			System.out.println("Is file Writable?"+ file.canWrite());
			System.out.println("File readable? " + file.canRead());
			System.out.println("File length: "+ file.length());
			
		}else {
			System.out.println("File doesn't exits");
		}

	}

}

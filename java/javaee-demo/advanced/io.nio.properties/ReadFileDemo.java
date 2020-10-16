/*
    REQUIREMENTS:
        - To read a file using java.io.File
    ENTITIES:
        - ReadFileDemo
    WORK TO BE DONE:
        - create a file instance
        - obtain scanner object with file
        - while the scanner has next line
        	-> print the scanner data 
        - close the scanner
    
    PSEUDOCODE:
    {
    	In the main function
    	
		try {
		      File file = new File("C:\\1DEV\\mytraining\\java\\javaee-demo\\reflections\\reasoning.txt");
		      Scanner scanner = new Scanner(file);
		      
		      while (scanner.hasNextLine()) {
		        String data = scanner.nextLine();
		        System.out.println(data);
		      }
		      scanner.close();
		} catch (FileNotFoundException e) {
		      e.printStackTrace();
		}
    }
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileDemo {

	public static void main(String[] args) {

		try {
			File file = new File("C:\\1DEV\\mytraining\\java\\javaee-demo\\reflections\\reasoning.txt");
		    Scanner scanner = new Scanner(file);
		      
		    while (scanner.hasNextLine()) {
		    	String data = scanner.nextLine();
		        System.out.println(data);
		    }
		    scanner.close();
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		}
	}
}

/*
    REQUIREMENTS:
        - To get the permission allowed for a file
    ENTITIES:
        - PermissionDemo
    WORK TO BE DONE:
        - get a file instance
        - check whether the file exists
        	-> if yes, print whether it is executable, readable and writable or not 
            
    PSEUDOCODE:
        {
            In the main function

			File file = new File("C:\\1DEV\\mytraining\\java\\javaee-demo\\reflections\\reasoning.txt"); 
          
        	boolean exists = file.exists(); 
        
        	if(exists == true) { 
            	System.out.println("x: " + file.canExecute()); 
            	System.out.println("r: " + file.canRead()); 
            	System.out.println("w: "+ file.canWrite()); 
        	} 
        }
*/

import java.io.File;

public class PermissionDemo {

	public static void main(String[] args) {
		
		File file = new File("C:\\1DEV\\mytraining\\java\\javaee-demo\\reflections\\reasoning.txt"); 
          
        boolean exists = file.exists(); 
        
        if(exists == true) { 
            System.out.println("x: " + file.canExecute()); 
            System.out.println("r: " + file.canRead()); 
            System.out.println("w: "+ file.canWrite()); 
        } 
	}
}

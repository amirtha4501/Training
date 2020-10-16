/*
    REQUIREMENTS:
        - To read a file using Reader  
    ENTITIES:
        - ReaderDemo
    WORK TO DONE:
        - Make a file reader
        - while the reader ready to be read
            - print the content

    PSEUDOCODE:
        {
            In the main function

            FileReader fileReader = new FileReader(path); 
  
            int content; 
        	while ((content = fileReader.read()) != -1) {
            	System.out.print((char) content); 
        	}
        }
*/

import java.io.FileReader;

public class ReaderDemo {
   public static void main(String[] args) throws Exception {

        FileReader fileReader = new FileReader("C:\\1DEV\\mytraining\\java\\javaee-demo\\reflections\\reasoning.txt"); 

        int content; 
    	while ((content = fileReader.read()) != -1) {
        	System.out.print((char) content); 
    	}
    }    
}

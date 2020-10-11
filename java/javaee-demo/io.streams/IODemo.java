/*
    REQUIREMENTS:
        - To read the file contents line by line in streams 
    ENTITIES:
        - IODemo
    WORK TO DONE:
        - Make a file reader
        - convert file reader to buffered reader
        - while buffer reader the ready to be read
            - print the line

    PSEUDOCODE:
        {
            In the main function

            FileReader fileReader = new FileReader(path); 
  
            BufferedReader buffReader = new BufferedReader(fileReader); 
  
            while (buffReader.ready()) { 
                System.out.println(buffReader.readLine()); 
            } 
        }
*/

import java.io.FileReader;
import java.io.BufferedReader;

public class IODemo {
   public static void main(String[] args) throws Exception {

        FileReader fileReader = new FileReader("C:\\1DEV\\mytraining\\java\\javaee-demo\\reflections\\reasoning.txt"); 
  
        // Convert fileReader to bufferedReader 
        BufferedReader buffReader = new BufferedReader(fileReader); 
  
        while (buffReader.ready()) { 
            System.out.println(buffReader.readLine()); 
        } 
    }    
}
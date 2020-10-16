/*
    REQUIREMENTS:
        - To read a text file using BufferedReader and print the content of the file
    ENTITIES:
        - BufferedReaderDemo
    WORK TO DONE:
        - Make a file reader
        - convert file reader to buffered reader
        - while buffer reader the ready to be read
            - print the line

    PSEUDOCODE:
        {
            In the main function

            FileReader fileReader = new FileReader(path); 
  
            BufferedReader bufferedReader = new BufferedReader(fileReader); 
  
            while (bufferedReader.ready()) { 
                System.out.println(bufferedReader.readLine()); 
            } 
        }
*/

import java.io.FileReader;
import java.io.BufferedReader;

public class BufferedReaderDemo {
	
    public static void main(String[] args) throws Exception {

        FileReader fileReader = new FileReader("C:\\1DEV\\mytraining\\java\\javaee-demo\\reflections\\reasoning.txt"); 
  
        // Convert fileReader to bufferedReader 
        BufferedReader bufferedReader = new BufferedReader(fileReader); 
  
        while (bufferedReader.ready()) { 
            System.out.println(bufferedReader.readLine()); 
        } 
    }    
}

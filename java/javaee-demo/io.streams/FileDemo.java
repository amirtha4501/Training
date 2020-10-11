/*
    REQUIREMENTS:
        - To write a Java program reads data from a particular file using FileReader 
          and writes it to another, using FileWriter
    ENTITIES:
        - FileDemo
    WORK TO DONE:
        - Obtain a file reader with file input.txt
        - try to read the file and catch the exception if the file is not found
        - while not in eof
            - write content to another file
    PSEUDOCODE:
        {
            In the main function

            FileReader fileReader = new FileReader("input.txt"); 
            FileWriter fileWriter = new FileWriter("output.txt"); 

            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character); 
            }
        }
*/

import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.io.FileNotFoundException; 

class FileDemo {

    public static void main(String[] args) throws IOException { 

        int character; 
        FileReader fileReader = null; 
  
        try { 
            fileReader = new FileReader("input.txt"); 
        } catch (FileNotFoundException e) { 
            System.out.println("File not found"); 
        } 

        FileWriter fileWriter = new FileWriter("output.txt"); 

        while ((character = fileReader.read()) != -1) {
            fileWriter.write(character); 
        }

        System.out.println("Done"); 
        
        fileReader.close(); 
        fileWriter.close(); 
    } 
}

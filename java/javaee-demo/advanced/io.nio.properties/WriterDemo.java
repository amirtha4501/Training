/*
    REQUIREMENTS:
        - To write a String content using Writer
    ENTITIES:
        - WriterDemo
    WORK TO BE DONE:
        - try to create a writer instance
        - write a string to the console using write method of Writer class
    
    PSEUDOCODE:
    {
    	In the main function
    	
    	try {   
            Writer writer = new PrintWriter(System.out); 
            writer.write("Ammu papa"); 
  
            writer.flush(); 
        } 
        catch (Exception e) { 
            System.out.println(e); 
        } 
    }
*/

import java.io.PrintWriter;
import java.io.Writer;

public class WriterDemo {

	public static void main(String[] args) {
		
    	try { 
    		  
            Writer writer = new PrintWriter(System.out); 
            writer.write("Ammu papa");  
  
            writer.flush(); 
        } 
        catch (Exception e) { 
            System.out.println(e); 
        } 

	}
}

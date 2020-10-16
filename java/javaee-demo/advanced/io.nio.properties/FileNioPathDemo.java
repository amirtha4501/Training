/*
    REQUIREMENTS:
        - To read a file using java.nio.Files using Paths
    ENTITIES:
        - FileNioPathDemo
    WORK TO BE DONE:
        - get a path instance
        - get all lines of the file and store it in a list of string
        - for each data in the list
            - display the data
            
    PSEUDOCODE:
        {
            In the main function

			Path path = Paths.get("C:\\1DEV\\mytraining\\java\\javaee-demo\\reflections\\reasoning.txt");
		
			List<String> contents = Files.readAllLines(path);
		
			for(String content: contents) {
		    	System.out.println(content);
			}
        }
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileNioPathDemo {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:\\1DEV\\mytraining\\java\\javaee-demo\\reflections\\reasoning.txt");
		
		List<String> contents = Files.readAllLines(path);
		
		for(String content: contents) {
		    System.out.println(content);
		}
	}
}

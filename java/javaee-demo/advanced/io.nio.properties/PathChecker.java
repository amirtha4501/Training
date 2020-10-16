/*
    REQUIREMENTS:
        - To check if the path is a file or directory
    ENTITIES:
        - PathChecker
    WORK TO DONE:
        - Make a file reader
        - convert file reader to buffered reader
        - while buffer reader the ready to be read
            - print the line

    PSEUDOCODE:
        {
            In the main function

            File file = new File("C:\\1DEV\\mytraining\\java\\javaee-demo\\reflections");

			boolean isDirectory = file.isDirectory();
			boolean isFile = file.isFile(); 
		
			if (isFile) {
				System.out.println("File");
			} 
		
			if (isDirectory) {
				System.out.println("Directory");
			} 
        }
*/

import java.io.File;

public class PathChecker {

	public static void main(String[] args) {

		File file = new File("C:\\1DEV\\mytraining\\java\\javaee-demo\\reflections");

		boolean isDirectory = file.isDirectory();
		boolean isFile = file.isFile(); 
		
		if (isFile) {
			System.out.println("File");
		} 
		
		if (isDirectory) {
			System.out.println("Directory");
		} 
		
	}

}

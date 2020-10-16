/*
    REQUIREMENTS:
        - To get the file names of all file with specific extension in a directory
    ENTITIES:
        - NamePrinter
    WORK TO BE DONE:
        - get a file instance
        - get a instance of type file input stream
        - while not in eof
            - display the content
            
    PSEUDOCODE:
        {
            In the main function

            File file = new File("C:\\1DEV\\mytraining\\java\\javaee-demo\\advanced\\io.nio");
	     	File[] files = file.listFiles(new FilenameFilter() {
	             
	    		public boolean accept(File dir, String name) {
	    		 
	    		 	if (name.toLowerCase().endsWith(".java") || name.toLowerCase().endsWith(".txt")){
	    			 	return true;
	             	} else {
	            	 	return false;
	             	}
	         	}
	     	});
	     
	     	for(File f: files) {
	    		System.out.println(f.getName());
			}
        }
*/

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class NamePrinter {

	public static void main(String[] args) throws IOException {

		 File file = new File("C:\\1DEV\\mytraining\\java\\javaee-demo\\advanced\\io.nio");
	     File[] files = file.listFiles(new FilenameFilter() {
	             
	    	 public boolean accept(File dir, String name) {
	    		 
	    		 if (name.toLowerCase().endsWith(".java") || name.toLowerCase().endsWith(".txt")){
	    			 return true;
	             } else {
	            	 return false;
	             }
	         }
	     });
	     
	     for (File f: files) {
	    	 System.out.println(f.getName());
	     }
	}
}

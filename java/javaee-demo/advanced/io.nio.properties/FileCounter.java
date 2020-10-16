import java.io.File;

/*
    REQUIREMENTS:
        - To number of files in a directory and number of directories in a directory
    ENTITIES:
        - FileCounter
    WORK TO BE DONE:
    	- define a path
        - create variables of type int called fileCount and directoryCount
        - create a file instance with path
        - get list of files and store it in files array
        - if the files list contains contents
        	-> for each in files list
        		- check if it is a file, increment the filecount
        		- check if it is a directory, increment the directorycount
            	- print the filecount, directorycount
            	
    PSEUDOCODE:
        {
            In the main function
			
			String path = "C:\\1DEV\\mytraining\\java\\javaee-demo\\advanced";
			int fileCount = 0;
			int directoryCount = 0;
		
			File f = new File(path);
	    	File[] files = f.listFiles();

	    	if (files != null) {
	    		for (int i = 0; i < files.length; i++) {
	    		
	    			File file = files[i];
	    		
	    			if (file.isFile()) {  
	    				fileCount++;
	    			}
	    		
	    			if (file.isDirectory()) {   
	    				directoryCount++;
	    			}	
	    		}
	    	}
	    	System.out.println("file count: " + fileCount++);
	    	System.out.println("directory count: " + directoryCount++);
        }
*/

public class FileCounter {
	
	public static void main(String[] args) {

		String path = "C:\\1DEV\\mytraining\\java\\javaee-demo\\advanced";
		int fileCount = 0;
		int directoryCount = 0;
		
		File f = new File(path);
	    File[] files = f.listFiles();

	    if (files != null) {
	    	for (int i = 0; i < files.length; i++) {
	    		
	    		File file = files[i];
	    		
	    		if (file.isFile()) {  
	    			fileCount++;
	    		}
	    		
	    		if (file.isDirectory()) {   
	    			directoryCount++;
	    		}	
	    	}
	    }
	    System.out.println("file count: " + fileCount++);
	    System.out.println("directory count: " + directoryCount++);
	}

}




























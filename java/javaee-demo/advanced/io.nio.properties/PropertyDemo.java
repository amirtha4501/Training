/*
    REQUIREMENTS:
        - To get and print a configurable property based on the given priority
    ENTITIES:
        - PropertyDemo
    METHOD SIGNATURE:
    	- static String customProperty();
    	- static String getToken(String token);
	WORK TO DONE:
        - if arguments passed for the program, print the token from the args
        - if not, invoke getToken method
        - get token from env variable 
            - if not null, return token
        - get token using custom property method
        	- if not null, return token
        - create a string, and hardcode the token
        - print the token
        
    PSEUDOCODE:
    	{
    		In the customProperty function
    		
    		try (OutputStream output = new FileOutputStream("C:\\1DEV\\mytraining\\java\\javaee-demo\\advanced\\io.nio.properties\\config.properties")) {

            Properties properties = new Properties();

            properties.setProperty("JAVA_TOKEN", "a56rvupjhnpio9u8vte4xghb");
            
            properties.store(output, null);

            return properties.getProperty("JAVA_TOKEN") + " from custom property";
    	}
    	{ 
    		In the getToken function
    		
			token = System.getenv("JAVA_TOKEN");
			if(token != null) {
				return token + " from env variable";	
			}
		
			token = customProperty();
			if(token != null) {
				return token + " from custom property";	
			}
		
			String JAVA_TOKEN = "a56rvupjhnpio9u8vte4xghb";
			return JAVA_TOKEN + "hardcoded";
    	}
        {
            In the main function

            String token = null;	

			if (args.length != 0) {
				token = args[0] + " from args";
			} else {
				getToken(token);
			}
		
			System.out.println(token);
        }
*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyDemo {

	static String customProperty() throws IOException {
		try (OutputStream output = new FileOutputStream("C:\\1DEV\\mytraining\\java\\javaee-demo\\advanced\\io.nio.properties\\config.properties")) {

            Properties properties = new Properties();

            properties.setProperty("JAVA_TOKEN", "a56rvupjhnpio9u8vte4xghb");
            
            properties.store(output, null);

            return properties.getProperty("JAVA_TOKEN") + " from custom property";
		}   
	}
	
	static String getToken(String token) throws IOException {

		token = System.getenv("JAVA_TOKEN");
		
		if(token != null) {
			return token + " from env variable";	
		}
		
		token = customProperty();
		
		if(token != null) {
			return token + " from custom property";	
		}
		
		String JAVA_TOKEN = "a56rvupjhnpio9u8vte4xghb";
		return JAVA_TOKEN + "hardcoded";
	}
	
	public static void main(String[] args) throws IOException {
		
		String token = null;	

		if (args.length != 0) {
			token = args[0] + " from args";
		} else {
			getToken(token);
		}
		
		System.out.println(token);
	}
}

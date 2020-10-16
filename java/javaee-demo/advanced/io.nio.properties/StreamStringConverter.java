/*
    REQUIREMENTS:
        - To convert InputStream to String
    ENTITIES:
        - StreamStringConverter
    WORK TO DONE:
        - get bytes from message and give it byte array input stream
        - create a string builder
        - give the input stream to the buffered reader
		- while the buffered reader has content to read
			-> append the content to the string builder
		- print the string builder
		
		- create an InputStream
		- create a string content
		- get bytes of the string content and pass it to bytearray input stream
		- while the input stream has content to read
		- print the content by casting the data to char type
		
    PSEUDOCODE:
        {
            In the main function

			InputStream inputStream = new ByteArrayInputStream("InputStream message".getBytes());

        	StringBuilder stringBuilder = new StringBuilder();
        	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        	while ((content = bufferedReader.readLine()) != null) {
            	stringBuilder.append(content);
        	}
        	bufferedReader.close();
        	
        	print(stringBuilder)
        	
        	// String to InputStream       
        	InputStream ipStream = null;
        	String myStr = "String message";
        
        	ipStream = new ByteArrayInputStream(myStr.getBytes("UTF-8"));
        
        	int data;

        	while ((data = ipStream.read()) != -1) {
            	System.out.print((char) data);
        	}
        }
*/

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamStringConverter {

	public static void main(String[] args) throws IOException {
		
		// InputStream to String		
		InputStream inputStream = new ByteArrayInputStream("InputStream message".getBytes());

		String content;
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        while ((content = bufferedReader.readLine()) != null) {
            stringBuilder.append(content);
        }
        bufferedReader.close();

        System.out.println(stringBuilder);
        
        // String to InputStream       
        InputStream ipStream = null;
        String myStr = "String message";
        
        ipStream = new ByteArrayInputStream(myStr.getBytes("UTF-8"));
        
        int data;

        while ((data = ipStream.read()) != -1) {
            System.out.print((char) data);
        }
	}
}

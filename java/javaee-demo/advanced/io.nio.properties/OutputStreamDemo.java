/*
    REQUIREMENTS:
        - To write some String content using OutputStream
    ENTITIES:
        - OutputStreamDemo
    WORK TO DONE:
        - create a string called content
        - get bytes of the content
        - try to obtain the file output stream
        - write the content bytes to the output stream
        - print "done"

    PSEUDOCODE:
        {
            In the main function

            String content = "Hello from OutputStreamDemo";
 
        	byte[] bytes = content.getBytes();
 
        	try (OutputStream outputStream = new FileOutputStream("C:\\1DEV\\mytraining\\java\\javaee-demo\\advanced\\io.nio\\input.txt")) {
 
            	outputStream.write(bytes);
            	System.out.println("Done");
 
        	} catch (IOException e) {
            	e.printStackTrace();
        	}
        }
*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
 
class OutputStreamDemo {
 
    public static void main(String[] args) {
 
        String content = "Hello from OutputStreamDemo";
 
        byte[] bytes = content.getBytes();
 
        try (OutputStream outputStream = new FileOutputStream("C:\\1DEV\\mytraining\\java\\javaee-demo\\advanced\\io.nio\\input.txt")) {
 
            outputStream.write(bytes);
            System.out.println("Done");
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

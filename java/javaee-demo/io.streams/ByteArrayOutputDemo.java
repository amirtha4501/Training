/*
    REQUIREMENTS:
        - To read the file contents line by line in streams 
    ENTITIES:
        - ByteArrayOutputDemo
    WORK TO DONE:
        - make a file FileOutputStream for file1, file2
        - using ByteArrayOutputStream, write into it using with write()
        - using writeTo() method, write content to the file
    PSEUDOCODE:
        {
            In the main function

            FileOutputStream file1 = new FileOutputStream(file1.txt);
            FileOutputStream file2 = new FileOutputStream(file2.txt);
                
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();    
            byteArrayOutputStream.write(65);    
            byteArrayOutputStream.writeTo(file1);    
            byteArrayOutputStream.writeTo(file2);    
                
            byteArrayOutputStream.flush();    
            byteArrayOutputStream.close();
        }
*/

import java.io.FileOutputStream;  
import java.io.ByteArrayOutputStream;

class ByteArrayOutputDemo {  

    public static void main(String args[]) throws Exception {    

        FileOutputStream file1 = new FileOutputStream("C:\\1DEV\\mytraining\\java\\javaee-demo\\io.streams\\file1.txt");
        FileOutputStream file2 = new FileOutputStream("C:\\1DEV\\mytraining\\java\\javaee-demo\\io.streams\\file2.txt");
            
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();    
        byteArrayOutputStream.write(65);    
        byteArrayOutputStream.writeTo(file1);    
        byteArrayOutputStream.writeTo(file2);    
            
        byteArrayOutputStream.flush();    
        byteArrayOutputStream.close();    
    }    
}   

/*
    REQUIREMENTS:
        - To write a program for ByteArrayInputStream class to read byte array as input stream
    ENTITIES:
        - ByteArrayInputDemo
    WORK TO DONE:
        - create a byte array
        - give letters array to ByteArrayInputStream
        - while the byteArrayInputStream has values
            - cast ascii to respective character
            - print the character
    PSEUDOCODE:
        {
            In the main function

            byte[] letters = { 65, 66, 67, 68 };  

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(letters);  
            
            while ((ascii = byteArrayInputStream.read()) != -1) {  
                char character = (char) ascii;  
                System.out.println("ASCII " + ascii + ": " + character);
            }  
        }
*/

import java.io.ByteArrayInputStream;  
import java.io.IOException;  

class ByteArrayInputDemo {  

    public static void main(String[] args) throws IOException {  
        byte[] letters = { 65, 66, 67, 68 };  

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(letters);  
        int ascii = 0;  

        while ((ascii = byteArrayInputStream.read()) != -1) {  
            char character = (char) ascii;  
            System.out.println("ASCII " + ascii + ": " + character);
        }  
    }  
}  

/*
    REQUIREMENTS:
        - To read a file using InputStream
    ENTITIES:
        - FileReadDemo
    WORK TO BE DONE:
        - get a file instance
        - get a instance of type file input stream
        - while not in eof
            - display the content
            
    PSEUDOCODE:
        {
            In the main function

            try {
                File file = new File("C:\\1DEV\\mytraining\\java\\javaee-demo\\io.streams\\input.txt");
                InputStream input = new FileInputStream(file);

                int content;

                while ((content = input.read()) != -1) {
                    System.out.println((char) content);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
*/

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;

class FileReadDemo {

    public static void main(String[] args) {
        
        try {
            File file = new File("C:\\1DEV\\mytraining\\java\\javaee-demo\\io.streams\\input.txt");
            InputStream input = new FileInputStream(file);

            int content;

            while ((content = input.read()) != -1) {
                System.out.println((char) content);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

import java.io.*;

public class IODemo {
   public static void main(String[] args) throws Exception {

        FileReader fileReader = new FileReader("C:\\1DEV\\mytraining\\javaNIO\\temp1.txt"); 
  
        // Convert fileReader to bufferedReader 
        BufferedReader buffReader = new BufferedReader(fileReader); 
  
        while (buffReader.ready()) { 
            System.out.println(buffReader.readLine()); 
        } 
    }    
}
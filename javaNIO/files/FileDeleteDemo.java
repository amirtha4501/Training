package in.kpriet.training.java.filedemo;

import java.nio.file.*;
import java.io.*;

class FileDeleteDemo {

    public static void main(String[] args) {
    
        Path path = Paths.get("C:\\1DEV\\mytraining\\javaNIO\\temp3.txt");
       
        try {
            Files.delete(path);
        } catch (IOException e) {
            System.out.println("something else went wrong");
        }        
    }
}

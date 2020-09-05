package in.kpriet.training.java.filedemo;

import java.nio.file.*;
import java.io.*;

class FileMoveDemo {

    public static void main(String[] args) {
    
        Path srcPath = Paths.get("C:\\1DEV\\mytraining\\javaNIO\\temp1.txt");
        Path desPath = Paths.get("C:\\1DEV\\mytraining\\javaNIO\\files\\testdir\\temp2.txt");

        try {
            Files.copy(srcPath, desPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (FileAlreadyExistsException e) {
            System.out.println("the directory already exists");
        } catch (IOException e) {
            System.out.println("something else went wrong");
        }        
    }
}
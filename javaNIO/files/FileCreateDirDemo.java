package in.kpriet.training.java.filedemo;

import java.nio.file.*;
import java.io.*;

class FileCreateDirDemo {

    public static void main(String[] args) {
       
        Path path = Paths.get("C:\\1DEV\\mytraining\\javaNIO\\files\\testdir");

        try {
            Path newDir = Files.createDirectory(path);
        } catch (FileAlreadyExistsException e) {
            System.out.println("the directory already exists");
        } catch (IOException e) {
            System.out.println("something else went wrong");
        }
    }
}

// creates testdir in the specified directory

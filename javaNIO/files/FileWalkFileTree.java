package in.kpriet.training.java.filedemo;

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.*;

enum FileVisitResult {
    CONTINUE,
    TERMINATE,
    SKIP_SIBLINGS,
    SKIP_SUBTREE
}

interface FileVisitor {
    
    public FileVisitResult preVisitDirectory(
        Path dir, BasicFileAttributes attrs) throws IOException;

    public FileVisitResult visitFile(
        Path file, BasicFileAttributes attrs) throws IOException;

    public FileVisitResult visitFileFailed(
        Path file, IOException exc) throws IOException;

    public FileVisitResult postVisitDirectory(
        Path dir, IOException exc) throws IOException;
}

class FuleWalkFileTree {
    
    public static void main(String[] args) {

        Path file = Paths.get("C:\\1DEV\\mytraining\\javaNIO\\IODemo.java");
        Path dir = Paths.get("C:\\1DEV\\mytraining\\javaNIO");
        BasicFileAttributes attrs = Files.readAttributes(file, BasicFileAttributes.class);

        Files.walkFileTree(file, new FileVisitor<Path>() {
            @Override //  indicates that the child class method is over-writing its base class method
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
              System.out.println("pre visit dir:" + dir);
              return FileVisitResult.CONTINUE;
            }
          
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
              System.out.println("visit file: " + file);
              return FileVisitResult.CONTINUE;
            }
          
            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
              System.out.println("visit file failed: " + file);
              return FileVisitResult.CONTINUE;
            }
          
            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
              System.out.println("post visit directory: " + dir);
              return FileVisitResult.CONTINUE;
            }
        });
    }


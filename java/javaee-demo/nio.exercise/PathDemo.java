/*
    REQUIREMENTS:
        - To demonstrate absolute and relative path
        - To obtain current directory and parent directory using codes(. & ..)
        - To demonstrate toAbsolutePath(), normalize(), getName(), getFileName() and getFileCount()
    ENTITIES:
        - PathDemo
    WORK TO BE DONE:
        - create path instances
        - print absolute and relate path
        - use toAbsolutePath() method
        - use normalize() method
        - use getName() method
        - use getFileCount() method
        - print the results
*/

import java.nio.file.LinkOption; 
import java.nio.file.Path; 
import java.nio.file.Paths;

public class PathDemo {

    public static void main(String[] args) {

        Path pathAbsolute = Paths.get("c:\\1dev\\mytraining\\javaNIO\\input.txt"); 
        System.out.println("\nabsolute " + pathAbsolute);

        Path pathAbsoluteForward = Paths.get("c:/1dev/mytraining/javaNIO/input.txt"); 
        System.out.println("\nabsolute with forward slash " + pathAbsoluteForward);
     
        Path pathRelative = Paths.get("c:\\1dev", "\\javaNIO\\input.txt"); 
        System.out.println("\nrelative " + pathRelative);

        Path currentDir = Paths.get(".");
        System.out.println("\ncurrentDir " + currentDir.toAbsolutePath());   

        Path parentDir = Paths.get("..");
        System.out.println("\nparentDir " + parentDir.toAbsolutePath());

        Path path1 = Paths.get("c:\\1dev", ".\\javaNIO");
        System.out.println("\n" + path1.normalize());

        Path path2 = Paths.get("C:\\1DEV\\mytraining\\javaNIO\\temp1.txt");
        System.out.println("\n" + path2.toString());
        System.out.println(path2.getFileName());
        System.out.println(path2.getNameCount());
        System.out.println(path2.getName(path2.getNameCount() - 1));        
    }
}

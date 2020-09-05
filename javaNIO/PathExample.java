import java.nio.file.Path; // Path interface 
import java.nio.file.Paths; // Paths class

public class PathExample {

    public static void main(String[] args) {

        Path pathAbsolute = Paths.get("c:\\1dev\\mytraining\\javaNIO\\input.txt"); // absolute path
        System.out.println("\nabsolute" + pathAbsolute);

        // Path pathAbsoluteBackward = Paths.get("c:\1dev\mytraining\javaNIO\input.txt");   // error: illegal escape character 
        // System.out.println("\nabsolute with backward slash" + pathAbsoluteBackward);

        Path pathAbsoluteForward = Paths.get("c:/1dev/mytraining/javaNIO/input.txt"); // absolute path
        System.out.println("\nabsolute with forward slash" + pathAbsoluteForward);
     
        Path pathRelative = Paths.get("c:\\1dev", "\\javaNIO\\input.txt"); // relative path
        System.out.println("\nrelative" + pathRelative);

        Path currentDir = Paths.get(".");
        System.out.println("\nwith '.' =  " + currentDir.toAbsolutePath());   

        Path parentDir = Paths.get("..");
        System.out.println("\nparentDir " + parentDir.toAbsolutePath());

        Path path1 = Paths.get("c:\\1dev", ".\\javaNIO");
        System.out.println("\n" + path1.normalize());
    }
}

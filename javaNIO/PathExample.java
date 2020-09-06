import java.nio.file.LinkOption; // Path interface 
import java.nio.file.Path; // Path interface 
import java.nio.file.Paths; // Paths class

public class PathExample {

    public static void main(String[] args) {

        Path pathAbsolute = Paths.get("c:\\1dev\\mytraining\\javaNIO\\input.txt"); // absolute path
        System.out.println("\nabsolute " + pathAbsolute);

        // Path pathAbsoluteBackward = Paths.get("c:\1dev\mytraining\javaNIO\input.txt");   // error: illegal escape character 
        // System.out.println("\nabsolute with backward slash" + pathAbsoluteBackward);

        Path pathAbsoluteForward = Paths.get("c:/1dev/mytraining/javaNIO/input.txt"); // absolute path
        System.out.println("\nabsolute with forward slash " + pathAbsoluteForward);
     
        Path pathRelative = Paths.get("c:\\1dev", "\\javaNIO\\input.txt"); // relative path
        System.out.println("\nrelative " + pathRelative);

        Path currentDir = Paths.get(".");
        System.out.println("\ncurrentDir " + currentDir.toAbsolutePath());   

        Path parentDir = Paths.get("..");
        System.out.println("\nparentDir " + parentDir.toAbsolutePath());

        Path path1 = Paths.get("c:\\1dev", ".\\javaNIO");
        System.out.println("\n" + path1.normalize());

        // Path path2 = Paths.get("temp1.txt");
        Path path2 = Paths.get("C:\\1DEV\\mytraining\\javaNIO\\temp1.txt");
        System.out.println("\n" + path2.toString());
        System.out.println(path2.getFileName());
        System.out.println(path2.getNameCount());
        System.out.println(path2.getName(path2.getNameCount() - 1));
        
        // Path realPath = path2.toRealPath(LinkOption.NOFOLLOW_LINKS);
        // System.out.println(realPath);
    }
}

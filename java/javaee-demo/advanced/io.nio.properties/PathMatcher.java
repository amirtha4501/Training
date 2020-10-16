/*
    REQUIREMENTS:
        - To create two paths and test whether they represent same path
    ENTITIES:
        - PathMatcher
    WORK TO BE DONE:
        - create two paths
        - check whether the paths are same
        	-> if yes, print same
            -> if no, print not same
    PSEUDOCODE:
        {
            In the main function

			Path path1 = Paths.get("C:\\1DEV\\mytraining\\java\\javaee-demo\\advanced\\io.nio\\InputStreamDemo.java");
			Path path2 = Paths.get("C:\\1DEV\\mytraining\\java\\javaee-demo\\advanced\\io.nio\\InputStreamDemo.java");
			
			if (Files.isSameFile(path1, path2)) {
        		System.out.println("same");
      		} else {
        		System.out.println("not same");
      		}
        }
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMatcher {

	public static void main(String[] args) throws IOException {

		Path path1 = Paths.get("C:\\1DEV\\mytraining\\java\\javaee-demo\\advanced\\io.nio\\InputStreamDemo.java");
		Path path2 = Paths.get("C:\\1DEV\\mytraining\\java\\javaee-demo\\advanced\\io.nio\\FileCounter.java");
		
		if (Files.isSameFile(path1, path2)) {
    		System.out.println("same");
  		} else {
    		System.out.println("not same");
  		}
	}
}

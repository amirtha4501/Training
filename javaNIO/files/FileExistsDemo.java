package in.kpriet.training.java.filedemo;

import java.nio.file.*;

class FileExistsDemo {
    
    public static void main(String[] args) {
        Path path = Paths.get("data/logging.properties");
    
        boolean pathExists = Files.exists(path);
        boolean pathExistsOpt = Files.exists(path, new LinkOption[] { LinkOption.NOFOLLOW_LINKS}); // 2nd param is an array of options that influence how the Files.exists() determines if the path exists or not.
        // here, the file.exists method should not follow symbolic links in the file system to determine if the path exists.

        System.out.println(pathExists);
        System.out.println(pathExistsOpt);
    }
}

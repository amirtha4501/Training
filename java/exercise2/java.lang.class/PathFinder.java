/*
    REQUIREMENTS:
        - To print the absolute path of the .class file of the current class
        - To open the source file of the running class in Notepad++
    ENTITY: 
        - PathFinder
*/

class PathFinder {

    public static void main(String[] args) {

        PathFinder p1 = new PathFinder();

        System.out.println(p1.getClass());

        System.out.println(PathFinder.class.getProtectionDomain().getCodeSource().getLocation().getPath());

        System.out.println(PathFinder.class.getResource("/" + PathFinder.class.getName() + ".class").toString());

        ProcessBuilder builder = new ProcessBuilder("C:.ProgramFiles.Notepad.exe PathFinder.java");
        ProcessBuilder build = new ProcessBuilder("notepad.exe");
        // Process process = build.start();
    }
}

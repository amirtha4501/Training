/*
REQUIREMENTS:
        - To find the method which overrides a method in the superclass
        - To find the method which hides a method in the superclass
        - To find the other methods functionalities
    ENTITY: 
        - ClassA
    METHOD SIGNATURE:
        - public void methodOne(int i);
        - public void methodTwo(int i);
        - public static void methodThree(int i);
        - public static void methodFour(int i);
*/

package in.kpriet.training.java.inheritance;

public class ClassA {

    public void methodOne(int i) {
        System.out.println("methodOne A " + i);
    }
    
    public void methodTwo(int i) {
        System.out.println("methodTwo A " + i);
    }
    
    public static void methodThree(int i) {
        System.out.println("methodThree A " + i);
    }
    
    public static void methodFour(int i) {
        System.out.println("methodFour A " + i);
    }
} 

/*
    REQUIREMENTS:
        - To find the method which overrides a method in the superclass
        - To find the method which hides a method in the superclass
        - To find the other methods functionalities
    ENTITY: 
        - ClassA
        - ClassB
    METHOD SIGNATURE:
        - public static void methodOne(int i);
        - public void methodTwo(int i);
        - public void methodThree(int i);
        - public static void methodFour(int i);
*/

package in.kpriet.training.java.inheritance;

import in.kpriet.training.java.inheritance.ClassA;

public class ClassB extends ClassA {
    
    /* Error: overriding method is static
        public static void methodOne(int i) {
            System.out.println("methodOne B " + i);
        }
    */

    public void methodTwo(int i) {
        System.out.println("methodTwo B " + i);
    }

    /* Error: overridden method is static
    public void methodThree(int i) {
        System.out.println("methodThree B " + i);
    }
    */

    public static void methodFour(int i) {
        System.out.println("methodFour B " + i);
    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();

        System.out.println("With object a");
        a.methodOne(1);
        a.methodTwo(2);
        a.methodThree(3);
        a.methodFour(4);

        System.out.println("\nWith object b");
        b.methodOne(1);
        b.methodTwo(2);
        b.methodThree(3);
        b.methodFour(4);
    }
}

/*
    - methodTwo of ClassB overrides the method of classA
    - methodFour of classB hides the method of classB
    - If static method of classB tries to hide instance method of classA, it will throw overriding method is static
    - If instance method of classB tries to override the static method of classA, it will throw overridden method is static
*/

/*
    REQUIREMENTS:
        - To demonstrate overloading with varArgs
    ENTITY: 
        - VarArgsDemo
    METHOD SIGNATURE:
        - void methodOne(String name, int ...intArg)
        - void methodOne(int intArg, int ...chocolateCount)
        - void methodTwo(String ...names)
        - void methodTwo(String name)
*/

package in.kpriet.training.java.varargsdemo;

class VarArgsDemo {

    void methodOne(String name, int ...chocolateCounts) {
        System.out.println("From method 1:");
        System.out.println("\tString: " + name);
        
        for (int i = 0; i < chocolateCounts.size(); i++) {
            System.out.println(chocolateCount(i));
        }
        
        for (int i: chocolateCounts) {
            System.out.println("\tchocolateCount: " + i);
        }
    }

    void methodOne(int chocolateCount, int ...chocolateCounts) {
        System.out.println("From method 1:");
        System.out.println("\tint: " + intArg);       
        
        for (int i: chocolateCount) {
            System.out.println("\tchocolateCount: " + i);
        }
    }

    void methodTwo(String ...names) {
        System.out.println("From method 2 with vararg:");
        
        for (String i: names) {
            System.out.println("\tnames: " + i);
        }
    }
   
    void methodTwo(String name) {
        System.out.println("From method 2 with single arg:");
        System.out.println("\tname:" + name);
    }

    /* Method can have only one variable argument
    void methodTwo(String ...name, int intArg) {
        System.out.println("From method 3:");
        
        for(String i: name) {
            System.out.println("\tname: " + i);
        }

        for(int i: intArg) {
            System.out.println("\tintArg: " + i);
        }
    }
    */

    /* Method should have varargs as the last argument
    void methodFour(int ...intArg, String name) {
        System.out.println("From method 4:");
        
        System.out.println("\tname: " + name);
        
        for(int i: intArg) {
            System.out.println("\tintArg: " + i);
        }
    }
    */

    public static void main(String[] args) {
        
        VarArgsDemo varArgs = new VarArgsDemo();

        varArgs.methodOne("ami", 1, 2, 7, 4);
        varArgs.methodOne(100, 1, 2, 7, 4);
        varArgs.methodTwo("eena", "meena", "teeka");
        varArgs.methodTwo("\tammu");
    }
}

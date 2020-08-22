/*
    REQUIREMENTS:
        - To demonstrate overloading with varArgs
    ENTITY: 
        - VarArgs
    METHOD SIGNATURE:
        - void methodOne(String strArg, int ...intArg)
        - void methodOne(int intArg, int ...intArgs)
        - void methodTwo(String ...strArgs)
        - void methodTwo(String strArg)
*/

package in.kpriet.training.java.varargs;

class VarArgs {

    void methodOne(String strArg, int ...intArgs) {
        System.out.println("From method 1:");
        System.out.println("\tString: " + strArg);
        
        for(int i: intArgs) {
            System.out.println("\tintArgs: " + i);
        }
    }

    void methodOne(int intArg, int ...intArgs) {
        System.out.println("From method 1:");
        System.out.println("\tint: " + intArg);
        
        for(int i: intArgs) {
            System.out.println("\tintArgs: " + i);
        }
    }

    void methodTwo(String ...strArgs) {
        System.out.println("From method 2 with vararg:");
        
        for(String i: strArgs) {
            System.out.println("\tstrArgs: " + i);
        }
    }
   
    void methodTwo(String strArg) {
        System.out.println("From method 2 with single arg:");
        System.out.println("\tstrArg:" + strArg);
    }

    /* Method can have only one variable argument
    void methodTwo(String ...strArg, int intArg) {
        System.out.println("From method 3:");
        
        for(String i: strArg) {
            System.out.println("\tstrArg: " + i);
        }

        for(int i: intArg) {
            System.out.println("\tintArg: " + i);
        }
    }
    */

    /* Method should have varargs as the last argument
    void methodFour(int ...intArg, String strArg) {
        System.out.println("From method 4:");
        
        System.out.println("\tstrArg: " + strArg);
        
        for(int i: intArg) {
            System.out.println("\tintArg: " + i);
        }
    }
    */

    public static void main(String[] args) {
        
        VarArgs varArgs = new VarArgs();

        varArgs.methodOne("ami", 1, 2, 7, 4);
        varArgs.methodOne(100, 1, 2, 7, 4);
        varArgs.methodTwo("eena", "meena", "teeka");
        varArgs.methodTwo("\tammu");
    }
}

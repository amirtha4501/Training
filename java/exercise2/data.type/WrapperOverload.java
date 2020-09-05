/*
    REQUIREMENTS:
        - To demonstrate overloading with Wrapper types
    ENTITY: 
        - WrapperOverload
    METHOD SIGNATURE:
        - void wrapMethod(int val);
        - void wrapMethod(float val)
        - void wrapMethod(Integer val)
        - void wrapMethod(Float val)
    WORK TO BE DONE:
        - create methods with same name and different parameter types
        - call the method with same parameter type and similar parameter type
*/

package in.kpriet.training.java.data.type;

class WrapperOverload {

    void wrapMethod(int val) {
        System.out.println("Primitive int: " + val);
    }

    void wrapMethod(float val) {
        System.out.println("Primitive float: " + val);
    }
    
    void wrapMethod(Integer val) {
        System.out.println("Wrapper Integer: " + val);
    }

    void wrapMethod(Float val) {
        System.out.println("Wrapper Float: " + val);
    }

    public static void main(String[] args) {
        
        WrapperOverload wrapperOverload = new WrapperOverload();
        Byte byteVal = 5;

        wrapperOverload.wrapMethod(10);
        wrapperOverload.wrapMethod(new Integer(10));
        wrapperOverload.wrapMethod(new Long(10));
        wrapperOverload.wrapMethod(byteVal);
        wrapperOverload.wrapMethod(new Float(1000.00));
    }
}

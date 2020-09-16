/* 
    REQUIREMENTS:
        - To print the classname of all the primitive data types
        - To invert the value of a boolean
        - To show and explain the value of Integer.valueOf(1).equals(Long.valueOf(1))
        - To demonstrate what happens when mixing primitive with respective Wrapper types for the above operations
    ENTITY: 
        - DataTypeDemo
    WORK TO BE DONE:
        - use type.class with the method getName() and to display it
        - use complement operator to invert the boolean value
        - create a variable of type Integer and try to compare.
*/

package in.kpriet.training.java.data.type;

class DataTypeDemo {
    
    public static void main(String[] args) throws ClassNotFoundException {  
   
        Class integer = int.class;  
        System.out.println(integer.toString()); 
        System.out.println("int " + int.class.getName());
        System.out.println("long " + long.class.getName());
        System.out.println("float " + float.class.getName());
        System.out.println("double " + double.class.getName());
        System.out.println("char " + char.class.getName());
        System.out.println("byte " + byte.class.getName());
        System.out.println("boolean " + boolean.class.getName());

        boolean invertVal = true;
        System.out.println("invertVal: " + invertVal);
        System.out.println("!invertVal: " + !invertVal);
        System.out.println("!!invertVal: " + !!invertVal);

        boolean expVal = Integer.valueOf(1).equals(Long.valueOf(1));
        System.out.println(expVal); // false

        /*
        Integer num1;
        int num2;
        if(num1 == 0) { // will throw null pointer exception
            System.out.println("Number = 0"); 
        }
        if(num2 == 0) {
            System.out.println("Number = 0");
        }
        */
    } 
}

/*
    The expVal in line numeber 33 returns false. Because, the wrapper objects are different in type.
*/

/*
    REQUIREMENTS:
        - To convert this following code into a simple lambda expression
    ENTITIES:
        - ValueReturner
    METHOD SIGNATURE:
        int getValue();
    WORK TO BE DONE:
        - create an functional interface with method signature getValue() with return type Strinting
        - write a lambda expression that returns 5.
*/

import java.lang.FunctionalInterface;

@FunctionalInterface
interface ReturnInterface {
    
    int getValue();
}


class ValueReturner {

    public static void main(String[] args) {
        
        ReturnInterface returner;

        returner = () -> {
            return 5;
        };

        System.out.println("The return value is: " + returner.getValue());
    }
}

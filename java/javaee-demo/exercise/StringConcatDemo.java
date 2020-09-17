/*
    REQUIREMENTS:
        - To write a Lambda expression program with a single method interface
          to concatenate two strings
    ENTITIES:
        - StringConcatDemo
    METHOD SIGNATURE:
        String concatString(String firstName, String lastName);
    WORK TO BE DONE:
        - create an functional interface with method signature concatString(firstName, lastName) with return type String
        - write a lambda expression that returns the concatinated string.
*/

import java.lang.FunctionalInterface;

@FunctionalInterface
interface ConcatInterface {
    
    String concatString(String firstName, String lastName);
}


class StringConcatDemo {

    public static void main(String[] args) {
        
        ConcatInterface concatinator;

        concatinator = (firstName, lastName) -> {
            return firstName + " " + lastName;
        };

        System.out.println("String after concatenation: " + concatinator.concatString("ammu", "kutty"));
    }
}
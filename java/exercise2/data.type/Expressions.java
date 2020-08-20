/*
    REQUIREMENTS:
        - To find and fix the error
    ENTITY: 
        - BooleanFlags
    WORK TO BE DONE:
        - Create an integer to store each values
        - Use the binary OR operator | to store values
        - Use the binary AND operator & to retrieve values 
    METHOD SIGNATURE:
        - int area();
*/

package in.kpriet.training.java.data.type;

public class Expressions {

    public static void main(String[] args) {

        System.out.println("100 / 24    - " + ((Object)(100 / 24)).getClass().getName());
        System.out.println("100.10 / 10 - " + ((Object)(100.10 / 10)).getClass().getName());
        System.out.println("'Z' / 2     - " + ((Object)('Z' / 2)).getClass().getName());
        System.out.println("10.5 / 0.5  - " + ((Object)(10.5 / 0.5)).getClass().getName());
        System.out.println("12.4 % 5.5  - " + ((Object)(12.4 % 5.5)).getClass().getName());
        System.out.println("100 % 56    - " + ((Object)(100 % 56)).getClass().getName()); 
    }
}

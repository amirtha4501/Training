/*
    REQUIREMENTS:
        - To find and fix the error
    ENTITY: 
        - BooleanFlags
    WORK TO BE DONE:
        - Create an integer to store each values
        - Use the binary OR operator | to store values
        - Use the binary AND operator & to retrieve values 
*/

package in.kpriet.training.java.data.type;

public class BooleanFlags {

    public static void main(String[] args) {
        
        int valueStore;
        int value1 = 1;
        int value2 = 2;
        int value3 = 4;
        int value4 = 8;

        valueStore = value1 | value2 | value3 | value4; 
        
        System.out.println(valueStore & value1);
        System.out.println(valueStore & value2);
        System.out.println(valueStore & value3);
        System.out.println(valueStore & value4);
    }
}

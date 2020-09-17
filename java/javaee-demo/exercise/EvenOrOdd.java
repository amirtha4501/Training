/*
    REQUIREMENTS:
        - To convert the given anonymous class into lambda expression.
    ENTITIES:
        - EvenOrOdd
    METHOD SIGNATURE:
        String concatString(String firstName, String lastName);
    WORK TO BE DONE:
        - create an functional interface with method signature calculateDifference(number1, number2) with return type int
        - write a lambda expression that returns the difference.
*/

interface CheckNumber {
    public boolean isEven(int value);
}


public class EvenOrOdd {

    public static void main(String[] args) {
    
        CheckNumber number = (int value) -> {
            if (value % 2 == 0) {
                return true;
            } else return false;
        };
        System.out.println(number.isEven(11));
    }
}

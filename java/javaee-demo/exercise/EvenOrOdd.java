/*
    REQUIREMENTS:
        - To convert the given anonymous class into lambda expression.
    ENTITIES:
        - EvenOrOdd
        - CheckNumber
    METHOD SIGNATURE:
        - public boolean isEven(int value);
    WORK TO BE DONE:
        - create an functional interface with method signature public boolean isEven(int value); with return type boolean
        - check if number is mod of 2
            -> true
        - else 
            -> false
        - print result
    PSEUDOCODE:
        {
            In the main function

            calculate using lambda
            if value % 2 == 0
                return true;
            else 
                return false;

            print result
        }
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

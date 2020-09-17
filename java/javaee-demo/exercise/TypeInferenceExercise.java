/*
    REQUIREMENTS:
        - To fix the error in given code.
    ENTITIES:
        - TypeInferenceExercise
    METHOD SIGNATURE:
        - int print(int number1, int number2);
    WORK TO BE DONE:
        - remove the data type int in the function call's parameter
*/

interface BiFunction{
    int print(int number1, int number2);
}

public class TypeInferenceExercise {
    public static void main(String[] args) {

        BiFunction function = (int number1, int number2) ->  { 
        return number1 + number2;
        };
        
        int print = function.print(23, 32);
        
        System.out.println(print);
    }
}
/*
    REQUIREMENTS:
        - To use Addition, Substraction, Multiplication and Division concepts are achieved 
          using Lambda expression and functional interface.
    ENTITIES:
        - Calculator
        - Operation
    METHOD SIGNATURE:
        - int calculate(int number1, int number2);
    WORK TO BE DONE:
        - make an interface with method calculate that returns int
        - add addition, subtraction, multiplication, and division operation using lambda
        - print the results
    PSEUDOCODE: 
        interface Calculator {
            method signature called calculate with two paramaters
        }

        {
            In the main function
            
            create a variable for addition of type of Calculator interface using lambda
                add number1, number2 
                store it in add variable
            
            create a variable for subtraction of type of Calculator interface using lambda
                subtract number1, number2 
                store it in sub variable
            
            create a variable for multiplication of type of Calculator interface using lambda
                multiply number1, number2 
                store it in multiply variable

            create a variable for division of type of Calculator interface using lambda
                divide number1, number2 
                store it in divide variable

            print add using calculate method
            print sub using calculate method
            print multiply using calculate method
            print divide using calculate method
        }
*/

interface Calculator {
    int calculate(int number1, int number2);
}


class Operation {

    public static void main(String[] args) {
        
        Calculator add = (int number1, int number2) -> number1 + number2;
        Calculator sub = (int number1, int number2) -> number1 - number2;
        Calculator multiply = (int number1, int number2) -> number1 * number2;
        Calculator divide = (int number1, int number2) -> number1 / number2;

        System.out.println(add.calculate(5, 4));
        System.out.println(sub.calculate(5, 4));
        System.out.println(multiply.calculate(5, 4));
        System.out.println(divide.calculate(5, 4));
    }
}

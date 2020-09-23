/*
    REQUIREMENTS:
        - To use Addition, Substraction, Multiplication and Division concepts are achieved 
          using Lambda expression and functional interface.
    ENTITIES:
        - Operation
    WORK TO BE DONE:
        - make an interface with method calculate that returns int
        - add addition, subtraction, multiplication, and division operation using lambda
        - print the results
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

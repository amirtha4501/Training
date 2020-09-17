/*
    REQUIREMENTS: 
        - To demonstrate the catching of multiple exceptions.
        - To write a program ListOfNumbers using try and catch block.
    ENTITY:
        - ListOfNumbers
    WORKS TO BE DONE:
        - create an array of numbers
        - print value 3 divided by numbers within try block
        - catch ArrayIndexOutOfBoundsException and ArithmeticException
*/


class ListOfNumbers {

    public static void main(String[] args) {
        
        int[] numbers = {3, 5, 4, 0, 1};

        try {
            for (int i = 0; i <= numbers.length; i++) {
                int value = 3 / numbers[i];
                System.out.print(value + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nIndex out of bound exception");
        } catch (ArithmeticException e) {
            System.out.println("\nDivide by zero exception");
        }

        System.out.println("\nAfter try catch...");
    }
}

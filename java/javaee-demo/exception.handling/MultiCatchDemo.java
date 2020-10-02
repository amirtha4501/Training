/*
    REQUIREMENTS: 
        - To demonstrate mutiple catch block.
        - To explain whether it is possible to have more than one try block.
        - To differentiate catching multiple exceptions and Mutiple catch blocks.
    ENTITY:
        - MultiCatchDemo
    WORKS TO BE DONE:
        - create an array of numbers
        - print value 3 divided by numbers within try block
        - catch ArrayIndexOutOfBoundsException and ArithmeticException with same block using pipe.
    PSEUDOCODE:
        {
            In the main function

            create an array with values 3, 5, 4, 0, 1
            try 
                for every element in numbers array
                    value = 3 / numbers[element]
                    print value
            catch if ArrayIndexOutOfBoundsException or ArithmeticException occurs
                print "Index out of bound exception and arithmetic exception"
        }
*/

class MultiCatchDemo {

    public static void main(String[] args) {
        
        int[] numbers = {3, 5, 4, 0, 1};

        try {
            for (int i = 0; i <= numbers.length; i++) {
                int value = 3 / numbers[i];
                System.out.print(value + " ");
            }
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("\nIndex out of bound exception and arithmetic exception");
        } 
        System.out.println("\nAfter try catch...");
    }
}

/*
    - We cannot have multiple try blocks for a catch block or a finally block.
    - Because, each try block must be followed by either catch or finally or both blocks.

    MULTIPLE CATCH EXCEPTION Vs. MULTI CATCH EXCEPTION
        - Multiple catch does not provide any automatic resource management whereas Multi catch 
          helps in automatic resource management.
        - When Multiple catch is used, exception should be from specialized to generalized i.e. first 
          catch block could be subclass of Exception class. And if multi catch is used to catch
          subclass and its superclass, it will lead to error.
*/

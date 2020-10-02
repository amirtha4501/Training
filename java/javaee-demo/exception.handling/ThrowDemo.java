/*
    REQUIREMENTS:
        - To differentiate throw and throws with example
    ENTITIES:
        - ThrowDemo
    METHOD SIGNATURE:
        - int checker(int number1, int number2) 
        - void checker(int numeber)
    WORK TO BE DONE:
        - create two methods, one for throwing error and one uses throws keyword
        - catch the throws part
    PSEUDOCODE:
        {
            In function checker(int number1, int number2) {
                return number1 / number2
            }

            In function checker(int number) {
                if number == 0
                    throw arithmetic exception
                else 
                    print valid
            }

            In the main function

            get throw demo instance

            try 
                print the checker(3, 0) with 2 arguments
            catch ArithmeticException occurs
                print "error message"
                
                invoke checker(0)
                invoke checker(90)
        }
*/

class ThrowDemo {

    int checker(int number1, int number2) throws ArithmeticException {
        return number1 / number2;
    }

    void checker(int number) {
        if (number == 0) {
            throw new ArithmeticException("Not valid");
        } else {
            System.out.println("valid");
        }
    }

    public static void main(String[] args) {

        ThrowDemo demo = new ThrowDemo();

        try {
            System.out.print(demo.checker(3, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + " error with throws");
        }

        demo.checker(0);
        demo.checker(90);
    }
}

/*
    - Throw is a keyword which is used to throw an exception explicitly in the program inside a 
      function or inside a block of code. 
    - Throws is a keyword used in the method signature used to 
      declare an exception which might get thrown by the function while executing the code.
*/

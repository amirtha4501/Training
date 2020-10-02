/*
    REQUIREMENTS: 
        - To find that try block works without catch and finally blocks
    ENTITY:
        - TryBlockDemo
    WORKS TO BE DONE:
        - create an array of numbers
        - print value 3 divided by numbers within try block
        - catch ArrayIndexOutOfBoundsException and ArithmeticException
    PSEUDOCODE:
        {
            In the main function

            try
                print "Try with finally block"
            finally 
                print "finally block"
        }
*/

class TryBlockDemo {

    public static void main(String[] args) {
        
        try {
            System.out.println("Try with finally block");
        } finally {
            System.out.println("Finally block");
        }
    }
}

/*
    - If we use try block alone, then it will throw an error, say:
        error: 'try' without 'catch', 'finally' or resource declarations
    - But, we can use try block with either catch or finally or both.
*/

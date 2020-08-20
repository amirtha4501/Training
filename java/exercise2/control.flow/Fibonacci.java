/*
    REQUIREMENTS:
        - To print fibonacci using for loop, while loop and recursion
    ENTITY: 
        - Fibonacci
    WORK TO BE DONE:
        - if n value is less than or equal to 1, then return n value
        - Use For loop, initialise i value with 2, a value with 0, b value with 1 and increment i till nth element
            add a and b value and store it in a temporary variable
            assign b value to a
            assign the added value to b
        - Use while loop, initialise i value with 2, a value with 0, b value with 1 till i value is less than or equal to n
            add a and b value and store it in a temporary variable
            assign b value to a
            assign the added value to b
            increment i operator
        - Use recursion, call the function inside the function itself with the reduction of arguments by 1 and 2
            then add the both and return
    METHOD SIGNATURE:
        static int fibonacciFor(int n);
        static int fibonacciWhile(int n);
        static int fibonacciRecur(int n);
*/

class Fibonacci {

    static int fibonacciFor(int n) {       
        int a, b, temp;
        a = 0;
        b = 1; 

        if(n <= 1) {
            return n;
        }

        for(int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    static int fibonacciWhile(int n) {
        int a, b, i, temp;
        a = 0;
        b = 1; 
        i = 2;
        
        if(n <= 1) {
            return n;
        }

        while (i <= n) {
            temp = a + b;
            a = b;
            b = temp;
            i++;
        }
        return b;
    }

    static int fibonacciRecur(int n) {
        if (n <= 1) return n; 
        return fibonacciRecur(n-1) + fibonacciRecur(n-2); 
    }

    public static void main (String args[]) {
        int n = 9;

        System.out.println("For loop " + fibonacciFor(n));
        System.out.println("While loop " + fibonacciWhile(n));
        System.out.println("Recursion " + fibonacciRecur(n));
    }
}

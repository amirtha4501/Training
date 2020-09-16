/*
    REQUIREMENTS:
        - To print fibonacci using for loop, while loop and recursion
    ENTITY: 
        - Fibonacci
    METHOD SIGNATURE:
        static int fibonacciFor(int n);
        static int fibonacciWhile(int n);
        static int fibonacciRecur(int n);
    WORK TO BE DONE:
        - if n value is less than or equal to 1, then return n value
        - Use For loop, initialise i value with 2, number1 value with 0, number2 value with 1 and increment i till nth element
            add number1 and number2 value and store it in number1 temporary variable
            assign number2 value to a
            assign the added value to number2
        - Use while loop, initialise i value with 2, number1 value with 0, number2 value with 1 till i value is less than or equal to n
            add number1 and number2 value and store it in number1 temporary variable
            assign number2 value to a
            assign the added value to number2
            increment i operator
        - Use recursion, call the function inside the function itself with the reduction of arguments by 1 and 2
            then add the both and return
*/

class Fibonacci {

    void fibonacciFor(int n) {       
        int temp, number1 = 0, number2 = 1; 
  
        if (n < 1) { 
            System.out.println(0);
        }

        if(n == 1 || n == 2) {
            System.out.println(1);
		}

        for (int i = 1; i < n; i++) {
            temp = number1 + number2;
            number1 = number2;
            number2 = temp;
            System.out.println(number2);
        }
    }

    void fibonacciWhile(int n) {
        int temp, number1 = 0, number2 = 1, i = 2;
  
        if (n < 1) { 
            System.out.println(0);
        }

        if(n == 1 || n == 2) {
            System.out.println(1);
        }
        
        while (i <= n) {
            temp = number1 + number2;
            number1 = number2;
            number2 = temp;
            i++;
            System.out.println(number2);
        }
    }

    int fibonacciRecur(int n) {
        
        if (n < 1) { 
            return 0;
        }

        if(n == 1 || n == 2){
			return 1;
		}
        
        return fibonacciRecur(n - 2) + fibonacciRecur(n - 1); 
    }

    public static void main (String args[]) {
        int n = 9;

        Fibonacci fibonacci = new Fibonacci();

        System.out.println("For loop ");
        fibonacci.fibonacciFor(n);

        System.out.println("While loop ");
        fibonacci.fibonacciWhile(n);
    
        System.out.println("Recursion ");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci.fibonacciRecur(i) + " ");
        }
    }
}

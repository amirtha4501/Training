/*
    REQUIREMENTS:
        - To use compound assignments
    ENTITY: 
        - ArithmeticDemo
    WORK TO BE DONE:
        - add respective operators before assignment operator where the variable 'result' is repeated in assignment
*/

class ArithmeticDemo {

    public static void main (String[] args){

         int result = 1 + 2; // result is now 3
         System.out.println(result);

         result -= 1; // result is now 2
         System.out.println(result);

         result *= 2; // result is now 4
         System.out.println(result);

         result /= 2; // result is now 2
         System.out.println(result);

         result += 8; // result is now 10
         result %= 7; // result is now 3
         System.out.println(result);
    }
}

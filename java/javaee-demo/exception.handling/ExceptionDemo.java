/*
    REQUIREMENTS:
        - To handle and give the reason for the exception of the given code
    ENTITIES:
        - ExceptionDemo
    WORK TO BE DONE:
        - place the print statement in try block and catch the exception
*/

public class ExceptionDemo {  
 
    public static void main(String[] args) {
        
        int arr[] ={1,2,3,4,5};

        try {
            System.out.println(arr[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}

/*
    - We are trying to access array element with an illegal index i.e. the index 7 is greater than the
      the size of the array. Hence, it throws an exception.
*/
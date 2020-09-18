/*
    REQUIREMENTS:
        - To write a generic method to exchange the positions of two different elements in an array.
    ENTITIES:
        - GenericSwapper
    METHOD SIGNATURE:
        - public Iterator<T> iterator();
    WORK TO DONE:
        - create class Employee that implements Iterable interface
        - create method called iterator that iterates the employeeNames
        - call it via EmployeeTester class
*/

import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

class GenericSwapper {
 
    public static <T> void swap(T[] array, int index1, int index2) {
        
        for (T element: array) {
            System.out.print(element);
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        System.out.println();

        for (T element: array) {
            System.out.print(element);
        }

    }

    public static void main(String[] args) {

        Integer[] array = { 1, 2, 4, 5};
        swap(array, 3, 1);
    }
}

/*
    REQUIREMENTS:
        - To find the value of string after each numbered line executes
        - To find the string and the length of the string returned by the expression
                "Was it a car or a cat I saw?".substring(9, 12)
    ENTITY: 
        - StringDemo
*/

package in.kpriet.training.java.stringsdemo;

public class StringDemo {
    
    public static void main(String[] args) {

        String string1 = "software";

        StringBuilder stringFinal = new StringBuilder("hi");
        int index = string1.indexOf('a');

/*1*/   stringFinal.setCharAt(0, string1.charAt(0)); // set stringFinal's index 1 value to be string1's index 1 value
        System.out.println(stringFinal);

/*2*/   stringFinal.setCharAt(1, string1.charAt(string1.length() - 1)); // set stringFinal's index 1 value to be string1's last value
        System.out.println(stringFinal);

/*3*/   stringFinal.insert(1, string1.charAt(4)); // insert string1's index 4 value at index 1 of stringFinal by moving values to next indices
        System.out.println(stringFinal);

/*4*/   stringFinal.append(string1.substring(1, 4)); // add index 1, 2 and 3 value of string1 at the end of stringFinal
        System.out.println(stringFinal);

/*5*/   stringFinal.insert(3, (string1.substring(index, index + 2) + " ")); // insert 'a', 'r' and a space from the index 3 by moving values to next indices
        System.out.println(stringFinal); 
 
        System.out.println("\n\nString returned by expression: ");
        String stringExpression = "Was it a car or a cat I saw?".substring(9, 12);
        System.out.println(stringExpression); // returns car
    }
}

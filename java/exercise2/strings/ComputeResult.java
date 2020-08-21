/*
    REQUIREMENTS:
        - To find the value of result after each numbered line executes
        - To find the string and the length of the string returned by the expression
                "Was it a car or a cat I saw?".substring(9, 12)
    ENTITY: 
        - ComputeResult
*/

package in.kpriet.training.java.strings;

public class ComputeResult {
    
    public static void main(String[] args) {
        String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');

/*1*/   result.setCharAt(0, original.charAt(0)); // set result's index 1 value to be original's index 1 value
        System.out.println(result);

/*2*/   result.setCharAt(1, original.charAt(original.length()-1)); // set result's index 1 value to be original's last value
        System.out.println(result);

/*3*/   result.insert(1, original.charAt(4)); // insert original's index 4 value at index 1 of result by moving values to next indices
        System.out.println(result);

/*4*/   result.append(original.substring(1,4)); // add index 1, 2 and 3 value of original at the end of result
        System.out.println(result);

/*5*/   result.insert(3, (original.substring(index, index+2) + " ")); // insert 'a', 'r' and a space from the index 3 by moving values to next indices
        System.out.println(result); 
 
        System.out.println("\n\nString returned by expression: ");
        String stringExpression = "Was it a car or a cat I saw?".substring(9, 12);
        System.out.println(stringExpression); // returns car
    }
}

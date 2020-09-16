/*
    REQUIREMENTS:
        - To concatenate two strings in two ways
    ENTITY: 
        - ConcatenationDemo
    WORK TO BE DONE:
        - Print with '+' operator to concatinate
        - Print with concat() method to concatinate
*/

package in.kpriet.training.java.stringsdemo;

class ConcatenationDemo {
    
    public static void main(String[] args) {

        String hi = "Hi, ";
        String mom = "mom.";

        System.out.println(hi + mom);
        System.out.println(hi.concat(mom));
    }
}

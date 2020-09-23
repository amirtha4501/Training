/*
    REQUIREMENTS:
        - To add and remove the elements in stack.
    ENTITIES:
        - StackDemo
    WORK TO BE DONE:
        - initialise a stack
        - add elements into the stack
        - remove elements into the stack
*/

import java.util.Stack;

class StackDemo {

    public static void main(String[] args) {
        
        Stack<String> products = new Stack<String>();

        System.out.println(products);
        
        products.push("iPhone");
        products.push("glue gun");
        products.push("oven");

        System.out.println(products);
        
        System.out.println(products.pop());
        System.out.println(products);
    }
}

/*
    REQUIREMENTS:
        - To convert an int into a string that expresses the number in hexadecimal with Integer method
        - To convert a string expressed in base 5 into the equivalent int with Integer method
        - To detect whether a floating-point number has the special value Not a Number (NaN) with Double method
    ENTITY: 
        - WrapDemo
*/

package in.kpriet.training.java.javadoc;

import java.lang.*; 
import java.io.*; 

class WrapDemo {

    public static void main(String[] args) {

        System.out.println("Hex string is " + Integer.toHexString(65)); 
    
        System.out.println("base 5 string is " + Integer.valueOf("230", 5)); 
    
        Double dblVal = (-2.0/0.0);
        System.out.println("has the special value? " + dblVal.isNaN());
    }
}

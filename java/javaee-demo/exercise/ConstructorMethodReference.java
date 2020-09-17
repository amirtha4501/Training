/*
    REQUIREMENTS:
        - To write a program for each types of method reference
    ENTITIES:
        - ConstructorMethodReference
        - MyClass
        - MyInterface
    METHOD SIGNATURE:
        - MyClass printWord();
*/

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;

interface MyInterface {  
    MyClass printWord();  
}  


class MyClass {
    MyClass() {
        System.out.print("Hello!");
    }
}


class ConstructorMethodReference {

    public static void main(String[] args) {

        MyInterface myClass = MyClass::new;
        myClass.printWord();
    }
}

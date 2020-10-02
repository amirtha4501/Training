/*
    REQUIREMENTS:
        - To write a program for each types of method reference
    ENTITIES:
        - ConstructorMethodReference
        - MyClass
        - MyInterface
    METHOD SIGNATURE:
        - MyClass printWord();
    WORK TO BE DONE:
        - create interface
        - create class called myclass
        - call method with reference
    PSEUDOCODE:
        interface {
            ClassType printword()
        }

        class {
            constructor {
                print "hello"
            }
        }

        {
            In the main function

            MyInterface myClass = MyClass::new;
            myClass.printWord()
        }
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

/*
    REQUIREMENTS:
        - To define class object and get a class object via reflection
        - To write a Java program to demonstrate the use of reflection
        - To create a private constructor with main function
        - To invoke a public and private method
    ENTITIES:
        - Demo
        - ClassDemo
    METHOD SIGNATURE:
        - public void printName()
        - public void printNumber(int number)
        - public void printMethod()
    WORK TO DONE:
        - create a class called Demo
        - set Demo class constructor
        - define a methods called printName, printNumber, printMethod
        - create a class called ClassDemo with a private constructor 
        - using getClass(), obtain myClass object and get the name of the class using getName()
        - using getConstructor(), obtain constructor and print the name using getName()
        - create a methods array
            - for each method in methods list
                - print method name
        - invoke the methods in the Demo class 
        
    PSEUDOCODE:
        {
            In the main function

            Demo demo = new Demo(); 

            Class myClass = demo.getClass(); 
            System.out.println("Class name: " + myClass.getName()); 

            Constructor constructor = myClass.getConstructor(); 
            System.out.println("Constructor name: " + constructor.getName()); 

            Method[] methodsList = myClass.getMethods(); 

            for (Method method: methodsList) {
                System.out.println(method.getName()); 
            }

            Method getNumber = myClass.getDeclaredMethod("printNumber", int.class); 
            getNumber.invoke(demo, 20); 

            Field field = myClass.getDeclaredField("name"); 
            field.setAccessible(true); 

            field.set(demo, "AMMU"); 

            Method getName = myClass.getDeclaredMethod("printName"); 
            getName.invoke(demo); 

            Method getMethod = myClass.getDeclaredMethod("privateMethod"); 
            getMethod.setAccessible(true); 
            getMethod.invoke(demo); 
        }
*/

import java.lang.reflect.Method; 
import java.lang.reflect.Field; 
import java.lang.reflect.Constructor; 

class Demo { 
    private String name; 

    public Demo() { 
        name = "ammu";
    } 

    public void printName() { 
        System.out.println("Name " + name); 
    } 

    public void printNumber(int number) { 
        System.out.println("Number " + number); 
    } 

    private void privateMethod() { 
        System.out.println("Private method"); 
    } 
} 


class ClassDemo {

    public static void main(String args[]) throws Exception {

        private ClassDemo() {
            // private constructor
        }

        Demo demo = new Demo(); 

        Class myClass = demo.getClass(); 
        System.out.println("Class name: " + myClass.getName()); 

        Constructor constructor = myClass.getConstructor(); 
        System.out.println("Constructor name: " + constructor.getName()); 

        System.out.println("Public methods: "); 

        Method[] methodsList = myClass.getMethods(); 

        for (Method method: methodsList) {
            System.out.println(method.getName()); 
        }

        Method getNumber = myClass.getDeclaredMethod("printNumber", int.class); 

        getNumber.invoke(demo, 99); 

        Field field = myClass.getDeclaredField("name"); 

        field.setAccessible(true); 

        field.set(demo, "AMMU"); 

        Method getName = myClass.getDeclaredMethod("printName"); 

        getName.invoke(demo); 

        Method getMethod = myClass.getDeclaredMethod("privateMethod"); 

        getMethod.setAccessible(true); 

        getMethod.invoke(demo); 
    } 
} 

/*
    REQUIREMENTS:
        - To write a program for each types of method reference
    ENTITIES:
        - ArbitraryInstanceReference
    METHOD SIGNATURE:
        - static void printName(String name);
    WORK TO BE DONE:
        - create a method that print name inside the inner class
        - call the method using reference
*/

import java.util.List;
import java.util.Arrays;

public class ArbitraryInstanceReference {
    
    public static void main(String args[]) {
    
        List<Person> people = Arrays.asList(new Person("ammu"), new Person("jimmu"));
        
        people.forEach(Person::printName);
    }

    
    static class Person {
        
        String name;
        
        Person(String name) {
            this.name = name;
        }
        
        public void printName() {
            System.out.println(name);
        }
    }
}

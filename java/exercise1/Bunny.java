package in.kpriet.training.java.abstraction;

abstract class Animal { 

    String color;
    int legs;
    
    abstract void makeSound();
} 

class Bunny extends Animal { 

    Bunny() {
        color = "Black";
        legs = 4;
    }
    
    void makeSound() {
        System.out.println("Bunny says, bow bow");
    }
    
    public static void main(String[] args) {    
    
        Animal bunny = new Bunny();
        bunny.makeSound();
        System.out.println("Hi! I'm a " + bunny.color + " bunny." + " I've " + bunny.legs + " legs"); 
    } 
}

/*
    An abstract class may or may not have implementations for one or more methods. If there is a possibility to create an object for abstract class, and if we call any abstract methods in it, then JVM will not be able to decide what to do. 
    So that it is not possible to create an object for abstract class. However, we can instantiate an abstract class if and only if it doesn't have any abstract methods in it.
*/

/*
    REQUIREMENTS:
        - To demonstrate inheritance, overloading and overriding
    ENTITY: 
        - Animal
        - Dog
    METHOD SIGNATURE:
        - void makeSound();
        - void makeSound(String name, String sound);
    WORK TO BE DONE:
        - Inherit two methods with same name and different parameter counts
        - Override the method 1
*/

package in.kpriet.training.java.inheritance;

import in.kpriet.training.java.inheritance.Animal;

class Dog extends Animal {

    void makeSound() {
        System.out.println("Hey there! I'm a puppy - Child dog\nI say bow bow");
    }

    public static void main(String args[]) {
        
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.makeSound();
        animal.makeSound("puppy", "lol lol");
        
        dog.makeSound();
        dog.makeSound("tommy", "lol lol bow bow");
    }
}

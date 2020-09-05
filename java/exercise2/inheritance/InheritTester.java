/*
    REQUIREMENTS:
        - To demonstrate inheritance, overloading and overriding
    ENTITY: 
        - Animal
        - Cat
        - Snake
    METHOD SIGNATURE:
        - void makeSound();
        - void makeSound(String name, String sound);
    WORK TO BE DONE:
        - Create two methods with same name and different parameter counts in Animal class
        - Call the methods with different parameters
        - Override the methods of Animal by the child 
*/

package in.kpriet.training.java.inheritance;

class Animal {

    void makeSound() {
        System.out.println("Hi! I'm an animal - Parent");
    }

    void makeSound(String name, String sound) {
        System.out.println("Hi! I'm " + name + " - Parent\nI say " + sound);
    }
}


class Cat extends Animal {

    // constructor overriding
    void makeSound() {
        System.out.println("Hey there! I'm kitty - Child cat.\nI say mmam mamm meew");
    }
}


class Snake extends Animal {
    String name;
    String sound;
    
    Snake() {
        name = "sen";
        sound = "sizzz sizzz";
    }

    void makeSound(String name, String sound) {
        System.out.println("Hey there! I'm " + name + " - Child snake\nI say " + sound);
    }
}


class InheritTester {
    
    public static void main(String[] args) {
        Animal animal = new Animal(); 
        Animal cat = new Animal(); 
        Animal snake = new Animal(); 

        animal.makeSound();
        animal.makeSound("animal", "hrr hrr");

        cat.makeSound();
        cat.makeSound("chintu", "kiwi kiwi");

        snake.makeSound();
        snake.makeSound("snakey", "squizz squizz");
    }
}

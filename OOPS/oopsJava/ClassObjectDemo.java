package in.kpriet.training.oops;

class ClassObjectDemo {

    String name;

    ClassObjectDemo() {
        this.name = "tina";
    }

    public static void main(String[] args) {

        ClassObjectDemo person = new ClassObjectDemo();

        System.out.println(person);
        System.out.println(person.name);
    }
}
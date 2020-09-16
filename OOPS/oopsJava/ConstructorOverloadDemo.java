package in.kpriet.training.oops;

class ConstructorOverloadDemo {

    String name;
    int number;

    ConstructorOverloadDemo() {
        this.name = "default";
    }

    ConstructorOverloadDemo(String name) {
        this.name = name;
    }

    ConstructorOverloadDemo(int number) {
        this.number = number;
    }

    void printString() {
        System.out.println(this.name);
    }

    void printInt() {
        System.out.println(this.number);
    }

    public static void main(String[] args) {
        
        ConstructorOverloadDemo demo1 = new ConstructorOverloadDemo();
        ConstructorOverloadDemo demo2 = new ConstructorOverloadDemo("parameterized");
        ConstructorOverloadDemo demo3 = new ConstructorOverloadDemo(1);

        demo1.printString();
        demo2.printString();
        demo3.printInt();
    }
}
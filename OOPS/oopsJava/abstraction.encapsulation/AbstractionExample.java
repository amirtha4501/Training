package in.kpriet.training.oops;

abstract class Shape {

    String color;

    Shape(String color) {
        this.color = color;
    }

    public abstract double getArea(double number1, double number2);
    
    public String getColor() {
        return this.color;
    }
}


class Triangle extends Shape {

    Triangle(String color) {
        super(color);
    }

    public double getArea(double number1, double number2) {
        return 0.5 * number1 * number2;
    }
}


class Rectangle extends Shape {

    Rectangle(String color) {
        super(color);
    }

    public double getArea(double number1, double number2) {
        return number1 * number2;
    }
}


class AbstractionExample {

    public static void main(String[] args) {
        
        Shape triangle = new Triangle("Black");
        Shape rectangle = new Rectangle("Blue");

        System.out.println(triangle.getArea(3, 5));
        System.out.println(rectangle.getArea(4, 5));

        System.out.println(triangle.getColor());
        System.out.println(rectangle.getColor());
    }
}

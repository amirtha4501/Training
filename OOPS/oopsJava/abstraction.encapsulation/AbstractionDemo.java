package in.kpriet.training.oops;

interface Shape {
    String COLOR = "Yellow";

    public double getArea(double number1, double number2);
    public String getColor();
}


class Triangle implements Shape {

    public double getArea(double number1, double number2) {
        return 0.5 * number1 * number2;
    }

    public String getColor() {
        return COLOR;
    }
}


class Rectangle implements Shape {

    public double getArea(double number1, double number2) {
        return number1 * number2;
    }

    public String getColor() {
        return COLOR;
    }
}


class AbstractionDemo {

    public static void main(String[] args) {
        
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();

        System.out.println(triangle.getArea(3, 5));
        System.out.println(rectangle.getArea(4, 5));

        System.out.println(triangle.getColor());
        System.out.println(rectangle.getColor());
    }
}

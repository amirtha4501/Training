/*
    REQUIREMENTS:
        - To demonstrate abstract classes using Shape class
    ENTITY: 
        - ShapeTester
        - Shape 
        - Circle 
        - Square 
    WORK TO BE DONE:
        - create an abstract class called Shape with methods to calculate area and perimeter
        - create the child classes Circle and Square inherits the Shape class
        - In class Circle, 
            calculate the area of the circle by multiplying the square of the radius with PI value
            calculate the perimeter of the circle by multiplying the twice of the radius with PI value
        - In class Square,
            calculate the area of the square by obtaining the square of side 'a'
            calculate the perimeter of the square by calculating the four times of side 'a'
    METHOD SIGNATURE:
        - abstract void calcArea();
        - abstract void calcPerimeter();
*/
package in.kpriet.training.java.abstractclass;

abstract class Shape {
    double area;
    double perimeter;

    abstract void calcArea();
    abstract void calcPerimeter();
}

class Circle extends Shape {
    double r = 5;

    void calcArea() {
        area = 3.14 * r * r;
        System.out.println("The area of a circle is: " + area);
    }

    void calcPerimeter() {
        perimeter = 2 * 3.14 * r;
        System.out.println("The perimeter of a circle is: " + perimeter);
    }
}

class Square extends Shape {
    double a = 8;

    void calcArea() {
        area = a * a;
        System.out.println("The area of a square is: " + area);
    }

    void calcPerimeter() {
        perimeter = 4 * a;
        System.out.println("The perimeter of a square is: " + perimeter);
    }
}

class ShapeTester {
    public static void main(String[] args) {
     
        Circle circle = new Circle();
        Square square = new Square();

        circle.calcArea();
        circle.calcPerimeter();

        square.calcArea();
        square.calcPerimeter();
    }
}

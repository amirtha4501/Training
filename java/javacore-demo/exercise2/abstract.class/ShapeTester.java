/*
    REQUIREMENTS:
        - To demonstrate abstract classes using Shape class
    ENTITY: 
        - ShapeTester
        - Shape 
        - Circle 
        - Square 
    METHOD SIGNATURE:
        - abstract void calculateArea();
        - abstract void calculatePerimeter();
    WORK TO BE DONE:
        - create an abstract class called Shape with methods to calculate area and perimeter
        - create the child classes Circle and Square inherits the Shape class
        - In class Circle, 
            calculate the area of the circle by multiplying the square of the radius with PI value
            calculate the perimeter of the circle by multiplying the twice of the radius with PI value
        - In class Square,
            calculate the area of the square by obtaining the square of side 'a'
            calculate the perimeter of the square by calculating the four times of side 'a'
*/

package in.kpriet.training.java.abstractclass;

abstract class Shape {
    double area;
    double perimeter;

    abstract void calculateArea();
    abstract void calculatePerimeter();
}


class Circle extends Shape {
    double radius = 5;

    void calculateArea() {
        area = 3.14 * radius * radius;
        System.out.println("The area of a circle is: " + area);
    }

    void calculatePerimeter() {
        perimeter = 2 * 3.14 * radius;
        System.out.println("The perimeter of a circle is: " + perimeter);
    }
}


class Square extends Shape {
    double side = 8;

    void calculateArea() {
        area = side * side;
        System.out.println("The area of a square is: " + area);
    }

    void calculatePerimeter() {
        perimeter = 4 * side;
        System.out.println("The perimeter of a square is: " + perimeter);
    }
}

class ShapeTester {
    
    public static void main(String[] args) {
     
        Circle circle = new Circle();
        Square square = new Square();

        circle.calculateArea();
        circle.calculatePerimeter();

        square.calculateArea();
        square.calculatePerimeter();
    }
}

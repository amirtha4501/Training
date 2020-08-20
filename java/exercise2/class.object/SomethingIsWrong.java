/*
    REQUIREMENTS:
        - To find and fix the error
    ENTITY: 
        - SomethingIsWrong
        - Rectangle 
    WORK TO BE DONE:
        - create a class called rectangle with properties width, height and method area
    METHOD SIGNATURE:
        - int area();
*/

package in.kpriet.training.java.classes.objects;

class Rectangle {
    int width;
    int height;

    int area() {
        return width * height;    
    }
}

public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }
}

/*
    REQUIREMENTS:
        - To create instance of a class 
        - To initialize its two member variables
        - To displays the value of each member variable
    ENTITY: 
        - NumberHolder
    WORK TO BE DONE:
        - create an instance called numberHolder in main method
        - assign values to the variables anInt and aFloat
        - print the variables' value
*/

package in.kpriet.training.java.classes.objects;

public class NumberHolder {
    public int anInt;
    public float aFloat;

    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder();
        
        numberHolder.anInt = 8;
        numberHolder.aFloat = 0.8f;

        System.out.println("Int value " + numberHolder.anInt);
        System.out.println("Float value " + numberHolder.aFloat);
    }
}

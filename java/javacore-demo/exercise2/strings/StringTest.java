/*
    REQUIREMENTS:
        - To find the value by the expression hannah.length()
        - To find the value returned by the method call hannah.charAt(12)
        - To write an expression to refer 'b' in the string of variable hannah

        - To find the initial capacity of the following string builder
                StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");

        - To find the number of references to the objects when the given code executes 
        - To check whether any object will go for garbage collection
    ENTITY: 
        - StringTest
*/

package in.kpriet.training.java.strings;

class StringTest {

    public static void main(String[] args) {
        
        String hannah = "Did Hannah see bees? Hannah did.";

        System.out.println(hannah.length()); // 32
        System.out.println(hannah.charAt(12)); // e
        System.out.println("hannah.charAt(15) gives " + hannah.charAt(15)); // b

        StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
        System.out.println("The initial capacity of given string builder is " + sb.capacity());
    }
}

/* 
    String[] students = new String[10];
    String studentName = "Peter Parker";
    students[0] = studentName;
    studentName = null;

    The String array is referenced with an object students and the string "Peter Parker" is referenced 
    with an object studentName. The pointer studentName is referenced by the students array and then the 
    studentName is made as null.
    Here, no object is eligible for garbage collection. Because, even though the object studentName is made as
    null, it is referenced by the students array.
*/

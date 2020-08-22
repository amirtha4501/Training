/*
    REQUIREMENTS:
        - To demonstrate object equality using Object.equals() vs ==, using String objects
    ENTITY: 
        - ObjectEquality
*/

package in.kpriet.training.java.javalangexercise;

class ObjectEquality {

    public static void main(String[] args) {
        
        String str1 = new String("str");
        String str2 = new String("str");
        
        String str3 = "string";
        String str4 = "string";

        System.out.println("With string object str1 == str2 is " + (str1 == str2));
        System.out.println("With string object str1.equals(str2) is " + str1.equals(str2));

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
    }
}

/*
    - The .equals() method compares the values in the objects whereas == operator compares the 
      memory address of the objects.
    - The str1 and str2 is equal when using equals method. Because, the comparison is between the values of
      the objects.
    - Here, the str1 and str2 is not equal when using == operator. Because, the comparison is between the
      address of objects str1 and str2
    - Whereas, the str3 and str4 is equal when using == operator. Because, the values of all the strings 
      which are defined in the program are stored in a string constant pool in heap memory. In our example, 
      the value of str3 is stored in the pool and when we try to store the same value with another pointer, 
      it will not create the new one. Instead, the another pointer will refer to the value that is already 
      in memory.
*/

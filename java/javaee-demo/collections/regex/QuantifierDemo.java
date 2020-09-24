/*
    REQUIREMENTS:
        - To write a program for java regex quantifier
        - To write a program for email-validation
        - To create a username for login website which contains
            -> 8-12 characters in length
            -> Must have at least one uppercase letter
            -> Must have at least one lower case letter
            -> Must have at least one digit
    ENTITIES:
        - QuantifierDemo
    WORK TO BE DONE:
        - create a string
        - check if the regular expression matches the string or not.
            -> if yes, print true
            -> else, print false
        - check if a string contains '@' and '.' in between letters
            -> if yes, print true
            -> else, print false
        - check if a string is 8-12 characters long and have atleast 1 uppercase 
          and lowercase letter and atleast 1 digit
*/

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class QuantifierDemo {

    public static void main(String[] args) {
        
        String string1 = "Hello*";
        String string2 = "Hell\\+";
        String string3 = "Hello{2}";
        String string4 = "Hello{2,4}";

        String text1 = "Hello";
        String text2 = "Helloo";
        String text3 = "Helloo";
        String text4 = "Hellooo";

        boolean matches1 = text1.matches(string1);
        boolean matches2 = text2.matches(string2);
        boolean matches3 = text3.matches(string3);
        boolean matches4 = text4.matches(string4);

        System.out.println(matches1 + " " + matches2 + " " + matches3 + " " + matches4);

        Pattern checker = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        String email = "amirtha23@gmail.com";
        Matcher matcher = checker.matcher(email);
        System.out.println(matcher.matches());

        Pattern passChecker = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$");
        String password = "amirtha23A";
        Matcher passMatcher = passChecker.matcher(password);
        System.out.println(passMatcher.matches());
        
    }
}

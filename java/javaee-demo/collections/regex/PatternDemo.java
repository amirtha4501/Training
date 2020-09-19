/*
    REQUIREMENTS:
        - To create a pattern for password which contains
            8 to 15 characters in length
            Must have at least one uppercase letter
            Must have at least one lower case letter
            Must have at least one digit
    ENTITIES:
        - PatternDemo
    METHOD SIGNATURE:
        - boolean checkPassword();
    WORK TO BE DONE:
        - get input from the user
        - check the input is valid or not
            -> if it has space or null, return false
            -> if it has any number, return false
            -> if it has any special characters, return false
        - if any condition return false, print 'invalid input'
        - else print 'valid input'
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PatternDemo {

    public static void main(String[] args) {
        
        String password = "sne5678Am@ad";
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,15}$");

        Matcher matches = pattern.matcher(password);

        System.out.println("matches = " + matches.find());
    }
}

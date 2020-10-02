/*
    REQUIREMENTS:
        - To create a program which throws exception and fetch all the details of the exception.
            demonstrate establish the difference between lookingAt() and matches().
            demonstrate the different types of groups in regex.
            demonstrate all the fields of the pattern class.
            find the no of occurrence of a pattern in the text and also fetch the start and end index of the the occurrence.
            difference between replaceAll() and appendReplacement().
            split any random text using any pattern you desire.
    ENTITIES:
        - RegexDemo
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
    PSEUDOCODE:
        {
            In the main function

            create a regex pattern
            create a string called greeting

            check the pattern and print the result

            use lookingAt and print

            while (matcher.find()) {
                System.out.println("Found at: "+ matcher.start() + " - " + matcher.end());
            }

            use replaceAll()
            use appendReplacement()
        }
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexDemo {

    public static void main(String[] args) {
        
        String greeting = "good morning";
        String regex = "good";
        Pattern pattern1 = Pattern.compile(regex);
        Matcher matcher1 = pattern1.matcher(greeting);

        System.out.println("lookingAt: " + matcher1.lookingAt());
        System.out.println("matches: " + matcher1.matches());

        
        String content = "CCC RR DDZZZ";
        String string = "RR";
        Pattern pattern2 = Pattern.compile(string);
        Matcher matcher2 = pattern2.matcher(content);
        
        while (matcher2.find()) {
            System.out.println("Found at: "+ matcher2.start() + " - " + matcher2.end());
        }
        
        String search = "a";
        String input = "ragfafuaa";
        Pattern pattern3 = Pattern.compile(search);
        Matcher matcher3 = pattern3.matcher(input);
        int count = 0; 

        while (matcher3.find()) { 
            count++; 
        }
        System.out.println(count);

        String text = "I like India. I like TN.";
        String textPattern = "((like) (.+?))";
        Pattern pattern4 = Pattern.compile(textPattern);
        Matcher matcher4 = pattern4.matcher("like");
        System.out.println("before: " + text);
        String replace = matcher4.replaceAll("love");
        System.out.println("after: " + replace);
    }
}

/*
    - The matches method attempts to match the entire input sequence against the pattern.
      i.e. it matches the regular expression against the whole text. 
    
    - The lookingAt method attempts to match the input sequence, starting 
      at the beginning, against the pattern. i.e. it matches the regular expression
      against the beginning of the text

    - The replaceAll() method replaces all matches of the regular expression. 
*/

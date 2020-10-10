/*
    REQUIREMENTS:
        - To print the following pattern of the Date and Time using SimpleDateFormat
            "yyyy-MM-dd HH:mm:ssZ"
    ENTITIES:
        - DatePattern
    WORK TO DONE:
        - create a pattern
        - make a simple data format instance
        - format the simple date format
        - print the date

    PSEUDOCODE:
        {
            In the main function
            
            String pattern = "yyyy-MM-dd HH:mm:ssZ";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("en", "UK"));
            
            String date = simpleDateFormat.format(new Date());
            System.out.println(date);        
        }
*/

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

class DatePattern {

    public static void main(String[] args) {

        String pattern = "yyyy-MM-dd HH:mm:ssZ";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("en", "UK"));
        
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);        
    }
}

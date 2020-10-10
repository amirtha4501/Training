/*
    REQUIREMENTS:
        - To print the following Date Formats in Date using locale
            DEFAULT, MEDIUM, LONG, SHORT, FULL
    ENTITIES:
        - DateFormatDemo
    WORK TO DONE:
        - create a locale instance with the country codes
        - get date instance of default, long, medium, short, full
        - format with date
        - print the results

    PSEUDOCODE:
        {
            In the main function

            Locale locale = new Locale("en", "UK");

            DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
            DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
            DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.LONG, locale);
            DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.SHORT, locale);
            DateFormat dateFormat5 = DateFormat.getDateInstance(DateFormat.FULL, locale);

            String date1 = dateFormat1.format(new Date());
            String date2 = dateFormat2.format(new Date());
            String date3 = dateFormat3.format(new Date());
            String date4 = dateFormat4.format(new Date());
            String date5 = dateFormat5.format(new Date());

            System.out.println(date1, date2, date3, date4, date5);
        }
*/

import java.util.Locale;
import java.text.DateFormat;
import java.util.Date;

class DateFormatDemo {

    public static void main(String[] args) {
        
        Locale locale = new Locale("en", "UK");

        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.LONG, locale);
        DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        DateFormat dateFormat5 = DateFormat.getDateInstance(DateFormat.FULL, locale);

        String date1 = dateFormat1.format(new Date());
        String date2 = dateFormat2.format(new Date());
        String date3 = dateFormat3.format(new Date());
        String date4 = dateFormat4.format(new Date());
        String date5 = dateFormat5.format(new Date());

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(date5);
    }
}

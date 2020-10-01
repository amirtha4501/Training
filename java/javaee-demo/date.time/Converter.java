/*
    REQUIREMENTS:
        - To convert a Calendar to Date and vice-versa with example
    ENTITIES:
        - Converter
    WORK TO BE DONE:
        - instantiate a date object
        - get calendar instance
        - set date time into calendar object
        - convert calendar to date type 
        - print the output
*/

import java.util.Calendar;
import java.util.Date;

class Converter {

	public static void main(String[] args) {

        // Converting Date to Calendar
        Date date = new Date();
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println("Date to Calendar: " + date);

        // Converting Calendar to Date 
        Date newDate = calendar.getTime(); 
        System.out.println("Calendar to Date: " + date);
    }
}

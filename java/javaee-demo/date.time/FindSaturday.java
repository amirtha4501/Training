/*
    REQUIREMENTS:
        - To write an example that, for a given month of the current year, lists all of the Saturdays in that month
        - To find class used to store your birthday in years, months, days, seconds, and nanoseconds - LocalDateTime 
    ENTITIES:
        - FindSaturday
    WORK TO BE DONE:
        - get year as an input from user as int
        - get month as an input from user as september
        - convert it to uppercase
        - calculate all the saturday 
    PSEUDOCODE:
        {
            In the main function

            get input year
            get input month and convert it to uppercase
            print month input

            give the inputs into calendar

            while calendar.get(Calendar.MONTH) == month
                get day of the week
                if day == saturday
                    get day of month
                    add to calendar
        }
*/

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FindSaturday {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.print("Enter month: ");
        String monthInput = scanner.next().toUpperCase();
        System.out.println(monthInput);

        int month = Calendar.SEPTEMBER;

        Calendar calendar = new GregorianCalendar(year, month, 1);
        do {
            int day = calendar.get(Calendar.DAY_OF_WEEK);
            if (day == Calendar.SATURDAY) {
                System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
            }
            calendar.add(Calendar.DAY_OF_YEAR, 1);
        } while (calendar.get(Calendar.MONTH) == month);
    }
}

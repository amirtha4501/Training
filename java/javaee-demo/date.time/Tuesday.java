/*
    REQUIREMENTS:
        - To write an example that tests whether a given date occurs on Tuesday the 11th 
    ENTITIES:
        - Tuesday
    WORK TO BE DONE:
        - get date a input from user as string
        - convert it to date type
        - calculate the date on friday  
    PSEUDOCODE:
        {
            In the main function

            get date input
            convert string to local date
            print the result
        }
*/

import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

class Tuesday {
    public static void main(String[] args) {

        // Calendar calendar = Calendar.getInstance();

        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter date(dd/mm/yy): ");

        String inputDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        
        //convert String to LocalDate
        LocalDate date = LocalDate.parse(inputDate, formatter);

        System.out.println(date.format(calendar));
    }
}

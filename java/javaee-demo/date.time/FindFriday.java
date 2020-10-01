/*
    REQUIREMENTS:
        - To find the date of the previous Friday with a given date
        - To find class used to store your birthday in years, months, days, seconds, and nanoseconds - LocalDateTime 
    ENTITIES:
        - FindFriday
    WORK TO BE DONE:
        - get date a input from user as string
        - convert it to date type
        - calculate the previous friday 
*/

import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

class FindFriday {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter date(dd/mm/yy): ");

        String inputDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        
        //convert String to LocalDate
        LocalDate date = LocalDate.parse(inputDate, formatter);

        System.out.println("Previous Friday with respect to the given date: " + date.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));
    }
}

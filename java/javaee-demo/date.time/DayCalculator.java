/*
    REQUIREMENTS:
        - To write an example that, for a given year, reports the length of each month within that particular year.
    ENTITIES:
        - DayCalculator
    WORK TO BE DONE:
        - get year from user as int
        - get month from user as int
        - give year and month to a converter
        - calculate the days
        - display the result  
*/

import java.time.YearMonth;
import java.util.Scanner;

class DayCalculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        System.out.print("Enter month in number: ");
        int month = scanner.nextInt();

        YearMonth yearMonth = YearMonth.of(year, month);
        int days = yearMonth.lengthOfMonth(); //28  
        
        System.out.println("Total days: ", days);
    }
}

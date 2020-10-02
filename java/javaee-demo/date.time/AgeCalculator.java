/*
    REQUIREMENTS:
        - To write a Java program to calculate your age 
    ENTITIES:
        - AgeCalculator
    METHOD SIGNATURE:
        - public void run();
    WORK TO BE DONE:
        - get dob from user
        - calculate current date
        - calculate difference between the input and the current date
        - print the difference
    PSEUDOCODE:
        {
            In the main function
            
            get dob as input from user

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
            
            parse the inputDate and formatter using LocalDate parse method

            get year, month, day of month from LocalDate of method

            calculate the difference between dob and the current date

            print age
        }
*/

import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class AgeCalculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter dob(dd/mm/yyyy): ");

        String inputDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate date = LocalDate.parse(inputDate, formatter);
        
        LocalDate dob = LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth());
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(dob, currentDate);
        
        System.out.println(age.getYears() + " years");
    }
}

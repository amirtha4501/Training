/*
    REQUIREMENTS:
        - To write a Java program to calculate your age 
    ENTITIES:
        - Converter
        - Printer
    METHOD SIGNATURE:
        - public void run();
    WORK TO BE DONE:
        - get dob from user
        - calculate current date
        - calculate difference between the input and the current date
        - print the difference
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

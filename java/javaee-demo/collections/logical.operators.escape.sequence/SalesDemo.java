/*
    REQUIREMENTS:
        - To Write a Java program to calculate the revenue from a sale based on the unit price 
          and quantity of a product input by the user. The discount rate is 10% for the quantity 
          purchased between 100 and 120 units, and 15% for the quantity purchased greater 
          than 120 units. If the quantity purchased is less than 100 units, the discount rate is 0%. 
          Output like below:
                Enter unit price: 25
                Enter quantity: 110
                The revenue from sale: 2475.0$
                After discount: 275.0$(10.0%)
    ENTITIES:
        - SalesDemo
    WORK TO BE DONE:
        - get user inputs for unit price and quantity
        - if quantity less than 100
            -> then revenue is the product of unit price and quantity
        - if quantity less than 120 and greater than 100
            -> then revenue is revenue - discount where discount is 10 / 100 * unit price * quantity 
        - if quantity greater than 120
            -> then revenue is revenue - discount where discount is 15 / 100 * unit price * quantity 
        - print result with discount percentage where discount percentage is discount * 100
    PSEUDOCODE:
        {
            In the main function

            discountRate = 0f
            discountAmount = 0f
            unitPrice = 0f
            quantity = 0
            revenue = 0f

            get unit price as input from the user of float type
            
            get quantity as input from the user of type int

            if quantity < 100
                revenue = unitPrice * quantity
            else if quantity >= 100 and quantity <= 120
                discountRate = 10 / 100
                revenue = unitPrice * quantity
                discountAmount = revenue * discountRate
                revenue -= discountAmount
            else if quantity > 120
                discountRate = 15 / 100
                revenue = unitPrice * quantity
                discountAmount = revenue * discountRate
                revenue -= discountAmount
            
            print the revenue, discount amount and discount rate
        }
*/

import java.util.Scanner;

class SalesDemo {

    public static void main(String[] args) {

        float discountRate = 0f;
        float discountAmount = 0f;
        float unitPrice = 0f;
        int quantity = 0;
        float revenue = 0f;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter unit price:");
        unitPrice = scanner.nextFloat();
        
        System.out.print("Enter quantity:");
        quantity = scanner.nextInt();
        
        if (quantity < 100) {
            revenue = unitPrice * quantity;
        } else if (quantity >= 100 && quantity <= 120) {
            discountRate = (float) 10 / 100;
            revenue = unitPrice * quantity;
            discountAmount = revenue * discountRate;
            revenue -= discountAmount;
        } else if (quantity > 120) {
            discountRate = (float) 15 / 100;
            revenue = unitPrice * quantity;
            discountAmount = revenue * discountRate;
            revenue -= discountAmount;
        }
        
        System.out.println("The revenue from sale:" + revenue + "$");
        System.out.println("After discount:" + discountAmount + "$(" + discountRate * 100 + "%)");   
    }
}

/*
    REQUIREMENTS:
        - To write a code to change the number format to Denmark number format
        - To write a code to rounding the value to maximum of 3 digits by setting maximum and minimum Fraction digits
    ENTITIES:
        - Converter
    WORK TO DONE:
        - create a locale instance with the country codes
        - get a numberFormat with the locale instance
        - format the numberFormat
        - display the result
        - get a numberFormat with the locale instance
        - format the numberFormat
        - use minimum digit formatter and display the result
        - use maximum digit formatter and display the result

    PSEUDOCODE:
        {
            In the main function

            Locale locale = new Locale("da", "DK");
            NumberFormat numberFormat = NumberFormat.getInstance(locale);

            String number = numberFormat.format(5);
            System.out.println(number);

            numberFormat1.setMaximumFractionDigits(2);
            System.out.println("After setMaximumFractionDigits: " + numberFormat1.format(123.678));
        
            numberFormat1.setMinimumFractionDigits(5);
            System.out.println("After setMinimumFractionDigits: " + numberFormat1.format(123.678));
        }
*/

import java.text.NumberFormat;
import java.util.Locale;

class InternationalizationConverter {

    public static void main(String[] args) {

        Locale locale = new Locale("da", "DK");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);

        String number = numberFormat.format(5000.50);
        System.out.println(number);

        NumberFormat numberFormat1 = NumberFormat.getInstance();
        System.out.println("Initial format: " + numberFormat1.format(123.678));

        numberFormat1.setMaximumFractionDigits(2);
        System.out.println("After setMaximumFractionDigits: " + numberFormat1.format(123.678));
        
        numberFormat1.setMinimumFractionDigits(5);
        System.out.println("After setMinimumFractionDigits: " + numberFormat1.format(123.678));
    }
}

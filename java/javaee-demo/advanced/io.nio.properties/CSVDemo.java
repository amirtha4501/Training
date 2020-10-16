/*
    REQUIREMENTS:
        - To read a CSV file using java.nio.Files API as List string with each row in CSV as a String
    ENTITIES:
        - CSVDemo
    WORK TO DONE:
        - get a buffered reader from nio files
        - obtain the path of the csv file
        - get reader of nio file using path
        - pass the reader to the csv reader
        - create a string array and assign values to it
        - print the records of the file

    PSEUDOCODE:
        {
            In the main function

			Path path = Paths.get(csvPath);
            try (
            	Reader reader = Files.newBufferedReader(path);
            	CSVReader csvReader = new CSVReader(reader);
        	) {
            	String[] nextRecord;
            	System.out.println("First Name\tLastName" );
            
            	while ((nextRecord = csvReader.readNext()) != null) {
                	System.out.println(nextRecord[0] + "\t\t" + nextRecord[1]);
            	}
        	}
        }
*/

import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CSVDemo {

    public static void main(String[] args) throws IOException {
        
    	Path path = Paths.get("C:\\1DEV\\mytraining\\java\\javaee-demo\\advanced\\io.nio\\testfile.csv");
    	
    	try (
            Reader reader = Files.newBufferedReader(path);
            CSVReader csvReader = new CSVReader(reader);
        ) {
            String[] nextRecord;
            System.out.println("First Name\tLastName" );
            
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println(nextRecord[0] + "\t\t" + nextRecord[1]);
            }
        }
    }
}
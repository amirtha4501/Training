/*
    REQUIREMENTS:
        - To write a program to perform the following operations in Properties.
            -> add some elements to the properties file.
            -> print all the elements in the properties file using iterator.
            -> print all the elements in the properties file using list method.
    ENTITIES:
        - PropertiesDemo
    WORK TO BE DONE:
        - get property.txt file
        - load the property.txt file into the properties class
        - set values to the properties 
        - store the values into the file
        - print the values using key
*/

import java.util.Properties;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

class PropertiesDemo {

    public static void main(String[] args) throws IOException {
        
        FileReader fileReader = new FileReader("property.txt");
        Properties properties = new Properties();  
        properties.load(fileReader);  
            
        properties.setProperty("name","ammu");  
        properties.setProperty("age", "19");  

        properties.store(new FileWriter("property.txt"), "Properties Demo");  
        
        System.out.println(properties.getProperty("name"));  
        System.out.println(properties.getProperty("age"));    
    }
}

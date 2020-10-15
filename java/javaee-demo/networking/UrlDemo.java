/*
    REQUIREMENTS:
        - To create a program for url class and url connection class in networking
    ENTITIES:
        - UrlDemo
    WORK TO DONE:
        - get url instance of the portfolio website
        - open connection to the website
        - add request property to avoid 403 response
        - create a buffered reader that stores the data of website
        - while the buffered reader is not null
            - print the line
        
    PSEUDOCODE:
        {
            In the main function

            URL portfolio = new URL("https://amirtha.ml/");
            URLConnection urlConnection = portfolio.openConnection();
            urlConnection.addRequestProperty("User-Agent", "...");
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            
            String input;
            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);	
            }
            bufferedReader.close();
        }
*/

import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class UrlDemo {

	public static void main(String[] args) throws Exception {
    
		URL portfolio = new URL("https://amirtha.ml/");
        URLConnection urlConnection = portfolio.openConnection();
        urlConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        
        String input;
        while ((input = bufferedReader.readLine()) != null) {
        	System.out.println(input);	
        }
        bufferedReader.close();
    }
}

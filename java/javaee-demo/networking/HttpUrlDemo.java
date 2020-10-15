/*
    REQUIREMENTS:
        - To reate a program using HttpUrlconnection in networking
    ENTITIES:
        - HttpUrlDemo
    WORK TO DONE:
        - get url instance of the financemanager website
        - open connection to the website via HttpURLConnection
        - set request method as GET
        - add request property to avoid 403 response
        - create a buffered reader that stores the data of website
        - while the buffered reader is not null
            - print the line
        
    PSEUDOCODE:
        {
            In the main function

            URL portfolio = new URL("https://financemanager.amirtha.ml/");
            HttpURLConnection httpUrlConnection = (HttpURLConnection) portfolio.openConnection();
            httpUrlConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
            httpUrlConnection.setRequestMethod("GET");
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpUrlConnection.getInputStream()));
            
            String input;
            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);	
            }
            bufferedReader.close();
        }
*/

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class HttpUrlDemo {

	public static void main(String[] args) throws Exception {
    
		URL portfolio = new URL("https://financemanager.amirtha.ml/");
        HttpURLConnection httpUrlConnection = (HttpURLConnection) portfolio.openConnection();
        httpUrlConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
        httpUrlConnection.setRequestMethod("GET");
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpUrlConnection.getInputStream()));
        
        String input;
        while ((input = bufferedReader.readLine()) != null) {
        	System.out.println(input);	
        }
        bufferedReader.close();
    }
}

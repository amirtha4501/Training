package in.kpr.training.jdbc.service;

public class AppConfig {

	static String stringUrl = null;
	static String username = null;
	static String password = null;
	
    public static final String dbString = (System.getenv("DB_STRING") != null) ? System.getenv("DB_STRING")
    									  : (stringUrl != null)? stringUrl : "jdbc:mysql://localhost:3303/jdbc.exercises?autoReconnect=true&useSSL=false";
    
    public static final String dbUsername = (System.getenv("DB_USERNAME") != null) ? System.getenv("DB_USERNAME") 
    										: (username != null) ? username : "root";
    
    public static final String dbPassword = (System.getenv("DB_PASSWORD") != null) ? System.getenv("DB_PASSWORD") 
    										: (password != null) ? password : "password";
    
}

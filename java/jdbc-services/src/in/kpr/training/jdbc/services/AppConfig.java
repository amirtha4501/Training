package in.kpr.training.jdbc.services;

public class AppConfig {

    public static final String dbString = (System.getenv("DB_STRING") != null) ? System.getenv("DB_STRING"): "jdbc:mysql://localhost:3303/jdbc.exercises?autoReconnect=true&useSSL=false",
            dbUsername = (System.getenv("DB_USERNAME") != null) ? System.getenv("DB_USERNAME") : "root",
            dbPassword = (System.getenv("DB_PASSWORD") != null) ? System.getenv("DB_PASSWORD") : "password";
}

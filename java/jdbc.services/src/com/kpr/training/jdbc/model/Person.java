package com.kpr.training.jdbc.model;

import com.kpr.training.jdbc.services.AppConfig;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.Statement;

public class Person {
	
	public String name = null;
	public String email	= null;
	public Date birthDate = null;
	public Date createdDate = null;
	public int addressId = 0;
	public String street = null;
	public String city = null;
	public long postalCode = 0;
	
	public boolean isEmpty() {
		return name == null && email == null && birthDate == null && createdDate == null && addressId == 0;
	}
	
	public String createPersonTable() {
    	try {
    		Connection connection  = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
            Statement statement = connection.createStatement();
            
            Class.forName("com.mysql.jdbc.Driver");
            
            String sql = "CREATE TABLE person (PRIMARY KEY (id), id BIGINT(20) AUTO_INCREMENT, name VARCHAR(50), email VARCHAR(100) UNIQUE, birth_date DATE, created_date DATETIME DEFAULT NOW(), address_id BIGINT(20), FOREIGN KEY (id) REFERENCES address(id))";												
            statement.executeUpdate(sql);
            
            return "Created Person table";
    	} catch (Exception e) {
    		return "error:" + e;
    	} 
	}

	public String truncatePersonTable() {
		try {
    		Connection connection  = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
            Statement statement = connection.createStatement();
            
            Class.forName("com.mysql.jdbc.Driver");
            
            String sql = "TRUNCATE TABLE person";
            statement.executeUpdate(sql);
            
            return "Truncated Person table";
    	} catch (Exception e) {
    		return "error:" + e;
    	} 
	}
	
	public String dropPersonTable() {
		try {
    		Connection connection  = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
            Statement statement = connection.createStatement();
            
            Class.forName("com.mysql.jdbc.Driver");
            
            String sql = "DROP TABLE person";
            statement.executeUpdate(sql);
            
            return "Dropped Person table";
    	} catch (Exception e) {
    		return "error:" + e;
    	} 
    }
}

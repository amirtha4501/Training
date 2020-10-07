package com.kpr.training.jdbc.services;

import com.kpr.training.jdbc.services.AppConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Address {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

    	Connection connection;	
    	Statement statement;

    	try {
    		connection  = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
    		statement = connection.createStatement();
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "CREATE DATABASE STUDENTS";
            statement.executeUpdate(sql);
    	} catch(Exception e) {
    		System.out.println("error:" + e);
    	}

    }
}
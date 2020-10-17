package com.kpr.training.jdbc.services;

import com.kpr.training.jdbc.exceptions.AppException;
import com.kpr.training.jdbc.exceptions.ExceptionCode;
import com.kpr.training.jdbc.model.Address;
import com.kpr.training.jdbc.services.AppConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AddressService {

	public long create(Address address) throws AppException {        
		long generatedAddressId = 0;
        
        if (address.postalCode == 0) {
            throw new AppException(ExceptionCode.INVALID_INPUT, "postalCode should not be empty");
        }
        
		try {
			Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
			String insertQuery = "INSERT INTO address VALUES(default, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, address.street);
            ps.setString(2, address.city);
            ps.setLong(3, address.postalCode);
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
            	generatedAddressId = rs.getLong(1);
            	System.out.println("Address created with id: " + generatedAddressId);
            }
            
        } catch (Exception e) {
			System.out.println("error: " + e);
		}

		if (generatedAddressId == 0) {
            throw new AppException(ExceptionCode.CREATE_FAILED, "Address creation failed");
        }

        return generatedAddressId;      
	}
	
	public Address read(int id) throws AppException {
		
		if (id <= 0) {
			throw new AppException(ExceptionCode.INVALID_INPUT, "id is invalid");
		}
		
		Address address = new Address();
		
		try {
			Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
			String selectQuery = "SELECT street, city, postal_code FROM address WHERE id = " + id;
            PreparedStatement ps = con.prepareStatement(selectQuery);
            
            ResultSet rs = ps.executeQuery(); 

            if (rs.next()) {            
            	String street = rs.getString("street"); 
            	String city = rs.getString("city"); 
            	long postalCode = rs.getLong("postal_code");
            	
        		address.street = street;
        		address.city = city;
        		address.postalCode = postalCode;	
            }
        } catch (Exception e) {
			System.out.println("error: " + e.getMessage());
		}

		if (address.isEmpty()) {
			throw new AppException(ExceptionCode.READ_FAILED, "id not found");
		}
		return address;		
	}
	
	public List<Address> readAll() throws AppException {
		
		List<Address> addresses = new ArrayList<>();
		Address address = new Address();
		
		try {
			Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
			String selectQuery = "SELECT street, city, postal_code FROM address";
            PreparedStatement ps = con.prepareStatement(selectQuery);
            
            ResultSet rs = ps.executeQuery(); 

            while (rs.next()) {
            
            	String street = rs.getString("street"); 
            	String city = rs.getString("city"); 
            	long postalCode = rs.getLong("postal_code");
            	
        		address.street = street;
        		address.city = city;
        		address.postalCode = postalCode;
        		
        		addresses.add(address);
            }
        } catch (Exception e) {
			System.out.println("error: " + e);
		}
		return addresses; 
	}
 
	public Address update(int id, Address address) throws AppException {
		
		if (id <= 0) {
			throw new AppException(ExceptionCode.INVALID_INPUT, "id is invalid");
		}
        
		try {
			Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
			String updateQuery = "UPDATE address SET street=?, city=?, postal_code=? WHERE id = " + id;
            PreparedStatement ps = con.prepareStatement(updateQuery);
            
            ps.setString(1, address.street);
            ps.setString(2, address.city);
            ps.setLong(3, address.postalCode);
            
            int result = ps.executeUpdate();
            if (result == 0) {
            	throw new AppException(ExceptionCode.UPDATE_FAILED, "id not found");
            }
        } catch (AppException e) {
			System.out.println("errorCode:" + e.getErrorCode() + " " + e.getErrorMessage());
		} catch (Exception e) {
			System.out.println("error: " + e.getMessage());
		}
		
		return address;
	}
	
	public String delete(int id) throws AppException {
		
		int result = 0;
		
		if (id <= 0) {
			throw new AppException(ExceptionCode.INVALID_INPUT, "id is invalid");
		}
		
		try {
			Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
			String deleteQuery = "DELETE FROM address WHERE id = " + id;
            PreparedStatement ps = con.prepareStatement(deleteQuery);
            
            result = ps.executeUpdate(); 
            if (result == 0) {
            	throw new AppException(ExceptionCode.DELETE_FAILED, "id not found");
            }
		} catch (AppException e) {
			System.out.println("errorCode:" + e.getErrorCode() + " " + e.getErrorMessage());
        } catch (Exception e) {
			System.out.println("error: " + e);
		}
		
		return result + " records deleted";
	}
}

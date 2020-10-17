package com.kpr.training.jdbc.services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kpr.training.jdbc.exceptions.AppException;
import com.kpr.training.jdbc.exceptions.ExceptionCode;
import com.kpr.training.jdbc.model.Address;
import com.kpr.training.jdbc.model.Person;

public class PersonService {
	
	public long create(Person person) throws AppException {        
		long generatedPersonId = 0;
        
		if (person.name == null || person.email == null || person.birthDate == null) {
            throw new AppException(ExceptionCode.INVALID_INPUT, "Input should not be empty");
        }
        
		try {
			Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
			String insertQuery = "INSERT INTO person (name, email, birth_date, address_id) VALUES(?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, person.name);
            ps.setString(2, person.email);
            ps.setDate(3, person.birthDate);
            ps.setInt(4, person.addressId);
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
            	generatedPersonId = rs.getLong(1);
            	System.out.println("Person created with id: " + generatedPersonId);
            }
            
        } catch (Exception e) {    		
        	System.out.println("error: " + e.getMessage());
		}

		if (generatedPersonId == 0) {
            throw new AppException(ExceptionCode.CREATE_FAILED, "Person creation failed");
        }

        return generatedPersonId;      
	}

	public Person read(int id) throws AppException {
		
		if (id <= 0) {
			throw new AppException(ExceptionCode.INVALID_INPUT, "id is invalid");
		}
		Person person = new Person();
		
		try {
			Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
			String selectQuery = "SELECT name, email, birth_date, created_date, address_id FROM person WHERE id = " + id;
            PreparedStatement ps = con.prepareStatement(selectQuery);
            
            ResultSet rs = ps.executeQuery(); 

            if (rs.next()) {            
            	String name = rs.getString("name"); 
            	String email = rs.getString("email"); 
            	Date birthDate = rs.getDate("birth_date");
            	Date createdDate = rs.getDate("created_date");
            	int personId = rs.getInt("address_id");
            	
            	person.name = name;
            	person.email = email;
            	person.birthDate = birthDate;
            	person.createdDate = createdDate;
            	
            	String selectForeign = "SELECT street, city, postal_code FROM address WHERE id = " + personId;
            	
            	PreparedStatement psPerson = con.prepareStatement(selectForeign);
            	ResultSet rsPerson = psPerson.executeQuery(); 
                
            	if (rsPerson.next()) {   
            		String street = rsPerson.getString("street");
            		String city = rsPerson.getString("city");
            		long postalCode = rsPerson.getLong("postal_code");
            	
            		person.street = street;
            		person.city = city;
            		person.postalCode = postalCode;
            	}
            }
        } catch (Exception e) {
			System.out.println("error: " + e);
		}

		// ! print without try block
		try {
			if (person.isEmpty()) {
				throw new AppException(ExceptionCode.READ_FAILED, "id not found");
			}
		} catch (AppException e) {
			System.out.println("errorCode:" + e.getErrorCode() + " " + e.getErrorMessage());
		}
		return person;		
	}

	public List<Person> readAll() throws AppException {
		
		List<Person> persons = new ArrayList<>();
		Person person = new Person();
		
		try {
			Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
			String selectQuery = "SELECT name, email, birth_date, created_date, address_id FROM person";
            PreparedStatement ps = con.prepareStatement(selectQuery);
            
            ResultSet rs = ps.executeQuery(); 

            while (rs.next()) {
            
            	String name = rs.getString("name"); 
            	String email = rs.getString("email"); 
            	Date birthDate = rs.getDate("birth_date");
            	Date createdDate = rs.getDate("created_date");
            	int addressId = rs.getInt("address_id");
            	
        		person.name = name;
        		person.email = email;
        		person.birthDate = birthDate;
        		person.createdDate = createdDate;
        		person.addressId = addressId;
        		
        		String selectForeign = "SELECT street, city, postal_code FROM address WHERE id = " + addressId;
            	
            	PreparedStatement psPerson = con.prepareStatement(selectForeign);
            	ResultSet rsPerson = psPerson.executeQuery(); 
                
            	if (rsPerson.next()) {   
            		String street = rsPerson.getString("street");
            		String city = rsPerson.getString("city");
            		long postalCode = rsPerson.getLong("postal_code");
            	
            		person.street = street;
            		person.city = city;
            		person.postalCode = postalCode;
            	}
            	
        		persons.add(person);
            }
        } catch (Exception e) {
			System.out.println("error: " + e);
		}
		return persons; 
	}
 
	public Person update(int id, Person person) throws AppException {
		
		if (id <= 0) {
			throw new AppException(ExceptionCode.INVALID_INPUT, "id is invalid");
		}
        
		try {
			Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
			String updateQuery = "UPDATE person SET name=?, email=?, birth_date=? WHERE id = " + id;
            PreparedStatement ps = con.prepareStatement(updateQuery);
            
            ps.setString(1, person.name);
            ps.setString(2, person.email);
            ps.setDate(3, person.birthDate);
            
            int result = ps.executeUpdate();
            if (result == 0) {
            	System.out.println("adf");
            	throw new AppException(ExceptionCode.UPDATE_FAILED, "id not found");
            }
        } catch (AppException e) {
			System.out.println("errorCode:" + e.getErrorCode() + " " + e.getErrorMessage());
		} catch (Exception e) {
			System.out.println("error: " + e.getMessage());
		}
		
		return person;
	}

	public String delete(int id) throws AppException {
		
		int result = 0;
		
		if (id <= 0) {
			throw new AppException(ExceptionCode.INVALID_INPUT, "id is invalid");
		}
		
		try {
			Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
			String deleteQuery = "DELETE FROM person WHERE id = " + id;
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

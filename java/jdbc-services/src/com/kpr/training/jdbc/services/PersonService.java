package com.kpr.training.jdbc.services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kpr.training.jdbc.constants.Query;
import com.kpr.training.jdbc.exceptions.AppException;
import com.kpr.training.jdbc.exceptions.ExceptionCode;
import com.kpr.training.jdbc.model.Address;
import com.kpr.training.jdbc.model.Person;

public class PersonService {
    
    // ! check
    public long create(Person person, Address address) throws AppException {
        long generatedPersonId = 0;
        AddressService addressService = new AddressService();
        
        if (person.getName() == null || person.getEmail() == null || person.getBirthDate() == null) {
            throw new AppException(ExceptionCode.INVALID_INPUT, "Input should not be empty");
        }

        try {
            Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
            PreparedStatement ps = con.prepareStatement(Query.insertPersonQuery, Statement.RETURN_GENERATED_KEYS);

            // creating address if it's given
            if (!address.isEmpty()) {                
                long addressId = addressService.create(address);   
                person.setAddressId((int) addressId);
            }
            
            ps.setString(1, person.getName());
            ps.setString(2, person.getEmail());
            ps.setDate(3, person.getBirthDate());
            ps.setInt(4, person.getAddressId());

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
            addressService.delete(person.getAddressId());
            throw new AppException(ExceptionCode.CREATE_FAILED, "Person creation failed");
        }
        
        return generatedPersonId;
    }

    public long create(Person person) throws AppException {
        return create(person, new Address());
    }
    
    public Person read(int id, boolean includeAddress) throws AppException {

        if (id <= 0) {
            throw new AppException(ExceptionCode.INVALID_INPUT, "id is invalid");
        }
        Person person = new Person();

        try {
            Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername,
                    AppConfig.dbPassword);
            PreparedStatement ps = con.prepareStatement(Query.selectPersonQuery + id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                Date birthDate = rs.getDate("birth_date");
                Date createdDate = rs.getDate("created_date");
                int personId = rs.getInt("address_id");

                person.setName(name);
                person.setEmail(email);
                person.setBirthDate(birthDate);
                person.setCreatedDate(createdDate);
                
                if (includeAddress) {
                    PreparedStatement psPerson = con.prepareStatement(Query.selectAddressQuery + personId);
                    ResultSet rsPerson = psPerson.executeQuery();

                    if (rsPerson.next()) {
                        String street = rsPerson.getString("street");
                        String city = rsPerson.getString("city");
                        long postalCode = rsPerson.getLong("postal_code");

                        person.setStreet(street);
                        person.setCity(city);
                        person.setPostalCode(postalCode);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("error: " + e);
        }

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
            Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername,
                    AppConfig.dbPassword);
            PreparedStatement ps = con.prepareStatement(Query.selectAllPersonQuery);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String name = rs.getString("name");
                String email = rs.getString("email");
                Date birthDate = rs.getDate("birth_date");
                Date createdDate = rs.getDate("created_date");
                int addressId = rs.getInt("address_id");

                person.setName(name);
                person.setEmail(email);
                person.setBirthDate(birthDate);
                person.setCreatedDate(createdDate);
                person.setAddressId(addressId);

                PreparedStatement psPerson = con.prepareStatement(Query.selectAddressQuery + addressId);
                ResultSet rsPerson = psPerson.executeQuery();

                if (rsPerson.next()) {
                    String street = rsPerson.getString("street");
                    String city = rsPerson.getString("city");
                    long postalCode = rsPerson.getLong("postal_code");

                    person.setStreet(street);
                    person.setCity(city);
                    person.setPostalCode(postalCode);
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
            Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername,
                    AppConfig.dbPassword);
            PreparedStatement ps = con.prepareStatement(Query.updatePersonQuery + id);

            ps.setString(1, person.getName());
            ps.setString(2, person.getEmail());
            ps.setDate(3, person.getBirthDate());

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
            Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername,
                    AppConfig.dbPassword);
            PreparedStatement ps = con.prepareStatement(Query.deletePersonQuery + id);

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

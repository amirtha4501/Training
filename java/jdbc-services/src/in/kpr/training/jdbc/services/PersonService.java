package in.kpr.training.jdbc.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.kpr.training.jdbc.constants.Constant;
import in.kpr.training.jdbc.constants.Query;
import in.kpr.training.jdbc.exceptions.AppException;
import in.kpr.training.jdbc.exceptions.ExceptionCode;
import in.kpr.training.jdbc.model.Address;
import in.kpr.training.jdbc.model.Person;

public class PersonService {

    public boolean isUnique(String email, Integer updation_id) {
        boolean result = false;
        Integer id = null;
        PreparedStatement ps;
        
        try {
            Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
            
            if (updation_id == null) {            
                ps = con.prepareStatement(Query.SELECT_EMAIL_EXISTS + email + "'");           
            } else {
            	ps = con.prepareStatement(Query.SELECT_EMAIL_EXISTS + email + "'" + Query.EMAIL_EXISTS_ID + updation_id);
            }
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(Constant.ID);
            }
            if (id == null) {
                result = true;
            }
        } catch(Exception e) {
            throw new AppException(ExceptionCode.REQUEST_FAILED);
        }
        return result;
    }
    
    public boolean isUnique(String email) {
        return isUnique(email, null);
    }

    public long create(Person person, Address address) {
        long generatedPersonId = 0;
        AddressService addressService = new AddressService();

        if (person.getName() == null || person.getEmail() == null || person.getBirthDate() == null) {
            throw new AppException(ExceptionCode.INVALID_INPUT, "Input should not be empty");
        }

        try {
            Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername,
                    AppConfig.dbPassword);
            PreparedStatement ps = con.prepareStatement(Query.INSERT_PERSON_QUERY, Statement.RETURN_GENERATED_KEYS);

            PreparedStatement setForeignChecks = con.prepareStatement(Query.SET_FOREIGN_CHECKS);
            setForeignChecks.execute();

            // creating address if it's given
            if (!address.isEmpty()) {
                long addressId = addressService.create(address);
                person.setAddressId((int) addressId);
            }

            if (this.isUnique(person.getEmail()) == false) {
                throw new AppException(ExceptionCode.UNIQUE_CONSTRAINT_FAILED, "Email violates unique constraint");
            } else {
                ps.setString(1, person.getName());
                ps.setString(2, person.getEmail());
                ps.setDate(3, person.getBirthDate());
                ps.setInt(4, person.getAddressId());

                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();

                if (rs.next()) {
                    generatedPersonId = rs.getLong(1);
                }
            }

        } catch (Exception e) {
        	throw new AppException(ExceptionCode.REQUEST_FAILED);
        }

        if (generatedPersonId == 0) {
            addressService.delete(person.getAddressId());
            throw new AppException(ExceptionCode.CREATE_FAILED, "Person creation failed");
        }

        return generatedPersonId;
    }

    public long create(Person person) {
        return create(person, null);
    }

    public Person read(int id, boolean includeAddress) {

        if (id <= 0) {
            throw new AppException(ExceptionCode.INVALID_INPUT, "id is invalid");
        }
        Person person = new Person();

        try {
            Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername,
                    AppConfig.dbPassword);
            PreparedStatement ps = con.prepareStatement(Query.SELECT_PERSON_QUERY + id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                person.setName(rs.getString(Constant.NAME));
                person.setEmail(rs.getString(Constant.EMAIL));
                person.setBirthDate(rs.getDate(Constant.BIRTH_DATE));
                person.setCreatedDate(rs.getDate(Constant.CREATED_DATE));

                if (includeAddress) {
                    PreparedStatement psPerson = con.prepareStatement(Query.SELECT_ADDRESS_QUERY + rs.getInt(Constant.ADDRESS_ID));
                    ResultSet rsPerson = psPerson.executeQuery();

                    if (rsPerson.next()) {
                        person.setStreet(rsPerson.getString(Constant.STREET));
                        person.setCity(rsPerson.getString(Constant.CITY));
                        person.setPostalCode(rsPerson.getLong(Constant.POSTAL_CODE));
                    }
                }
            }
        } catch (Exception e) {
        	throw new AppException(ExceptionCode.REQUEST_FAILED);
        }

        if (person.isEmpty()) {
            throw new AppException(ExceptionCode.READ_FAILED, "id not found");
        }
        return person;
    }

    public List<Person> readAll() {

        List<Person> persons = new ArrayList<>();
        Person person = new Person();

        try {
            Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername,
                    AppConfig.dbPassword);
            PreparedStatement ps = con.prepareStatement(Query.SELECT_ALL_PERSON_QUERY);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                person.setName(rs.getString(Constant.NAME));
                person.setEmail(rs.getString(Constant.EMAIL));
                person.setBirthDate(rs.getDate(Constant.BIRTH_DATE));
                person.setCreatedDate(rs.getDate(Constant.CREATED_DATE));
                person.setAddressId(rs.getInt(Constant.ADDRESS_ID));

                PreparedStatement psPerson = con.prepareStatement(Query.SELECT_ADDRESS_QUERY + rs.getInt(Constant.ADDRESS_ID));
                ResultSet rsPerson = psPerson.executeQuery();

                if (rsPerson.next()) {
                    person.setStreet(rsPerson.getString(Constant.STREET));
                    person.setCity(rsPerson.getString(Constant.CITY));
                    person.setPostalCode(rsPerson.getLong(Constant.POSTAL_CODE));
                }

                persons.add(person);
            }
        } catch (Exception e) {
        	throw new AppException(ExceptionCode.REQUEST_FAILED);
        }
        return persons;
    }

    public void update(int id, Person person) {
        
        if (id <= 0) {
            throw new AppException(ExceptionCode.INVALID_INPUT, "id is invalid");
        }

        try {
            Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername,
                    AppConfig.dbPassword);
            PreparedStatement ps = con.prepareStatement(Query.UPDATE_PERSON_QUERY + id);

            int result = 0;
            
            if (this.isUnique(person.getEmail(), id) == false) {
                throw new AppException(ExceptionCode.UNIQUE_CONSTRAINT_FAILED, "Email violates unique constraint");
            } else {                
            	ps.setString(1, person.getName());
                ps.setString(2, person.getEmail());
                ps.setDate(3, person.getBirthDate());
                
                result = ps.executeUpdate();               
            }
            if (result == 0) {
                throw new AppException(ExceptionCode.UPDATE_FAILED, "id not found");
            }
        } catch (Exception e) {
        	throw new AppException(ExceptionCode.REQUEST_FAILED);
        }

    }

    public void delete(int id) {

        int result = 0;

        if (id <= 0) {
            throw new AppException(ExceptionCode.INVALID_INPUT, "id is invalid");
        }

        try {
            Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername,
                    AppConfig.dbPassword);
            PreparedStatement ps = con.prepareStatement(Query.DELETE_PERSON_QUERY + id);

            result = ps.executeUpdate();
            if (result == 0) {
                throw new AppException(ExceptionCode.DELETE_FAILED, "id not found");
            }
        } catch (Exception e) {
        	throw new AppException(ExceptionCode.REQUEST_FAILED);
        }
    }
}

package com.kpr.training.jdbc.tests;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kpr.training.jdbc.exceptions.AppException;
import com.kpr.training.jdbc.model.Address;
import com.kpr.training.jdbc.model.Person;
import com.kpr.training.jdbc.services.AddressService;
import com.kpr.training.jdbc.services.AppConfig;
import com.kpr.training.jdbc.services.PersonService;
import com.mysql.jdbc.Connection;

public class ServiceTester {

    @Test(priority = 1, description = "Connection activated")
    public void isConnected() throws AppException, SQLException {
        Connection connection = (Connection) DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername,
                AppConfig.dbPassword);

        Assert.assertEquals(connection, connection);
    }

    @Test(priority = 2, description = "Create Address")
    public void createAddress() throws AppException {
        long creationStatus = 0;

        AddressService addressService = new AddressService();
        Address address = new Address();

        address.setStreet("south saliya street");
        address.setCity("myd");
        address.setPostalCode(123456);
        creationStatus = addressService.create(address);
        //
        Assert.assertTrue(creationStatus > 0);
    }

    @Test(priority = 3, description = "Create Address without postalCode")
    public void createAddressWithoutPincode() throws AppException {
        long creationStatus = 0;

        AddressService addressService = new AddressService();
        Address address = new Address();

        address.setStreet("7th cross street");
        address.setCity("bangalore");
        creationStatus = addressService.create(address);
        //
        Assert.assertTrue(creationStatus > 0);
    }

    @Test(priority = 4, description = "Create Person with address")
    public void createPerson() throws AppException, ParseException {
        long creationStatus = 0;

        Person person = new Person();
        Address address = new Address();
        PersonService personService = new PersonService();

        String dob = "2001-10-28";
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(dob);
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        person.setName("janvi");
        person.setEmail("janvi@mail.com");
        person.setBirthDate(sqlDate);

        address.setCity("xyz");
        address.setPostalCode(98765);

        creationStatus = personService.create(person, address);

        Assert.assertTrue(creationStatus > 0);
    }

    @Test(priority = 5, description = "Create Person without address")
    public void createPersonWithoutAddress() throws AppException, ParseException {
        long creationStatus = 0;

        Person person = new Person();
        PersonService personService = new PersonService();

        String dob = "2001-10-28";
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(dob);
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        person.setName("janvi");
        person.setEmail("janvi@mail.com");
        person.setBirthDate(sqlDate);

        creationStatus = personService.create(person);

        Assert.assertTrue(creationStatus > 0);
    }

    @Test(priority = 6, description = "Person creation with duplicate email")
    public void createPersonWithDuplicates() throws AppException, ParseException {
        long creationStatus = 0;

        Person person = new Person();
        PersonService personService = new PersonService();

        String dob = "2001-10-28";
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(dob);
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        person.setName("janvi");
        person.setEmail("ammu@mail.com");
        person.setBirthDate(sqlDate);

        creationStatus = personService.create(person);

        Assert.assertTrue(creationStatus > 0);
    }

    @Test(priority = 7, description = "Read person without address")
    public void readPersonWithoutAddress() throws AppException {
        int id = 7;
        String personName = null;
        Person person = null;
        
        PersonService personService = new PersonService();
        person = personService.read(id, false);
        personName = person.getName();
        Assert.assertTrue(personName != null);
    }
    
    @Test(priority = 8, description = "Read person with address")
    public void readPersonWithAddress() throws AppException {
        int id = 7;
        String personName = null;
        Person person = null;
        
        PersonService personService = new PersonService();
        person = personService.read(id, true);
        personName = person.getName();
        Assert.assertTrue(personName != null);
    }

}
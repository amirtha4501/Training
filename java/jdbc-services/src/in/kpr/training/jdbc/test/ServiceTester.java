package in.kpr.training.jdbc.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;


import in.kpr.training.jdbc.model.Address;
import in.kpr.training.jdbc.model.Person;
import in.kpr.training.jdbc.service.AddressService;
import in.kpr.training.jdbc.service.PersonService;

public class ServiceTester {

    @Test(priority = 2, description = "Create Address")
    public void createAddress() {
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
    public void createAddressWithoutPincode() {
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
    public void createPerson() throws ParseException {
        long creationStatus = 0;

        Person person = new Person();
        Address address = new Address();
        PersonService personService = new PersonService();

        String dob = "2001-10-28";
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(dob);
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        person.setName("kavi");
        person.setEmail("kavi@mail.com");
        person.setBirthDate(sqlDate);

        address.setCity("xyz");
        address.setPostalCode(98765);

        creationStatus = personService.create(person, address);

        Assert.assertTrue(creationStatus > 0);
    }

    @Test(priority = 5, description = "Create Person without address")
    public void createPersonWithoutAddress() throws ParseException {
        long creationStatus = 0;

        Person person = new Person();
        PersonService personService = new PersonService();

        String dob = "2001-10-28";
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(dob);
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        person.setName("ravi");
        person.setEmail("ravi@mail.com");
        person.setBirthDate(sqlDate);

        creationStatus = personService.create(person);

        Assert.assertTrue(creationStatus > 0);
    }

    @Test(priority = 6, description = "Person creation with duplicate email")
    public void createPersonWithDuplicates() throws ParseException {
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
    public void readPersonWithoutAddress() {
        int id = 7;
        String personName = null;
        Person person = null;
        
        PersonService personService = new PersonService();
        person = personService.read(id, false);
        personName = person.getName();
        Assert.assertTrue(personName != null);
    }
    
    @Test(priority = 8, description = "Read person with address")
    public void readPersonWithAddress() {
        int id = 7;
        String personName = null;
        Person person = null;
        
        PersonService personService = new PersonService();
        person = personService.read(id, true);
        personName = person.getName();
        Assert.assertTrue(personName != null);
    }

}
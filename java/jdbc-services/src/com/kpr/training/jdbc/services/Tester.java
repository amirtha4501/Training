package com.kpr.training.jdbc.services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.kpr.training.jdbc.exceptions.AppException;
import com.kpr.training.jdbc.model.Address;
import com.kpr.training.jdbc.model.Person;

class Tester {

    // Person CRUD operations

    static void createPerson() throws AppException, ParseException {
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
//        person.setAddressId(4);

        address.setCity("xyz");
        address.setPostalCode(98765);
        System.out.println(personService.create(person, address));
    }

    static void readPerson(int id) throws AppException {
        PersonService personService = new PersonService();

        System.out.println(personService.read(id, false).getPostalCode());
    }

    static void readAllPerson() throws AppException {
        PersonService personService = new PersonService();
        System.out.println(personService.readAll());
    }

    static void updatePerson(int id) throws AppException, ParseException {
        Person person = new Person();
        PersonService personService = new PersonService();

        String dob = "2020-10-28";
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(dob);
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        person.setName("ammu");
        person.setEmail("ammu@mail.com");
        person.setBirthDate(sqlDate);

        System.out.println(personService.update(id, person));
    }

    static void deletePerson(int id) throws AppException {
        PersonService personService = new PersonService();
        System.out.println(personService.delete(id));
    }

    // Address CRUD operations

    static void createAddress() throws AppException {
        AddressService addressService = new AddressService();
        Address address = new Address();

        address.setStreet("south saliya street");
        address.setCity("myd");
        address.setPostalCode(123456);
        System.out.println(addressService.create(address));
    }

    static void readAddress(int id) throws AppException {
        AddressService addressService = new AddressService();
        System.out.println(addressService.read(id));
    }

    static void readAllAddress() throws AppException {
        AddressService addressService = new AddressService();
        System.out.println(addressService.readAll());
    }

    static void updateAddress(int id) throws AppException {
        Address address = new Address();
        AddressService addressService = new AddressService();

        address.setStreet("abc street");
        address.setCity("");
        address.setPostalCode(2332434);

        System.out.println(addressService.update(id, address));
    }

    static void deleteAddress(int id) throws AppException {
        AddressService addressService = new AddressService();
        System.out.println(addressService.delete(id));
    }

    public static void main(String[] args) throws AppException, ParseException {

        // For Address

        // createAddress();
        // readAddress(2);
        // readAllAddress();
        // updateAddress(6);
        // deleteAddress(2);

        // For Person

//         createPerson();
         readPerson(7);
        // readAllPerson();
        // updatePerson(6);
        // deletePerson(2);
    }
}

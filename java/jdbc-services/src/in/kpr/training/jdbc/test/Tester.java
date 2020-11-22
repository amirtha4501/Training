package in.kpr.training.jdbc.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import in.kpr.training.jdbc.model.Address;
import in.kpr.training.jdbc.model.Person;
import in.kpr.training.jdbc.service.AddressService;
import in.kpr.training.jdbc.service.PersonService;

class Tester {

    // Person CRUD operations

    static void createPerson() throws ParseException {
        Person person = new Person();
        Address address = new Address();
        PersonService personService = new PersonService();

        String dob = "2001-10-28";
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(dob);
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        person.setName("pavi");
        person.setEmail("pavithra@mail.com");
        person.setBirthDate(sqlDate);
        // person.setAddressId(5);

        address.setStreet("tuo");
        address.setCity("xyz");
        address.setPostalCode(98765);
        System.out.println(personService.create(person, address));
    }

    static void readPerson(int id) {
        PersonService personService = new PersonService();

        System.out.println(personService.read(id, false));
    }

    static void readAllPerson() {
        PersonService personService = new PersonService();
        System.out.println(personService.readAll());
    }

    static void updatePerson(int id) throws ParseException {
        Person person = new Person();
        PersonService personService = new PersonService();

        String dob = "2020-10-28";
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(dob);
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        person.setName("anu");
        person.setEmail("anu@mail.com");
        person.setBirthDate(sqlDate);

        personService.update(id, person);
    }

    static void deletePerson(int id) {
        PersonService personService = new PersonService();
        personService.delete(id);
    }

    // Address CRUD operations

    static void createAddress() {
        AddressService addressService = new AddressService();
        Address address = new Address();

        address.setStreet("south saliya street");
        address.setCity("myd");
        address.setPostalCode(123456);
        System.out.println(addressService.create(address));
    }

    static void readAddress(int id) {
        AddressService addressService = new AddressService();
        System.out.println(addressService.read(id));
    }

    static void readAllAddress() {
        AddressService addressService = new AddressService();
        System.out.println(addressService.readAll());
    }

    static void updateAddress(int id) {
        Address address = new Address();
        AddressService addressService = new AddressService();

        address.setStreet("abc street");
        address.setCity("");
        address.setPostalCode(2332434);

        addressService.update(id, address);
    }

    static void deleteAddress(int id) {
        AddressService addressService = new AddressService();
        addressService.delete(id);
    }

    public static void main(String[] args) throws ParseException {

        // For Address

        // createAddress();
        // readAddress(3);
        // readAllAddress();
        // updateAddress(6);
        // deleteAddress(4);

        // For Person
    	
        // createPerson();
        // readPerson(4);
        // readAllPerson();
        // updatePerson(3);
        // deletePerson(2);

        // Address address = new Address();
        // Person person = new Person();
        // person.createPersonTable();
        // address.createAddressTable();
        // PersonService personService = new PersonService();
        // personService.isUnique("ammu@mail.com");
    }
}

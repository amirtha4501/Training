package com.kpr.training.jdbc.services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.kpr.training.jdbc.exception.AppException;
import com.kpr.training.jdbc.model.Address;
import com.kpr.training.jdbc.model.Person;

class Tester {
	
	static void createPerson() throws AppException, ParseException {
		Person person = new Person();
		PersonService personService = new PersonService();
		
		String dob = "2020-07-28";
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = formatter.parse(dob);
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());

		person.name = "amirha";
		person.email = "amirtha@mail.com";		
		person.birthDate = sqlDate;
		person.addressId = 2;
		
		System.out.println(personService.create(person));
	}
	
	static void readPerson(int id) throws AppException {
		PersonService personService = new PersonService();
		
		System.out.println(personService.read(id).city);
	}
	
	static void readAllPerson() throws AppException {
		PersonService personService = new PersonService();
		System.out.println(personService.readAll());
	}
	
	static void updatePerson(int id) throws AppException, ParseException {
		Person person = new Person();
		PersonService personService = new PersonService();
		
		String dob = "2020-07-28";
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = formatter.parse(dob);
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());

		person.name = "amirha";
		person.email = "amirtha@mail.com";		
		person.birthDate = sqlDate;
		
		System.out.println(personService.update(id, person));
	}
	
	static void deletePerson(int id) throws AppException {
		PersonService personService = new PersonService();
		System.out.println(personService.delete(id));
	}
	
	public static void main(String[] args) throws AppException, ParseException {
		
//		For Address
		AddressService addressService = new AddressService();
		Address address = new Address();

		System.out.println(addressService.create(address));
		System.out.println(addressService.read(3));
		System.out.println(addressService.readAll());
		System.out.println(addressService.update(3, address));
		System.out.println(addressService.delete(3));
		
//		For Person
		createPerson();
		readPerson(0);
		readAllPerson();
		updatePerson(1);
		deletePerson(1);
	}
}

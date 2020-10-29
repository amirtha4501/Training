package com.kpr.training.jdbc.constants;

public class Query {

    // Address queries

    public static final String insertAddressQuery = "INSERT INTO address VALUES(default, ?, ?, ?)";
    public static final String selectAddressQuery = "SELECT street, city, postal_code FROM address WHERE id = ";
    public static final String selectAllAddressQuery = "SELECT street, city, postal_code FROM address";
    public static final String updateAddressQuery = "UPDATE address SET street=?, city=?, postal_code=? WHERE id = ";
    public static final String deleteAddressQuery = "DELETE FROM address WHERE id = ";

    // Person queries

    public static final String insertPersonQuery = "INSERT INTO person (name, email, birth_date, address_id) VALUES(?, ?, ?, ?)";
    public static final String selectPersonQuery = "SELECT name, email, birth_date, created_date, address_id FROM person WHERE id = ";
    public static final String selectAllPersonQuery = "SELECT name, email, birth_date, created_date, address_id FROM person";
    public static final String updatePersonQuery = "UPDATE person SET name=?, email=?, birth_date=? WHERE id = ";
    public static final String deletePersonQuery = "DELETE FROM person WHERE id = ";
}

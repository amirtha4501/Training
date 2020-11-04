package in.kpr.training.jdbc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import in.kpr.training.jdbc.constants.Query;
import in.kpr.training.jdbc.services.AppConfig;

public class Address {

    private String street = null;
    private String city = null;
    private long postalCode = 0;

    public boolean isEmpty() {
        return street == null && city == null && postalCode == 0;
    }

    // getters

    public String getStreet() {
        return this.street;
    }

    public String getCity() {
        return this.city;
    }

    public long getPostalCode() {
        return this.postalCode;
    }

    // setters

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(long postalCode) {
        this.postalCode = postalCode;
    }

    // create, truncate, drop table

    public String createAddressTable() {
        try {
            Connection connection = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
            Statement statement = connection.createStatement();

            Class.forName("com.mysql.jdbc.Driver");

            statement.executeUpdate(Query.createAddressTable);

            return "Created Address table";
        } catch (Exception e) {
            return "error:" + e;
        }
    }

    public String truncateAddressTable() {
        try {
            Connection connection = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
            Statement statement = connection.createStatement();

            Class.forName("com.mysql.jdbc.Driver");

            statement.executeUpdate(Query.truncateAddressTable);

            return "Truncated Address table";
        } catch (Exception e) {
            return "error:" + e;
        }
    }

    public String dropAddressTable() {
        try {
            Connection connection = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
            Statement statement = connection.createStatement();

            Class.forName("com.mysql.jdbc.Driver");

            statement.executeUpdate(Query.dropAddressTable);

            return "Dropped Address table";
        } catch (Exception e) {
            return "error:" + e;
        }
    }
}

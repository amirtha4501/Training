package in.kpr.training.jdbc.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.Statement;

import in.kpr.training.jdbc.constant.Query;
import in.kpr.training.jdbc.service.AppConfig;

public class Person {

    private String name = null;
    private String email = null;
    private Date birthDate = null;
    private Date createdDate = null;
    private int addressId = 0;
    private String street = null;
    private String city = null;
    private long postalCode = 0;

    public boolean isEmpty() {
        return name == null && email == null && birthDate == null && createdDate == null && getAddressId() == 0;
    }

    // getters

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public int getAddressId() {
        return this.addressId;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(long postalCode) {
        this.postalCode = postalCode;
    }

    public String createPersonTable() {
        try {
            Connection connection = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername,
                    AppConfig.dbPassword);
            Statement statement = connection.createStatement();

            Class.forName("com.mysql.jdbc.Driver");
            statement.executeUpdate(Query.CREATE_PERSON_TABLE);

            return "Created Person table";
        } catch (Exception e) {
            return "error:" + e;
        }
    }

    public String truncatePersonTable() {
        try {
            Connection connection = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername,
                    AppConfig.dbPassword);
            Statement statement = connection.createStatement();

            Class.forName("com.mysql.jdbc.Driver");

            statement.executeUpdate(Query.TRUNCATE_PERSON_TABLE);

            return "Truncated Person table";
        } catch (Exception e) {
            return "error:" + e;
        }
    }

    public String dropPersonTable() {
        try {
            Connection connection = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername,
                    AppConfig.dbPassword);
            Statement statement = connection.createStatement();

            Class.forName("com.mysql.jdbc.Driver");

            statement.executeUpdate(Query.DROP_PERSON_TABLE);

            return "Dropped Person table";
        } catch (Exception e) {
            return "error:" + e;
        }
    }

}

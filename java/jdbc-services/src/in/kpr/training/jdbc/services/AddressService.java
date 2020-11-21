package in.kpr.training.jdbc.services;

import in.kpr.training.jdbc.constants.Constant;
import in.kpr.training.jdbc.constants.Query;
import in.kpr.training.jdbc.exceptions.AppException;
import in.kpr.training.jdbc.exceptions.ExceptionCode;
import in.kpr.training.jdbc.model.Address;
import in.kpr.training.jdbc.services.AppConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AddressService {

    public long create(Address address) {
        long generatedAddressId = 0;

        if (address.getPostalCode() == 0) {
            throw new AppException(ExceptionCode.INVALID_INPUT, "postalCode should not be empty");
        }

        try {
            Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
            PreparedStatement ps = con.prepareStatement(Query.INSERT_ADDRESS_QUERY, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, address.getStreet());
            ps.setString(2, address.getCity());
            ps.setLong(3, address.getPostalCode());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                generatedAddressId = rs.getLong(1);
                System.out.println("Address created with id: " + generatedAddressId);
            }

        } catch (Exception e) {
        	throw new AppException(ExceptionCode.REQUEST_FAILED);
        }

        if (generatedAddressId == 0) {
            throw new AppException(ExceptionCode.CREATE_FAILED, "Address creation failed");
        }

        return generatedAddressId;
    }

    public Address read(int id) {

        if (id <= 0) {
            throw new AppException(ExceptionCode.INVALID_INPUT, "id is invalid");
        }

        Address address = new Address();

        try {
            Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername,
                    AppConfig.dbPassword);
            PreparedStatement ps = con.prepareStatement(Query.SELECT_ADDRESS_QUERY + id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                address.setStreet(rs.getString(Constant.STREET));
                address.setCity(rs.getString(Constant.CITY));
                address.setPostalCode(rs.getLong(Constant.POSTAL_CODE));
            }
        } catch (Exception e) {
        	throw new AppException(ExceptionCode.REQUEST_FAILED);
        }

        if (address.isEmpty()) {
            throw new AppException(ExceptionCode.READ_FAILED, "id not found");
        }
        return address;
    }

    public List<Address> readAll() {

        List<Address> addresses = new ArrayList<>();
        Address address = new Address();

        try {
            Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername,
                    AppConfig.dbPassword);
            PreparedStatement ps = con.prepareStatement(Query.SELECT_ALL_ADDRESS_QUERY);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                address.setStreet(rs.getString(Constant.STREET));
                address.setCity(rs.getString(Constant.CITY));
                address.setPostalCode(rs.getLong(Constant.POSTAL_CODE));

                addresses.add(address);
            }
        } catch (Exception e) {
        	throw new AppException(ExceptionCode.REQUEST_FAILED);
        }
        return addresses;
    }

    public void update(int id, Address address) {

        if (id <= 0) {
            throw new AppException(ExceptionCode.INVALID_INPUT, "id is invalid");
        }

        try {
            Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername,
                    AppConfig.dbPassword);
            PreparedStatement ps = con.prepareStatement(Query.UPDATE_ADDRESS_QUERY + id);
            
            ps.setString(1, address.getStreet());
            ps.setString(2, address.getCity());
            ps.setLong(3, address.getPostalCode());

            int result = ps.executeUpdate();
            if (result == 0) {
            	throw new AppException(ExceptionCode.UPDATE_FAILED, "id not found");
            }
        } catch (Exception e) {
        	throw new AppException(ExceptionCode.REQUEST_FAILED);
        }
    }

    public void delete(int id) {

        if (id <= 0) {
            throw new AppException(ExceptionCode.INVALID_INPUT, "id is invalid");
        }

        try {
            Connection con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername,
                    AppConfig.dbPassword);
            PreparedStatement ps = con.prepareStatement(Query.DELETE_ADDRESS_QUERY + id);

            int result = ps.executeUpdate();
            if (result == 0) {
                throw new AppException(ExceptionCode.DELETE_FAILED, "id not found");
            }
        } catch (Exception e) {
        	throw new AppException(ExceptionCode.REQUEST_FAILED);
        }
    }
}

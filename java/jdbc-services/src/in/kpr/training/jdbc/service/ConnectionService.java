package in.kpr.training.jdbc.service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import in.kpr.training.jdbc.exception.AppException;
import in.kpr.training.jdbc.exception.ExceptionCode;

public class ConnectionService {

	public void get() throws Exception{ // static ?
		
		Properties property = new Properties();
		
		InputStream inputStream = new FileInputStream("E:\\1DEV\\mytraining\\java\\jdbc-services\\resource\\properties.txt");
		
		property.load(inputStream);
		
		AppConfig.stringUrl = property.getProperty("DB_STRING");
		AppConfig.username = property.getProperty("DB_USERNAME");
		AppConfig.password = property.getProperty("DB_PASSWORD");
		
		inputStream.close();
	}
	
	public Connection init() {
		Connection con;
		try {
			this.get();
			con = DriverManager.getConnection(AppConfig.dbString, AppConfig.dbUsername, AppConfig.dbPassword);
			con.setAutoCommit(false);
		} catch (Exception e) {
			throw new AppException(ExceptionCode.REQUEST_FAILED, "Connection failed");
		}
		
		return con;
	}
	
	public void commit(Connection con) {
		try {
			con.commit();
		} catch (Exception e) {
			throw new AppException(ExceptionCode.REQUEST_FAILED, "Commit failed");
		}
	}
	
	public void release(Connection con) {
		try {
			con.rollback();
			con.close();
		} catch (Exception e) {
			throw new AppException(ExceptionCode.REQUEST_FAILED, "Rollback failed");
		}
	}
	
}

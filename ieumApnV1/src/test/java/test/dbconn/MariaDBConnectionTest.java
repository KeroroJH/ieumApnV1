package test.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MariaDBConnectionTest {
	
	final static String DRIVER = "org.mariadb.jdbc.Driver";
	final static String URL    = "jdbc:mariadb://120.0.0.1:33307/jener";
	final static String USER   = "id";
	final static String PW     = "pass!";
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		try {
			Connection conn = DriverManager.getConnection(URL, USER, PW);
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}

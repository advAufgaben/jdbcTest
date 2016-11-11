package jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTester {
	public static void main(String[] args) throws SQLException {
		
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@advora11g:1521:oracle11g", "schatteb", "SchatteB");
		Statement stmt = con.createStatement();
		ResultSet rset = stmt.executeQuery("SELECT pflanzenname FROM pflanzen");
		while (rset.next()) {
			System.out.println(rset.getString(1));
		}
		return;
		
	}
}

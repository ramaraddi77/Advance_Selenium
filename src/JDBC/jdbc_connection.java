package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class jdbc_connection 
{
	@Test
	public void testscripts() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/ram";
		String un = "root";
		String pass = "root";

		//to establish the connection

		Connection connection = DriverManager.getConnection(url, un, pass);

		//to open Interface

		Statement state = connection.createStatement();

		// to execute the query and store in array format
		ResultSet res = state.executeQuery("select * from rasm19;");

		//to point to next line

		while(res.next())
		{
			System.out.println( " id :"+res.getString(1));
			System.out.println( " name :"+res.getString(2));
			System.out.println( " password :"+res.getString(3));

			System.out.println("-------------------------------------------");
		}

	}
}

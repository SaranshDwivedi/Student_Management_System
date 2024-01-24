package POM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBase_Connection {

	public static void main(String[] args) throws SQLException
	{
		Connection con = null;
		try
		{
			//Register driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//connect DataBase
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet53", "root", "root");
			
			//Create Statement
			Statement state = con.createStatement();
			String query = "insert into rmg values('Prakash', 'Java', 4) , ('Ashish' , 'Manual', 5);";

			//Create or Update Query
			int result = state.executeUpdate(query);
			if(result > 1)
			{
				System.out.println("Data added successfully");
			}
			else
			{
				System.out.println("Data is not Added");
			}

		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		//close the DATABASE
		finally 
		{
			con.close();
		}
	}
}
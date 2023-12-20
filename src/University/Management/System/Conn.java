package University.Management.System;
import java.sql.*;
public class Conn 
{
	Connection c;
	Statement s;
	Conn()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		    c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem" , "root" , "12345678");
		    s = c.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main (String args[])
	{
		
	}
}

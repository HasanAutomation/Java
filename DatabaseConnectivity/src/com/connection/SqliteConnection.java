package com.connection;
import java.sql.*;
import javax.swing.*;

public class SqliteConnection {
	public static Connection conn=null;
	
	public static Connection dbConnector()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost/dbmysql?useTimezone=true&serverTimezone=UTC","root","");
//			JOptionPane.showMessageDialog(null, "Connection successful");
			return conn;
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}

}

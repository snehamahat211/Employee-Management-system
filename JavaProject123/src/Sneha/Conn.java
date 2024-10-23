package Sneha;
import java.sql.*;

public class Conn {
	Connection c;
	Statement s;
	
	public Conn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementsystem", "root", "sneha");
			s=c.createStatement();
			
			
		}
		catch(Exception e) {
		e.printStackTrace();
		}
	}}
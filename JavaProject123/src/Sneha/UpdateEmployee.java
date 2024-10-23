package Sneha;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateEmployee extends JFrame implements ActionListener{
	
	
	JTextField tfname,tfename,tfsname,tfpname,tfhname;
	JLabel eid;
	JButton add,back;
	UpdateEmployee(String id){
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		JLabel heading=new JLabel("Update Employee Details");
		heading.setBounds(320,30,500,50);
		heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
		add(heading);
		
		JLabel labelname=new JLabel("Name:");
		labelname.setBounds(50,150,150,40);
		labelname.setFont(new Font("serif",Font.PLAIN,20));
		add(labelname);
		
		tfname=new JTextField();
		tfname.setBounds(200,150,150,40);
		add(tfname);
		
		JLabel labelename=new JLabel("Email ID:");
		labelename.setBounds(400,150,150,40);
		labelename.setFont(new Font("serif",Font.PLAIN,20));
		add(labelename);
		
		tfename=new JTextField();
		tfename.setBounds(600,150,150,40);
		add(tfename);
	
		
		JLabel labelsname=new JLabel("Salary:");
		labelsname.setBounds(50,230,150,40);
		labelsname.setFont(new Font("serif",Font.PLAIN,20));
		add(labelsname);
		
		tfsname=new JTextField();
		tfsname.setBounds(200,230,150,40);
		add(tfsname);
		
		JLabel labelpname=new JLabel(" Phone:");
		labelpname.setBounds(400,230,150,40);
		labelpname.setFont(new Font("serif",Font.PLAIN,20));
		add(labelpname);
		
		 tfpname=new JTextField();
		tfpname.setBounds(600,230,150,40);
		add(tfpname);
		
		JLabel labelhname=new JLabel("Education:");
		labelhname.setBounds(50,310,150,40);
		labelhname.setFont(new Font("serif",Font.PLAIN,20));
		add(labelhname);
		

		tfhname=new JTextField();
		tfhname.setBounds(200,310,150,40);
		add(tfhname);
		
		eid=new JLabel("EmployeeID:");
		eid.setBounds(400,310,150,40);
		eid.setFont(new Font("serif",Font.PLAIN,20));
		add(eid);
	
//		 eid=new JLabel();
//		 eid.setBounds(600,310,150,40);
//	     eid.setFont(new Font("serif",Font.PLAIN,20));
//		 add(eid);
		 
		 try {
	            Conn c = new Conn();
	            String query = "select * from employee where id = '"+id+"'";
	            ResultSet rs = c.s.executeQuery(query);
	            while(rs.next()) {
	            	tfname.setText(rs.getString("name"));
	            	tfename.setText(rs.getString("email"));
	            	tfsname.setText(rs.getString("salary"));
	            	tfpname.setText(rs.getString("phone"));
	            	tfhname.setText(rs.getString("education"));
	            	eid.setText(rs.getString("id"));}
		 } catch (Exception e) {
	            e.printStackTrace();
	        }
	            	
	            
		
		    add=new JButton("UPDATE DETAILS");
			add.setBounds(250,390,150,40);
			add.setBackground(Color.BLACK);
			add.setForeground(Color.WHITE);
			add.addActionListener(this);
			add(add);
			
			back=new JButton("BACK");
			back.setBounds(500,390,150,40);
			back.setBackground(Color.BLACK);
			back.setForeground(Color.WHITE);
			back.addActionListener(this);
			add(back);
		
		
		setSize(900,700);
		setLocation(300,50);
		setVisible(true);
		}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==add) {
			String name=tfname.getText();
			String email=tfename.getText();
			String salary=tfsname.getText();
			String phone=tfpname.getText();
			String education=tfhname.getText();
			String empId=eid.getText();
			
			try {
			Conn conn=new Conn();
		String query = "update  employee set name='" + name + "',email='" + email + "',salary='" + salary + "',phone='" + phone + "',education='" + education + "'where id='"+ empId + "'";
		conn.s.executeUpdate(query);
		JOptionPane.showMessageDialog(null, "Details updated Succesfully");
		setVisible(false);
		new Home();
}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
	    setVisible(false);
		new Home();
		}
	}
	
	public static void main (String []args) {
		new UpdateEmployee("");
	}
		
		
		
		
		
	}



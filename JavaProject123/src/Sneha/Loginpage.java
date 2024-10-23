package Sneha;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Loginpage extends JFrame implements ActionListener {
  JTextField tfusername,tfpassword;
Loginpage(){
		getContentPane().setBackground(Color.white);
		setLayout(null);
		JLabel username=new JLabel("Username");
		username.setBounds(40,20,100,30);
		add(username);
	    tfusername=new JTextField();
		tfusername.setBounds(150,20,150,30);
		add(tfusername);
		JLabel password=new JLabel("Password");
		password.setBounds(40,70,100,30);
		add(password);
	    tfpassword=new JTextField();
		tfpassword.setBounds(150,70,150,30);
		add(tfpassword);
		JButton login=new JButton("LOGIN");
		login.setBounds(150,140,150,30);
	    login.setBackground(Color.black);
	    login.setForeground(Color.white);
	    login.addActionListener(this);
	    add(login);
	    
	    ImageIcon i1 = new ImageIcon("C:/Users/user/Downloads/login.png");
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 20, 150, 150);
        add(image);
	    
		
		
		
		setSize(600,300);
		setLocation(450,200);
		setVisible(true);
				
	}
	public void actionPerformed(ActionEvent ae) {
    	try {
    		String username=tfusername.getText();
    		String password=tfpassword.getText();
    		Conn c=new Conn();
    		String query="select * from login where username= '"+username+"' and password='"+password+"'";
    		ResultSet rs=c.s.executeQuery(query);
    		if(rs.next()) {
  			setVisible(false);
    			new Home();
    			
    		}
    		else {
    			JOptionPane.showMessageDialog(null,"Invalid username or password");
    			setVisible(false);
    		}
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	}
	public static void main (String[]args) {
		new Loginpage();
	}

}

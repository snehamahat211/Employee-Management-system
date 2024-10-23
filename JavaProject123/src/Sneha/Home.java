package Sneha;
import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
	JButton view,update,add,remove;
	Home(){
		setLayout(null);
//		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/employee.jpg"));
		ImageIcon i1 = new ImageIcon("C:/Users/user/Downloads/groupofemployee.png");

		Image i2=i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,1120,630);
		add(image);
		JLabel heading=new JLabel("Employee Management System");
		heading.setBounds(590,20,400,40);
		heading.setFont(new Font("Tahoma",Font.BOLD,25));
		image.add(heading);
		
		
	    add=new JButton("Add Employee");
		add.setBounds(600,80,150,40);
		add.addActionListener(this);
		image.add(add);
		
		view=new JButton("View Employee");
		view.setBounds(800,80,150,40);
		view.addActionListener(this);
		image.add(view);
		
	    update=new JButton("Update Employee");
		update.setBounds(600,140,150,40);
		update.addActionListener(this);
		image.add(update);
		
	    remove=new JButton("Remove Employee");
		remove.setBounds(800,140,150,40);
		remove.addActionListener(this);
		image.add(remove);
		
		
		setSize(1120,630);
		setLocation(250,100);
		setVisible(true);
	}
	public void actionPerformed (ActionEvent ae) {
		if(ae.getSource()== add) {
			setVisible(false);
			new AddEmployee();
		}
		else if(ae.getSource()==view) {
			setVisible(false);
			new ViewEmployee();
		}
		else if(ae.getSource()==update) {setVisible(false);
		new ViewEmployee();}
		else if(ae.getSource()==remove) {
			setVisible(false);
			new RemoveEmployee();}		
	}
	public static void main(String[]args) {
		new Home();
	}
}

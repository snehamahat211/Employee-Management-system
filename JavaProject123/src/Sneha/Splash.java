package Sneha;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener{
	Splash(){
		 ImageIcon i1 = new ImageIcon("C:/Users/user/Downloads/office.jpg");
		 Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
	        ImageIcon i3 = new ImageIcon(i2);
	        JLabel image = new JLabel(i3);
	        image.setBounds(50, 100, 1050, 500);
	        add(image);
		    
		getContentPane().setBackground(Color.white);
		setLayout(null);
		JLabel heading=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		heading.setBounds(80,30,1200,60);
		heading.setFont(new Font("serif",Font.PLAIN,60));
		heading.setForeground(Color.RED);
		add(heading);
		JButton clickhere=new JButton("CLICK HERE TO CONTINUE");
		clickhere.setBounds(400,400,300,70);
	    clickhere.setBackground(Color.black);
	    clickhere.setForeground(Color.white);
	    clickhere.addActionListener(this);
	    image.add(clickhere);
	    setSize(1170,650);
		setLocation(200,50);
		setVisible (true);
		    while(true) {
  	heading.setVisible(false);
	    	try {
	    		Thread.sleep(500);
	    	}catch(Exception e) {}
	    	
	        heading.setVisible(true);
    	try {
    		Thread.sleep(500);
    	}catch(Exception e) {
    		   	}	    }


		
	}
	    public void actionPerformed(ActionEvent ae) {
	    	setVisible(false);
	    	new Loginpage();
	    	}
	    
	
	public static void main(String args[]) {
		new Splash ();
	}

}

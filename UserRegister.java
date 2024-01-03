import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class UserRegister extends JPanel implements ActionListener
{
	Users u;
	String getGender ;
	JLabel l1 , l2 , l3 , l4 , l5 , l6 , l7 , l8 , l9;
	JPasswordField tx2;
	JTextField tx1 , tx3 , tx4 , tx5 , tx6 , tx7;
	JButton b1 , b2 , b3;
    JComboBox cb1 , cb2 , cb3;
	JRadioButton r1 , r2 , r3;
	ButtonGroup bg = new ButtonGroup() ;
	ImageIcon img1 , img2 , img3;
	Image background , back , register ;
	
	UserRegister(FDemo f)
	{
		img1 =new ImageIcon("background1.png");
		background = img1.getImage();
		img2 =new ImageIcon("back.png");
		back = img2.getImage();
		img3 =new ImageIcon("register.png");
		register = img3.getImage();
		
		
		
		Font f1 = new Font("Times New Roman" , Font.BOLD , 30);
		setLayout(null);
		
		l1 = new JLabel("Enter Username :");
		l1.setBounds(700 , 50 , 300 , 50);
		l1.setForeground(Color.white);
		l1.setFont(f1);
		add(l1);
		
		tx1 = new JTextField(10);
		tx1.setBounds(1000 , 50 , 320 , 50);
		tx1.setForeground(Color.white);
		tx1.setOpaque(false);
		tx1.setFont(f1);
		add(tx1);
		
		l2 = new JLabel("Enter Password :");
		l2.setBounds(700 , 120 , 300 , 50);
		l2.setOpaque(false);
		l2.setForeground(Color.white);
		l2.setFont(f1);
		add(l2);
		
		tx2 = new JPasswordField(10);
		tx2.setBounds(1000 , 120 , 320 , 50);
		tx2.setOpaque(false);
		tx2.setForeground(Color.white);
		tx2.setFont(f1);
		add(tx2);
		
		l3 = new JLabel("Name :");
		l3.setBounds(700 , 190 , 300 , 50);
		l3.setOpaque(false);
		l3.setForeground(Color.white);
		l3.setFont(f1);
		add(l3);
		
		tx3= new JTextField(10);
		tx3.setBounds(1000 , 190 , 320 , 50);
	    tx3.setForeground(Color.white);
		tx3.setOpaque(false);
		tx3.setFont(f1);
		add(tx3);
		
		l4= new JLabel("Mobile No. :");
		l4.setBounds(700 , 260 , 300 , 50);
		l4.setOpaque(false);
		l4.setForeground(Color.white);
		l4.setFont(f1);
		add(l4);
		
		tx4 = new JTextField(10);
		tx4.setBounds(1000 , 260 , 320 , 50);
		tx4.setForeground(Color.white);
		tx4.setOpaque(false);
		tx4.setFont(f1);
		add(tx4);
		
		l5 = new JLabel("Gender :");
		l5.setBounds(700 , 330 , 300 , 50);
		l5.setOpaque(false);
		l5.setForeground(Color.white);
		l5.setFont(f1);
		add(l5);
		
		r1 =new JRadioButton("Male");
		r1.setBounds(1000 , 330 , 100 , 50);
		r1.setOpaque(false);
		r1.setForeground(Color.white);
		r1.setFont(f1);
		bg.add(r1);
		add(r1);
		
		r2 =new JRadioButton("Female");
		r2.setBounds(1100 , 330 , 120 , 50);
		r2.setOpaque(false);
		r2.setForeground(Color.white);
		r2.setFont(f1);
		bg.add(r2);
		add(r2);
		
		r3 =new JRadioButton("Others");
		r3.setBounds(1220 , 330 , 120 , 50);
		r3.setOpaque(false);
		r3.setForeground(Color.white);
		r3.setFont(f1);
		bg.add(r3);
		add(r3);
		
		l6 = new JLabel("E-mail :");
		l6.setBounds(700 , 400 , 300 , 50);
		l6.setForeground(Color.white);
		
		l6.setFont(f1);
		add(l6);
		
		tx5 = new JTextField(10);
		tx5.setBounds(1000 , 400 , 320 , 50);
		tx5.setForeground(Color.white);
		tx5.setOpaque(false);
		tx5.setFont(f1);
		add(tx5);
		
		l7 = new JLabel("Date of Birth :");
		l7.setBounds(700 , 470 , 300 , 50);
		l7.setForeground(Color.white);
		l7.setFont(f1);
		add(l7);
		
		String date[] = {"1" ,"2" ,"3" ,"4" ,"5" ,"6" ,"7" ,"8" ,"9" ,"10" ,"11" ,"12" ,"13" ,"14" ,"15" ,"16" ,"17" ,"18" ,"19" ,"20" ,"21" ,"22" ,"23" ,"24" ,"25" ,"26" ,"27" ,"28" ,"29" ,"30" , "31"};
		cb1 = new JComboBox(date);
		cb1.setBounds(1000 , 470 , 50 , 50);
		//cb1.setForeground(Color.white);
		cb1.setOpaque(false);
		cb1.setFont(f1);
		add(cb1);
	
		String month[] = {"January" ,"February" ,"March" ,"April" ,"May" ,"June" ,"July" ,"August" ,"September" ,"October" ,"Novenber" ,"December"};
		cb2 = new JComboBox(month);
	    cb2.setBounds(1070 , 470 , 140 , 50);
		cb2.setOpaque(false);
		cb2.setFont(f1);
		add(cb2);
		
		String year[] = {"1990" ,"1991" ,"1992" ,"1993" ,"1994" ,"1995" ,"1996" ,"1997" ,"1998" ,"1999" ,"2000" ,"2001" ,"2002" ,"2003" ,"2004" ,"2005" ,"2006" ,"2007" ,"2008"};
		cb3 = new JComboBox(year);
		cb3.setBounds(1230 , 470 , 100 , 50);
		cb3.setOpaque(false);
		cb3.setFont(f1);
		add(cb3);
		
		
		l8 = new JLabel("College :");
		l8.setBounds(700 , 540 , 300 , 50);
		l8.setForeground(Color.white);
	
		l8.setFont(f1);
		add(l8);
		
		tx6 = new JTextField(10);
		tx6.setBounds(1000 , 540 , 320 , 50);
		tx6.setForeground(Color.white);
		tx6.setOpaque(false);
		tx6.setFont(f1);
		add(tx6);
		
		l9 = new JLabel("Address :");
		l9.setBounds(700 , 610 , 300 , 50);
		l9.setForeground(Color.white);
		l9.setFont(f1);
		add(l9);
		
		tx7 = new JTextField(10);
		tx7.setBounds(1000 , 610 , 320 , 50);
		tx7.setOpaque(false);
		tx7.setForeground(Color.white);
		tx7.setFont(f1);
		add(tx7);
		
		// b1 = new JButton("Register");
		// b1.setBounds(900 , 680 , 150 , 50 );
		// b1.setFont(f1);
		// add(b1);
		// b1.addActionListener(this);
		
		b2 = new JButton(img2);
		b2.setBounds(700 , 750 , 100 , 50 );
		b2.setFont(f1);
		add(b2);
		b2.addActionListener(f);
		
		b3 = new JButton(img3);
		b3.setBounds(1150 , 750 , 150 , 50 );
		b3.setFont(f1);
		add(b3);
		b3.addActionListener(this);		

        		
	}
	String getGender()
		{
			if(r1.isSelected())
			{
				return "Male";
			}
			else if(r2.isSelected())
			{
				return "Female";
			}
			else if(r3.isSelected())
			{
				return "Other ";	
			}
			return null;
		}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b3)
		{
		String uname=tx1.getText();
		String upass=tx2.getText();
		String name=tx3.getText();
		String mobile=tx4.getText();
		String gender=getGender();
		String email=tx5.getText();
		String date=(String)cb1.getSelectedItem();
		String month=(String)cb1.getSelectedItem();
		String year=(String)cb3.getSelectedItem();
		String college=tx6.getText();
		String address=tx7.getText();
		String dob=year+"-"+month+"-"+date;
		
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "prerna");
			Statement st = con.createStatement();
			st.executeUpdate("insert into userregister(uname , upass , name , mobileno , gender , email , dob , college , address) values('"+uname+"' ,'"+upass+"' ,'"+name+"' ,'"+mobile+"' ,'"+gender+"' ,'"+email+"' ,'"+dob+"' ,'"+college+"' ,'"+address+"'  )");
			JOptionPane.showMessageDialog(null , "DataInserted ");
			
		     	tx1.setText(" ");
		     	tx2.setText(" ");
				tx3.setText(" ");
				tx4.setText(" ");
				tx5.setText(" ");
				tx6.setText(" ");
				tx7.setText(" ");
				
			con.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		}
		
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(background , 0 , 0 , this);
	}

}

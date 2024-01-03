 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 import java.sql.*;
 class AddCourse extends JPanel implements ActionListener
 {
	 JLabel l1 , l2 , l3 , l4;
	 JTextField tx1 , tx2 , tx3 , tx4;
	 JComboBox cb1 ; 
	 JButton b1 , b2;
	 ImageIcon img1,img2,img3;
	Image background , addcourse , back;

	 AddCourse(FDemo f)
	 {
		img1 =new ImageIcon("background1.png");
		background = img1.getImage();
		img2 =new ImageIcon("addcourse.png");
		addcourse = img2.getImage();
		img3 =new ImageIcon("back.png");
		back = img3.getImage();
		
		setLayout(null);
		
		Font f1 = new Font("Times New Roman" , Font.BOLD , 30);
		setFont(f1);
		 
		 l1 = new JLabel("ADD COURSE");
		 l1.setBounds(900 , 100 , 400 , 50);
		 l1.setForeground(Color.white);
		 l1.setFont(f1);
		 add(l1);
		 
		 l2 = new JLabel("Course Name:");
		 l2.setBounds(700 , 300 , 300 , 50);
		 l2.setForeground(Color.white);
		 l2.setFont(f1);
		 add(l2);
		 
		 tx1 = new JTextField(10);
         tx1.setBounds(1000 , 300 , 300 , 50);
		 tx1.setOpaque(false);
		 tx1.setFont(f1);
		 add(tx1);
		 
		 l3 = new JLabel("Time");
		 l3.setBounds(700 , 370 , 300 , 50);
		 l3.setForeground(Color.white);
		 l3.setFont(f1);
		 add(l3);
		 
		  tx2 = new JTextField(2);
		  tx2.setBounds(1000 , 370 , 50 , 50);
		   tx2.setOpaque(false);
		 tx2.setFont(f1);
		 add(tx2);
		 
		 tx3 = new JTextField(2);
		 tx3.setBounds(1070 , 370 , 50 , 50);
		  tx3.setOpaque(false);
		 tx3.setFont(f1);
		 add(tx3);
		 
		 tx4 = new JTextField(2);
		 tx4.setBounds(1140 , 370 , 50 , 50);
		  tx4.setOpaque(false);
		 tx4.setFont(f1);
		 add(tx4);
		 
		 l4 = new JLabel("Each Mark");
		 l4.setBounds(700 , 440 , 300 , 50);
		 l4.setForeground(Color.white);
		 l4.setFont(f1);
		 add(l4);
		 
		String marks[] = {"1" , "2" ,"3" , "4" , "5" , "6" , "7" , "8"  };
		 cb1 = new JComboBox(marks);
		 cb1.setBounds(1000 , 440 , 50 , 50);
		 cb1.setFont(f1);
		 add(cb1);
		 
		 b1 = new JButton(img3);
		 b1.setBounds(700 , 510 , 100 , 50);
		 b1.setFont(f1);
		 add(b1);
		 b1.addActionListener(f);
		 
		 b2 = new JButton(img2);
		 b2.setBounds(1100 , 510 , 200 , 50);
		 b2.setFont(f1);
		 b2.addActionListener(this);
		 add(b2);
	 }
	 public void actionPerformed(ActionEvent e)
	 {
		 String coursename = tx1.getText();
		 String hours = tx2.getText();
		 String minutes = tx3.getText();
		 String seconds = tx4.getText();
		 String marks=(String)cb1.getSelectedItem();
		 String time=hours+":"+minutes+":"+seconds;
		 
		 try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "prerna");
			Statement st = con.createStatement();
			st.executeUpdate("insert into addnewcourse(coursename , time , eachmark) values('"+coursename+"' ,'"+time+"' ,'"+marks+"')");
			JOptionPane.showMessageDialog(null ,"Data Inserted");
			
			tx1.setText(" ");
			tx2.setText(" ");
			tx3.setText(" ");
			tx4.setText(" ");
			
			con.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	 }
	 public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(background , 0 , 0 , this);
	}
 }
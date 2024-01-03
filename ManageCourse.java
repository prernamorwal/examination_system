import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class ManageCourse extends JPanel implements ActionListener
{
	JLabel l1;
    JButton b1 ,b2 , b3 , b4;
	JComboBox cb1;
	ImageIcon img1,img2 ,img3 ,img4 ,img5;
	Image background , addnewcourse , delete , editcourse , back;
	
	ManageCourse(FDemo f)
	{
		img1 =new ImageIcon("background1.png");
		background = img1.getImage();
		img2 =new ImageIcon("addnewcourse.png");
		addnewcourse = img2.getImage();
		img3 =new ImageIcon("delete.png");
		delete = img3.getImage();
		img4 =new ImageIcon("editcourse.png");
		editcourse = img4.getImage();
		img5 =new ImageIcon("back2.png");
		back = img5.getImage();
		
		setLayout(null);
		
		Font f1 = new Font("Times New Roman" , Font.BOLD , 30);
		setFont(f1);
		
		l1 = new JLabel("--MANAGE COURSES--");
        l1.setBounds(600,300,350,50);
		l1.setForeground(Color.white);
		l1.setFont(f1);
		add(l1);
		
	
		cb1 = new JComboBox();
		cb1.setBounds(1000,300,150,40);
		cb1.setFont(f1);
		add(cb1);
		
		b1= new JButton(img2);
        b1.setBounds(400,500,300,50);
		b1.setFont(f1);
		add(b1);
		b1.addActionListener(f);
		
		b2= new JButton(img3);
		b2.setBounds(800,500,300,50);
		b2.setFont(f1);
		add(b2);
		b2.addActionListener(this);
		
		b3= new JButton(img4);
		b3.setBounds(1200 ,500,300,50);
		b3.setFont(f1);
		add(b3);
		b3.addActionListener(f);
		
		b4= new JButton(img5);
		b4.setBounds(870 ,600,150,50);
		b4.setFont(f1);
		add(b4);
		b4.addActionListener(f);
	}
	
	public void actionPerformed(ActionEvent e)
	{
			String s1=(String)cb1.getSelectedItem();
		if(e.getSource()==b2)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "root1262");
				Statement st=con.createStatement();
				st.executeUpdate("delete from addnewcourse where coursename='"+s1+"'");
				
				JOptionPane.showMessageDialog(null,"Deleted Successfully");
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
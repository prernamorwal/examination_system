import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class CourseResult extends JPanel implements ActionListener
{
	JLabel l1 ;
	 JComboBox cb1 ;
	 JButton b1  , b2;
	 ImageIcon img1 , img2 , img3;
	Image background , search , back; 

	CourseResult(FDemo f)
	{
		img1 =new ImageIcon("background1.png");
		background = img1.getImage();
		img2 =new ImageIcon("search.png");
		search = img2.getImage();
		img3=new ImageIcon("back.png");
		back = img3.getImage();
		setLayout(null);
		Font f1 = new Font("Times New Roman" , Font.BOLD , 30);
		
		l1 =new JLabel("Available Courses");
		l1.setBounds(700 , 300 , 400 , 50);
		l1.setForeground(Color.white);
		l1.setFont(f1);
		add(l1);
		
		cb1 = new JComboBox();
		cb1.setBounds(1000 , 300 , 150 , 50);
		cb1.setFont(f1);
		add(cb1);
		
	    b1 = new JButton(img2);
		b1.setBounds(1000 , 400 , 150 , 50);
	    b1.setFont(f1);
		add(b1);
		
		b2 = new JButton(img3);
		b2.setBounds(700 , 400 , 100 , 50);
	    b2.setFont(f1);
		add(b2);
		b2.addActionListener(f);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(background , 0 , 0 , this);
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}
}
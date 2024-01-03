import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class AdminPanel extends JPanel implements ActionListener
{
	
	JButton b1 , b2 , b3 , b4 , b5 , b6 ;
	ImageIcon img1 ,img2 ,img3 ,img4 ,img5 ,img6 ,img7 ;
	Image background , managecourse , courseresult , logout , users , verification , forgotpassword;
	AdminPanel(FDemo f)
	{
		img1 =new ImageIcon("background1.png");
		background = img1.getImage();
		img2 =new ImageIcon("managecourse.png");
		managecourse = img2.getImage();
		img3 =new ImageIcon("courseresult.png");
		courseresult = img3.getImage();
		img4 =new ImageIcon("logout.png");
		logout = img4.getImage();
		img5 =new ImageIcon("users.png");
		users = img5.getImage();
		img6 =new ImageIcon("verification.png");
		verification = img6.getImage();
		img7 =new ImageIcon("forgotpassword2.png");
		forgotpassword = img7.getImage();
		
        setLayout(null);
		
		Font f1 = new Font("Times New Roman" , Font.BOLD , 30);
		setFont(f1);
		
		b1 = new JButton(img2);
		b1.setBounds(400,200,300,50);
		b1.setFont(f1);
		add(b1);
		b1.addActionListener(f);
		
		b2 = new JButton(img3);
		b2.setBounds(1200,200,300,50);
		b2.setFont(f1);
		add(b2);
		b2.addActionListener(f);
		
		b3 = new JButton(img4);
		b3.setBounds(400 ,500,300,50);
		b3.setFont(f1);
		add(b3);
		b3.addActionListener(f);
		
		b4 = new JButton(img5);
		b4.setBounds(1200,500,300,50);
		b4.setFont(f1);
		add(b4);
		b4.addActionListener(f);
		
		// b5 = new JButton(img6);
		// b5.setBounds(900,500,300,50);
		// b5.setFont(f1);
		// add(b5);
		
		// b6 = new JButton(img7);
		// b6.setBounds(1500 ,500,300,50);
		// b6.setFont(f1);
		// add(b6);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(background , 0 , 0 , this);
	}
}

		
		
		
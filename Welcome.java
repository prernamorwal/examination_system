import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Welcome extends JPanel
{	
	JButton b1,b2,b3,b4;
	JComboBox cb;
    JLabel l1,l2;
	String s1;
	ImageIcon img1 ,img2 ,img3 ,img4 ,img5 ;
	Image background ,editdetails , result , logout , start;
	
	Welcome(FDemo f)
	{
		
		img1 =new ImageIcon("background1.png");
		background = img1.getImage();
		img2 =new ImageIcon("editdetails.png");
		editdetails = img2.getImage();
		img3 =new ImageIcon("results.png");
		result = img3.getImage();
		img4 =new ImageIcon("logout2.png");
		logout = img4.getImage();
		img5 =new ImageIcon("start.png");
		start = img5.getImage();
		
		setLayout(null);
		Font f1 = new Font("Times New Roman" , Font.BOLD , 30);
		setFont(f1);
		
		l2=new JLabel();
		l2.setBounds(850,100,400,50);
		l2.setForeground(Color.white);
		add(l2);
		l2.setFont(f1);
		
		b1=new JButton(img2);
		b1.setBounds(400,250,300,50);
		b1.setFont(f1);
		add(b1);
		b1.addActionListener(f);
		
		
		b2=new JButton(img3);
		b2.setBounds(800,250,300,50);
		b2.setFont(f1);
		add(b2);
		
		b3=new JButton(img4);
		b3.setBounds(1200 ,250,300,50);
		b3.setFont(f1);
		add(b3);
		b3.addActionListener(f);
		
		
		l1=new JLabel("Select Course");
		l1.setBounds(800,400,200,50);
		l1.setForeground(Color.white);
		l1.setFont(f1);
		add(l1);
		
		
	    cb =new JComboBox();
		cb.setBounds(1000,400,150,40);
		cb.setFont(f1);
		add(cb);
		
		b4=new JButton(img5);
		b4.setBounds(900,500,150,50);
		b4.setFont(f1);
		add(b4);	
		b4.addActionListener(f);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(background , 0 , 0 , this);
	}
}

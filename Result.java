import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Result extends JPanel
{
	JLabel l ,l1 , l2 , l3 , l4 , l5 , l6 , l7 ;
	JLabel   l11 ,l12 , l13 , l14 , l15 , l16 , l17 ;
	JButton b1;
    
	ImageIcon img1;
	Image background ;
	
   Result(FDemo f)
	{
		img1 =new ImageIcon("background1.png");
		background = img1.getImage();
		
		setLayout(null);
		Font f1 = new Font("Times New Roman" , Font.BOLD , 30);
		Font f2 = new Font("Times New Roman" , Font.BOLD , 80);
		
		
		l = new JLabel("RESULT");
		l.setBounds(700 , 100 , 400 ,70);
		l.setForeground(Color.white);
		l.setFont(f2);
		add(l);
		
		
		l1 = new JLabel("Total Questions : ");
		l1.setBounds(600 , 300 , 300 ,50);
		l1.setForeground(Color.white);
		l1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		l1.setFont(f1);
		add(l1);
		
		l11 = new JLabel();
		l11.setBounds(900 , 300 , 300 ,50);
		l11.setForeground(Color.white);
		l11.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		l11.setFont(f1);
		add(l11);
		
		l2 = new JLabel("Attempted Questions : ");
		l2.setBounds(600 , 350 , 300 ,50);
		l2.setForeground(Color.white);
		l2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		l2.setFont(f1);
		add(l2);
		
		l12 = new JLabel();
		l12.setBounds(900 , 350 , 300 ,50);
		l12.setForeground(Color.white);
		l12.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		l12.setFont(f1);
		add(l12);
		
		l3 = new JLabel("Correct Answers : ");
		l3.setBounds(600 , 400 , 300 ,50);
		l3.setForeground(Color.white);
		l3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		l3.setFont(f1);
		add(l3);
		
		l13 = new JLabel();
		l13.setBounds(900 , 400 , 300 ,50);
		l13.setForeground(Color.white);
		l13.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		l13.setFont(f1);
		add(l13);
		
		l4 = new JLabel("Wrong Answers : ");
		l4.setBounds(600 , 450 , 300 ,50);
		l4.setForeground(Color.white);
		l4.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		l4.setFont(f1);
		add(l4);
		
		l14 = new JLabel();
		l14.setBounds(900 , 450 , 300 ,50);
		l14.setForeground(Color.white);
		l14.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		l14.setFont(f1);
		add(l14);
		
		l5 = new JLabel("Marks Obtained : ");
		l5.setBounds(600 , 500 , 300 ,50);
		l5.setForeground(Color.white);
		l5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		l5.setFont(f1);
		add(l5);
		
		l15 = new JLabel();
		l15.setBounds(900 ,500 , 300 ,50);
		l15.setForeground(Color.white);
		l15.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		l15.setFont(f1);
		add(l15);
		
		
		l6 = new JLabel("Total Marks : ");
		l6.setBounds(600 , 550 , 300 ,50);
		l6.setForeground(Color.white);
		l6.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		l6.setFont(f1);
		add(l6);
		
		l16 = new JLabel();
		l16.setBounds(900 , 550 , 300 ,50);
		l16.setForeground(Color.white);
		l16.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		l16.setFont(f1);
		add(l16);
		
		l7 = new JLabel("RESULT : ");
		l7.setBounds(600 , 600 , 300 ,50);
		l7.setForeground(Color.white);
		l7.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		l7.setFont(f1);
		add(l7);
		
		l17= new JLabel();
		l17.setBounds(900 , 600 , 300 ,50);
		l17.setForeground(Color.white);
		l17.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		l17.setFont(f1);
		add(l17);
		
		b1= new JButton("Back to Homepage");
		b1.setBounds(800 , 800 , 300 ,50);
		b1.setForeground(Color.white);
		// b1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		b1.setFont(f1);
		add(b1);
		b1.addActionListener(f);
		
	}
    public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(background , 0 , 0 , this);
	}
} 

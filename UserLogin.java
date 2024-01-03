import javax.swing.*;
import java.awt.*;
class UserLogin extends JPanel 
{
	JLabel l1 , l2 , l3;
	JTextField tx1 , tx2;
	JButton b1 ,b2 , b3 , b4;
	ImageIcon img1 , img2 , img3 , img4 , img5;
	Image background , login , register , back , forgotpassword;

	UserLogin(FDemo f)
	{
		img1 =new ImageIcon("background1.png");
		background = img1.getImage();
		img2 =new ImageIcon("login.png");
		login = img2.getImage();
		img3 =new ImageIcon("register.png");
		register = img3.getImage();
		img4 =new ImageIcon("back.png");
		back = img4.getImage();
		img5 =new ImageIcon("forgotpassword.png");
		forgotpassword = img5.getImage();
		
		
		Font f1 = new Font("Times New Roman" , Font.BOLD , 30);
		setLayout(null);
		
		l1 = new JLabel("Enter Username :");
		l1.setBounds(700 , 300 , 300 , 50);
		l1.setForeground(Color.white);
		l1.setFont(f1);
		add(l1);
		
		tx1 = new JTextField(10);
		tx1.setBounds(1000 , 300 , 300 , 50);
	    tx1.setOpaque(false);
		tx1.setForeground(Color.white);
		tx1.setFont(f1);
		add(tx1);
		
		l2 = new JLabel("Enter Password :");
		l2.setBounds(700 , 400 , 300 , 50);
		l2.setForeground(Color.white);
		l2.setFont(f1);
		add(l2);
		
		tx2 = new JPasswordField(10);
		tx2.setBounds(1000 , 400 , 300 , 50);
		 tx2.setOpaque(false);
		tx2.setForeground(Color.white);
		tx2.setFont(f1);
		add(tx2);
		
		b1 = new JButton(img2);
		b1.setBounds(900 , 500 , 150 , 50 );
		b1.setFont(f1);
		add(b1);
		b1.addActionListener(f);
		
		l3 = new JLabel("Are you a New User ??");
		l3.setBounds(750 , 700 , 300 , 50);
		l3.setForeground(Color.white);
		l3.setFont(f1);
		add(l3);
		
		b3 = new JButton(img3);
		b3.setBounds(1050 , 700 , 150 , 50 );
		b3.setFont(f1);
		add(b3);
		b3.addActionListener(f);
		
		b2 = new JButton(img4);
		b2.setBounds(700 , 800 , 100 , 50 );
		b2.setFont(f1);
		add(b2);
		b2.addActionListener(f);
		
		// b4= new JButton(img5);
		// b4.setBounds(1050 , 800 , 250 , 50 );
		// b4.setFont(f1);
		// add(b4);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(background , 0 , 0 , this);
	}
}



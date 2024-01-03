import javax.swing.*;
import java.awt.*;
class AdminLogin extends JPanel 
{
	JLabel l1 , l2;
	JTextField tx1 , tx2;
	JButton b1 , b2;
	ImageIcon img1 , img2 , img3;
	Image background , login , back;

	AdminLogin(FDemo f)
	{
		img1 =new ImageIcon("background1.png");
		background = img1.getImage();
		img2 =new ImageIcon("login.png");
		login = img2.getImage();
		img3 =new ImageIcon("back2.png");
		back = img3.getImage();
		
		Font f1 = new Font("Times New Roman" , Font.BOLD , 30);
		setLayout(null);
		
		l1 = new JLabel("Enter Username :");
		l1.setForeground(Color.white);
		l1.setBounds(700 , 300 , 300 , 50);
		l1.setFont(f1);
		add(l1);
		
		tx1 = new JTextField(10);
		tx1.setBounds(1000 , 300 , 300 , 50);
		tx1.setForeground(Color.white); 
		tx1.setOpaque(false);
		tx1.setFont(f1);
		add(tx1);
		
		l2 = new JLabel("Enter Password :");
		l2.setBounds(700 , 400 , 300 , 50);
		l2.setForeground(Color.white);
		l2.setFont(f1);
		add(l2);
		
		tx2 = new JPasswordField(10);
		tx2.setBounds(1000 , 400 , 300 , 50);
		tx2.setForeground(Color.white); 
		tx2.setOpaque(false);
		tx2.setFont(f1);
		add(tx2);
		
		b1 = new JButton(img2);
		b1.setBounds(900 , 500 , 150 , 50 );
		b1.setFont(f1);
		add(b1);
		b1.addActionListener(f);
		
		b2 = new JButton(img3);
		b2.setBounds(400 , 600 , 150 , 50 );
		b2.setFont(f1);
		add(b2);
		b2.addActionListener(f);	
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(background , 0 , 0 , this);
	}
}

import javax.swing.*;
import java.awt.*;
class Home extends JPanel 
{
	JButton b1 , b2;
	ImageIcon img1,img2 , img3;
	Image background , admin , user;
	
	Home(FDemo f)
	{
		img1 =new ImageIcon("background1.png");
		background = img1.getImage();
		img2 =new ImageIcon("admin.png");
		admin = img2.getImage();
		img3 =new ImageIcon("user.png");
		user = img3.getImage();
		
		Font f1 = new Font("Times New Roman" , Font.BOLD , 40);
		setLayout(null);
		
		b1 = new JButton(img2);
		b1.setBounds(850 , 300 ,300 ,100);
		b1.setFont(f1);
		add(b1);
		b1.addActionListener(f);
		
		b2 = new JButton(img3);
		b2.setBounds(850 , 450 ,300 ,100);
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
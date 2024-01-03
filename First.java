import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class First extends JPanel //implements ActionListener
{
    JButton b1 ,b2;
	JLabel l1;
	ImageIcon img1,img2 , img3;
	Image background , help , next;
	First(FDemo f)
	{
		img1 =new ImageIcon("background1.png");
		background = img1.getImage();
		
		img2 =new ImageIcon("help.png");
		help = img2.getImage();
		
		img3 =new ImageIcon("next.png");
		next = img3.getImage();
		
		Color c1=new Color(223 , 100 , 224);
		setBackground(c1);
		setLayout(new BorderLayout());
		Font f1 = new Font("Times New Roman" , Font.BOLD , 40);
		Font f2 = new Font("Times New Roman" , Font.BOLD , 80);
		setLayout(null);
		
		l1 =new JLabel("Examination System");
		l1.setBounds(700,150,900,100);
		l1.setFont(f2);
		l1.setForeground(Color.white);
		add(l1);
		
		b1 = new JButton(img2);
		b1.setBounds(850 , 300 ,300 ,100);
		b1.setFont(f1);
		add(b1);
		
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

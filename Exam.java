import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Exam extends JPanel implements ActionListener
{
	JLabel l ,l1 , l2 , l3 , l4 , l5 , l6 , l7;
	JTextArea tx1;
    JRadioButton r1 , r2 , r3 , r4;
	ButtonGroup bg1;
	JComboBox cb1;
	JButton b1 , b2 , b3;
	ImageIcon img1,img2 , img3;
	Image background , back , save;

	Exam(FDemo f)
	{
		img1 =new ImageIcon("background1.png");
		background = img1.getImage();
		img2 =new ImageIcon("back.png");
		back = img2.getImage();
		img3 =new ImageIcon("save.png");
		save = img3.getImage();


		setLayout(null);
		Font f1 = new Font("Times New Roman" , Font.BOLD , 30);

		
		l = new JLabel("Question ID");
		l.setBounds(100 , 100 , 300 ,50);
		l.setForeground(Color.white);
		l.setFont(f1);
		add(l);

		l1 = new JLabel();
		l1.setBounds(400 , 100 , 300 ,50);
		l1.setForeground(Color.white);
		l1.setFont(f1);
		add(l1);

		l2 = new JLabel("Question Statement");
		l2.setBounds(100 , 170 , 300 ,50);
		l2.setForeground(Color.white);
		l2.setFont(f1);
		add(l2);

		tx1 = new JTextArea();
		tx1.setBounds(400 , 170 , 600 ,200);
		 tx1.setOpaque(false);
		 tx1.setForeground(Color.white);
		tx1.setFont(f1);
		add(tx1);
		
		l3 = new JLabel("A");
		l3.setBounds(100 , 390 , 300 ,50);
		l3.setForeground(Color.white);
		l3.setFont(f1);
		add(l3);

		r1 = new JRadioButton();
		r1.setBounds(400 , 390 , 600 ,50);
		 r1.setForeground(Color.white);
		 r1.setOpaque(false);
		r1.setFont(f1);
		add(r1);

		l4 = new JLabel("B");
		l4.setBounds(100 , 460 , 300 ,50);
		l4.setForeground(Color.white);
		l4.setFont(f1);
		add(l4);

		r2 = new JRadioButton();
		r2.setBounds(400 , 460 , 600 ,50);
		 r2.setForeground(Color.white);
		 r2.setOpaque(false);
		r2.setFont(f1);
		add(r2);

		l5 = new JLabel("C");
		l5.setBounds(100 , 530 , 300 ,50);
		l5.setForeground(Color.white);
		l5.setFont(f1);
		add(l5);

		r3 = new JRadioButton();
		r3.setBounds(400 , 530 , 600 ,50);
		 r3.setForeground(Color.white);
		 r3.setOpaque(false);
		r3.setFont(f1);
		add(r3);

		l6 = new JLabel("D");
		l6.setBounds(100 , 600 , 300 ,50);
		l6.setForeground(Color.white);
		l6.setFont(f1);
		add(l6);

		r4 = new JRadioButton();
		r4.setBounds(400 , 600 , 600 ,50);
		 r4.setForeground(Color.white);
		 r4.setOpaque(false);
		r4.setFont(f1);
		add(r4);

		b1 = new JButton(img2);
		b1.setBounds(100 , 740 , 100 ,50);
		b1.setFont(f1);
		add(b1);
		b1.addActionListener(f);

		b2 = new JButton(img3);
		b2.setBounds(900 , 740 , 100 ,50);
		b2.setFont(f1);
		b2.addActionListener(f);
        add(b2, BorderLayout.SOUTH);

		b3 = new JButton("Submit");
		b3.setBounds(1200 , 500 , 200 ,50);
		b3.setFont(f1);
		b3.addActionListener(this);
		add(b3);
		
		ButtonGroup bg1 = new ButtonGroup();
        bg1.add(r1);
        bg1.add(r2);
        bg1.add(r3);
        bg1.add(r4);
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
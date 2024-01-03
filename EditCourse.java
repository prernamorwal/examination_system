import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class EditCourse extends JPanel
{
	JTabbedPane tab;
	New new1;
	View view;
	Update update;
	Remove remove;
	
	EditCourse()
	{
		Font f1 = new Font("Times New Roman" , Font.BOLD , 30);
		
		setLayout(new BorderLayout());
		tab = new JTabbedPane();
		new1 = new New();
        view = new View();
        update = new Update();
		remove = new Remove();
		
        tab.addTab("New" , new1);	
        tab.addTab("View",view);	
        tab.addTab("Update",update);
        tab.addTab("Remove",remove);			
		tab.setFont(f1);
		add(tab);
	}
}
class New extends JPanel implements ActionListener
{
	JLabel l1 , l2 , l3 , l4 , l5 , l6 , l7;
	JTextArea tx2;
	JTextField tx1 ,  tx3 , tx4 , tx5 , tx6;
	JComboBox cb1;
	JButton b1 , b2;
	ImageIcon img1,img2 , img3;
	Image background , back , save;
	
	New()
	{
		img1 =new ImageIcon("background1.png");
		background = img1.getImage();
		img2 =new ImageIcon("back.png");
		back = img2.getImage();
		img3 =new ImageIcon("save.png");
		save = img3.getImage();
		
		
		setLayout(null);
		Font f1 = new Font("Times New Roman" , Font.BOLD , 30);
		
		l1 = new JLabel("Question ID");
		l1.setBounds(100 , 100 , 300 ,50);
		l1.setForeground(Color.white);
		l1.setFont(f1);
		add(l1);
		
		tx1 = new JTextField(10);
		tx1.setBounds(400 , 100 , 100 ,50);
		 tx1.setOpaque(false);
		 tx1.setForeground(Color.white);
		tx1.setFont(f1);
		add(tx1);
		
		l2 = new JLabel("Question Statement");
		l2.setBounds(100 , 170 , 300 ,50);
		l2.setForeground(Color.white);
		l2.setFont(f1);
		add(l2);
		
		tx2 = new JTextArea ();
		tx2.setBounds(400 , 170 , 600 ,200);
		 tx2.setOpaque(false);
		 tx2.setForeground(Color.white);
		 tx2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tx2.setFont(f1);
		add(tx2);
		
		l3 = new JLabel("Option 1");
		l3.setBounds(100 , 390 , 300 ,50);
		l3.setForeground(Color.white);
		l3.setFont(f1);
		add(l3);
		
		tx3 = new JTextField(10);
		tx3.setBounds(400 , 390 , 600 ,50);
		 tx3.setForeground(Color.white);
		 tx3.setOpaque(false);
		tx3.setFont(f1);
		add(tx3);
		
		l4 = new JLabel("Option 2");
		l4.setBounds(100 , 460 , 300 ,50);
		l4.setForeground(Color.white);
		l4.setFont(f1);
		add(l4);
		
		tx4 = new JTextField(10);
		tx4.setBounds(400 , 460 , 600 ,50);
		 tx4.setForeground(Color.white);
		 tx4.setOpaque(false);
		tx4.setFont(f1);
		add(tx4);
		
		l5 = new JLabel("Option 3");
		l5.setBounds(100 , 530 , 300 ,50);
		l5.setForeground(Color.white);
		l5.setFont(f1);
		add(l5);
		
		tx5 = new JTextField(10);
		tx5.setBounds(400 , 530 , 600 ,50);
		 tx5.setOpaque(false);
		 tx5.setForeground(Color.white);
		tx5.setFont(f1);
		add(tx5);
		
		l6 = new JLabel("Option 4");
		l6.setBounds(100 , 600 , 300 ,50);
		l6.setForeground(Color.white);
		l6.setFont(f1);
		add(l6);
		
		tx6 = new JTextField(10);
		tx6.setBounds(400 , 600 , 600 ,50);
		 tx6.setOpaque(false);
		 tx6.setForeground(Color.white);
		tx6.setFont(f1);
		add(tx6);
		
		l7 = new JLabel("Correct Option");
		l7.setBounds(100 , 670 , 300 ,50);
		l7.setForeground(Color.white);
		l7.setFont(f1);
		add(l7);
		
		String option[] = {"Option 1", "Option 2", "Option 3", "Option 4"};
		cb1  =new JComboBox(option);
		cb1.setBounds(400 , 670 , 150 ,50);
		cb1.setFont(f1);
		add(cb1);
		
		b1 = new JButton(img2);
		b1.setBounds(100 , 740 , 100 ,50);
		b1.setFont(f1);
		add(b1);
		
		b2 = new JButton(img3);
		b2.setBounds(900 , 740 , 100 ,50);
		b2.setFont(f1);
		b2.addActionListener(this);
		add(b2);
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
class View extends JPanel implements ActionListener
{
	JLabel l1 , l2 , l3 , l4 , l5 , l6 , l7 , l8;
	JTextArea tx2;
	JTextField  tx3 , tx4 , tx5 , tx6;
	JComboBox cb1;
	JButton b1 ;
	ImageIcon img1,img2;
	Image background , back;
	
	View()
	{
		img1 =new ImageIcon("background1.png");
		background = img1.getImage();
		img2 =new ImageIcon("back.png");
		back = img2.getImage();
		
		setLayout(null);
		Font f1 = new Font("Times New Roman" , Font.BOLD , 30);
		
		l1 = new JLabel("Question ID");
		l1.setBounds(100 , 100 , 300 ,50);
		l1.setForeground(Color.white);
		l1.setFont(f1);
		add(l1);
		
		cb1  =new JComboBox();
		cb1.setBounds(400 , 100 , 150 ,50);
		cb1.setFont(f1);
		add(cb1);
		//cb1.setOpaque(true);
		//cb1.setForeground(Color.white);
		cb1.addActionListener(this);
		
		l2 = new JLabel("Question Statement");
		l2.setBounds(100 , 170 , 300 ,50);
		l2.setForeground(Color.white);
		l2.setFont(f1);
		add(l2);
		
		tx2 = new JTextArea();
		tx2.setBounds(400 , 170 , 600 ,200);
		tx2.setForeground(Color.white);
		tx2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		 tx2.setOpaque(false);
		tx2.setFont(f1);
		add(tx2);
		
		l3 = new JLabel("Option 1");
		l3.setBounds(100 , 390 , 300 ,50);
		l3.setForeground(Color.white);
		l3.setFont(f1);
		add(l3);
		
		tx3 = new JTextField(10);
		tx3.setBounds(400 , 390 , 600 ,50);
		tx3.setForeground(Color.white);
		 tx3.setOpaque(false);
		tx3.setFont(f1);
		add(tx3);
		
		l4 = new JLabel("Option 2");
		l4.setBounds(100 , 460 , 300 ,50);
		l4.setForeground(Color.white);
		l4.setFont(f1);
		add(l4);
		
		tx4 = new JTextField(10);
		tx4.setBounds(400 , 460 , 600 ,50);
		tx4.setForeground(Color.white);
		 tx4.setOpaque(false);
		tx4.setFont(f1);
		add(tx4);
		
		l5 = new JLabel("Option 3");
		l5.setBounds(100 , 530 , 300 ,50);
		l5.setForeground(Color.white);
		l5.setFont(f1);
		add(l5);
		
		tx5 = new JTextField(10);
		tx5.setBounds(400 , 530 , 600 ,50);
		tx5.setForeground(Color.white);
		 tx5.setOpaque(false);
		tx5.setFont(f1);
		add(tx5);
		
		l6 = new JLabel("Option 4");
		l6.setBounds(100 , 600 , 300 ,50);
		l6.setForeground(Color.white);
		l6.setFont(f1);
		add(l6);
		
		tx6 = new JTextField(10);
		tx6.setBounds(400 , 600 , 600 ,50);
		tx6.setForeground(Color.white);
		 tx6.setOpaque(false);
		tx6.setFont(f1);
		add(tx6);
		
		l7 = new JLabel("Correct Option");
		l7.setBounds(100 , 670 , 300 ,50);
		l7.setForeground(Color.white);
		l7.setFont(f1);
		add(l7);
		
		l8 = new JLabel();
		l8.setBounds(100 , 670 , 50 ,50);
		l8.setForeground(Color.white);
		l8.setFont(f1);
		add(l8);
		
		
		b1 = new JButton(img2);
		b1.setBounds(100 , 740 , 100 ,50);
		b1.setFont(f1);
		add(b1);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		String s1 = (String)cb1.getSelectedItem();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "root1262");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from editcourse where qid='"+s1+"'");
			if(rs.next())
			{
				tx2.setText(rs.getString(2));
				tx3.setText(rs.getString(3));
				tx4.setText(rs.getString(4));
				tx5.setText(rs.getString(5));
				tx6.setText(rs.getString(6));
				l8.setText(rs.getString(7));
				
			}
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(background , 0 , 0 , this);
	}
}
class Update extends JPanel implements ActionListener
{
	JLabel l1 , l2 , l3 , l4 , l5 , l6 , l7;
	JTextArea tx2;
	JTextField   tx3 , tx4 , tx5 , tx6;
	JComboBox cb1 , cb2;
	JButton b1 , b2;
    ImageIcon img1,img2 , img3;
	Image background , back , update;
	
	Update()
	{
		img1 =new ImageIcon("background1.png");
		background = img1.getImage();
		img2 =new ImageIcon("back.png");
		back = img2.getImage();
		img3 =new ImageIcon("update.png");
		update = img3.getImage();
		
		
		setLayout(null);
		Font f1 = new Font("Times New Roman" , Font.BOLD , 30);
		
		l1 = new JLabel("Question ID");
		l1.setBounds(100 , 100 , 300 ,50);
		l1.setForeground(Color.white);
		l1.setFont(f1);
		add(l1);
		

		cb2  =new JComboBox();
		cb2.setBounds(400 , 100 , 150 ,50);
		cb2.setFont(f1);
		add(cb2);
		cb2.addActionListener(this);
		
		l2 = new JLabel("Question Statement");
		l2.setBounds(100 , 170 , 300 ,50);
		l2.setForeground(Color.white);
		l2.setFont(f1);
		add(l2);
		
		tx2 = new JTextArea ();
		tx2.setBounds(400 , 170 , 600 ,200);
		tx2.setFont(f1);
		tx2.setOpaque(false);
		tx2.setForeground(Color.white);
    	 tx2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		add(tx2);
		
		l3 = new JLabel("Option 1");
		l3.setBounds(100 , 390 , 300 ,50);
		l3.setForeground(Color.white);
		l3.setFont(f1);
		add(l3);
		
		tx3 = new JTextField(10);
		tx3.setBounds(400 , 390 , 600 ,50);
		tx3.setFont(f1);
		tx3.setOpaque(false);
		tx3.setForeground(Color.white);
		add(tx3);
		
		l4 = new JLabel("Option 2");
		l4.setBounds(100 , 460 , 300 ,50);
		l4.setForeground(Color.white);
		l4.setFont(f1);
		add(l4);
		
		tx4 = new JTextField(10);
		tx4.setBounds(400 , 460 , 600 ,50);
		tx4.setFont(f1);
		tx4.setForeground(Color.white);
		tx4.setOpaque(false);
		add(tx4);
		
		l5 = new JLabel("Option 3");
		l5.setBounds(100 , 530 , 300 ,50);
		l5.setForeground(Color.white);
		l5.setFont(f1);
		add(l5);
		
		tx5 = new JTextField(10);
		tx5.setBounds(400 , 530 , 600 ,50);
		 tx5.setOpaque(false);
		 tx5.setForeground(Color.white);
		tx5.setFont(f1);
		add(tx5);
		
		l6 = new JLabel("Option 4");
		l6.setBounds(100 , 600 , 300 ,50);
		l6.setForeground(Color.white);
		l6.setFont(f1);
		add(l6);
		
		tx6 = new JTextField(10);
		tx6.setBounds(400 , 600 , 600 ,50);
		 tx6.setOpaque(false);
		 tx6.setForeground(Color.white);
		 
		tx6.setFont(f1);
		add(tx6);
		
		l7 = new JLabel("Correct Option");
		l7.setBounds(100 , 670 , 300 ,50);
		l7.setForeground(Color.white);
		l7.setFont(f1);
		add(l7);
		
		String option[] = {"Option 1", "Option 2", "Option 3", "Option 4"};
		cb1  =new JComboBox(option);
		cb1.setBounds(400 , 670 , 150 ,50);
		cb1.setFont(f1);
		add(cb1);
		
		b1 = new JButton(img2);
		b1.setBounds(100 , 740 , 100 ,50);
		b1.setFont(f1);
		add(b1);
		
		b2 = new JButton(img3);
		b2.setBounds(800 , 740 , 200 ,50);
		b2.setFont(f1);
		add(b2);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		String s1 = (String)cb2.getSelectedItem();
		String qst = tx2.getText();
		String opt1 = tx3.getText();
		String opt2 = tx4.getText();
		String opt3 = tx5.getText();
		String opt4 = tx6.getText();
		String correctopt = (String)cb1.getSelectedItem();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "root1262");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from editcourse where qid='"+s1+"'");
			if(rs.next())
			{
				tx2.setText(rs.getString(2));
				tx3.setText(rs.getString(3));
				tx4.setText(rs.getString(4));
				tx5.setText(rs.getString(5));
				tx6.setText(rs.getString(6));	
			}
			if(e.getSource()==b2)
			{
				st.executeUpdate("update editcourse set questionstatement='"+qst+"' , option1='"+opt1+"',option2='"+opt2+"',option3='"+opt3+"',option4='"+opt4+"',correctoption='"+correctopt+"' where qid= '"+s1+"'");
				JOptionPane.showMessageDialog(null , "Updated Successfully");
				tx2.setText(" ");
				tx3.setText(" ");
				tx4.setText(" ");
				tx5.setText(" ");
				tx6.setText(" ");
			}
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(background , 0 , 0 , this);
	}
}
class Remove extends JPanel implements ActionListener
{
	JLabel l1 , l2 , l3 , l4 , l5 , l6 , l7 , l8;
	JTextArea tx2;
	JTextField  tx3 , tx4 , tx5 , tx6;
	JComboBox cb1;
	JButton b1,b2 ;
	Image background , back , delete;
	ImageIcon img1 , img2 , img3;
	
	Remove()
	{
		img1 =new ImageIcon("background1.png");
		background = img1.getImage();
		img2 =new ImageIcon("back.png");
		back = img2.getImage();
		img3 =new ImageIcon("delete1.png");
		delete = img3.getImage();
		
		setLayout(null);
		Font f1 = new Font("Times New Roman" , Font.BOLD , 30);
		
		l1 = new JLabel("Question ID");
		l1.setBounds(100 , 100 , 300 ,50);
		l1.setForeground(Color.white);
		l1.setFont(f1);
		add(l1);
		
		cb1  =new JComboBox();
		cb1.setBounds(400 , 100 , 150 ,50);
		cb1.setFont(f1);
		add(cb1);
		cb1.addActionListener(this);
		
		l2 = new JLabel("Question Statement");
		l2.setBounds(100 , 170 , 300 ,50);
		l2.setForeground(Color.white);
		l2.setFont(f1);
		add(l2);
		
		tx2 = new JTextArea();
		tx2.setBounds(400 , 170 , 600 ,200);
		tx2.setOpaque(false);
		tx2.setForeground(Color.white);
	    tx2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tx2.setFont(f1);
		add(tx2);
		
		l3 = new JLabel("Option 1");
		l3.setBounds(100 , 390 , 300 ,50);
		l3.setForeground(Color.white);
		l3.setFont(f1);
		add(l3);
		
		tx3 = new JTextField(10);
		tx3.setBounds(400 , 390 , 600 ,50);
		tx3.setOpaque(false);
		tx3.setForeground(Color.white);
		tx3.setFont(f1);
		add(tx3);
		
		l4 = new JLabel("Option 2");
		l4.setBounds(100 , 460 , 300 ,50);
		l4.setForeground(Color.white);
		l4.setFont(f1);
		add(l4);
		
		tx4 = new JTextField(10);
		tx4.setBounds(400 , 460 , 600 ,50);
		tx4.setOpaque(false);
		tx4.setFont(f1);
		tx4.setForeground(Color.white);
		add(tx4);
		
		l5 = new JLabel("Option 3");
		l5.setBounds(100 , 530 , 300 ,50);
		l5.setForeground(Color.white);
		l5.setFont(f1);
		add(l5);
		
		tx5 = new JTextField(10);
		tx5.setBounds(400 , 530 , 600 ,50);
		tx5.setOpaque(false);
		tx5.setForeground(Color.white);
		tx5.setFont(f1);
		add(tx5);
		
		l6 = new JLabel("Option 4");
		l6.setBounds(100 , 600 , 300 ,50);
		l6.setForeground(Color.white);
		l6.setFont(f1);
		add(l6);
		
		tx6 = new JTextField(10);
		tx6.setBounds(400 , 600 , 600 ,50);
		tx6.setOpaque(false);
		tx6.setForeground(Color.white);
		tx6.setFont(f1);
		add(tx6);
		
		l7 = new JLabel("Correct Option");
		l7.setBounds(100 , 670 , 300 ,50);
		l7.setForeground(Color.white);
		l7.setFont(f1);
		add(l7);
		
		l8 = new JLabel();
		l8.setBounds(100 , 670 , 50 ,50);
		l8.setFont(f1);
		add(l8);
		
		
		b1 = new JButton(img2);
		b1.setBounds(100 , 740 , 100 ,50);
		b1.setFont(f1);
		add(b1);
		
		b2 = new JButton(img3);
		b2.setBounds(800 , 740 , 200 ,50);
		b2.setFont(f1);
		add(b2);
		b2.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
		String s1 = (String)cb1.getSelectedItem();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "root1262");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from editcourse where qid='"+s1+"'");
			if(rs.next())
			{
				tx2.setText(rs.getString(2));
				tx3.setText(rs.getString(3));
				tx4.setText(rs.getString(4));
				tx5.setText(rs.getString(5));
				tx6.setText(rs.getString(6));
			}
			if(e.getSource()==b2)
			{
				st.executeUpdate("delete from editcourse where qid = '"+s1+"'");
				JOptionPane.showMessageDialog(null , "Deleted Successfully");
				tx2.setText(" ");
				tx3.setText(" ");
				tx4.setText(" ");
				tx5.setText(" ");
				tx6.setText(" ");
			}
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(background , 0 , 0 , this);
	}
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class FDemo extends JFrame implements ActionListener
{
	
	JLabel l1;
	CardLayout card;
	Container cn = getContentPane();
	First fr;
	Home hm;
	AdminLogin adlg;
	UserLogin ulg ; 
	UserRegister ureg;
	AdminPanel apanel;
	ManageCourse managecourse;
	EditCourse editcourse;
	AddCourse addcourse;
	CourseResult courseresult;
	Users user;
	Welcome wel;
	EditDetails editdetails;
	UserDetailsSearch userdetailsearch;
	
	New new1;
	View view;
	Update update;
	Remove remove;
	
	Exam exam;
	Result result;
	
			Connection con5;
			Statement st5;
			ResultSet rs5;
			
			int marks;
			
			// SearchCourseData searchdata;
			
	FDemo()
	{
		card = new CardLayout();
		setLayout(card);
		fr = new First(this);
		add("first" , fr);
		
		user =new Users(this);
		add("user" , user);
		
		hm = new Home(this);
		add("home" ,hm);
		
		adlg = new AdminLogin(this);
		add("alogin" , adlg);
		
		ulg = new UserLogin(this);
		add("ulogin" , ulg);
		
		ureg = new UserRegister(this);
		add("uregis",ureg);
		
		apanel = new AdminPanel(this);
		add("apanel",apanel);
		
		managecourse = new ManageCourse(this);
		add("managecourse" , managecourse);
		
		addcourse = new AddCourse(this);
		add("addcourse" , addcourse);
		
		
		courseresult = new CourseResult(this);
		add("courseresult" , courseresult);
		
		wel = new Welcome(this);
		add("welcome" , wel);
		
		editcourse = new EditCourse();
		add("editcourse" , editcourse);
		
		new1 = new New();
		add("n1",new1);
		
		view = new View();
		add("v1",view);
		
		update = new Update();
		add("u1",update);
		
		remove = new Remove();
		add("r1",remove);
		
		exam = new Exam(this);
		add("exam",exam);
		
		editdetails = new EditDetails(this);
		add("editdetails",editdetails);
		
		userdetailsearch = new UserDetailsSearch(this);
		add("userdetailsearch",userdetailsearch);
		
		result =new Result(this);
		add("result",result);
		
		// searchdata =new SearchCourseData(this);
		// add("searchdata",searchdata);
		
		editcourse.new1.b1.addActionListener(this);
		editcourse.new1.b2.addActionListener(this);
		editcourse.view.b1.addActionListener(this);
		editcourse.update.b1.addActionListener(this);
		editcourse.remove.b1.addActionListener(this);
		
		
	
	    exam.b2.addActionListener(e -> insertData());
		exam.b3.addActionListener(this);
		//exam.b2.addActionListener(e -> showNextData());
		
	}
	  public void showResult()
	  {
		  try
				{
					String s1 = "Java";
					System.out.println("...................................................");
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "root1262");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select  count(*) from editcourse where coursename ='"+s1+"'");
					rs.next();
					int total=rs.getInt(1);
					
					 System.out.println("total count is "+total);
					
					//result.t1.setText(""+ques);
					result.l11.setText(""+total);
					rs=st.executeQuery("select count(*) from result");//result
					rs.next();
					int count=rs.getInt(1);
					System.out.println("total count is "+count);
					result.l12.setText(""+count);
					
					rs=st.executeQuery("select count(*) from result where selectedoption=correctoption");
					rs.next();
					int correct=rs.getInt(1);
					result.l13.setText(""+correct);
					System.out.println(correct);
					 
					 int wrong=count-correct;
					System.out.println("wrong count is "+wrong);
					result.l14.setText(""+wrong);
					
					 int marksO=correct*5;				 
					float f1=marksO;
					result.l15.setText(""+marksO);
					System.out.println("marks opt is "+f1);
					
					 int marksT=total*5;
					float f2=marksT;			 
					result.l16.setText(""+marksT);
					System.out.println("marks tot is "+f2);
					
					float f=f1/f2*100;
					System.out.println("marks f val is "+f);
					String res="";
					if(f>=40.0f)
						res="PASS";
					else
					res="FAIL";
					String time="00";
					result.l17.setText(""+res); 
					
					
					String username = ulg.tx1.getText();
					String coursename = (String)wel.cb.getSelectedItem();
					String totalques = result.l11.getText();
					String attemptedques = result.l12.getText();
					String correctans = result.l13.getText();
					String wrongans = result.l14.getText();
					String marksobt = result.l15.getText();
					String totalmarks = result.l16.getText();
					//String result = result.l17.getText();
					
					st.executeUpdate("insert into allresult values('"+username+"','"+coursename+"','"+totalques+"','"+attemptedques+"','"+correctans+"','"+wrongans+"','"+marksobt+"','"+totalmarks+"','"+res+"')");
					// rs.absolute(x);
			        JOptionPane.showMessageDialog(exam.b3,"Test Submit Successfuly","TestSubmit",JOptionPane.INFORMATION_MESSAGE);     

			        card.show(cn,"result");
					
					con.close();
				}
				catch(Exception e1)
				{
					System.out.println(e1);
			
				}
	  }
	  public void insertData()
	  {
	    	System.out.println("ram1");
			String qid=exam.l1.getText();
			String uname = ulg.tx1.getText();
			String selectedoption =getSelectedOption();
			String coursename =(String)wel.cb.getSelectedItem();
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "root1262");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select correctoption  from editcourse where qid = '"+qid+"'");
				while(rs.next())
				{
					String correctoption = rs.getString("correctoption");
					Statement st1 = con.createStatement();
				    st1.executeUpdate("insert into result values('"+qid+"' ,'"+uname+"' ,'"+selectedoption+"' ,'"+correctoption+"' ,'"+coursename+"')");
					// showMarks();
					exam.bg1.clearSelection();
				}
				
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			showNextData();
	  }
	 
      // public void showMarks()
	  // {
			// String qid=exam.l1.getText();
			
		    // try
    		// {
	     		// Class.forName("com.mysql.cj.jdbc.Driver");
		    	// Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "root1262");
	    		// Statement st1 = con1.createStatement();
     			// ResultSet rs1 = st1.executeQuery("select * from editcourse where qid ='"+qid+"' ");
			
	    		// while(rs1.next())
		    	// {
						// String correctOption = rs1.getString(7);
						// String selectedOption = "";
                        // if (exam.r1.isSelected()) {
                            // selectedOption = "Option 1";
                        // } 
						// else if (exam.r2.isSelected()) {
                            // selectedOption =  "Option 2";
                        // } 
						// else if (exam.r3.isSelected()) {
                            // selectedOption = "Option 3";
                        // }
						// else if (exam.r4.isSelected()) {
                            // selectedOption = "Option 4";
                        // }
						// else{
							
						// }
						
						
						// if(selectedOption.equals(correctOption))
						// {
							// marks+=1;
		                 	// System.out.println("show marks:");
							// System.out.println(marks);
		         		// }
						// else
						// {
							// System.out.println("No marks display");	
						// }
	    		// }
		    	// con1.close();
    		// }	
	    	// catch(Exception e1)
    		// {
	    		// System.out.println(e1);
     		// }
	  // }	  
	  
	  public void showNextData()
		{   
		        System.out.println("ram2");
					exam.l1.setText(" ");
					exam.tx1.setText(" ");
					exam.r1.setText(" ");
					exam.r2.setText(" ");
					exam.r3.setText(" ");
					exam.r4.setText(" ");	
			String coursename=(String)wel.cb.getSelectedItem();
			
			try
  			{
				Class.forName("com.mysql.cj.jdbc.Driver");
			    if(con5==null)
			   {
				con5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "root1262");
				st5 = con5.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
					System.out.println("RAM1");
     			 rs5= st5.executeQuery("select * from editcourse where coursename = '"+coursename+"'");
			   }
	    	    
            // Retrieve next data from result set
                if(rs5.next()) 
				{
					
                    exam.l1.setText(rs5.getString(1));	
					exam.tx1.setText(rs5.getString(2));
					exam.r1.setText(rs5.getString(3));
					exam.r2.setText(rs5.getString(4));
					exam.r3.setText(rs5.getString(5));
					exam.r4.setText(rs5.getString(6));	
					System.out.println("RAM2");
                exam.b3.setEnabled(false);
                }
				else
				{
                exam.b3.setEnabled(true);
              // Disable button when no more data is available
			   JOptionPane.showMessageDialog(null , "Test completed , you can submit noww!!");
				}
           }
		   catch (Exception e) 
		   {
            e.printStackTrace();
           }
		   
		}
		
		String getSelectedOption()
		{
			if(exam.r1.isSelected())
			{
				return "Option 1";
			}
			else if(exam.r2.isSelected())
			{
				return "Option 2";
			}
			else if(exam.r3.isSelected())
			{
				return "Option 3";	
			}
			else if(exam.r4.isSelected())
			{
				return "Option 4";	
			}
			return null;
		}
		
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==exam.b3)
		{
			card.show(cn, "result");
			showResult();
		}
		if(e.getSource()==result.b1)
		{
			card.show(cn, "ulogin");
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "root1262");
	            Statement st = con.createStatement();
     			st.executeUpdate("delete from result");
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
		if(e.getSource()==editcourse.new1.b2)
		{
			String questionid = editcourse.new1.tx1.getText();
	     	String questionstatement = editcourse.new1.tx2.getText();
     		String option1 = editcourse.new1.tx3.getText();
     		String option2 = editcourse.new1.tx4.getText();
    		String option3 = editcourse.new1.tx5.getText();
    		String option4 = editcourse.new1.tx6.getText();
    		String correctoption = (String)editcourse.new1.cb1.getSelectedItem();
    		String coursename = (String)managecourse.cb1.getSelectedItem();
		
	     	try
	    	{
	     		Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "root1262");
	    Statement st = con.createStatement();
     			st.executeUpdate("insert into editcourse(qid , questionstatement , option1, option2, option3, option4,correctoption , coursename) values('"+questionid+"' ,'"+questionstatement+"' ,'"+option1+"' ,'"+option2+"' ,'"+option3+"' ,'"+option4+"' ,'"+correctoption+"','"+coursename+"')");
	    		System.out.print("Data Inserted");
				 editcourse.new1.tx1.setText(" ");
	        	 editcourse.new1.tx2.setText(" ");
     	    	 editcourse.new1.tx3.setText(" ");
        		 editcourse.new1.tx4.setText(" ");
        	     editcourse.new1.tx5.setText(" ");
        		 editcourse.new1.tx6.setText(" ");
				 
    			con.close();
    		}
     		catch(Exception e1)
    		{
    			System.out.println(e1);
     		}
		}
		
		if(e.getSource()  == editcourse.new1.b1)
		{
			card.show(cn,"managecourse");
             editcourse.view.cb1.removeAllItems();			
             editcourse.update.cb2.removeAllItems();			
             editcourse.remove.cb1.removeAllItems();			
		}
	    if(e.getSource()==editcourse.view.b1)
		{
			card.show(cn,"managecourse");
		     editcourse.view.cb1.removeAllItems();			
             editcourse.update.cb2.removeAllItems();			
             editcourse.remove.cb1.removeAllItems();			
		}
		 if(e.getSource()==editcourse.update.b1)
		{
			card.show(cn,"managecourse");			
             editcourse.view.cb1.removeAllItems();			
             editcourse.update.cb2.removeAllItems();			
             editcourse.remove.cb1.removeAllItems();			
		}
		 if(e.getSource()==editcourse.remove.b1)
		{
			card.show(cn,"managecourse");			
             editcourse.update.cb2.removeAllItems();			
             editcourse.remove.cb1.removeAllItems();			
             editcourse.view.cb1.removeAllItems();			
		}
		if(e.getSource()==fr.b2)
		{
			card.show(cn, "home");
		}
		if(e.getSource()==hm.b1)
		{
			card.show(cn, "alogin");
		}
		if(e.getSource()==hm.b2)
		{
			card.show(cn, "ulogin");
		}
		if(e.getSource()==adlg.b2  || e.getSource()==ulg.b2)
		{
			card.show(cn, "home");
		}
		if(e.getSource()==ulg.b3)
		{
			card.show(cn, "uregis");
		}
		if(e.getSource()==ureg.b2 || e.getSource()==ureg.b3 )
		{
			card.show(cn, "ulogin");
		}
		if(e.getSource()==adlg.b1)
		{
			if(adlg.tx1.getText().equals("admin") && adlg.tx2.getText().equals("admin"))
			{
				card.show(cn, "apanel");
				
				
				adlg.tx1.setText(" ");
				adlg.tx2.setText(" ");
			}
			else
			{
	    			JOptionPane.showMessageDialog(null , "Invalid Username and password ");
			
			}
		}
		if(e.getSource()==apanel.b1)
		{
			card.show(cn, "managecourse");
			
			try
	    	{
		    	Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "root1262");
	     		Statement st = con.createStatement();
		    	ResultSet rs = st.executeQuery("select * from addnewcourse");
	    		while(rs.next())
	     		{
	     			
	
				managecourse.cb1.addItem(rs.getString(2));
					 
	     		}
     			
			    
     			con.close();
     		}
	    	catch(Exception e1)
	    	{
		    	System.out.println(e1);
    		}
		}
		if(e.getSource()==managecourse.b3)
		{
			card.show(cn, "editcourse");
			try
	    	{
		    	Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "root1262");
	     		Statement st = con.createStatement();
		    	ResultSet rs = st.executeQuery("select * from editcourse");
	    		while(rs.next())
	     		{
	     			
	
				editcourse.view.cb1.addItem(rs.getString(1));  
				editcourse.update.cb2.addItem(rs.getString(1));
				editcourse.remove.cb1.addItem(rs.getString(1));
					 
	     		}
     			
			    
     			con.close();
     		}
	    	catch(Exception e1)
	    	{
		    	System.out.println(e1);
    		}
		}
		if(e.getSource()==managecourse.b1)
		{
			card.show(cn, "addcourse");
		}
		if(e.getSource()==addcourse.b1)
		{
			card.show(cn, "managecourse");
		}
		if(e.getSource()==managecourse.b4)
		{
			card.show(cn, "apanel");
			managecourse.cb1.removeAllItems();
		}	
		if(e.getSource()==apanel.b4)
		{
			
			card.show(cn, "user");
			
			try
	    	{
		    	Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "root1262");
	     		Statement st = con.createStatement();
		    	ResultSet rs = st.executeQuery("select * from userregister");
	    		while(rs.next())
	     		{
	     			
	
				user.cb1.addItem(rs.getString(2));
					 
	     		}
     			
			    
     			con.close();
     		}
	    	catch(Exception e1)
	    	{
		    	System.out.println(e1);
    		}
			
		}	
		if(e.getSource()==user.b2)
		{
			card.show(cn, "apanel");
			user.cb1.removeAllItems();
		}
		if(e.getSource()==apanel.b2)
		{
			card.show(cn, "courseresult");
			try
	    	{
		    	Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "root1262");
	     		Statement st = con.createStatement();
		    	ResultSet rs = st.executeQuery("select * from addnewcourse");
	    		while(rs.next())
	     		{
	     			
	
				courseresult.cb1.addItem(rs.getString(2));
					 
	     		}
     			
			    
     			con.close();
     		}
	    	catch(Exception e1)
	    	{
		    	System.out.println(e1);
    		}
		}
		if(e.getSource()==courseresult.b2)
		{
			card.show(cn, "apanel");
			courseresult.cb1.removeAllItems();
		}
		if(e.getSource()==apanel.b3)
		{
			card.show(cn, "home");
		}
		if(e.getSource()==ulg.b1)
		{
			String uname = ulg.tx1.getText();
	     	String upass = ulg.tx2.getText();
			String s1;
			
		
	    	try
	    	{
		    	Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "root1262");
	     		Statement st = con.createStatement();
		    	ResultSet rs = st.executeQuery("select * from userregister where uname='"+uname+"' and upass = '"+upass+"'");
	    		
	    		if(rs.next())
	     		{
	     			
	     			card.show(cn , "welcome");
					wel.l2.setText("Welcome "+uname); 
					 
	     		}
     			else
	    		{
	    			JOptionPane.showMessageDialog(null , "Invalid Username and password ");
			    }
	      
				ResultSet rs1 = st.executeQuery("select * from addnewcourse");
				while(rs1.next())
	     		{
	     			
	
				wel.cb.addItem(rs1.getString(2));
	     		}
				ulg.tx1.setText(" ");
				ulg.tx2.setText(" ");
				
     			con.close();
     		}
	    	catch(Exception e1)
	    	{
		    	System.out.println(e1);
    		}
		}
		if(e.getSource()==wel.b3)
		{
			card.show(cn, "home");
			wel.cb.removeAllItems();
		}
		if(e.getSource()==editcourse.new1.b1)
		{
			card.show(cn, "managecourse");
		}
		if(e.getSource()==wel.b4)
		{
			card.show(cn, "exam");
			
			String coursename = (String)wel.cb.getSelectedItem();
			try
	    	{
	     		Class.forName("com.mysql.cj.jdbc.Driver");
				 con5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "root1262");
            	 st5 = con5.createStatement();
     			 rs5 = st5.executeQuery("select * from editcourse where coursename = '"+coursename+"'");
	    	    if(rs5.next())
				{
					exam.l1.setText(rs5.getString(1));
					exam.tx1.setText(rs5.getString(2));
					exam.r1.setText(rs5.getString(3));
					exam.r2.setText(rs5.getString(4));
					exam.r3.setText(rs5.getString(5));
					exam.r4.setText(rs5.getString(6));	
				}
				
    		}
     		catch(Exception e1)
    		{
    			System.out.println(e1);
     		}
		}
		if(e.getSource()==exam.b1)
		{
			card.show(cn, "welcome");
		}
		if(e.getSource()==wel.b1)
		{
			card.show(cn, "editdetails");
			String uname = ulg.tx1.getText();
			editdetails.tx1.setText(uname);
		}
		if(e.getSource()==editdetails .b2)
		{
			card.show(cn, "welcome");
		}
		
		
		if(e.getSource()==userdetailsearch.b2)
		{
			card.show(cn , "user");
		}
		if(e.getSource()==user.b1)
		{
	    	String uname=(String)user.cb1.getSelectedItem();
		    try
    		{
	     		Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "root1262");
	    		Statement st = con.createStatement();
     			ResultSet rs = st.executeQuery("select * from userregister where uname ='"+uname+"' ");
			
	    		if(rs.next())
		    	{
					System.out.println("heyy");
		     	    userdetailsearch.tx1.setText(rs.getString(2));
     		     	userdetailsearch.tx3.setText(rs.getString(4));
	    	     	userdetailsearch.tx4.setText(rs.getString(5));
		         	userdetailsearch.tx5.setText(rs.getString(7));
		        	userdetailsearch.tx6.setText(rs.getString(9));
		     	    userdetailsearch.tx7.setText(rs.getString(10));	
	    		}
		    	con.close();
    		}	
	    	catch(Exception e1)
    		{
	    		System.out.println(e1);
     		}
			card.show(cn , "userdetailsearch");
		}
		// if(e.getSource()==courseresult.b1)
		// {
			// card.show(cn, "searchdata");
		// }
		
	}
}
class Demo
{
	public static void main(String ar[])
	{
		FDemo f= new FDemo();
		f.setVisible(true);
		f.setBounds(0 , 0 , 2000 , 1100);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
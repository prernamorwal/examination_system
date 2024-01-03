// import javax.swing.*;
// import javax.swing.table.DefaultTableModel;
// import java.sql.*;

// public class SearchCourseData extends JPanel 
// {
	// JPanel jp;
  // SearchCourseData()
      // {
		  // JPanel jp=new JPanel();
		  // add(jp);
        
		    // JTable table = new JTable();
            // DefaultTableModel model = new DefaultTableModel();
            // table.setModel(model);

       // } 
	   
            // try 
			// {



                // Class.forName("com.mysql.cj.jdbc.Driver");
				// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination" , "root" , "root1262");
	    		// Statement st = con.createStatement();
     			// ResultSet rs = st.executeQuery("SELECT * FROM allresult where coursename =JAVA");
                // ResultSetMetaData metaData = resultSet.getMetaData();
				
             //  Get the number of columns in the result set
                // int columnCount = metaData.getColumnCount();

             // Add column names to the model
                // for (int column = 1; column <= columnCount; column++) {
                    // model.addColumn(metaData.getColumnName(column));
                // }

             // Add rows to the model
                // while (resultSet.next()) {
                    // Object[] rowData = new Object[columnCount];
                    // for (int column = 1; column <= columnCount; column++) {
                        // rowData[column - 1] = resultSet.getObject(column);
                    // }
                    // model.addRow(rowData);
                // }

             // Add the JTable to a JScrollPane and add it to the JFrame
                // JScrollPane scrollPane = new JScrollPane(table);
                // jp.add(scrollPane);

             // Set JFrame size and visibility
                

            // } 
			// catch (SQLException e) 
			// {
                // e.printStackTrace();
            // }

        // } 
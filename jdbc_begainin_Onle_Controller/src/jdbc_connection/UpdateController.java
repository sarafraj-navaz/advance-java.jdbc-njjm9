package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateController {

	public static void main(String[] args) {
		
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/raj1";
			String user="root";
			String pass="0786";
			
			connection=DriverManager.getConnection(url, user, pass);
			
			Statement statement=connection.createStatement();
			
			String updateQuery="update navaz set Sname='Nehal' where Sid=2";
			int id=statement.executeUpdate(updateQuery);
			
			if(id !=0) {
				System.out.println("Data has updated Successfully");
			}
			else {
				System.out.println("Please check your id ");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

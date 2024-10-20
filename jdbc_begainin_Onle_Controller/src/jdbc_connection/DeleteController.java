package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteController {

	public static void main(String[] args) {
	
		Connection connection=null;
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/raj1";
			String user="root";
			String pass="0786";
			connection=DriverManager.getConnection(url, user, pass);
			
			Statement statement=connection.createStatement();
			
			String deleteQuery="delete from navaz where Sid=1";
			int check=statement.executeUpdate(deleteQuery);
			if(check !=0) {
				System.out.println("Data has deleted successfully yet");
			}
			else {
				System.out.println("please check id which have you enterd yet");
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

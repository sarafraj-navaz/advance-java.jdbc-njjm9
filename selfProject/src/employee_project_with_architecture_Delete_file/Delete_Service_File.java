package employee_project_with_architecture_Delete_file;

public class Delete_Service_File {
	
	/*
	 * 
	 * accepting return values from the Dao method 
	 * i have made one method
	 */
	// we have create one object to access the all properties of the Delete_file_Dao
	Delete_file_Dao dao = new Delete_file_Dao();
	
	//business method
	public void deleteDao()
	{
		int id= dao.deleteDao();
		
		if(id !=0)
		{
			System.out.println("data deleted successfully");
		}
		else {
			System.out.println("please the you have enterd the id is not present in the table");
		}
	}
	
	
	

}

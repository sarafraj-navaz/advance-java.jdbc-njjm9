package employee_project_with_architecture_Update_file;

public class Update_Service_file {
	
	Update_Dao dao  =  new Update_Dao();
	
	public void updateMethod1()
	{
		
		int id =  dao.updateMethod();
		if(id!=0) {
			 System.out.println("data update successfully");
		}
		else {
			 System.err.println("data  not  update successfully");
			
		}
	}
	

}

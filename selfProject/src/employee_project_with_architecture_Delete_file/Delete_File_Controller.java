package employee_project_with_architecture_Delete_file;

public class Delete_File_Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * In the main method we are creating object of the business class 
		 * to access the properties of the service class and permission the business class to execution of the service
		 */
		Delete_Service_File  s1 = new Delete_Service_File();
		s1.deleteDao();
	}

}

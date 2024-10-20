package insert_File_Manager;

public class Insert_File_Driver {

	public static void main(String[] args) {
		
		 Insert_File_Driver  in2 = new  Insert_File_Driver();
		 in2.createTableRun();

	}
	public void createTableRun()
	{
		Insert_Class_file in1 =  new Insert_Class_file();
		in1.createTable();
		System.out.println("create table successfully");
		
	}

}

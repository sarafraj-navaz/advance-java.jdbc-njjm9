package createTable;

public class Create_Table_Driver {

	public static void main(String[] args) {
		
		Create_Table_Driver s1 = new Create_Table_Driver();
		s1.tableService();
		
	}
	public void tableService()
	{
		create_Table  t1 = new create_Table();
		t1.createTable();
		System.out.println("create table Successfully");
	}

}

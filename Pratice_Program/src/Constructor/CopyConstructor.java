package Constructor;

public class CopyConstructor {

	String name;
	int age;
	double salary;

	CopyConstructor()
	 {
		 
	 }

	CopyConstructor(String name,int age,double salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
/*
 * copy constructor method;
 * 
 * 
 * 
 */
	 CopyConstructor( CopyConstructor copy)
	 {
		 this.name=copy.name;
		 this.age=copy.age;
		 this.salary=copy.salary;
	 }

	 public void display()
	 {
		 System.out.println(" name of student "+name);
		 System.out.println("age of the Student"+age);
		 System.out.println("salary of the Student"+salary);
	 }
}

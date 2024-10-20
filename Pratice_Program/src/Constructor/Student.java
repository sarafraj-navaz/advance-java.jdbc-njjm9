package Constructor;

public class Student {
	String name;
	int roll;
	double fees;

	Student(String  name,int roll,double fees) {
		this.name=name;
		this.roll=roll;
		this.fees=fees;
		
	}
	public  void studentPrint()
	{
		System.out.println("name of the student "+name);
		System.out.println("roll number of the Student "+roll);
		System.out.println("fees of the  Student  "+fees);
	}

}

package Constructor;

public class LaptopDriver {

	public static void main(String[] args) {
		
		
		System.out.println("this is main method");
		Laptop l1=new Laptop("hp",7,200000,3.3);
		l1.displayLaptop();
		
		System.out.println("======");
		Student  s1=new Student("Suhail",12,21222.1);
		s1.studentPrint();

	}

}

package OPPProgram;

public class Employ1 {
	static int i=1;
	int  j=10;
	public void test()
	{
		System.out.println("this is non static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("directly access ");
		System.out.println(i);
		demo();
		System.out.println("using class refrence");
		System.out.println(Employ1.i);
		Employ1.demo();
		System.out.println("by using object refrence");
		Employ1 sc=new Employ1();
		System.out.println(sc.i);
		sc.demo();
		System.out.println(sc.j);
        sc.test();
		

	}
	public static void demo()
	{
		System.out.println("this is static method");
	}

}

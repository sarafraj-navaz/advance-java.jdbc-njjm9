package recursion;
public class Recursion1 {

	public static void main(String[] args) {
		System.out.println("this is main method");
		test();
		System.out.println("main method end");
	}
	public static void test()
	{
		System.out.println("this is test method");
		test();
	}

}

package recursion;

public class Recursion2ControlFlow {

	public static void main(String[] args) {
		System.out.println("this is main method ");
		test(10);
	}
	public static void test(int  n)
	{
		if(n>=1)
		{
			System.out.println("number=="+n);
			test(n-1);
		}
		else
		{
			System.out.println("recursion stop controll fail");
		}
	}
}

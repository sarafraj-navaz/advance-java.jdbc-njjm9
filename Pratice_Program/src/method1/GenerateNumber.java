package method1;

public class GenerateNumber {

	public static void main(String[] args) {
		// generate();
		for (int i = 1; i <= 15; i++) {
			int n=generate(i);
			System.out.println("factorial "+n);

		}

	}

//	public static void generate()
//	{
//		for(int i=1;i<=15;i++)
//		{
//			System.out.println("number"+i);
//			int fact=1;
//			int n=i;
//			for(int j=1;j<=n;j++)
//			{
//				fact=fact*j;
//			}
//		System.out.println(i+"fact of the number "+fact);	
//			
//		}
//	}
	public static int generate(int a) {
		// System.out.println(n);
		int fact = 1;
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		System.out.println(a + " !==  " + fact);	
		return fact;
	}



}

package method_class;

public class FactorialFind {

	public static void main(String[] args) {
		int n=5;
		int factorial = fact(n);
		System.out.println(factorial+" fact of  the number");
	}
	public static  int fact(int n)
	{
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
	return fact;	
	}

}

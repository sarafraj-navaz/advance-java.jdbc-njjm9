package method_class;
import java.util.Scanner;
public class Program1ASum {

	public static void main(String[] args) {
		System.out.println("enter the first number");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		
		int sum=add(a,b);
		if(sum%2==0)
		{
			System.out.println(sum+"  Even number");
		}
		else
		{
			System.out.println(sum+"  odd number ");
		}

	}
	public static int add(int a,int b)
	{
		return a+b;
	}

}

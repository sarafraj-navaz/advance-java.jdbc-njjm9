package Exercise;
import java.util.Scanner;
public class Program5 {
//.WRITE ONE PROGRAM FOR NESTED IF,else if Ladder->IN CLASS
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("enter  the third number");
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is greater number  "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b  is the greater number   "+b);
		}
		else if(c>a && c>b)
		{
			System.out.println("c is the greater  number   "+c);
		}

	}

}

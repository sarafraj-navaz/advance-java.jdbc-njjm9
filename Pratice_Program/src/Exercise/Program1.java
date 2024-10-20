package Exercise;
import java.util.Scanner;
public class Program1 {
     //1.WAP TO CHECK WHETHER NUMBER IS POSITIVE OR NOT.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("positive number"+n);
		}
		else
		{
			System.out.println("not positive number"+n);
		}

	}

}

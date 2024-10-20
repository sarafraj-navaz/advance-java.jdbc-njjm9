package Exercise;
import java.util.Scanner;
public class Program2 {
//2.WAP TO CHECK WHETHER THE PERSON IS ELIGIBLE TO MARRY OR NOT.
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter the your age");
		int n=a.nextInt();
		if(n>=18)
		{
			System.out.println("you are eligible to marry"+n);
		}
		else
		{
			System.out.println("you are not eligible to marry"+n);
		}

	}

}

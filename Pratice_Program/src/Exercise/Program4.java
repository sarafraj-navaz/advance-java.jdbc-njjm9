package Exercise;
import java.util.Scanner;
public class Program4 {
//4.WAP TO DISPLAY MESSAGE GOOD MORNING WHEN NUMBER IS 8 AND
	//NUMBER EQUALS TO 10 AND NUMBER EQUALS TO 11.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		if(n==8 || n==10 || n==11)
		{
			System.out.println("Good morning   "+n);
		}
		else
		{
			System.out.println("you can not access    "+n);
		}
	}

}

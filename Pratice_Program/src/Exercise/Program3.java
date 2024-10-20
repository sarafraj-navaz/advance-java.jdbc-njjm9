package Exercise;
import java.util.Scanner;
public class Program3 {
//3.WAP TO PRINT GOODMORNING WHEN THE NO IS 8.
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the nummber");
    int n=sc.nextInt();
    if(n==8 || n==10)
    {
    	System.out.println("Good Morning     "+n);
    }
    else
    {
    	System.out.println("you can not access the data:::    "+n);
    }
	}

}

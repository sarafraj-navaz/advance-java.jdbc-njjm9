package arrayProgram;
import java.util.Scanner;
public class Program81Sum {

	public static void main(String[] args) {
   
		Scanner sc=new Scanner(System.in);
		int s =sc.nextInt();
		int arr[] = new int[5]; 
        int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			System.out.println(sum);
		}
		

	}

}

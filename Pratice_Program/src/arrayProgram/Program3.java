package arrayProgram;
import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner (System.in);
		System.out.println("enter the size of the array");
		int size =sc.nextInt();
		sc.nextLine();// it has added for going to next lines
		System.out.println("enter the element of the array");
		String arr[] =  new String[size];
		
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println("enter the number of the position"+i);
			arr[i]=sc.nextLine();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}

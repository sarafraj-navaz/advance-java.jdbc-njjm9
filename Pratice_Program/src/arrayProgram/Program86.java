package arrayProgram;

import java.util.Scanner;

public class Program86 {

	public static void main(String[] args) {
		
		int[] r =  createArray(4);
		for(int i=0;i<r.length;i++)
		{
			System.out.println(r[i]);
		}
		

	}
	public static int[] createArray(int size)
	{
		Scanner sc= new Scanner(System.in);
		//System.out.println("enter the size of  the Array");
		// size = sc.nextInt();
		int a[] = new int[size];
		for(int i=0;i<a.length;i++) {
	
			
			a[i] = sc.nextInt();
			System.out.println(a[i]);
			
		}
		return a;
	
	}

}

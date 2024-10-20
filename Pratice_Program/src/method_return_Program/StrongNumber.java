package method_return_Program;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
//		int a = n;
		if (findSum(n) == n) {
			System.out.println(n + "is a strong number");
		} else {
			System.out.println(n + "is not a strong number");
		}

	}

	public static int findSum(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + findFactorial(rem);
		n=n/10;	
		}
		System.out.println("sum==" + sum);
		return sum;
	}

	public static int findFactorial(int rem) {
		int fact = 1;
		for (int i = 1; i <= rem; i++) {
			fact = fact * i;
		}
		System.out.println("fact " + fact);
		return fact;
	}
}

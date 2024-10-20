package method1;

public class PalindromNumber {

	public static void main(String[] args) {

		int count=0;
		for (int i = 10; i <= 100; i++) {
			int j = i;
			int n = palindrom(i);
			if (n == j) {
				count=count+1;
				System.out.println("palindrom " + n);
				System.out.println(" count of the palindrom number "+count);
			}
		}

	}

	public static int palindrom(int n) {
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		return rev;
	}
}

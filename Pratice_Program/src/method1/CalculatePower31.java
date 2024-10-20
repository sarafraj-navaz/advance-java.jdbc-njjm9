package method1;

public class CalculatePower31 {
//31.WAP TO CALCULATE POWER OF A NUMBER.->IN CLASS
	public static void main(String[] args) {

		for (int i = 12345; i <= 12345; i++) {
			int n = factor(i);
			System.out.println("rememder  " + n);

		}
	}

	public static int factor(int n) {

		int rem = 0;
		int power = 1;
		while (n > 0) {
			rem = n % 10;
			if (rem % 2 == 0) {

				power = rem * rem;
				System.out.println(rem + "  power===" + power);
			}

			n = n / 10;
		}
		return rem;
	}

}

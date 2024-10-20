package Exercise;

public class Program22 {
//22.WAP TO CALCULATE SUM OF ODD DIGITS IN A NUMBER.
	public static void main(String[] args) {
		int n=12345;
		int rem=0;
		int sum=0;
		while(n>0)
		{
			rem=n%10;
			System.out.println("rem"+rem);
			int n1=rem;
			if(n1%2!=0)
			{
				System.out.println("factor of odd"+n1);
				sum=sum+n1;
				System.out.println("sum of the odd number  "+sum);
				
			}
			n=n/10;
		}
		System.out.println("sum of the odd number  "+sum);

	}

}

package Exercise;

public class Program20SumOfDigit {
//20.WAP TO CALCULATE SUM OF ALL DIGITS IN A NUMBER.
	public static void main(String[] args) {
		for(int i=1234;i<1235;i++)
		{
			int n=i;
			int rem=0;
			int sum=0;
			while(n>0)
			{
				rem=n%10;
				System.out.println(" rem "+rem);
				sum=sum+rem;
				System.out.println("sum of the digit "+sum);
				n=n/10;
			}
		System.err.println(" sum of  the digit of  the number"+sum);	
		}
		

	}

}

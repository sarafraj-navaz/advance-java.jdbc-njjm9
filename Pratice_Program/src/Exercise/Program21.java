package Exercise;

public class Program21 {
//21.WAP TO CALCULATE SUM OF EVEN DIGITS IN A NUMBER.
	public static void main(String[] args) {
     
		int n=1234;
		int rem=0;
		int sum=0;
		while(n>0)
		{
			rem=n%10;
			System.out.println(rem);
			int n1=rem;
			if(n1%2==0)
			{
				sum=sum+n1;
				System.out.println("sum of the even number  "+n1);
			}
			n=n/10;
		}
	System.out.println("sum "+sum);	
	}

}

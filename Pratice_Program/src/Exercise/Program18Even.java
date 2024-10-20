package Exercise;

public class Program18Even {
//18.WAP TO PRINT EVEN DIGITS IN A NUMBER.
	public static void main(String[] args) {

		for(int i=1234;i<1235;i++)
		{
			int  n=i;
			int rem=0;
			int sum=0;
			while(n>0)
			{
				rem=n%10;
				//System.out.println(rem);
				int n1=rem;
				if(n1%2==0)
				{
					System.err.println("even number   "+n1);
					sum=sum+n1;
					System.err.println("sum  of the  number   "+sum);
					
				}
				n=n/10;
			}
			System.err.println("sum even      "+sum);	
			
		}
	}

}

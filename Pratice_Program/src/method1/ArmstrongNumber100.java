package method1;

public class ArmstrongNumber100 {

	public static void main(String[] args) {
		
		for(int i=153;i<=10000;i++)
		{
			int n=i;
			int x=countDigit(n);
		//	System.out.println(" count digit "+x);
			int sum=0;
			
			while(n>0)
			{
				int rem=n%10;
				sum=sum+powerNumber(rem,x);
			//	System.out.println(" of  the power  "+sum);
				
				n=n/10;
			}
		//System.out.println(" total sum  "+sum);	
		if(i==sum)	
		{
			System.err.println("Armstrong number"+sum);
		}
		}
	}

	public static int countDigit(int n)
	{
		int count=0;
		while(n>0)
		{
			count=count+1;
			n=n/10;
		}
	return count;	
	}
	public static int powerNumber(int rem,int count)
	{
		int power=1;
		for(int i=1;i<=count;i++)
		{
			power=power*rem;
		}
	return power;	
	}
}

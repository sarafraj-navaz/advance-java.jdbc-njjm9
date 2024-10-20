package method1;

public class StrongNumber1 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=1000000;i++)
		{
			int a=i;
			int n=StrongNumber1.findFactorial(i);
			//System.err.println(" factorial "+n);
			
			if(a==n)
			{
				System.out.println("strongNumber   "+n);
			}
		}
		
	}
	public static  int findFactorial(int n)
	{
		//System.err.println(n);
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
		sum=sum+fact;	
		n=n/10;
		}
	//System.out.println("sum of the all factorial "+sum);
	return sum;
	}
}

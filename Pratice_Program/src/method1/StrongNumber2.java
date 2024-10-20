package method1;

public class StrongNumber2 {

	public static void main(String[] args) {
		for(int i=1;i<=100000;i++)
		{
			int a=i;
			int check=strongNumber(i);
			//System.out.println("total number  "+check);
			if(check==a)
			{
				System.out.println(" strong number "+check);
			}
		}
	}	
	

	public static int strongNumber(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
		    sum=sum+factorial(rem);
			//System.out.println("sum of the factorial   "+sum);
			n=n/10;
		}
		return sum;
	}
	public static int factorial(int rem)
	{
		int fact=1;
		for(int i=1;i<=rem;i++)
		{
			fact=fact*i;
		}
		//System.out.println(" factorial of the number  "+fact);
		return fact;
	}
}

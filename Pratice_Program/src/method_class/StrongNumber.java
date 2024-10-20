package method_class;

public class StrongNumber {

	public static void main(String[] args) {
		int n=145;
		int check=sum(n);
		System.out.println("sum"+check);
		if(check==n)
		{
			System.out.println("strong number"+check);
		}
		else
		{
			System.out.println("not strong number"+check);
		}

	}
	public static int sum(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+fact(rem);
			n=n/10;
		}
	return sum;	
	}
	public static int fact(int rem)
	{
		int fact=1;
		for(int i=1;i<=rem;i++)
		{
			fact=fact*i;
		}
		System.out.println("fact"+fact);
	return  fact;	
	}

}

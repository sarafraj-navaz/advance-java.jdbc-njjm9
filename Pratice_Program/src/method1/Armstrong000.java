package method1;

public class Armstrong000 {

	public static void main(String[] args) {
		int n=153;
		int count1=count(n);
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+digitPower(rem,count1);
			n=n/10;
		}
		System.out.println("sum of "+sum);
		
		

	}
	public static int count(int n)
	{
		int count=0;
		while(n>0)
		{
			count=count+1;
			n=n/10;
		}
		System.out.println("count "+count);
	return count;	
	}
	public static int digitPower(int rem,int count1)
	{
		int power=1;
		for(int i=1;i<=count1;i++)
		{
			power=power*rem;
		}
		System.out.println("power"+power);
	return power;	
	}

}

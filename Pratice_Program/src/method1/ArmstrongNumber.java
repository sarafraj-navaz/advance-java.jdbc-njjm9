package method1;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
	
     for(int n=1;n<=10000;n++)
     {
 		
 		int p=n;
 		int a=n;
 		int sum=0;
 		int x=count(n);
 		//System.out.println(" count of the number "+x);
 		while(p>0)
 		{
 			int rem=p%10;
 			sum=sum+powerFind(rem,x);
 			//System.out.println(" sum of the power "+sum);
 			p=p/10;
 		}
 		if(sum==a)
 		{
 			System.out.println("armstrong number"+sum);
 		}
     }
	}
	public static int count(int n)
	{
		int  count=0;
		while(n>0)
		{
			count=count+1;
			n=n/10;
		}
		//System.out.println(" count==="+count);
		return count;
	}
	public static int powerFind(int rem1,int power1)
	{
		int power=1;
		for(int i=1;i<=power1;i++)
		{
			power=power*rem1;
		}
		//System.out.println("power "+power);
		return power; 
	}

}

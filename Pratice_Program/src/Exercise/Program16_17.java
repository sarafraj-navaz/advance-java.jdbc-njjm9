package Exercise;

public class Program16_17 {
//15.WAP TO PRINT SUM OF EVEN NO B/W 20 TO 10.
	//16.WAP TO PRINT SUM OF ODD NO B/W 35 TO 11.

	public static void main(String[] args) {
		int sum=0;
		int sum1=0;
		for(int i=20;i>=10;i--)
		{
			if(i%2==0)
			{
				sum=sum+i;
				System.out.println(i);
				System.out.println(" sum of the even number   "+sum);
			}
		}
		System.out.println(" sum of the even number   "+sum);
		
		System.err.println("Program 17");
		for(int j=35;j>=11;j--)
		{
			if(j%2!=0)
			{
				sum1=sum1+j;
				System.out.println(j);
				System.out.println(" sum of the even number   "+sum1);
			}
		}
       System.err.println("sum of the odd number  "+sum1);
	}

}

package Exercise;

public class Program13 {
//13.WAP TO CALCULATE SUM OF EVEN NO B/W 1 TO 10 WITH TRACING.
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				System.out.println(i);
				System.err.println("sum of even number  "+sum);
			}
		}
		System.out.println("sum of even number  "+sum);

	}

}

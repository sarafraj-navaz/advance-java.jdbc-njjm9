package Exercise;

public class Program14 {
//14.WAPT PRINT SUM OF ODD NO B/W 1 TO 10 WITH TRACING.
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
				System.out.println(i);
				System.err.println("sum of the odd number "+sum);
						
			}
		}
       System.out.println("sum of the odd number  "+sum);
	}

}

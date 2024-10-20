package method1;

public class PrimeNumber {

	public static void main(String[] args) {
			int count=0;
			for(int i=1;i<=7;i++)
			{
			
				int n=i;
				int check=number(i);
				if(check==0)
				{
					System.out.println("prime number "+n);
					count=count+1;
				System.out.println("count prime number"+count );
					//System.err.println("     count prime number "+count);
				}
				
			}
		}
		
		public static int  number(int n)
		{
			int c=0;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					c=c+1;
				}
			}
		return c;	
		}

	

}

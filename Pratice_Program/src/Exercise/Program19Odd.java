package Exercise;

public class Program19Odd {
//	19.WAP TO PRINT ODD DIGITS IN A NUMBER.
	public static void main(String[] args) {
		for(int i=13;i<14;i++)
		{
			int n=i;
			int  rem=0;
			while(n>0)
			{
				rem=n%10;
				//System.out.println(rem);
				int n1=rem;
				if(n1%2!=0)
				{
					System.out.println("odd number in the  number "+n1);
				}
				n=n/10;
			}
		}

	}

}

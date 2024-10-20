package Exercise;

public class Program26 {
//26.WAP TO COUNT EVEN DIGITS IN A NUMBER.
	public static void main(String[] args) {
		int  n=123456;
		int rem=0;
		int count=0;
		while(n>0)
		{
			rem=n%10;
			//System.out.println(rem);
			int n1=rem;
			if(n1%2==0)
			{
				System.out.println("even number "+n1);
				count=count+1;
			}
			n=n/10;
		}
	System.out.println("count even number in the  number"+count);	
	}

}

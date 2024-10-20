package Exercise;

public class Program27 {
//27.WAP TO COUNT ODD DIGITS IN A NUMBER.
	public static void main(String[] args) {
		int  n=1234567;
		int rem=0;
		int count=0;
		while(n>0)
		{
			rem=n%10;
			System.out.println("rem "+rem);
			int n1=rem;
			if(n1%2!=0)
			{
				count=count+1;
				System.out.println(" odd number"+n1);
			}
			n=n/10;
		}
	System.out.println("count odd number in this number "+count);	

	}

}

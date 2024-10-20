package Exercise;

public class Program30 {
//30.WAP TO PRINT PALINDROME NUMBER B/W 10 TO 200.
	public static void main(String[] args) {
		for(int i=10;i<=200;i++)
		{
			int  n=i;
			int a=i;
			int rem=0;
			int rev=0;
			while(n>0)
			{
				rem=n%10;
				rev=rev*10+rem;
				//System.out.println(rem);
				n=n/10;
			}
		//System.out.println("reverse  of the number "+rev);	
		if(a==rev)
		{
			System.out.println("palindrom number  "+rev);
		}
//		else
//		{
//			System.out.println("not palindrom number  "+rev);
//		}
		}

	}

}

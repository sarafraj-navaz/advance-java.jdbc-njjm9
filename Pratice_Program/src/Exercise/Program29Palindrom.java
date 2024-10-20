package Exercise;

public class Program29Palindrom {
//29.WAP TO CHECK WHETHER THE NUMBER IS PALINDROME OR NOT.->IN CLASS
	public static void main(String[] args) {
	for(int i=121;i<122;i++)
	{
		int n=i;
		int a=n;
		int rem=0;
		int rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			//System.out.println(rem);
			n=n/10;
		}
	//System.out.println("reverse "+rev);	
	if(a==rev)
	{
		System.err.println("palindrom number  "+rev);
	}
	else
	{
		System.out.println("not  palindrom number "+rev);
	}
	}
  }	

}

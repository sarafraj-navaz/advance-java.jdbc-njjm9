package Exercise;

public class Program28 {
//28.WAP TO REVERSE THE NUMBER.->IN CLASS
	public static void main(String[] args) {
		int n=123;
		System.out.println("Number "+n);
		System.err.println("Number "+n);
		int rem=0;
		int rev=0;
		while(n>0)
		{
			rem=n%10;
			System.out.println("rem"+rem);
			rev=rev*10+rem;
			n=n/10;
		}
    System.out.println("reverse number of the  number "+rev);
	}

}

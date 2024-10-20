package Exercise;

public class Program25 {
//25.WAP TO COUNT HOW MANY DIGITS ARE PRESENT IN A NUMBER.->IN CLASS
	public static void main(String[] args) {
		int n=12345;
		int count=0;
		while(n>0)
		{
			count=count+1;
			n=n/10;
		}
		System.err.println(count+"  Digit  is present in the number");
		

	}

}

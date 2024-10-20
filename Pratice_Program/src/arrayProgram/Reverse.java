package arrayProgram;

public class Reverse {

	public static void main(String[] args) {


		int  n=12345;
	    int  rev =0;
	    
		while(n>0) {
			int rem = n%10;
			System.out.println(rem);
			rev=rev*10+rem;
			System.out.println(rev);
			n=n/10;
		}

	}

}

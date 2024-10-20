package Exercise;

public class Program17ReverseNumber {
	//17.WAP TO PRINT EACH DIGIT IN A NUMBER(IN REVERSE ORDER).->IN CLASS
		public static void main(String[] args) {

			for(int i=10;i<=100;i++)
			{
				int n=i;
				int  rem=0;
				int rev=0;
				while(n>0)
				{
					rem=n%10;
					rev=rev*10+rem;
					n=n/10;
				}
				System.out.println("Reverse "+rev);
			}
		}

}

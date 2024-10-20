package pattern_class;

public class pattern15 {

	public static void main(String[] args)throws InterruptedException {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= i; c++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		starPattern();

	}
	public static void starPattern() throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++)
			{
				Thread.sleep(2000);
				System.out.print("@");
			}
		System.out.println("");	
		}
	}

}

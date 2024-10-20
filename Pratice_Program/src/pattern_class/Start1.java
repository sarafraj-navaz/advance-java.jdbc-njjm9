package pattern_class;

public class Start1 {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				Thread.sleep(100);
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++)
			{
				Thread.sleep(300);
				System.out.print("@");
			}
		System.out.println("");	
		}

	}

}

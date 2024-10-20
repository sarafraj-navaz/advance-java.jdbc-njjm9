package pattern_class;

public class Program13 {

	public static void main(String[] args) {
			
			for(int i=0;i<5;i++)
			{
				for(int j=5;j>i;j--)
				{
					System.out.print(" ");
				}
				int number=1;
				for(int k=0;k<=i;k++)
				{
					System.out.print(number+" ");
					number=number*(i-k)/(k+1);
				}
			System.out.println();	
			}
				

		}

	}

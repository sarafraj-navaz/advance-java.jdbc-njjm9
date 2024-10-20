package pattternProblem;

public class PatternX {
	
	public static void main(String[] args) {
	
		
		patternX();
		System.out.println("==============");
		patternOdd();
	}
	public static void patternX()
	{
		int size=6;
		for(int i=1;i<size;i++)
		{
			for(int j=1;j<size;j++)
			{
				if(i==j || i+j==size)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
		System.out.println("");	
		}
	}
	
	public static void patternOdd()
	{
		/*
		 * when size of the matrix limit  odd 
		 * then in the middle two star together will come
		 */
		
		int size=7;
		for(int i=1;i<size;i++)
		{
			for(int j=1;j<size;j++)
			{
				if(i==j || i+j==size)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
		System.out.println("");	
		}
	}
	

}

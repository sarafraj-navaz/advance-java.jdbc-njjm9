package arrayProgram;

public class Program88 {

	public static void main(String[] args) {
		
		int a[]  = {1,2,3,4,6,7};
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
		

	}

}

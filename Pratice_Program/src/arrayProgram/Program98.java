package arrayProgram;

public class Program98 {

	public static void main(String[] args) {
		int arr[] =  {10,20,30,40};
		int rev[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			rev[i]  = arr[(arr.length-1)-i];
			System.out.println(rev[i]);
		}

	}

}

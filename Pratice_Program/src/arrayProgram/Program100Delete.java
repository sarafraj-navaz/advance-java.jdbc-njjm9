package arrayProgram;

public class Program100Delete {

	public static void main(String[] args) {
		
		int arr[]  = {10,20,30,40};
		int temp [] =new  int[arr.length-1];

		for(int i=0;i<temp.length;i++)
		{
			if(i<2) {
				temp[i]=arr[i];
			}
			else {
				temp[i]=arr[i+1];
				
			}
			System.out.println(temp[i]);
		}
	}

}

package arrayProgram;

public class Program97 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40};
		
		int temp[] =  new int[arr.length];
		
		for(int  i=0;i<temp.length;i++) {
			
			temp[i]=arr[i];
			System.err.println(temp[i]);
		}

	}

}

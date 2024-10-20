package arrayProgram;

public class Program99InsertValues {

	public static void main(String[] args) {
		
		int arr[] =  {10,20,40,50};
		int temp[] = new int[arr.length+1];
		
		for(int i=0;i<temp.length;i++)
		{
			if(i<2) {
				temp[i]=arr[i];
			}
			else if(i==2) {
				temp[i]= 30;
			}
			else {
				temp[i] =arr[i-1];
				
			}
			System.out.println(temp[i]);
			
		}
		

	}

}

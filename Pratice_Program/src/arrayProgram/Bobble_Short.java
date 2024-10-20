package arrayProgram;

public class Bobble_Short {

	public static void main(String[] args) {
		
		int arr[] = {36,19,12,5,8,3,6,9,5};
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]<arr[j+1])
				{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}

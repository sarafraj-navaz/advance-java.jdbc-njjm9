package arrayProgram;

public class Porgram87 {

	public static void main(String[] args) {
		int sum=0;
		int count =0;
		int a[] = {20,30,30,40};
		
		for(int i:a) {
			count=count+1;
			sum=sum+i;
			System.out.println(i);
			System.out.println("sum of the number"+sum);
		}
		System.err.println("length of the  array"+count);
	}

}

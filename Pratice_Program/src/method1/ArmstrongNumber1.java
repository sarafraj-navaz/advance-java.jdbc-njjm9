package method1;

public class ArmstrongNumber1 {

	public static void main(String[] args) {
		int n=153;
		int a=n;
		int count1=countNumber(n);
		System.out.println(count1);
		int rem1=rem1(a);
		System.out.println(rem1);
	}

	
	public static int countNumber(int n)
	{
		int count =0;
		while(n>0)
		{
			count=count+1;
			n=n/10;
		}
	return	count;
	}
  public static int rem1(int n) {
	  int rem=0;
	  while(n>0)
	  {
		 rem=n%10;
		 n=n%10;
	  }
	  System.out.println("remender"+rem);
	 return rem; 
  }
	  
  }



package Constructor;

public class CopyConstructorDriver {

	public static void main(String[] args) throws InterruptedException { 

		CopyConstructor copydata =new CopyConstructor();
		copydata.display();
		
		System.err.println("second Constructor===================");
		CopyConstructor  copydata1 = new CopyConstructor("raj",22,200000);
		
		copydata1.display();
		 Thread.sleep(2000);

		System.out.println("===================Copy Constructor method =========================");
		
		CopyConstructor  copydata2 = new CopyConstructor(copydata1);
		copydata2.display();
		
		
	}

}

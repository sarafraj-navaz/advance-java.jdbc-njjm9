package Constructor;

public class BrowserDriver {

	public static void main(String[] args) {
		
		System.out.println("main method ");
		
		Browser b1= new Browser("GoogleBrowser",6,"Google");
		b1.displayBrowser();
		Browser b2= new Browser("firebox",8,"Apply");
		b2.displayBrowser();
		

	}

}

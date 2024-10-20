package Constructor;

public class Browser {
	String name;
	int version;
	String companyName;
	static int count=0;
	//int count=0;

	public Browser(String name,int version,String companyName) {
		
		
		this.name=name;
		this.version=version;
		this.companyName=companyName;
		count=count+1;
		System.err.println(" count  object "+count);
		
	}
	public void displayBrowser()
	{
		System.out.println("name of the browser "+name);
		System.out.println("version of the browser  "+version);
		System.out.println("companyName of the browser "+companyName);
		
	}

}

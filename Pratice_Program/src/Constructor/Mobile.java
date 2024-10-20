package Constructor;

public class Mobile {
	
	String name;
	int price;
	String companyName;
	String generation;

	
	public Mobile(String name,int price,String companyName,String generation)
	{
		this.name=name;
		this.price=price;
		this.companyName=companyName;
		this.generation=generation;
	}
	public void displayMobile()
	{
		System.out.println("name =="+name);
		System.out.println("price==="+price);
		System.out.println("company====="+companyName);
		System.out.println("generation===="+generation);
	}

}

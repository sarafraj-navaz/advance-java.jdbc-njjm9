package Constructor;

public class Moblie {
	
	String name;
	int price;
	String companyName;
	int generation;

	
	public Moblie(String name,int price,String companyName,int generation)
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

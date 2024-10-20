package Constructor;

public class Laptop {
	
	String name;
	int processor;
	int price;
	double weight;
	
	public Laptop(String name,int processor,int price,double weight) {
		
		this.name=name;
		this.processor=processor;
		this.price=price;
		this.weight=weight;
		
	}
	public void displayLaptop()
	{
		System.out.println("name= "+name);
		System.out.println("processor ="+processor);
		System.out.println("price====  "+price);
		System.out.println("weight===="+weight);
	}

}

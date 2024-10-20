package has_A_relationship;

public class CarComposition {
	String name;
	String colour;
	int price;
	EngineComposition e =  new EngineComposition("Acer",2,60);
	
	CarComposition()
	{
		
	}
	CarComposition(String  name,String colour,int price)
	{
		this.name=name;
		this.colour=colour;
		this.price=price;
		
	}
	public void displayCar()
	{
		System.out.println("Car name "+name);
		System.out.println("Car colour is "+colour);
		System.out.println("Car price is  "+price);
		e.displayEngine();
		
	}

}

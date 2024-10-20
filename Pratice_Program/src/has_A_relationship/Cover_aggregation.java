package has_A_relationship;

public class Cover_aggregation {

	String name;
	String colour;
	double price;
	
	Cover_aggregation()
	{
		
	}
	Cover_aggregation(String name,String colour,double price)
	{
		this.name=name;
		this.colour=colour;
		this.price=price;
	}
	public void displayCover()
	{
		System.out.println("Cover name "+name);
		System.out.println("cover colur "+colour);
		System.out.println(" cover price"+price);
	}
}

package Constructor;
public class Fruit {
	String name;
	int price;
	double weight;

	Fruit(String n,int p,double w)
	{
		name=n;
		price=p;
		weight=w;
		System.out.println("Name  "+name);
		System.out.println("price  "+price);
		System.out.println("weight   "+weight);
	}
	public static void main(String[] args) {
		
		System.out.println("this is main method");
		Fruit f1=new Fruit("Apple",12,15.4);
	}

}

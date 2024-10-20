package has_A_relationship;

public class CarDriverComposition {
	
	public static void main(String[] args) {
		
		CarComposition c1 = new CarComposition("BMW","blue",23444444);
		System.out.println("Address of the Car Composition blue print"+c1);
		 
		System.out.println("Address of the Engine "+c1.e);
		System.out.println("Detail  of the  CAr"+c1);
		c1.displayCar();
		c1=null;
		System.out.println("after initialization oject  is null  then  object  is currently point to null");
		c1.displayCar();
	}

}

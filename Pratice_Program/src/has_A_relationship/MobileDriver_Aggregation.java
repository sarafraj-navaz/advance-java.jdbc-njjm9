package has_A_relationship;

public class MobileDriver_Aggregation {

	public static void main(String[] args) {
		
		System.out.println("this is main method");
		
		Cover_aggregation c2 = new Cover_aggregation("Weste","blue",150.0);
		
		Mobile_Aggregation_relationship m1  =  new Mobile_Aggregation_relationship("Realmi","4G",20000.0);
		c2.displayCover();
		
		Mobile_Aggregation_relationship m2 = new Mobile_Aggregation_relationship("Vivo","5G",23000.0, new Cover_aggregation());
		m2.displayMobile();

	}

}

package collection;

import java.util.ArrayList;
import java.util.List;

public class Program15 {

	public static void main(String[] args) {
		List c1=new ArrayList();
		c1.add(81);
		c1.add(45);
		c1.add(5);
		c1.add(45);
		c1.add(35);
		
		System.out.println(c1);
		c1.remove(2);
		System.out.println(c1);
		
	}
}

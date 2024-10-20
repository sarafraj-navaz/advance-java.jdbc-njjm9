package collection;

import java.util.ArrayList;
import java.util.List;

public class Program12 {

	public static void main(String[] args) {
		List<Integer> c1=new ArrayList<Integer>();
		
		c1.add(56);
		c1.add(88);
		c1.add(61);
		c1.add(77);
		c1.add(90);
		c1.add(67);
		c1.add(null);
		c1.add(null);
		c1.add(1, 34);
		System.out.println(c1);
		System.out.println(c1.get(2));
	}

}

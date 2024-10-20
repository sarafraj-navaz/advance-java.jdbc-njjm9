package collection;

import java.util.ArrayList;
import java.util.List;

public class Program14 {

	public static void main(String[] args) {
		List<Integer> c1=new ArrayList<Integer>();
		c1.add(56);
		c1.add(88);
		c1.add(61);
		c1.add(77);
		c1.add(90);
		c1.add(67);
		List c2=new ArrayList();
		c2.add(547);
		c2.add(568);
		c2.add(61);
		c2.addAll(1, c1);
		System.out.println(c2);
		
		
	}

}

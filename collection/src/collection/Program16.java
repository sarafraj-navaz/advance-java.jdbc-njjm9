package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Program16 {

	public static void main(String[] args) {
		List c1=new ArrayList();
		c1.add(81);
		c1.add(45);
		c1.add(2);
		c1.add(45);
		c1.add(35);
		
		ListIterator it=c1.listIterator();
		
		System.out.println(it.next());
		System.out.println(it.hasPrevious());
		System.out.println(it.previous());
		
		
		
	}
}

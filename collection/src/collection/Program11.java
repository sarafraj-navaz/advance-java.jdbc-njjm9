package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program11 {

	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<Integer>();
		c1.add(56);
		c1.add(88);
		c1.add(61);
		c1.add(77);
		c1.add(90);
		
		Iterator<Integer> itr=c1.iterator();
		System.out.println("All ELements===================");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Even Elements===================");
		while(itr.hasNext())
		{
			if(itr.next()%2==0)
			{
				System.out.println(itr.next());
			}
		}
	}

}

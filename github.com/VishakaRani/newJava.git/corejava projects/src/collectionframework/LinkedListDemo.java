package collectionframework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public LinkedListDemo() {
		// TODO Auto-generated constructor stub
		LinkedList l1=new LinkedList();
		l1.add(new Integer(10));
		l1.add(new Integer(20));
		l1.add(new Integer(30));
		l1.addFirst(new Integer(5));
		l1.add(2,new Integer(40));
		l1.addLast(60);
		l1.addFirst(70);
		l1.remove();
		l1.remove();
		l1.remove(3);
		Iterator i=l1.iterator();
		while(i.hasNext())
		{
			Integer obj=(Integer) i.next();
			System.out.println(obj);
		}
	}

}

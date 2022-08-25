package collectionframework;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
		// TODO Auto-generated constructor stub
		public static void main(String args[]) 
		{
		Stack obj=new Stack();
		obj.push(new Integer(10));
		obj.push(new Integer(20));
		obj.push(new Integer(30));
		obj.push(new Integer(40));
		obj.pop();
		Iterator i=obj.iterator();
		while(i.hasNext())
		{
			Integer i1=(Integer) i.next();
			System.out.println(obj);
		}
	}
	}

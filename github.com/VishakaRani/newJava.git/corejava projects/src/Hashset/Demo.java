package Hashset;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		TreeSet<String> hs=new TreeSet<String>();
		hs.add("Hash");
		hs.add("Set");
		hs.add("Demo");
		hs.add("Demo");
		// TODO Auto-generated constructor stub
		Iterator i=hs.iterator();
			while(i.hasNext())
			{
				Object o=i.next();
				System.out.println(o);
			}
	}

}

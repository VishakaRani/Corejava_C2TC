package Array;

public class c {public static void main(String[]args)
	{
	StringBuffer sb=new StringBuffer();
	
	System.out.println("Length "+sb.length());
	System.out.println("Capacity "+sb.capacity());
	
	
	StringBuffer sb1=new StringBuffer("India");
	System.out.println(sb1);
	System.out.println(sb1.reverse());
	
	StringBuffer sb2=new StringBuffer("Java Programming");
	System.out.println(sb2);
	sb2.replace(0, 4, "c");
	System.out.println(sb2);
	}
	

}

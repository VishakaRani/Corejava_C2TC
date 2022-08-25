package collectionframework;
import java.util.ArrayList;
class Student{
}
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		Student s1=new Student();
		//adding elements into array list
		Integer i=new Integer(10);
		al1.add(i);
		al1.add(new String ("vishaka"));
		al1.add("vish");
		al1.add(s1);
		System.out.println(al1);
		
		
	}

}

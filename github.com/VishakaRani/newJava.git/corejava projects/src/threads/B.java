package threads;

public class B {
	public static void main(String[]args)
	{
		A t1=new A(5000,"First");
		A t2=new A(3000,"second");
		
		t1.start();
		t2.start();
		
		try
		{
			t1.join();
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}

}

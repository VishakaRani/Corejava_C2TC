package EH;

public class ExceptionHandaling2 {
	package ExceptionalHandling;
	import java.io.IOException;
	import Exception_Handling.ExceptionHandlingDemo2;
	public class ExceptionHandlingDemo3 {
		void m()throws IOException
		{
		throw new IOException("device error");//checked exception
		}
		void n()throws IOException
		{
		m();
		}
		void p()
		{
		try
		{
		n();
		}
		catch(Exception e){System.out.println("exception handled");}
		}
		public static void main(String args[])
		{
	  ExceptionHandlingDemo2 obj=new ExceptionHandlingDemo2();
		obj.p();
		System.out.println("normal flow...");
		}
	}

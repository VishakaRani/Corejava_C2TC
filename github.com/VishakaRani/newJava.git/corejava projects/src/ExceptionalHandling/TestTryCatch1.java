package ExceptionalHandling;

public class TestTryCatch1 {

	//package ExceptionalHandling;

	public class Testtrycatch1 {

		public static void main(String[] args) {
			try
			{
				int data=50/0;
			}
	catch(ArithmeticException ae)
			{
		System.out.println(ae);
			}
			System.out.println("rest of the code...");
		}

	}
}

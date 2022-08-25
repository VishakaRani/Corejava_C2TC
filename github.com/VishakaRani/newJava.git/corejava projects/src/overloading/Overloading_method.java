

public class Overloading_method {
	package overloading;
	
		//void sum(int a, int b)
		{
		System.out.println("Sum of two integers:"+(a+b));
		
		void sum(int a, int b,int c)
		{
		System.out.println("Sum of three integers:"+(a+b+c));
		}
		void sum(double a, double b)
		{
		System.out.println("Sum of two decimals:"+(a+b));
		}
		public static void main(String[] args) {
		Overloading_method O1=new Overloading_method();
		O1.sum(20,30);
		O1.sum(10,20,40);
		O1.sum(10.5,10.5);
		}
	}


package overloading;

public class Overloading_constructor {

	
	
		Overloading_constructor(int a, int b)
		{
		System.out.println("Sum of two integers:"+(a+b));
		}
		Overloading_constructor(int a, int b,int c)
		{
		System.out.println("Sum of three integers:"+(a+b+c));
		}
		Overloading_constructor(double a, double b)
		{
		System.out.println("Sum of two decimals:"+(a+b));
		}
		public static void main(String[] args)
		{
		Overloading_constructor O1=new Overloading_constructor(20,30);
		Overloading_constructor O2=new Overloading_constructor(10,20,40);
		Overloading_constructor O3=new Overloading_constructor(10.5,10.5);
		}
	}

}

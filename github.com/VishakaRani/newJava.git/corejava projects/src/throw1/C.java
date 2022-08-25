package throw1;

import java.util.Scanner;
public class C {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter student id");
		int id=sc.nextInt();
		
		if(id>100)
		{
			System.out.println("student found");
		}
		else
		{
			try
			{
				throw new B(id);
			}
			catch(Exception e)
			{
				System.out.println("student not found");
			}
		}
	}

}

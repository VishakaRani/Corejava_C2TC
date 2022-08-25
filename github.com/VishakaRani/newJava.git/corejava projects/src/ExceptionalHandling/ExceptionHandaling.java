package EH;

public class ExceptionHandaling {

	package ExceptionalHandling;
	import java.util.Scanner;
	public class ExceptionHandaling
	{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);	
			System.out.println("Enter student id: ");
			int id=sc.nextInt();
			if(id>100)
			{
				System.out.println("Student found");
			}
			else
			{
				try
				{
					throw new ClassNotFoundException();
				}
				catch(ClassNotFoundException se)
				{
					System.out.println(se);	
					System.out.println(se.getMessage());
				}
			}
		}
	}

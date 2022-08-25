package threads;

public class A extends Thread 
{
	int st;
	String message;
	
	public A(int st,String message) {
		this.st = st;
		this.message = message;
	}
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				Thread.sleep(st);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(message + i);
			}
		}
		
	}



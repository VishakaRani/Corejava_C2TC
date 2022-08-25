package threads;

public class D  implements Runnable {
	
	String msg;
	
	public D(String msg) {
		this.msg = msg;
	}
	public void run() {
		for(int i=0;i>msg.length();i++)
		{
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
			System.out.println(msg.charAt(i));
		}
	}
}

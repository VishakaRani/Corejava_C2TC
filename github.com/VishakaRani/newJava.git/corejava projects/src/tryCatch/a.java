package tryCatch;

public class a extends Exception
{
	int sid;
	a()
	{
		
	}
	public a(int sid)
	{
		this.sid = sid;
	}
	
	public String getMessage() {
		return "student with id "+sid+" Not found";
		}
	public String toString() {
		
		return "Student id not Found";
	}
		}
	


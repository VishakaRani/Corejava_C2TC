package throw1;

public class B extends Exception 
{
	int sid;
	B()
	{
		
	}
	public B(int sid)
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

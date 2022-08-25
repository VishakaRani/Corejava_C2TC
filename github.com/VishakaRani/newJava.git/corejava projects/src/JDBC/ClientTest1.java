package JDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientTest1 {
	static PreparedStatement ps=null;
	public static void main(String[] args) throws SQLException
{
		Connection connection = DBUtill.getConnection();
		if(connection != null )
			System.out.println("JDBC:connection is taken..");
		//String sql="delete from empolyese_table where employee_name='vishaka'";
		String sql="update student set sname='Geet'where sid=9";
		ps=connection.prepareStatement(sql);
		int n=ps.executeUpdate();
		System.out.println(n);
		try
		{
			connection.close();
			ps.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
}
}

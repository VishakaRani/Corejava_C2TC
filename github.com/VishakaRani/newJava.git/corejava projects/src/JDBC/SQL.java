package JDBC;
import java.sql.SQLException;
import java.sql.ResultSet;
public class SQL {
	void getStudent() throws SQLException
	{
		String sql="select * from student";
		Object st;
		ResultSet rs=((Object) st).executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getDate(4));
		}
	}
	void updateStudent() throws SQLException
	{
		String sql="update student set branch='cs' where sid=103 ";
		Object st;
		int b=((Object) st).executeUpdate(sql);
		//System.out.println(b);
		
			System.out.println(b+"  row affected");
	}
	void deleteStudent() throws SQLException
	{
		String sql="delete from student where sid=102";
		Object st;
		int i=((Object) st).executeUpdate(sql);
		System.out.println(i+"  row affected");
	}
	public void closeSession()
	{
		try { 
			  ResultSet connection = null;
			connection.close(); 
			  ResultSet st = null;
			st.close();
			  } 
		  catch(Exception e) {
		  System.out.println(e); }  
	}
}

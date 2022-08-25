package JDBC;

import java.util.Properties;

public class DBUtill {
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="admin";
	private static final String DB_URL ="jdbc:mysql://localhost:3306/ait_db";
	
	private static Connection connection = null;
	private static Properties properties=null;
	static {
		try {
			Class.forName(DB_DRIVER_CLASS);
			properties=new Properties();
			properties.put("user", DB_USERNAME);
			properties.put("password", DB_PASSWORD);
connection = DriverManager.getConnection(DB_URL,properties);
		}
		catch (ClassNotFoundException | SQL Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return connection;
	}

}

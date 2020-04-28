package cartest.util;
import java.sql.Connection;

public class DBUtil {
	private static final String jdbcUrl="jdbc:oracle:thin:@localhost:1521:ORCL";
	private static final String dbUser="c##lynx";
	private static final String dbPwd="123456";
	static{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws java.sql.SQLException{
		return java.sql.DriverManager.getConnection(jdbcUrl, dbUser, dbPwd);
	}
}

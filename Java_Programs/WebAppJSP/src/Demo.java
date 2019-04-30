import java.sql.*;
/*
 * import package
 * load and registre the driver-->com.mysql.jdbc.driver
 * create connection--
 * create statement--
 * execute query--
 * process result
 * close
 */

public class Demo 
{
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/data";
		String uname = "root";
		String pass = "root";
		String query = "select name from student where id = 2";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
		rs.next();
		String n = rs.getString("name");
		System.out.println(n);
		
		st.close();
		rs.close();
	}
}

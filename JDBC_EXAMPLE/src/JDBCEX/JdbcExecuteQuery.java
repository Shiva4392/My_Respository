package JDBCEX;

import java.sql.*;

import oracle.jdbc.OracleDriver;
public class JdbcExecuteQuery {

	public static void main(String[] args) throws SQLException {
		OracleDriver driver=new OracleDriver();
		DriverManager.registerDriver(driver);
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
		
		//System.out.println(connection);
		
		String query="select * from employees";
		
		Statement st=connection.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		System.out.println("___________TABLE INFO_________");
		System.out.println("EMPLOYEE_ID"+" "+"FIRST_NAME"+" "+"LAST_NAME"+" "+"HIRE_DATE");
		System.out.println("______________________________");
		
		
		while(rs.next()){
			//int employee_id=rs.getInt("employee_id");
			//String first_name=rs.getNString("first_name");
			//String last_name=rs.getNString("last_name");
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDate(6)
			);
		}
		
	}

}

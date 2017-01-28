package JDBCEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class JdbcUpdate {

	public static void main(String[] args) throws SQLException {
		OracleDriver driver=new OracleDriver();
		DriverManager.registerDriver(driver);
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
		
		//System.out.println(connection);
		Statement st=connection.createStatement();
		
		String query="insert into employees (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL_ID,HIRE_DATE,JOB_ID) values(001,'Siva','Prakash','sivaprakasheie@gmail.com','10-MAR-17','AD_VP')";
				
		int i=st.executeUpdate(query);
		if(i!=0){System.out.println("UPDATED");}
		else{System.out.println("NOT UPDATED");}
		
	}

}

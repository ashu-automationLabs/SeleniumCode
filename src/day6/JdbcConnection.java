package day6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;

public class JdbcConnection {

 public static String dbconnection(String Query,String Colomn) throws SQLException {
	    //1.Configuration of your DB
	 	MysqlDataSource datasource = new MysqlDataSource();
	    datasource.setDatabaseName("employee");
	    datasource.setUseSSL(false);
	    datasource.setPortNumber(3306);
	    datasource.setUser("root");
	    datasource.setPassword("Ashu@oct@31");
	    datasource.setServerName("localhost");
	    //2. Forming connection
	    Connection con= datasource.getConnection();
	    //3.To create Statement and Query
	    Statement stat=con.createStatement();
	    ResultSet rs= stat.executeQuery(Query);
	    String x= null;
	    while(rs.next()) {
	    	x=rs.getString(Colomn);
	    	System.out.println(x);
	    	
	    }
	  return x;  
 }
}

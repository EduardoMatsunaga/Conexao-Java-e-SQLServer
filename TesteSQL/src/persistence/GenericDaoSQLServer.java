package persistence;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDaoSQLServer {
	
	private Connection c;
	public GenericDaoSQLServer () {
		super ();
	}
	
	public Connection getConnection () throws ClassNotFoundException, SQLException {
		String hostName = "localhost";
		String dbName = "maternidade";
		String user = "Eduardo";
		String senha = "senhabd123";
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
		
		c = DriverManager.getConnection(
				String.format("jdbc:sqlserver://%s:1433;databaseName=%s;encrypt=true;trustServerCertificate=true",
                        hostName, dbName),
          user, senha);
		return c;
	}
}

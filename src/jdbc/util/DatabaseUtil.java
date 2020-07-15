package jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

	private static final String ORACLE_USER = "hr";

	private static final String ORACLE_PASSWORD = "hr";

	private static final String MYSQL_USER = "root";

	private static final String MYSQL_PASSWORD = "mysql1234";

	private static final String ORACLE_CONNECTION_STRING = "jdbc:oracle:thin:@localhost:1521:xe";

	private static final String MYSQL_CONNECTION_String = "jdbc:mysql://localhost:3306/sakila?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	public static Connection getConnection(DatabaseType dataBaseType) {

		switch (dataBaseType) {

		case ORACLEDB: {
			Connection connection = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection(ORACLE_CONNECTION_STRING, ORACLE_USER, ORACLE_PASSWORD);

				return connection;

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println("EXCEPTION :>> " + e);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("EXCEPTION :>> " + e);
			}
			return connection;
		}

		case MYSQLDB: {
			Connection connection = null;
			try {
				// Class.forName("com.mysql.jdbc.Driver");
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(MYSQL_CONNECTION_String, MYSQL_USER, MYSQL_PASSWORD);

				return connection;
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println("EXCEPTION :>> " + e);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("EXCEPTION :>> " + e);
			}
			return connection;

		}

		}
		return null;
	}

	public static void testOracleConnection() {
		Connection connection = null;
		connection = DatabaseUtil.getConnection(DatabaseType.ORACLEDB);
		if (connection != null) {
			System.out.println("Connected to oracle");
		}
	}

	public static void testMySQLConnection() {
		Connection connection = null;
		connection = DatabaseUtil.getConnection(DatabaseType.MYSQLDB);
		if (connection != null) {
			System.out.println("Connected to MYSQL");
		}
	}
	
	public static void displayError(SQLException exception) {
		System.out.println("EXCEPTION :>> " +exception.getMessage());
	}

}
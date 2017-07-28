package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Christopher Ingram.
 *
 */
public class DbConnector {

  private static final String user = ""; // change
  private static final String password = ""; // change
  private static final String database = ""; // change

  private static Connection DbInstance = null;

  protected DbConnector() {}

  /**
   * This method negotiates a connection with a Database.
   * 
   * @return An open connection object to the database.
   */
  public static Connection getConnection() {
    if (DbInstance == null) {
      System.out.println("Connecting to PostgreSQL DB");

      try {
        DbInstance = DriverManager.getConnection(database, user, password);
        System.out.println("Connection Successful!\n");
      } catch (SQLException ex) {
        System.out.println("Connection Failed");
        ex.printStackTrace();
      }


    }
    return DbInstance;
  }

}

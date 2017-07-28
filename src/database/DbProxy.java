/**
 * 
 */
package database;

import java.sql.Connection;

import database.DbConnector;
import database.DbProxy;

/**
 * @author Christopher Ingram.
 *
 */
public class DbProxy {
  
  private static DbProxy instance = null;
  private Connection dbInstance = DbConnector.getConnection();

  public DbProxy() {}



  /**
   * This is a singleton creation method.
   * 
   * @return Singleton instance of this class.
   */
  public static DbProxy getInstance() {
    if (instance == null) {
      instance = new DbProxy();
    }
    return instance;
  }
}

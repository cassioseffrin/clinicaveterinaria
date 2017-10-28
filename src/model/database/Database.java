
package model.database;

import java.sql.Connection;

/**
 *
 * @author cassioseffrin
 */

public interface Database {
    
 
  //  public  Connection conectar();
    public void desconectar(Connection conn);
}

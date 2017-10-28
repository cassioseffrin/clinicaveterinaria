
package model.database;

import java.sql.Connection;


public interface Database {
    
    /**
     *
     * @return
     */
  //  public  Connection conectar();
    public void desconectar(Connection conn);
}

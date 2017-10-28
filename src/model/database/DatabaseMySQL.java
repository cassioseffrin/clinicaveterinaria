package model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael Vargas Mesquita
 */
public class DatabaseMySQL implements Database {

    private static Connection connection;

    
    
    public static Connection getConnection(){
        if (connection == null){
            return conectar();
        }else{
            return connection;
        }
    }
    
 
    private  static Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
             connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/veterinaria", "root","123");
            return connection;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DatabaseMySQL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void desconectar(Connection connection) {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

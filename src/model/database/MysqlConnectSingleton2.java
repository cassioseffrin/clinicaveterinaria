 
package model.database;


import com.mysql.jdbc.Connection;
import java.sql.*;
import java.sql.DriverManager;
 
/**
 *
 * @author cassioseffrin
 */
public final class MysqlConnectSingleton2 {
    public Connection conn;
    private Statement statement;
    public static MysqlConnectSingleton2 db;
    private MysqlConnectSingleton2() {
        String url= "jdbc:mysql://localhost:3306/";
        String dbName = "veterinaria";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "123";
        try {
            Class.forName(driver).newInstance();
            this.conn = (Connection)DriverManager.getConnection(url+dbName,userName,password);
        }
        catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }
 
    public static synchronized MysqlConnectSingleton2 getDbCon() {
        if ( db == null ) {
            db = new MysqlConnectSingleton2();
        }
        return db;
 
    }
 
    public ResultSet query(String query) throws SQLException{
        statement = db.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }
 
    public int insert(String insertQuery) throws SQLException {
        statement = db.conn.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;
 
    }
 
}

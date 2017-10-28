package model.database;

import model.database.DatabaseMySQL;

/**
 *
 * @author cassioseffrin
 */

public class DatabaseFactory {
    public static Database getDatabase(String nome){
    
            return new DatabaseMySQL();
        
     
    }
}

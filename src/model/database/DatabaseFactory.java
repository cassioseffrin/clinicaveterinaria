package model.database;

import model.database.DatabaseMySQL;

public class DatabaseFactory {
    public static Database getDatabase(String nome){
    
            return new DatabaseMySQL();
        
     
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import clinica.Cliente;
import java.sql.Connection;
import java.time.LocalDate;
import model.database.DatabaseMySQL;

/**
 *
 * @author cassioseffrin
 */
public class ClienteTest {
    
    public static void main (String a[]){
         Cliente cassio = new Cliente(LocalDate.MAX, "249 9934.2344", "cliente VIP2", "YCassio", 3223343239L, "Masculino", LocalDate.MIN, "Rua b");
         
     //    DatabaseMySQL db = new DatabaseMySQL ();
         Connection con = DatabaseMySQL.getConnection();
         
       ClienteDAO cliDao = new ClienteDAO();
       cliDao.setConnection(con);
       
         cliDao.inserir(cassio);
//         System.out.println("cassio"+cassio);
    }
    
}
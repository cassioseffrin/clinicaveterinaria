 
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

    public static void main(String a[]) {
        Cliente cassio = new Cliente(LocalDate.MAX, "249 9934.2344", "Cliente especial", "Jose", 3223343239L, "Masculino", LocalDate.MIN, "Rua C");

        DatabaseMySQL db = new DatabaseMySQL ();
        Connection con = db.conectar();
        
 
        ClienteDAO cliDao = new ClienteDAO();
        cliDao.setConnection(con);
        cliDao.inserir(cassio);
 
    }

}

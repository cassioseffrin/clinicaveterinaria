/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import clinica.Animal;
import clinica.Cliente;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.database.DatabaseMySQL;

/**
 *
 * @author cassioseffrin
 */
public class AnimalTest {
    
        public static void main(String a[]) {
        Cliente cassio = new Cliente(LocalDate.MAX, "249 9934.2344", "Cliente especial", "Jose", 3223343239L, "Masculino", LocalDate.MIN, "Rua C");

        Animal pepeu = new Animal();
        pepeu.setNome("Pepeu");
        pepeu.setCor("amerelo");
        pepeu.setPeso(5);
        
        
        DatabaseMySQL db = new DatabaseMySQL ();
        Connection con = db.conectar();
        
        //Connection con = DatabaseMySQL.getConnection();
        AnimalDAO animalDao = new AnimalDAO();
        animalDao.setConnection(con);
        animalDao.inserir(pepeu);
        
        
        List<Animal> lstAnimais =  animalDao.listar();
        
            System.out.println("tamanho" + lstAnimais.size());
            
       
        
        
        
 
    }
}

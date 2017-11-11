package model.dao;

import clinica.Animal;
import clinica.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cassioseffrin
 */
public class AnimalDAO {

   
    private Connection connection;
 
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public boolean inserir(Animal animal) {
        String sql = "INSERT INTO animal(nome, peso, cor) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, animal.getNome());
            stmt.setLong(2, animal.getPeso());
            stmt.setString(3, animal.getCor());

            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Animal> listar() {
        String sql = "SELECT * FROM animal";
        List<Animal> retorno = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Animal animal = new Animal();
                animal.setId(resultado.getInt("id"));
                animal.setNome(resultado.getString("nome"));
                animal.setPeso(resultado.getInt("peso"));
                animal.setCor(resultado.getString("cor"));
                retorno.add(animal);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
}

package clinicaveterinaria;

 
import clinica.Cliente;
import comparators.NomeComparator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author cassioseffrin
 */
public class Sockets {

    public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Cliente cassio = new Cliente(LocalDate.MAX, "49 9934.2344", "cliente VIP", "Cassio", 3223343239L, "Masculino", LocalDate.MIN, "Rua A");
        Cliente lucas = new Cliente(LocalDate.MAX, "49 9934.2344", "cliente desconto", "Lucas", 3223343239L, "Masculino", LocalDate.MIN, "Rua A");
      
               
        Set<Cliente> colecaoCliente = new TreeSet<>(new NomeComparator());
        colecaoCliente.add(lucas);
        colecaoCliente.add(cassio); 
 
       
//        File f = new File("/Users/cassioseffrin/colecaoClientes.txt");
//        FileOutputStream fos = new FileOutputStream(f);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(colecaoCliente);
//   
//        
//       
//        FileInputStream fis = new FileInputStream(f);
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        Object col = ois.readObject();
//        Set<Cliente> colecaoDeserializable = (Set<Cliente>) col;
//        
//        System.out.println("Tamanho colecao: "+ colecaoDeserializable.size());
//                oos.flush();
//        oos.close();
        for (Cliente p:colecaoCliente){
            System.out.println( p.getNome());
        }
        


    }

}

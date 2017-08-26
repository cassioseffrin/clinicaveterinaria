package net;

import clinica.Cliente;

/**
 *
 * @author cassioseffrin
 */
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class EnviaObjetosRede {

    private Socket socket = null;
    private ObjectInputStream inputStream = null;
    private ObjectOutputStream outputStream = null;
    private boolean isConnected = false;

    public void enviar() {

        while (!isConnected) {
            try {
                socket = new Socket("10.0.0.158", 5000);
                System.out.println("Conectado!");
                isConnected = true;
                outputStream = new ObjectOutputStream(socket.getOutputStream());
                Cliente cliente = new Cliente(LocalDate.MAX, "49 9934.2344", "cliente preferencial", "Macson", 3223343239L, "Masculino", LocalDate.MIN, "Rua A");
                       
                outputStream.writeObject(cliente);

            } catch (SocketException se) {
                se.printStackTrace();
// System.exit(0);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        EnviaObjetosRede envia = new EnviaObjetosRede();
        envia.enviar();
    }
}
 //  Cliente cassio2 = new Cliente(LocalDate.MAX, "49 9934.2344", "cliente VIP", "Cassio2", 3223343239L, "Masculino", LocalDate.MIN, "Rua A");
               // Set<Cliente> colecaoCliente = new HashSet<>();
              //  colecaoCliente.add(cassio);
              //  colecaoCliente.add(cassio2);
//        System.out.println("Object to be written = " + cassio);
//      
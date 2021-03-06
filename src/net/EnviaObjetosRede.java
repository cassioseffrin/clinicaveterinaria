package net;

import clinica.Cliente;
import java.io.FileInputStream;

/**
 *
 * @author cassioseffrin
 */
import java.io.IOException;
import java.io.InputStream;
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
                socket = new Socket("localhost", 5000);
                System.out.println("Conectado!");
                isConnected = true;
                outputStream = new ObjectOutputStream(socket.getOutputStream());
                Cliente cliente = new Cliente(LocalDate.MAX, "49 9934.2344", "cliente preferencial", "Macson", 3223343239L, "Masculino", LocalDate.MIN, "Rua A");

                outputStream.writeObject(cliente);
                System.out.println("objeto enviado!");
                InputStream fis = socket.getInputStream();
                int content;
                while ((content = fis.read()) != -1) {
                    System.out.print((char) content);
                }

            } catch (SocketException se) {
                se.printStackTrace();

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

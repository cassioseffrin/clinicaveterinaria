 
package net;

/**
 *
 * @author cassioseffrin
 */
import clinica.Cliente;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor extends Thread {

    private ServerSocket serverSocket = null;
    private Socket socket = null;
    private ObjectInputStream inStream = null;

    public void receber() throws IOException, ClassNotFoundException {

        serverSocket = new ServerSocket(4448);

        socket = serverSocket.accept();
        System.out.println("Ouvindo rede");

        inStream = new ObjectInputStream(socket.getInputStream());

//            Cliente cliente = (Cliente) inStream.readObject();
//            System.out.println("Nome  = " + cliente.getNome());
        Object col = inStream.readObject();

        HashSet<Cliente> colecaoDeserializable = (HashSet<Cliente>) col;
        for (Cliente p : colecaoDeserializable) {
            System.out.println(p.getNome());
        }

        System.out.println("Tamanho colecao: " + colecaoDeserializable.size());

        socket.close();

    }

    public static void main(String[] args) {
        Servidor server = new Servidor();
        try {
            server.receber();
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

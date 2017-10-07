package clinicaveterinaria;

import clinica.Cliente;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author cassioseffrin
 */
public class Principal {

    public static void main(String a[]) {

        //criarColecaoTeste();
        Scanner in = new Scanner(System.in);

        System.out.println("1 Cadastro de Cliente");
        System.out.println("2 Cadastro de Animal");
        System.out.println("3 Cadastro de Veterinário");
        System.out.println("4 Realizar Atendimento");

        System.out.println("10 -> Sair");

        boolean sair = false;
        int menuItem;
        do {
            System.out.print("Escolha uma opcao: ");
            menuItem = in.nextInt();
            switch (menuItem) {
                case 1:
                    System.out.println("Cadastro de cliente");
                    cadastrarCliente();
                    break;
                case 2:
                    System.out.println("2 Cadastro de Animal");

                    break;
                case 3:
                    System.out.println("3 Cadastro de Veterinário");

                    break;
                case 4:
                    System.out.println("4 Homologar Atendimento");

                    break;

                case 10:
                    sair = true;
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (!sair);
        System.out.println("ate logo!");
    }

    public static void cadastrarCliente() { 
        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite o cpf: ");
        String cpf = scan.next();

        Cliente cliente = Cliente.procurarCliente(Long.parseLong(cpf));

        if (cliente == null) {
            System.out.println("CPF nao cadastrado!");

        } else {
            System.out.println("cliente encontrada na base de dados: " + cliente.getNome());
        }
    }

    public static void cadastrarClienteGUI() {

        String cpfS = JOptionPane.showInputDialog("Digite o CPF");

        Cliente cliente = Cliente.procurarCliente(Long.parseLong(cpfS));

        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "O cliente nao encontrado! ", 
                    "Resultado");

        } else {
            JOptionPane.showMessageDialog(null, "O cliente é: " + 
                    cliente.getNome(), "Resultado");
        }
    }
    public static void criarColecaoTeste() {

        Cliente cassio = new Cliente(LocalDate.MAX, "49 9934.2344", "cliente VIP", "Cassio", 3223343239L, "Masculino", LocalDate.MIN, "Rua A");
        Cliente lucas = new Cliente(LocalDate.MAX, "49 9934.2344", "cliente desconto", "Lucas", 2443342930L, "Masculino", LocalDate.MIN, "Rua A");
        HashSet<Cliente> colecaoCliente = new HashSet<>();
        colecaoCliente.add(lucas);
        colecaoCliente.add(cassio);

        Cliente.gravarColecao(colecaoCliente);

    }

}

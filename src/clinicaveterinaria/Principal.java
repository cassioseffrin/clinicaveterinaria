/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

import clinica.Cliente;
import comparators.NomeComparator;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cassioseffrin
 */
public class Principal {
    
    
    public static void main(String a[]){
        
       //criarColecaoTeste();
        cadastrarCliente();
        
        
        
    }
    
    public static void cadastrarCliente(){
        
        Scanner scan = new Scanner (System.in);
        System.out.printf("Digite o cpf: ");
        String cpf =  scan.next();
        
        Cliente cliente = Cliente.procurarCliente(Long.parseLong(cpf));
        
        if (cliente == null){
            System.out.println("CPF nao cadastrado!");
            
            
            
        }else{
            System.out.println("cliente encontrada na base de dados: "+cliente.getNome());
        }
    }
    
    
    
    public static void criarColecaoTeste(){
        
        Cliente cassio = new Cliente(LocalDate.MAX, "49 9934.2344", "cliente VIP", "Cassio", 3223343239L, "Masculino", LocalDate.MIN, "Rua A");
        Cliente lucas = new Cliente(LocalDate.MAX, "49 9934.2344", "cliente desconto", "Lucas", 2443342930L, "Masculino", LocalDate.MIN, "Rua A");
        HashSet<Cliente> colecaoCliente = new HashSet<>();
        colecaoCliente.add(lucas);
        colecaoCliente.add(cassio); 
        
        Cliente.gravarColecao(colecaoCliente);
 
       
    
        


    
        
        
    }
    
    
}

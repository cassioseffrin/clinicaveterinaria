/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparators;

import clinica.Cliente;
import clinica.Pessoa;
import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author cassioseffrin
 */
public class NascimentoComparator implements  Comparator<Cliente>{
    
      @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.getDataNascimento().compareTo(o2.getDataNascimento());
    }
    
}

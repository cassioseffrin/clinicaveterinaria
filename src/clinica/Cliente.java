 
package clinica;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author cassioseffrin
 */
public class Cliente extends Pessoa implements Serializable,Acoes{
    
    
    private LocalDate dataCadastro;
    private String telefone;
    private String observacao;
    
    private final static String ARQUIVO="/Users/cassioseffrin/clinica/colectionCliente.dat";
    public static final long serialVersionUID = 5000493038443485120L;
 
    public Cliente(LocalDate dataCadastro, String telefone, String observacao, String nome, long cpf,  String sexo, LocalDate dataNascimento, String endereco) {
        super(nome, cpf, sexo, dataNascimento, endereco);
        this.dataCadastro = dataCadastro;
        this.telefone = telefone;
        this.observacao = observacao;
    }

    public Cliente() {
        
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dataCadastro=" + dataCadastro + ", telefone=" + telefone + ", observacao=" + observacao + '}';
    }
    
   
    
    
    
}

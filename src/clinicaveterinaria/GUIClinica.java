 
package clinicaveterinaria;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author cassioseffrin
 */
public class GUIClinica extends JFrame implements ActionListener{
    
    
    private JTextField textFieldNome;
    private JLabel labelNome;
    private JButton botaoSalvar;
    
    GUIClinica(){
        setLayout(new FlowLayout());
        textFieldNome = new JTextField(10);
        textFieldNome.setHorizontalAlignment(SwingConstants.LEFT);
        labelNome = new JLabel("Digite o Nome:");
        labelNome.setHorizontalTextPosition(SwingConstants.RIGHT);
        botaoSalvar = new JButton("Salvar");
        botaoSalvar.setHorizontalAlignment(SwingConstants.LEFT);
        botaoSalvar.addActionListener(this);
        add(labelNome);
        add(textFieldNome);
        add(botaoSalvar);
    }
 
    public static void main (String a[]){
        GUIClinica c = new GUIClinica();
        c.setSize(640, 480);
        c.setDefaultCloseOperation(EXIT_ON_CLOSE);
        c.setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==botaoSalvar){
            String nome = textFieldNome.getText();
            JOptionPane.showMessageDialog(null, "Nome Digitado "+nome);
        }
    }
    
}

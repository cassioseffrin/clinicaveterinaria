 
package GUI;

import clinicaveterinaria.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author cassioseffrin
 */
public class JPanelAnimal extends JPanel implements ActionListener{
    
    
    private JTextField textFieldNome;
    private JTextField textFieldPeso;
    private JLabel labelNome;
    private JLabel labelPeso;
    private JButton botaoSalvar;
 
    JPanelAnimal(){
        setLayout(new GridLayout(3, 1));
        textFieldNome = new JTextField(10);
        textFieldPeso = new JTextField(10);
        
        labelNome = new JLabel("Digite o Nome:");
        labelPeso = new JLabel("Digite o Peso:");
        
        botaoSalvar = new JButton("Salvar");
       
        botaoSalvar.addActionListener(this);
        add(labelNome);
        add(textFieldNome);
        add(labelPeso);
        add(textFieldPeso );
        add(botaoSalvar);
        
         this.setSize(500,200);
         setVisible(true);
         setBackground(Color.gray);
    }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==botaoSalvar){
            String nome = textFieldNome.getText();
            JOptionPane.showMessageDialog(null, "Nome Digitado "+nome);
        }
    }
    
}

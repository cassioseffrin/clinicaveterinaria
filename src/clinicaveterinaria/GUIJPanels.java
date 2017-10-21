 
package clinicaveterinaria;

/**
 *
 * @author cassioseffrin
 */
 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
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
public class GUIJPanels extends JFrame implements ActionListener{
    
    
 
    private JButton botaoSalvar;
    
    private JPanel jpanel1;
    private JPanel jpanel2;
    
    @SuppressWarnings("unchecked")
    GUIJPanels(){
        setLayout(new BorderLayout());
   
        jpanel1 = new JPanel();
        jpanel1.setBackground(Color.red);
        jpanel2 = new JPanel();
        jpanel2.setBackground(Color.blue);
        
        
        botaoSalvar = new JButton("Cor");
        botaoSalvar.addActionListener(this);
        add(jpanel1, BorderLayout.NORTH);
        add(jpanel2, BorderLayout.CENTER);
        add(botaoSalvar, BorderLayout.SOUTH);
    }
 
    public static void main (String a[]){
        GUIJPanels c = new GUIJPanels();
        c.setSize(640, 480);
        c.setDefaultCloseOperation(EXIT_ON_CLOSE);
        c.setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==botaoSalvar){
                 jpanel2.setBackground(Color.pink);
        }
    }
    
}
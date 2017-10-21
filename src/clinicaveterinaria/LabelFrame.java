/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

/**
 *
 * @author cassioseffrin
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Cassio
 */
public class LabelFrame extends JFrame{
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
    public LabelFrame(){
        super("testesss");
        setLayout(new FlowLayout());
        label1 = new JLabel("Alguma coisa");
        label1.setToolTipText("mouse sobre label1");
      //  add(label1);
        
     //   Icon image = new ImageIcon("d:\\1.png");
      //  label2 = new JLabel(image);
//        label2.setToolTipText("mouse sober imagem");
       label2 = new JLabel("mais uma  coisa");        
label2.setText("outra coisa");
       // add(label2);
        
        label3 = new JLabel();
        label3.setText("texto3");
      //  label3.setIcon(image);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        label3.setToolTipText("em cima");
       // add(label3);
        
        //getContentPane().setLayout(new BorderLayout());    
        JPanel panel1 = new JPanel();    
        panel1.setLayout(new BorderLayout());  
        
         panel1.add(label1, BorderLayout.CENTER);
         panel1.add(label2, BorderLayout.SOUTH);
         panel1.add(label3, BorderLayout.EAST);
         
         add(panel1);
        
        
        
    }
    
    public static void main (String a[]){
        LabelFrame lf = new LabelFrame();
        lf.setSize(320, 200);
        lf.setVisible(true);
        
    }
    
       
}


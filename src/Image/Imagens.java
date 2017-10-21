package Image;

import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author cassioseffrin
 */
public class Imagens extends JFrame {

    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;

    public Imagens() {
        setLayout(new FlowLayout());

        label1 = new JLabel("etiqueta 1");

        add(label1);

    //    Icon tigre = new ImageIcon(getClass().getResource("tigre.jpg "));
                ImageIcon tigre = new ImageIcon("/Users/cassioseffrin/Desktop/tigre.jpg","tigrinho!");
        label2 = new JLabel("Tigre", tigre, SwingConstants.LEFT);
        
        add(label2);

        label3 = new JLabel();
        label3.setText("um tigre");
        label3.setIcon(tigre);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("Hey, watchout ! be aware... it's me!");
        add(label3);


    }
    
    public static void main(String a[]){
        Imagens im = new Imagens();
        im.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        im.setSize(640, 480);
        im.setVisible(true);
    }

}

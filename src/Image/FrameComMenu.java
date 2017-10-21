package Image;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author cassioseffrin
 */
public class FrameComMenu extends JFrame {

    private final JTextField textField1;
    private final JTextField textField2;

    private final JButton b1;

    public FrameComMenu() {
        setLayout(new FlowLayout());
        Manuseio manuseio = new Manuseio();

        textField1 = new JTextField(10);
        textField2 = new JTextField(20);
        b1 = new JButton("Entrar Texto");
        b1.addActionListener(manuseio);
        add(b1);

        add(textField1);
        add(textField2);

        textField1.addActionListener(manuseio);

        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;

 
        menuBar = new JMenuBar();

 
        menu = new JMenu("Menu");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "o menu do frame");
        menuBar.add(menu);

        //grupo de  JMenuItems
        menuItem = new JMenuItem("somente texto",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "faz nada");
        menu.add(menuItem);

        menuItem = new JMenuItem("com icone",
                new ImageIcon("img.jpg"));
        menuItem.setMnemonic(KeyEvent.VK_B);
        menu.add(menuItem);

        menuItem = new JMenuItem(new ImageIcon("img2.jpg"));
        menuItem.setMnemonic(KeyEvent.VK_D);
        menu.add(menuItem);

        //grupo de  radio button menu items
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();
        rbMenuItem = new JRadioButtonMenuItem("radio button no item");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem("outro");
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

 
        menu.addSeparator();
        cbMenuItem = new JCheckBoxMenuItem("checkbox");
        cbMenuItem.setMnemonic(KeyEvent.VK_C);
        menu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("mais um");
        cbMenuItem.setMnemonic(KeyEvent.VK_H);
        menu.add(cbMenuItem);

            //submenu
        menu.addSeparator();
        submenu = new JMenu("submenu");
        submenu.setMnemonic(KeyEvent.VK_S);

        menuItem = new JMenuItem("Alguma coisa no submenu");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.ALT_MASK));
        submenu.add(menuItem);

        menuItem = new JMenuItem("mais um");
        submenu.add(menuItem);
        menu.add(submenu);

        //segundo menu 
        menu = new JMenu("outro  Menu");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription(
                "faz nada 2");
        menuBar.add(menu);

 
        add(menuBar);
    }

    private class Manuseio implements ActionListener {

        String string = "";

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("checando");
            if (e.getSource() == textField1) {
                string = String.format("texto 1: %s", e.getActionCommand());
            }

            if (e.getSource() == b1) {
                System.out.println("botao precionado!");
                string = textField1.getText();
            }

            JOptionPane.showMessageDialog(null, "String: " + string, "Resultado", JOptionPane.DEFAULT_OPTION);
        }

    }

    public static void main(String a[]) {
        FrameComMenu im = new FrameComMenu();
        im.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        im.setSize(640, 480);
        im.setVisible(true);
    }
}

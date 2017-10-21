package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author cassioseffrin
 */
public class JFrameComDiversosPanels extends JFrame implements ActionListener {

    private JPanel jPanelMenu;
    private JPanel jPainelCentro;
    private JPanel jPainelCliente;
    private JPanel jPainelAnimal;
    private JPanel jPanelStatus;

    private JButton botaoCadastroCliente;
    private JButton botaoCadastroAnimal;

    public JFrameComDiversosPanels() {

        botaoCadastroCliente = new JButton("Cadastro Cliente");
        botaoCadastroAnimal = new JButton("Cadastro Animal");
        botaoCadastroCliente.addActionListener(this);
        botaoCadastroAnimal.addActionListener(this);

        jPanelMenu = new JPanel();
        jPanelMenu.setBackground(Color.red);
        jPanelMenu.setLayout(new FlowLayout());
        jPanelMenu.add(botaoCadastroCliente);
        jPanelMenu.add(botaoCadastroAnimal);

        jPainelCentro = new JPanel();
        jPainelCliente = new JPanelCliente();
        jPainelAnimal = new JPanelAnimal();

        jPanelStatus = new JPanel();
        jPanelStatus.setBackground(Color.yellow);

        add(jPanelMenu, BorderLayout.NORTH);
        add(jPainelCentro, BorderLayout.CENTER);
        add(jPanelStatus, BorderLayout.SOUTH);

    }

    public static void main(String a[]) {
        JFrameComDiversosPanels fr = new JFrameComDiversosPanels();
        fr.setSize(600, 600);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == botaoCadastroCliente) {
            jPainelCentro.removeAll();
            jPainelCentro.add(jPainelCliente);

            pack();
            setSize(600, 600);
            repaint();
        }
        if (e.getSource() == botaoCadastroAnimal) {
            jPainelCentro.removeAll();
            jPainelCentro.add(jPainelAnimal, BorderLayout.CENTER);

            pack();
            setSize(600, 600);
            repaint();

        }

    }
}

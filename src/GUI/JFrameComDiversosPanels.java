package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author cassioseffrin
 */
public class JFrameComDiversosPanels extends JFrame implements ActionListener {

    private final JPanel jPanelMenu;
    private final JPanel jPainelCentro;
    private final JPanel jPainelCliente;
    private final JPanel jPainelAnimal;
    private final JPanel jPanelStatus;

    private final JMenuBar menuBar;
    private final JMenu menuCadastros;
    private final JMenu menuRelatorios;
    private final JMenuItem menuItemAnimal;
    private final JMenuItem menuItemCliente;
    private final JMenuItem menuItemRelatorioClientes;

    public JFrameComDiversosPanels() {

        jPanelMenu = new JPanel();
        jPanelMenu.setBackground(Color.red);
        jPanelMenu.setLayout(new FlowLayout());

        jPainelCentro = new JPanel();
        jPainelCliente = new JPanelCliente();
        jPainelAnimal = new JPanelAnimal();

        jPanelStatus = new JPanel();
        jPanelStatus.setBackground(Color.yellow);

        add(jPanelMenu, BorderLayout.NORTH);
        add(jPainelCentro, BorderLayout.CENTER);
        add(jPanelStatus, BorderLayout.SOUTH);

        menuBar = new JMenuBar();
        menuCadastros = new JMenu("Cadastros");
        menuBar.add(menuCadastros);

        menuRelatorios = new JMenu("Relatorios");
        menuBar.add(menuCadastros);
        menuBar.add(menuRelatorios);

        menuItemAnimal = new JMenuItem("Cadastro Animal");
        menuItemAnimal.addActionListener(this);
        menuCadastros.add(menuItemAnimal);
        menuItemCliente = new JMenuItem("Cadastro Cliente");
        menuItemCliente.addActionListener(this);
        
       
        menuCadastros.add(menuItemCliente);
        
        menuItemRelatorioClientes = new JMenuItem("Relatorio Cliente");
        menuRelatorios.add(menuItemRelatorioClientes);

        jPanelMenu.add(menuBar);

    }

    public static void main(String a[]) {
        JFrameComDiversosPanels fr = new JFrameComDiversosPanels();
        fr.setSize(600, 600);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == menuItemCliente) {
            jPainelCentro.removeAll();
            jPainelCentro.add(jPainelCliente);

            pack();
            setSize(600, 600);
            repaint();
        }
        if (e.getSource() == menuItemAnimal) {
            jPainelCentro.removeAll();
            jPainelCentro.add(jPainelAnimal, BorderLayout.CENTER);

            pack();
            setSize(600, 600);
            repaint();

        }

    }
}

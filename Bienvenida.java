package General;

import java.awt.Color;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.awt.BorderLayout;
import java.awt.Font;

public class Bienvenida extends JFrame {
    protected JMenuBar mb;
    protected JMenu mA, mBD;
    protected JMenuItem home, mBD_a, mBD_c, mensaje, mMarcas, personas;
    
    protected CardLayout c1;
    protected JPanel pi, ps, pd, pc;

    public Bienvenida() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.menu();
        
        //este es el panel izquierdo
        JPanel pi = new JPanel();
        pi.setBackground(Color.GRAY);
        pi.add(new JLabel("Soy el panel izquierdo."));
        pi.setPreferredSize(new Dimension(200, getHeight()));
        
        //panel superior
        ps = new JPanel();
        ps.setBackground(new Color(39, 174, 96));
        JLabel titulo = new JLabel ("Sistema de gestion ...");
        titulo.setForeground(Color.WHITE);
        Font fuente = new Font("Arial", Font.BOLD, 18);
        titulo.setFont(fuente);
        ps.add(titulo);
        
        c1 = new CardLayout();
        pc = new JPanel(c1);
        pc.add(new JLabel("Welcome to java..."));
        pc.add(new Mensaje (), "mensaje");
        

        JPanel pd = new JPanel();
        pd.setBackground(new Color(245, 247, 250));
        pd.add(new JLabel("Soy el panel Derecho."));
        pd.setPreferredSize(new Dimension(200, getHeight()));
        
        this.setLayout(new BorderLayout());
        this.add(pi, BorderLayout.WEST);
        this.add(pd, BorderLayout.EAST);
        this.add(ps, BorderLayout.NORTH);
        this.add(pc, BorderLayout.CENTER);

        this.setVisible(true);
    }

    private void menu() {
        this.mb = new JMenuBar();
        this.setJMenuBar(mb);

        this.mA = new JMenu("Archivo");
        home = new JMenuItem("Home");
        this.mA.add(home);

        this.mensaje = new JMenuItem("Mensaje");
        this.mA.add(mensaje);

        this.mBD = new JMenu("Base de Datos");

        mMarcas = new JMenuItem("Marcas");
        mBD.add(mMarcas);

        this.mb.add(mA);
        this.mb.add(mBD);
    }
}

package General;
import Marcas.MarcasVista;
import Marcas.MarcasControl;
import javax.swing.JLabel;

public class Controlador {
    protected Bienvenida vista;
    protected MarcasVista marcasVista;
    protected MarcasControl marcasControl;
    
    
    public Controlador (Bienvenida vista){
        this.vista = vista;
        this.eventos();
    }
    
    public void eventos(){
        vista.mensaje.addActionListener(
        e -> vista.c1.show(vista.pc, "mensaje"));
        vista.home.addActionListener(e ->{
            vista.pc.add(new JLabel("Panel Home"), "home");
            vista.c1.show(vista.pc, "home");
        });
        
        vista.mMarcas.addActionListener(e -> {
            marcasVista = new MarcasVista();
            marcasControl = new MarcasControl(marcasVista);
            vista.pc.add(marcasVista, "mk");
            vista.c1.show(vista.pc, "mk");
        });
    }
    
}

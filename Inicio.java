
package poliza;


import General.Bienvenida;
import General.Controlador;
import javax.swing.SwingUtilities;

public class Inicio {
    protected Bienvenida vista;
    protected Controlador controlador;
    
    public Inicio(){
        vista = new Bienvenida();
        controlador  = new Controlador(vista);
        
    }
    public static void main(String[] args){
       SwingUtilities.invokeLater(Inicio::new);
        
    }
    
}

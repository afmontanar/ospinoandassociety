/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;


import java.util.HashMap;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author ADICNET
 */
    public class Usuarios {
static Connetion c= new Connetion("localhost", "atcivofijo", "root", "1988");
    /**
     * @param args the command line arguments
     */
    public static HashMap<String, JDialog> di = new HashMap<>();
    public static HashMap<String, JInternalFrame> d = new HashMap<>();
    public static void main(JFrame args) {
//       d.put("Formulario4",new EditarUsuario());
       di.put("Grilla", new Grilla(args, true));
          di.put("usa", new nuevosusuarios(args, true));
           di.put("edi", new EditarLosUsuarios(args, true));
    }
}

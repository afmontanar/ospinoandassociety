/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package activosfijos;

import Usuario.Grilla;
import java.util.HashMap;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author OSPINO 
 */
public class ActivosFijos {
static Connetion c= new Connetion("localhost", "deepfullstatic", "root", "1988");
    /**
     * @param args the command line arguments
     */
    public static HashMap<String, JDialog> e = new HashMap<>();
    public static HashMap<String, JInternalFrame> q = new HashMap<String, JInternalFrame>();
    
    public static void main(JFrame args) {
         
//        e.put("GRIL", new GrillaAtivoFijo());
        
//      GrillaAtivoFijo g=new GrillaAtivoFijo();
//      g.setLocationRelativeTo(null);
//      g.setVisible(true);
      
    }
}

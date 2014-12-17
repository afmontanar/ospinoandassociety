/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menuactivofijo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADICNET
 */
public class MenuActivoFijo {

    static Connetion c = new Connetion("localhost", "atcivofijo", "root", "1988");

    /**
     * @param args the command line arguments
     */
//    public static HashMap<String, JDialog> a = new HashMap<>();

    public static void main(String[] args) {
        Principal p = new Principal();
        p.setVisible(true);
    }

    

}

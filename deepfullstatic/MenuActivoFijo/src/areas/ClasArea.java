/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package areas;

import activosfijos.Connetion;
import java.util.HashMap;
import javax.swing.JDialog;

/**
 *
 * @author OSPINO Y ASOCIADO
 */
public class ClasArea {
    static Connetion c= new Connetion("localhost", "deepfullstatic", "root", "1988");
 public static HashMap<String, JDialog> are = new HashMap<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    }
    
}

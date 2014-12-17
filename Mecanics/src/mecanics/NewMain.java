/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mecanics;



/**
 *
 * @author adicnet
 */
public class NewMain {
    static utilities.Connetion o = new utilities.Connetion("localhost", "mecanics", "root", "1988");
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Principal().setVisible(true);
    }
    
}

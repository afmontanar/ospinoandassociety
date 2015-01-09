/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author afmontanar
 */
public class TexfieldTRC extends JTextField{

    private JLabel x;
    
    public TexfieldTRC(JLabel e) {
        super(); 
        this.x = e;
         this.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                esteCaretUpdate(evt);
            }
        });
         
    }
    
     private void esteCaretUpdate(javax.swing.event.CaretEvent evt) {                                         
        // TODO add your handling code here: Aca voy ha buscar el dueno
        try{ 
            int parseInt = Integer.parseInt(this.getText());
            
        }catch(Exception e){
        }
     
    }    
     
    int retorneValVar(){  
        return Integer.parseInt(this.getText());
    }
    
}

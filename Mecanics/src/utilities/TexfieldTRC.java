/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.awt.event.FocusEvent;
import javax.swing.JTextField;
import mecanics.HistoriaVehiculos;

/**
 *
 * @author afmontanar
 */
public class TexfieldTRC extends JTextField {

    private boolean salto;
    private HistoriaVehiculos r;

    public TexfieldTRC(HistoriaVehiculos r) {
        super();
        this.r=r;
        this.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                esteIdFocusLost(evt);
            }
        });
        this.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                esteFocusGained(evt);
            }
        });
//        this.addFocusListener(new java.awt.event.FocusAdapter() {
//            public void focusGained(java.awt.event.FocusEvent evt) {
//                esteIdFocusGained(evt);
//            }
//        });
    }

    private void esteIdFocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here: Aca voy ha buscar el dueno
       
            this.tratamientoEvtF();
    }
    
     private void esteFocusGained(FocusEvent evt) {
            this.tratamientoEvtF();
     }

    public void tratamientoEvtF() {
        try {
            this.r.sumaDes();
        } catch (Exception e) {
        }
    }

}

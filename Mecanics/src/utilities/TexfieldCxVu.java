/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import mecanics.HistoriaVehiculos;

/**
 *
 * @author afmontanar
 */
public class TexfieldCxVu extends JTextField {

    private boolean salto;
    private HistoriaVehiculos r;

    public TexfieldCxVu(HistoriaVehiculos r) {
        super();
        this.r=r;
        this.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                NumeroIdCaretUpdate(evt);
            }
        });
    }

    public void tratamientoEvtC() {
        try {       
            this.r.multiCxVu(this.getText());
            this.r.sumatot();
        } catch (Exception e) {
        }
    }
    
      private void NumeroIdCaretUpdate(CaretEvent evt) {
              this.tratamientoEvtC(); 
      }
      
}

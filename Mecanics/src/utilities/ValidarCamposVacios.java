/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.awt.Component;
import javax.swing.*;

/**
 *
 * @author ADICNET
 */
public class ValidarCamposVacios {

    private Component[] j;
    
    private Component[] r;

    public ValidarCamposVacios(Component[] components) {
        this.j = components;
    }

      public ValidarCamposVacios(Component[] components,Component[] componentsr) {
        this.r = componentsr;
        this.j = components;
    }
    public boolean validacionCamposNulosB() {
        for (int i = 0; i < j.length; i++) {//5,6,7,
            try {
                JTextField c = (JTextField) j[i];

                if ( c.getText().equals("") || c.getText().equals("null")) {
                    JOptionPane.showMessageDialog(null, "Campo " + c.getName() + " No puede ir Vacio");
                    return false;
                }
            } catch (Exception e) {
                try {
                    JComboBox c = (JComboBox) j[i];
                    String selectedItem = c.getSelectedItem().toString();
                    if (c.getSelectedItem().equals("") || c.getSelectedItem().equals("null")) {
                        JOptionPane.showMessageDialog(null, "Lista desplegable " + c.getName() + " No Puede ir vacio");
                        return false;
                    }

                } catch (Exception a) {                  
                    JLabel c = (JLabel) j[i];
                    if ( c.getText().equals("") || c.getText().equals("null")) {
                        JOptionPane.showMessageDialog(null, "Campo " + c.getName() + " No Puede ir Vacio");
                        return false;
                    }
                    }
                }
            }
        
        return true;
    }
    
    public void reiniciarFormulario(){
        for(int i=0; i<j.length; i++){
            try{
            JTextField c =(JTextField) j[i];
            c.setText("");
            }catch(ClassCastException a){
                try{
                    JComboBox c = (JComboBox) j[i];
                    c.setSelectedIndex(0);
                }catch(ClassCastException b){
                    try{
                     JLabel c = (JLabel) j[i];
                    c.setText("");
                    
                    }catch(ClassCastException e){
                    JCheckBox u = (JCheckBox)j[i];
                     u.setSelected(false);
                    }
                }
            }
        }
    }
    
    public void reiniciarFormularior(){
        for(int i=0; i<r.length; i++){
            try{
            JTextField c =(JTextField) r[i];
            c.setText("");
            }catch(ClassCastException a){
                try{
                    JComboBox c = (JComboBox) r[i];
                    c.setSelectedIndex(0);
                }catch(ClassCastException b){
                     try{
                     JLabel c = (JLabel) r[i];
                    c.setText("");                 
                    }catch(ClassCastException e){
                        try{
                    JCheckBox u = (JCheckBox)r[i];
                     u.setSelected(false);
                        }catch(ClassCastException c){
                            JTextArea p = (JTextArea)r[i];
                            p.setText("");
                        }
                    }
                }
            }
        }
    }
    
    public String FormatearEntero(String num) {
        String x1 = "0";
        long x;
        int neg = 0;
        num = "" + QuitarFormateoEntero(num);
        if (!num.equals("0")) {

            try {

                x = Long.parseLong(num);
                if (x < 0) {
                    x = x * (-1);
                    neg = 1;
                }
                if (x < 1000) {
                    x1 = "" + x;
                }
                if (x >= 1000 && x <= 999999) {
                    long miles;
                    miles = x / 1000;
                    x1 = "" + miles + "." + num.substring(num.length() - 3, num.length());

                } else if (x >= 1000000 && x <= 999999999) {
                    long millon;

                    millon = x / 1000000;

                    x1 = "" + millon + "." + num.substring(num.length() - 6, num.length() - 3) + "." + num.substring(num.length() - 3, num.length());


                } else if (x >= 1000000000 && x <= 999999999999.0) {
                    long milmillon;

                    milmillon = x / 1000000000;

                    x1 = "" + milmillon + "." + num.substring(num.length() - 9, num.length() - 6) + "." + num.substring(num.length() - 6, num.length() - 3) + "." + num.substring(num.length() - 3, num.length());
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR AL CONVERTIR A ENTERO 2" + e);
            }

        }


        if (neg == 1) {
            x1 = "-" + x1;
        }

        return x1;

    }

   public long QuitarFormateoEntero(String x)
   {
    long x1=0;
    if(!x.equals(""))
    {
    x=x.replace(".","");
     x=x.replace("$","");
    try
    {
    x1=Long.parseLong(x);
     return x1;
     } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "ERROR AL CONVERTIR A ENTERO1 " + e);
        }
    }

    return x1;

   }
}

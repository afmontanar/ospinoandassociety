/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mecanics;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author afmontanar
 */
public class GrillaChofer extends javax.swing.JDialog {

     private utilities.ModelosTablaS modelot;
    private int s;
    /**
     * Creates new form GrillaChofer
     */
    public GrillaChofer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        String n[] = {"Identificacion","Nombres","Apellidos","Direccion","Celular","Detalle","clienteid"};
        this.modelot = new utilities.ModelosTablaS(n, jTable1);
        jTable1.setModel(this.modelot);
        this.llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 108, 840, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            if(this.s==0){
            this.mandarDatosHv();
            this.setVisible(false);
            }else if(this.s==1){
               this.mandarDatosBhv();
               this.setVisible(false);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    void alimentarGrillaChofer(String toString, int s) {
        this.s = s;
        this.modelot.vaciarTabla();
        try {
            ResultSet MysqlConsulta = NewMain.o.MysqlConsulta("SELECT * FROM `chofer` where clienteid = '"+toString+"'");
            while(MysqlConsulta.next()){
                String d[]={MysqlConsulta.getString("Identificacion"), MysqlConsulta.getString("Nombres"),MysqlConsulta.getString("Apellidos"),MysqlConsulta.getString("Direccion"),MysqlConsulta.getString("Celular"),  MysqlConsulta.getString("Detalle"),MysqlConsulta.getString("clienteid")};
                this.modelot.ingresarUsuarioM(d);
            }
        this.modelot.reload();
        } catch (SQLException ex) {
            Logger.getLogger(GrillaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void llenarTabla() {
         this.modelot.vaciarTabla();
        try {
            ResultSet MysqlConsulta = NewMain.o.MysqlConsulta("SELECT * FROM `chofer`");
            while(MysqlConsulta.next()){
                String d[]={MysqlConsulta.getString("Identificacion"), MysqlConsulta.getString("Nombres"),MysqlConsulta.getString("Apellidos"),MysqlConsulta.getString("Direccion"),MysqlConsulta.getString("Celular"),  MysqlConsulta.getString("Detalle")};
                this.modelot.ingresarUsuarioM(d);
            }
        this.modelot.reload();
        } catch (SQLException ex) {
            Logger.getLogger(GrillaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void mandarDatosHv() {
         int selectedRow = jTable1.getSelectedRow();
         Principal parent = (Principal) super.getParent();
         parent.gChoferAhv(jTable1.getValueAt(selectedRow, 0)+"",jTable1.getValueAt(selectedRow, 1)+"");
    }

    private void mandarDatosBhv() {
         int selectedRow = jTable1.getSelectedRow();
         Principal parent = (Principal) super.getParent();
         parent.gChoferABhv(jTable1.getValueAt(selectedRow, 0)+"",jTable1.getValueAt(selectedRow, 1)+"");
    }
}

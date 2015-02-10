/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mecanics;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author afmontanar
 */
public class BusquedaHv extends javax.swing.JDialog {

    /**
     * Creates new form BusquedaHv
     */
    private Object idCliente;
    private utilities.ModelosTablaS modelot;   
    private String idChofer;
        
    public BusquedaHv(java.awt.Frame parent, boolean modal) {       
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        String n[] = {"indice","nombre","placa","dueno","chofer","Fecha","valorTotal","valorTotalConDescuento"};
        this.modelot = new utilities.ModelosTablaS(n, jTable2);
        jTable2.setModel(this.modelot);
        this.llenarTabla();
        this.idChofer = "";
        this.idCliente = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        valdesc = new javax.swing.JTextField();
        placa = new javax.swing.JTextField();
        dueno = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        chofer = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fechai = new com.toedter.calendar.JDateChooser();
        horai = new javax.swing.JComboBox();
        minutoi = new javax.swing.JComboBox();
        segundoi = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        nombre = new javax.swing.JTextField();
        valtotal = new javax.swing.JTextField();
        fechaf = new com.toedter.calendar.JDateChooser();
        horaf = new javax.swing.JComboBox();
        minutof = new javax.swing.JComboBox();
        segundof = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        valdesc.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor con descuento"));
        valdesc.setName("valdesc"); // NOI18N
        valdesc.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                valdescCaretUpdate(evt);
            }
        });
        jPanel1.add(valdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 180, 40));

        placa.setBorder(javax.swing.BorderFactory.createTitledBorder("Placa"));
        placa.setName("Nombre"); // NOI18N
        placa.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                placaCaretUpdate(evt);
            }
        });
        jPanel1.add(placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 180, 40));

        dueno.setBorder(javax.swing.BorderFactory.createTitledBorder("Dueño"));
        jPanel1.add(dueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 180, 50));

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 30, 40));

        chofer.setBorder(javax.swing.BorderFactory.createTitledBorder("Chofer"));
        jPanel1.add(chofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 180, 50));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 30, 40));

        fechai.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha inicial"));
        fechai.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(fechai, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 180, 40));

        horai.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "" }));
        horai.setBorder(javax.swing.BorderFactory.createTitledBorder("Hora"));
        jPanel1.add(horai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 70));

        minutoi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));
        minutoi.setBorder(javax.swing.BorderFactory.createTitledBorder("Minuto"));
        jPanel1.add(minutoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 80, 70));

        segundoi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));
        segundoi.setBorder(javax.swing.BorderFactory.createTitledBorder("Segundo"));
        jPanel1.add(segundoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 80, 70));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        /*
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        */
        jScrollPane3.setViewportView(jTable2);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1980, -1));

        jScrollPane2.setViewportView(jPanel4);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1200, 400));

        nombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        nombre.setName("nombre"); // NOI18N
        nombre.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nombreCaretUpdate(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, 40));

        valtotal.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor total"));
        valtotal.setName("valtotal"); // NOI18N
        valtotal.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                valtotalCaretUpdate(evt);
            }
        });
        jPanel1.add(valtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 180, 40));

        fechaf.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha final"));
        fechaf.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(fechaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 180, 40));

        horaf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "" }));
        horaf.setBorder(javax.swing.BorderFactory.createTitledBorder("Hora"));
        jPanel1.add(horaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 80, 70));

        minutof.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));
        minutof.setBorder(javax.swing.BorderFactory.createTitledBorder("Minuto"));
        jPanel1.add(minutof, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 80, 70));

        segundof.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));
        segundof.setBorder(javax.swing.BorderFactory.createTitledBorder("Segundo"));
        jPanel1.add(segundof, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 110, 80, 70));

        jCheckBox1.setText("Incluir busqueda de fechas");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valdescCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_valdescCaretUpdate
        // TODO add your handling code here:
        this.busquedaHv();
    }//GEN-LAST:event_valdescCaretUpdate

    private void placaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_placaCaretUpdate
        // TODO add your handling code here:
        this.busquedaHv();
    }//GEN-LAST:event_placaCaretUpdate

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Principal r = (Principal) super.getParent();
        r.setGrillaClienteVisibility(true,1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (null != this.idCliente) {
            Principal r = (Principal) super.getParent();
            r.getGrillaChofer(this.idCliente.toString(),1);
        } else {
            JOptionPane.showMessageDialog(this, "No a seleccionado dueno");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nombreCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_nombreCaretUpdate
        // TODO add your handling code here:
        busquedaHv();
    }//GEN-LAST:event_nombreCaretUpdate

    private void valtotalCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_valtotalCaretUpdate
        // TODO add your handling code here:
        busquedaHv();
    }//GEN-LAST:event_valtotalCaretUpdate

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chofer;
    private javax.swing.JLabel dueno;
    private com.toedter.calendar.JDateChooser fechaf;
    private com.toedter.calendar.JDateChooser fechai;
    private javax.swing.JComboBox horaf;
    private javax.swing.JComboBox horai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox minutof;
    private javax.swing.JComboBox minutoi;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField placa;
    private javax.swing.JComboBox segundof;
    private javax.swing.JComboBox segundoi;
    private javax.swing.JTextField valdesc;
    private javax.swing.JTextField valtotal;
    // End of variables declaration//GEN-END:variables

    private void busquedaHv() {
        this.modelot.vaciarTabla();
        String i = ((javax.swing.JTextField) fechai.getDateEditor().getUiComponent()).getText();
        String f = ((javax.swing.JTextField) fechaf.getDateEditor().getUiComponent()).getText();
        ResultSet MysqlConsulta=null;
        try {
            //ResultSet MysqlConsulta = NewMain.o.MysqlConsulta("SELECT * FROM `historiaVehiculo` WHERE `nombre` LIKE '%"+this.nombre.getText()+"%' AND `placa` LIKE '%"+this.placa.getText()+"%' AND `dueno` LIKE '%"+this.dueno.getText()+"%' AND `chofer` LIKE '%"+this.chofer.getText()+"%' AND `fecha` => '" + i + " "+this.horai.getSelectedItem()+":"+this.minutoi.getSelectedItem()+":"+this.segundoi.getSelectedItem()+"' AND `fecha` =< '" + i + " "+this.horai.getSelectedItem()+":"+this.minutoi.getSelectedItem()+":"+this.segundoi.getSelectedItem()+"' AND  `valorTotal` LIKE '%"+this.valtotal.getText()+"%' AND `valorTotalConDescuento` LIKE '%"+this.valdesc.getText()+"'%");
            if(jCheckBox1.isSelected()){
               MysqlConsulta = NewMain.o.MysqlConsulta("SELECT * FROM `historiaVehiculo` WHERE `nombre` LIKE '%"+this.nombre.getText()+"%' AND `placa` LIKE '%"+this.placa.getText()+"%' AND `dueno` LIKE '%"+this.idCliente+"%' AND `chofer` LIKE '%"+this.idChofer+"%' AND (`fecha` >= '" + i + " "+this.horai.getSelectedItem()+":"+this.minutoi.getSelectedItem()+":"+this.segundoi.getSelectedItem()+"' and `fecha` <= '" + f + " "+this.horaf.getSelectedItem()+":"+this.minutof.getSelectedItem()+":"+this.segundof.getSelectedItem()+"') AND  `valorTotal` LIKE '%"+this.valtotal.getText()+"%' AND `valorTotalConDescuento` LIKE '%"+this.valdesc.getText()+"%'"); 
            }else{
               MysqlConsulta = NewMain.o.MysqlConsulta("SELECT * FROM `historiaVehiculo` WHERE `nombre` LIKE '%"+this.nombre.getText()+"%' AND `placa` LIKE '%"+this.placa.getText()+"%' AND `dueno` LIKE '%"+this.idCliente+"%' AND `chofer` LIKE '%"+this.idChofer+"%' AND `valorTotal` LIKE '%"+this.valtotal.getText()+"%' AND `valorTotalConDescuento` LIKE '%"+this.valdesc.getText()+"%'");
            }
            while(MysqlConsulta.next()){               
               String a[] ={MysqlConsulta.getString("indice"),MysqlConsulta.getString("nombre"),MysqlConsulta.getString("placa"), MysqlConsulta.getString("dueno"),MysqlConsulta.getString("chofer"),MysqlConsulta.getString("fecha"),MysqlConsulta.getString("valorTotal"), MysqlConsulta.getString("valorTotalConDescuento")};
               this.modelot.ingresarUsuario(a);
            }       
        } catch (SQLException ex) {
            try {
                String a[] ={MysqlConsulta.getString("indice"),MysqlConsulta.getString("nombre"),MysqlConsulta.getString("placa"), MysqlConsulta.getString("dueno"),MysqlConsulta.getString("chofer"),"0000-00-00 00:00:00",MysqlConsulta.getString("valorTotal"), MysqlConsulta.getString("valorTotalConDescuento")};
                this.modelot.ingresarUsuario(a);
            } catch (SQLException ex1) {
                JOptionPane.showMessageDialog(rootPane, "A ocurrido un error inexperado");
            }
        }
        this.modelot.reload();
    }

    private void llenarTabla() {
        this.modelot.vaciarTabla();
        String i = ((javax.swing.JTextField) fechai.getDateEditor().getUiComponent()).getText();
        ResultSet MysqlConsulta=null;
        try {
            MysqlConsulta = NewMain.o.MysqlConsulta("SELECT * FROM `historiaVehiculo`");
            while(MysqlConsulta.next()){               
               String a[] ={MysqlConsulta.getString("indice"),MysqlConsulta.getString("nombre"),MysqlConsulta.getString("placa"), MysqlConsulta.getString("dueno"),MysqlConsulta.getString("chofer"),MysqlConsulta.getString("fecha"),MysqlConsulta.getString("valorTotal"), MysqlConsulta.getString("valorTotalConDescuento")};
               this.modelot.ingresarUsuario(a);
            }       
        }catch (SQLException ex) {
            try {
                String a[] ={MysqlConsulta.getString("indice"),MysqlConsulta.getString("nombre"),MysqlConsulta.getString("placa"), MysqlConsulta.getString("dueno"),MysqlConsulta.getString("chofer"),"0000-00-00 00:00:00",MysqlConsulta.getString("valorTotal"), MysqlConsulta.getString("valorTotalConDescuento")};
                this.modelot.ingresarUsuario(a);
            } catch (SQLException ex1) {
                JOptionPane.showMessageDialog(rootPane, "A ocurrido un error inexperado");
            }
               
        }
        this.modelot.reload();
    }

    void setCliente(Object nombre, Object identificacion) {
        dueno.setText(nombre+"");
        this.idCliente=identificacion;
    }

    

    void obtenerDChofer(String identificacion, String nombres) {
        this.chofer.setText(nombres);
        this.idChofer = identificacion;
    }
    
}

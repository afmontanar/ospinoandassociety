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
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.table.TableColumn;
import utilities.ValidarCamposVacios;

/**
 *
 * @author afmontanar
 */
public class HistoriaVehiculos extends javax.swing.JDialog {

    /**
     * Creates new form HistoriaVehiculos
     */
    private utilities.ModelosTabla modelot;
    private ValidarCamposVacios objectv;
    private Object idCliente;
    private String idChofer;

    public HistoriaVehiculos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        String n[] = {"Cantidad", "Marca", "Referencia", "Detalle", "Rueda", "Valor unitario", "Valor total", "Valor con descuento"};
        this.modelot = new utilities.ModelosTabla(n, jTable1);
        this.jTable1.setModel(this.modelot);
        TableColumn column = this.jTable1.getColumnModel().getColumn(7);
        column.setCellEditor(new DefaultCellEditor(new utilities.TexfieldTRC(this)));
        TableColumn column1 = this.jTable1.getColumnModel().getColumn(5);
        column1.setCellEditor(new DefaultCellEditor(new utilities.TexfieldCxVu(this)));
//        TableColumn column2 = this.jTable1.getColumnModel().getColumn(6);
//        column2.setCellEditor(new DefaultCellEditor(new utilities.TexfieldTcd(this)));      
//        this.modelot.addTableModelListener(new TableModelListener() {
//            @Override
//            public void tableChanged(TableModelEvent e) {
//                jtable1TableChanged(e);
//            }
//        });
    }

    public void jtable1TableChanged(TableModelEvent e) {
        this.sumatot();
        this.sumaDes();
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
        jLabel1 = new javax.swing.JLabel();
        placa = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        chofer = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dueno = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        Total = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        Totaldes = new javax.swing.JLabel();
        horai = new javax.swing.JComboBox();
        minutoi = new javax.swing.JComboBox();
        segundoi = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Historia de vehiculos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        placa.setBorder(javax.swing.BorderFactory.createTitledBorder("Placa"));
        placa.setName("Nombre"); // NOI18N
        jPanel1.add(placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 180, 40));

        nombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        nombre.setName("nombre"); // NOI18N
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, 40));

        chofer.setBorder(javax.swing.BorderFactory.createTitledBorder("Chofer"));
        jPanel1.add(chofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 180, 50));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 30, 40));

        dueno.setBorder(javax.swing.BorderFactory.createTitledBorder("Dueño"));
        jPanel1.add(dueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 180, 50));

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 30, 40));

        fecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        fecha.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 180, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1980, -1));

        jScrollPane2.setViewportView(jPanel2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1200, 400));

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 70, -1, -1));

        Total.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Total.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));
        jPanel1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 590, 240, 50));

        jToggleButton1.setText("Agregar registro");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, -1));

        Totaldes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Totaldes.setBorder(javax.swing.BorderFactory.createTitledBorder("Total con descuento"));
        jPanel1.add(Totaldes, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 590, 240, 50));

        horai.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "" }));
        horai.setBorder(javax.swing.BorderFactory.createTitledBorder("Hora"));
        jPanel1.add(horai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 70));

        minutoi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));
        minutoi.setBorder(javax.swing.BorderFactory.createTitledBorder("Minuto"));
        jPanel1.add(minutoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 80, 70));

        segundoi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));
        segundoi.setBorder(javax.swing.BorderFactory.createTitledBorder("Segundo"));
        jPanel1.add(segundoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 80, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here: Aca voy ha buscar el dueno
        Principal r = (Principal) super.getParent();
        r.setGrillaClienteVisibility(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (null != this.idCliente) {
            Principal r = (Principal) super.getParent();
            r.getGrillaChofer(this.idCliente.toString());
        } else {
            JOptionPane.showMessageDialog(this, "No a seleccionado dueno");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        Object[] a = {"", "", "", "", "", "", "", ""};
        this.modelot.ingresarUsuario(a);
//        this.sumaDes();
        this.modelot.fireTableCellUpdated(0, 6);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.guardar();
    }//GEN-LAST:event_jButton3ActionPerformed

//     public void sumaDes(int suplemento){
    public void sumaDes() {
        int sumTot = 0;
        for (int i = 0; i < this.jTable1.getRowCount(); i++) {
            try {
                int parseInt = Integer.parseInt((String) this.modelot.getValueAt(i, 7));
                sumTot = sumTot + parseInt;
            } catch (Exception e) {
                sumTot = +sumTot;
            }
            this.Totaldes.setText(sumTot + "");
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Total;
    private javax.swing.JLabel Totaldes;
    private javax.swing.JLabel chofer;
    private javax.swing.JLabel dueno;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JComboBox horai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox minutoi;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField placa;
    private javax.swing.JComboBox segundoi;
    // End of variables declaration//GEN-END:variables

    void setCliente(Object nombre, Object identificacion) {
        this.dueno.setText(nombre + "");
        this.idCliente = identificacion;
    }

    void obtenerDChofer(String identificacion, String nombres) {
        this.chofer.setText(nombres);
        this.idChofer = identificacion;
    }

    public void multiCxVu(String text) {
        try {
            int parseInt = Integer.parseInt(text);
            int parseInt1 = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            int resultado = parseInt * parseInt1;
            jTable1.setValueAt(resultado + "", jTable1.getSelectedRow(), 6);
        } catch (Exception r) {

        }
    }

    private void guardar() {
        String i = ((javax.swing.JTextField) fecha.getDateEditor().getUiComponent()).getText();
        try {
            NewMain.o.EjecutarMysql("INSERT INTO `mecanics`.`historiaVehiculo` (`nombre`, `placa`, `dueno`, `chofer`, `fecha`, `valorTotal`, `valorTotalConDescuento`, `indice`) VALUES ('" + this.nombre.getText() + "', '" + this.placa.getText() + "', '" + this.idCliente + "', '" + this.idChofer + "', '" + i + " "+this.horai.getSelectedItem()+":"+this.minutoi.getSelectedItem()+":"+this.segundoi.getSelectedItem()+"', '" + this.Total.getText() + "', '" + this.Totaldes.getText() + "','"+this.obtenerUingresado()+"')");
            this.guardarDetalles();
            JOptionPane.showMessageDialog(this, "Guardado con exito");
            this.reiniciarformulario();
        } catch (SQLException ex) {
            Logger.getLogger(HistoriaVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sumatot() {
        int sumTot = 0;
        for (int i = 0; i < this.jTable1.getRowCount(); i++) {
            try {
                int parseInt = Integer.parseInt((String) this.jTable1.getValueAt(i, 6));
                sumTot = sumTot + parseInt;
            } catch (Exception e) {
                sumTot = +sumTot;
            }
            this.Total.setText(sumTot + "");
        }
    }

    public void pretotaDes(String caretotades) {
        try {
            jTable1.setValueAt(caretotades + "", jTable1.getSelectedRow(), 7);
        } catch (Exception r) {

        }
    }

    private void reiniciarformulario() {
        Total.setText("");
        Totaldes.setText("");
        chofer.setText("");
        dueno.setText("");
        fecha.setDate(null);
        this.modelot.vaciarTabla();
        nombre.setText("");
        placa.setText("");
    }

    private void guardarDetalles() {
        
        try {
            NewMain.o.EjecutarMysql("INSERT INTO `mecanics`.`DetalleHistoriaVehiculo` (`codhistori`, `cantidad`, `Marca`, `Referencia`, `Detalle`, `Rueda`, `Valorunitario`, `valorTotal`, `Valordescuento`) VALUES ('"+this.obtenerUingresado1()+"', '"++"', 'b', 'c', 'd', 'e', 'f', 'g', 'h')");         
        
        } catch (SQLException ex) {
            Logger.getLogger(HistoriaVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private int obtenerUingresado() {
        try {
            ResultSet MysqlConsulta = NewMain.o.MysqlConsulta("SELECT indice FROM `historiaVehiculo` WHERE `indice`=(SELECT MAX(indice) from `historiaVehiculo`) ");
            if(MysqlConsulta.next()){
                int aInt = MysqlConsulta.getInt("indice");
               return (aInt+1);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(HistoriaVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

     private String obtenerUingresado1() {
        try {
            ResultSet MysqlConsulta = NewMain.o.MysqlConsulta("SELECT indice FROM `historiaVehiculo` WHERE `indice`=(SELECT MAX(indice) from `historiaVehiculo`) ");
            if(MysqlConsulta.next()){               
               return MysqlConsulta.getString("indice");
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(HistoriaVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

   
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mecanics;



/**
 *
 * @author OSPINO Y ASOCIADO
 */
public class Principal extends javax.swing.JFrame {

    private Object poder;
    private final Cliente cliente;
    private final HistoriaVehiculos hvehiculo;
    private final GrillaCliente gcliente;
    private final GrillaChofer gchofer;
    private final BusquedaHv BusqHv;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        this.cliente = new Cliente(this, true);
        this.hvehiculo = new HistoriaVehiculos(this, true);
        this.gcliente = new GrillaCliente(this, true);
        this.gchofer = new GrillaChofer(this, true);
        this.BusqHv = new BusquedaHv(this, true);
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        BusquedaHv = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/afhce curso activo fijo1.jpg"))); // NOI18N
        jDesktopPane2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1380, 750);

        jPanel1.add(jDesktopPane2, java.awt.BorderLayout.CENTER);

        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "1", "2", "3" }));

        jMenu4.setText("Inicio");

        jMenuItem7.setText("Cliente");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem1.setText("H Vehiculos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        BusquedaHv.setText("Busqueda Hv");
        BusquedaHv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaHvActionPerformed(evt);
            }
        });
        jMenu4.add(BusquedaHv);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1378, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 1377, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 723, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        this.poder = this.cliente;
        this.cliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.poder = this.hvehiculo;
        this.hvehiculo.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void BusquedaHvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaHvActionPerformed
        // TODO add your handling code here:
        this.poder = this.hvehiculo;
        this.BusqHv.setVisible(true);
        this.BusqHv.llenarTabla();
    }//GEN-LAST:event_BusquedaHvActionPerformed

//    protected void setHistoriaVehiculosVisibility(boolean prendido){
//        this.cliente.setVisible(prendido);
//    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BusquedaHv;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    void getGrillaChofer(String toString, int s) {
        this.gchofer.alimentarGrillaChofer(toString,s);
        this.gchofer.setVisible(true);
    }

    void setHistoriaVehiculosCliente(Object nombre, Object identificacion) {
        this.hvehiculo.setCliente(nombre, identificacion);
    }

    void gChoferAhv(String identificacion, String nombres) {
        this.hvehiculo.obtenerDChofer(identificacion,nombres);
    }

    void setGrillaClienteVisibility(boolean b, int i) {
        this.gcliente.quienPide(i);
        this.gcliente.setVisible(b);
    }

    void setGrillaHistoriaVCli(Object nombre, Object identificacion) {
        this.BusqHv.setCliente(nombre, identificacion);
    }

    void gChoferABhv(String identificacion, String nombres) {
        this.BusqHv.obtenerDChofer(identificacion,nombres);
    }

    void mostrarHv(String indice, String nombre, String placa, String dueno, String chofer, String fecha, String valorTotal, String valortotaldescuento) {
        this.hvehiculo.alimentarHv(indice, nombre, placa, dueno, chofer, fecha, valorTotal, valortotaldescuento);
        this.hvehiculo.setVisible(true);
    }

    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;


import activosfijos.ModelosTabla;
import activosfijos.RenderCelda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author OSPINO Y ASOCIADO
 */
public class Grilla extends javax.swing.JDialog {
 Object poder;
 ModelosTabla tm;
    /**
     * Creates new form Grilla
     */
    public Grilla(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
         String[] columnas = {"Nombre","Nivel"};
        this.tm = new ModelosTabla(columnas, jTable1, "usuario");

       TableCellRenderer renderer = new RenderCelda();
            try {
                jTable1.setDefaultRenderer(Class.forName( "java.lang.Object" ), renderer );
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Error en setdefaultRender");
            }
            jTable1.setModel(tm);
          Usuarios.di.put("usa", new nuevosusuarios(this, true));
          Usuarios.di.put("edi", new EditarLosUsuarios(this, true));
    }
int con=0;
      public void buscar1()  
{  int sw=0;
  // limpiartabla(); //nueva busqueda
   con=0;   // se limpio la tabla no hay datos
   tm.vaciarTabla();
 try 
{
  ResultSet resultado1 = Usuarios.c.MysqlConsulta("select Nombre,Nivel from usuario where Nombre like'%"+buscar.getText()+"%'");

  while(resultado1.next()) // va avanzando de UN(1) cliente.
{
 tm.setValueAt(resultado1.getString("Nombre"), con, 0);
tm.setValueAt(resultado1.getString("Nivel"), con, 1);
con++;
 sw=1;
} 
if(sw==0)                 
{
JOptionPane.showMessageDialog(this, "no existen clientes");

}
 resultado1.close(); 
}
 catch (Exception e) 
{
 JOptionPane.showMessageDialog(this, "error al buscar los datos" + e);
}
}    
 int conf=0;
      public void buscar()  
{  int sw=0;
  // limpiartabla(); //nueva busqueda
   conf=0;   // se limpio la tabla no hay datos
 try 
{
  ResultSet resultado1 = Usuarios.c.MysqlConsulta("select Nombre,Nivel from usuario where Pasabordo='"+buscar.getText()+"'");

  while(resultado1.next()) // va avanzando de UN(1) cliente.
{
 jTable1.setValueAt(resultado1.getString("Nombre"), conf, 0);
 jTable1.setValueAt(resultado1.getString("Nivel"), conf, 1);

conf++;
 sw=1;
} 
if(sw==0)                 
{
JOptionPane.showMessageDialog(this, "no existen clientes");

}
 resultado1.close(); 
}
 catch (Exception e) 
{
 JOptionPane.showMessageDialog(this, "error al buscar los datos" + e);
}
}    
public void buscarusu(){
         try
            
{
 int selectedRow = jTable1.getSelectedRow();
ResultSet resultado1 = Usuarios.c.MysqlConsulta("select * from usuario where Nombre='"+jTable1.getValueAt(selectedRow, 0).toString() +"'");
if(resultado1.next())
  {
EditarLosUsuarios.jTextField1.setText(resultado1.getString("Nombre"));
EditarLosUsuarios.jPasswordField1.setText(resultado1.getString("Pasabordo"));
EditarLosUsuarios.jLabel2.setText(resultado1.getString("Nivel"));
}
//}
 }
catch(Exception e)
{
//JOptionPane.showMessageDialog(this,"ERROR"+ e);
}
    }
public void eliminar(){
   try
{	Connection  Conec;
Statement  sentencia;
String url, instruccion;
Class.forName("com.mysql.jdbc.Driver");
url = "jdbc:mysql://localhost:3306/"+"atcivofijo";
Conec = (Connection) DriverManager.getConnection( url, "root","");
sentencia=Conec.createStatement();
instruccion="delete  from usuario where  Pasabordo='"+buscar.getText()+"'";
sentencia.execute(instruccion);
JOptionPane.showMessageDialog(this," eliminado");
 
}
catch(Exception e)
        
{
JOptionPane.showMessageDialog(this,"ERROR"+ e);
}   
    }  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar3 = new javax.swing.JToolBar();
        jComboBox3 = new javax.swing.JComboBox();
        jSeparator39 = new javax.swing.JToolBar.Separator();
        buscar = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        jSeparator18 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JToolBar.Separator();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        jSeparator16 = new javax.swing.JToolBar.Separator();
        jSeparator19 = new javax.swing.JToolBar.Separator();
        jSeparator31 = new javax.swing.JToolBar.Separator();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        jSeparator28 = new javax.swing.JToolBar.Separator();
        jSeparator27 = new javax.swing.JToolBar.Separator();
        jSeparator29 = new javax.swing.JToolBar.Separator();
        jSeparator30 = new javax.swing.JToolBar.Separator();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar3.setRollover(true);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario", "CodigoUsuario" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jToolBar3.add(jComboBox3);
        jToolBar3.add(jSeparator39);
        jToolBar3.add(buscar);
        jToolBar3.add(jSeparator10);

        jButton2.setText("Nuevo");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton2);

        jButton1.setText("Editar");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton1);

        jButton3.setText("Borrar");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton3);
        jToolBar3.add(jSeparator13);
        jToolBar3.add(jSeparator14);
        jToolBar3.add(jSeparator18);
        jToolBar3.add(jLabel1);
        jToolBar3.add(jSeparator17);
        jToolBar3.add(jSeparator15);
        jToolBar3.add(jSeparator16);
        jToolBar3.add(jSeparator19);
        jToolBar3.add(jSeparator31);
        jToolBar3.add(jSeparator11);
        jToolBar3.add(jSeparator28);
        jToolBar3.add(jSeparator27);
        jToolBar3.add(jSeparator29);
        jToolBar3.add(jSeparator30);
        jToolBar3.add(jSeparator8);
        jToolBar3.add(jSeparator12);
        jToolBar3.add(jSeparator9);
        jToolBar3.add(jSeparator7);
        jToolBar3.add(jSeparator6);

        jButton6.setText("Salir");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Nivel de Autoridad"
            }
        ));
        jTable1.setPreferredSize(new java.awt.Dimension(700, 3200));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane1.setBounds(0, 10, 720, 280);
        jDesktopPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 307, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 38, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        if (jComboBox3.getSelectedItem() == "Usuario") {
            buscar1();
        } else {
            if (jComboBox3.getSelectedItem() == "CodigoUsuario") {
                buscar();
            }
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.poder = Usuarios.di.get("usa");
        JDialog pu = (JDialog) this.poder;
        pu.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 buscarusu();
        this.poder = Usuarios.di.get("edi");
        JDialog pu = (JDialog) this.poder;
        pu.setVisible(true);
// buscarusu();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        eliminar();
        buscar.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jLabel1.setText("");
//        this.setVisible(false);
   this.dispose();

//              System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /*
//         * Set the Nimbus look and feel
      /*
//         * Create and display the dialog
//         */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//                Grilla dialog = new Grilla(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    public static javax.swing.JComboBox jComboBox3;
    private javax.swing.JDesktopPane jDesktopPane1;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator16;
    private javax.swing.JToolBar.Separator jSeparator17;
    private javax.swing.JToolBar.Separator jSeparator18;
    private javax.swing.JToolBar.Separator jSeparator19;
    private javax.swing.JToolBar.Separator jSeparator27;
    private javax.swing.JToolBar.Separator jSeparator28;
    private javax.swing.JToolBar.Separator jSeparator29;
    private javax.swing.JToolBar.Separator jSeparator30;
    private javax.swing.JToolBar.Separator jSeparator31;
    private javax.swing.JToolBar.Separator jSeparator39;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar3;
    // End of variables declaration//GEN-END:variables
}

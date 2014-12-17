/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package saldos;

import activosfijos.ModelosTabla;
import activosfijos.RenderCelda;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableCellRenderer;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import productos.Producto;

/**
 *
 * @author OSPINO Y ASOCIADO
 */
public class Lector extends javax.swing.JDialog {
 private final ModelosTabla tm;
    /**
     * Creates new form Lector
     */
    public Lector(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
//        , "Serie", "Marca", "Modelo", "Estado", "ID_Responsable", "Nombre  del  Responsable", "Localizacion", "Valor del Producto"
        String[] columnas = {"Codigo del Activofijo", "Nombre del Activofijo"};
//        , "Modelo", "Estado", "Cantidad", "CentrodeCosto", "NombredeCentrodeCosto", "CodigoDepreciacion", "NombreDepreciacion", "IDProveedor", "NombreProveedor", "Fabricante", "Distribuidora", "CostodeAdquisicion", "TotaldeAdquisicion", "totalDepreciaciones", "TotalMantenimiento", "ValorAcumulado", "Valorizacion", "Garantia", "FechadeVencimeintoGaran", "Mantenimiento", "FechaInicial", "numerodeSeciones", "Tiempo", "FechadeVencimientoManteni", "detalle"
        this.tm = new ModelosTabla(columnas, jTable1);
        TableCellRenderer renderer = new RenderCelda();
            try {
                jTable1.setDefaultRenderer(Class.forName( "java.lang.Object" ), renderer );
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Error en setdefaultRender");
            }
             jTable1.setModel(tm);
    }
public boolean buscarCB() {
//       encabezadosaldoactivvo.indiceRe=responsables.indiceRe &&
        try {
//, responsables.idresponsable, responsables.nombrerespon, responsables.namedireccion, saldoactivo.valorproducto
            ResultSet resultado1 = Producto.c.MysqlConsulta("select saldoactivo.codeActivofijo, detallesaldoactivo.nameproducto from saldoactivo,detallesaldoactivo where  detallesaldoactivo.codecontable=saldoactivo.codigoContable && saldoactivo.codeActivofijo='" +jTextField1.getText()+ "'");
            if (resultado1.next()) {
//                ,responsables,encabezadosaldoactivvo
//                ,resultado1.getString("saldoactivo.serie"),resultado1.getString("saldoactivo.marca"),resultado1.getString("saldoactivo.estado"),resultado1.getString("responsables.idresponsable"),resultado1.getString("responsables.nombrerespon"),resultado1.getString("responsables.namedireccion"),resultado1.getString("saldoactivo.valorproducto")
                String e[]={ jTextField1.getText(),resultado1.getString("detallesaldoactivo.nameproducto")};
//                ,resultado1.getString("Modelo"),resultado1.getString("Cantidad"),resultado1.getString("CentrodeCosto"),resultado1.getString("NombredeCentrodeCosto"),resultado1.getString("CodigoDepreciacion"),resultado1.getString("NombreDepreciacion"),resultado1.getString("IDProveedor"),resultado1.getString("NombreProveedor"),resultado1.getString("Fabricante"),resultado1.getString("Distribuidora"),resultado1.getString("CostodeAdquisicion"),resultado1.getString("TotaldeAdquisicion"),resultado1.getString("ValorAcumulado"),resultado1.getString("Valorizacion"),resultado1.getString("Garantia"),resultado1.getString("FechadeVencimeintoGaran"),resultado1.getString("Mantenimiento"),resultado1.getString("FechaInicial"),resultado1.getString("numerodeSeciones"),resultado1.getString("Tiempo"),resultado1.getString("FechadeVencimientoManteni"),resultado1.getString("detalle")
//                buscarImagen(resultado1);
//                Editaractivos.pisos.setText(resultado1.getString("Piso"));
//                Editaractivos.centrodecosto.setText(resultado1.getString("CentrodeCosto"));
//                Editaractivos.nombredelcentrocosto.setText(resultado1.getString("NombredeCentrodeCosto"));
//                Editaractivos.oficina.setText(resultado1.getString("Oficina"));
//                Editaractivos.codcontable.setText(resultado1.getString("CodigoContable"));
//                
                tm.ingresarUsuario(e);
//                jTextField1.setText("");
                return true;
            }
            


        } catch (Exception e) {
JOptionPane.showMessageDialog(this,"ERROR"+ e);
        }
        return false;
    }
    
//    public void ImprimirInformeExcel(ModelosTabla tabla ,String titulo ){
//         Blank workbook
//        XSSFWorkbook workbook = new XSSFWorkbook(); 
//         
//        //Create a blank sheet
//        XSSFSheet sheet = workbook.createSheet("Employee Data");
//          
//        //This data needs to be written (Object[])
////        Map<String, Object[]> data = new TreeMap<String, Object[]>();
////        data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
////        data.put("2", new Object[] {1, "Amit", "Shukla"});
////        data.put("3", new Object[] {2, "Lokesh", "Gupta"});
////        data.put("4", new Object[] {3, "John", "Adwards"});
////        data.put("5", new Object[] {4, "Brian", "Schultz"});
//        
//        //Iterate over data and write to sheet
////        Set<String> keyset = data.keySet();
//        int rownum = 0;
//      String[] titleColums = {"codeActivofijo"};
//       
//            Row row1 = sheet.createRow(rownum++);
////            Object [] objArr = titleColums[i];
//            int cellnum1 = 0;
//            for (Object obj : titleColums)
//            {
//               Cell cell = row1.createCell(cellnum1++);
//               if(obj instanceof String)
//                    cell.setCellValue((String)obj);
//                else if(obj instanceof Integer)
//                    cell.setCellValue((Integer)obj);
//            }
//     List<Object[]> usuarios = tabla.getUsuarios();
//        
//        for (int i=0;i<usuarios.size();i++)
//        {
//            Row row = sheet.createRow(rownum++);
//            Object [] objArr =usuarios.get(i);
//            int cellnum = 0;
//            for (Object obj : objArr)
//            {
//               Cell cell = row.createCell(cellnum++);
//               if(obj instanceof String)
//                    cell.setCellValue((String)obj);
//                else if(obj instanceof Integer)
//                    cell.setCellValue((Integer)obj);
//            }
//        }
//        try
//        {
//            //Write the workbook in file system
//            FileOutputStream out = new FileOutputStream(new File("c:/reportes/"+titulo+".xlsx"));
//            workbook.write(out);
//            out.close();
//            JOptionPane.showMessageDialog(this, "¡Exportado!");
//        } 
//        catch (Exception e) 
//        {
//            e.printStackTrace();
//        }
////       try
////       {
//////           WritableWorkbook workbook;
//////           workbook = Workbook.createWorkbook(new File("c:/reportes/"+titulo+".xls"));
////           XSSFWorkbook workbook = new XSSFWorkbook(); 
//////           WritableSheet sheet = workbook.createSheet("Factura Ventas", 0);
////           //tipo letra
////           XSSFSheet sheet = workbook.createSheet("Employee Data");
////           
////           
//           WritableFont arial10font = new WritableFont(WritableFont.ARIAL, 11,WritableFont.BOLD,true);
//           WritableCellFormat arial10format = new WritableCellFormat (arial10font);
// 
//           WritableCellFormat fCabecera = new WritableCellFormat(arial10font);
////           JOptionPane.showMessageDialog(null,"entre12");
//           fCabecera.setAlignment(Alignment.JUSTIFY);
//           fCabecera.setVerticalAlignment(VerticalAlignment.CENTRE);
//           fCabecera.setBackground(Colour.CORAL);
//           fCabecera.setBorder(Border.ALL,BorderLineStyle.THIN);
//       
//        
//             jxl.write.Label label;
//           for(int y=0;y<tabla.getColumnCount();y++)
//           {
//           label= new jxl.write.Label(y, ini,  tabla.getColumnName(y).replace(" ",""),fCabecera);
//           sheet.addCell(label);
//             sheet.setColumnView(y,tabla.getColumnName(y).length()*180/100);
//     
//           
//           }
//  
// 
//           int i=0,auxi;
//           while(i<tabla.getRowCount()){
//           auxi=ini+2+i;
//           for(int y=0;y<tabla.getColumnCount();y++)
//           {
//               //JOptionPane.showMessageDialog(null,"entr "+tabla.getValueAt(i, y));
//                    if( sheet.getColumnWidth(y)<tabla.getValueAt(i, y).toString().length()*129/100 )
//                        sheet.setColumnView(y,tabla.getValueAt(i, y).toString().length()*129/100);
// 
//            //JOptionPane.showMessageDialog(null,"entr111  "+y);
// 
//               if(QuitarFormateoEntero(tabla.getValueAt(i, y).toString())==0)
//               {
//                   if(validar_campos_numerico(tabla.getValueAt(i, y).toString()))
//                   {
//                       
//                   jxl.write.Number number = new jxl.write.Number(y, auxi,QuitarFormateoEntero(tabla.getValueAt(i, y).toString()));
//                    sheet.addCell(number);
//                   }
//                   else
//                   {
//                   label = new jxl.write.Label(y, auxi,""+tabla.getValueAt(i, y).toString());
//                   sheet.addCell(label);
//                   }
//                   //JOptionPane.showMessageDialog(null,"entr222  "+y);
//               }
//               else
//               {
// 
// 
//                   jxl.write.Number number = new jxl.write.Number(y, auxi,QuitarFormateoEntero(tabla.getValueAt(i, y).toString()));
//                    sheet.addCell(number);
// 
// 
//               }
//               //JOptionPane.showMessageDialog(null,"fin "+i);
// 
//           }
// 
//           i=i+1;
// 
//           }
// 
// 
//           workbook.write();
//           workbook.close();
//           JOptionPane.showMessageDialog(null,"Archivo creado correctamente");
// 
// 
// 
//       }
//       catch(Exception e)
//       {
// JOptionPane.showMessageDialog(null,"error de guardar excel formulario:"+ titulo+"  " +e);
//       }
//   }

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

 public boolean validar_campos_numerico(String campo) {
        Long x;
        try {
 
            x = Long.parseLong(campo);
 
 
            return true;
        } catch (Exception e) {
            return false;
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

        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 250, 241));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "codigo de la placa"));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 440, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 90));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1450, 330));

        jPanel1.setBackground(new java.awt.Color(255, 250, 241));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/java_1.jpg"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 120, 40));

        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Titulo de informe"));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 330, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 1450, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        if (buscarCB()) {
            //        this.poder = ActivosFijos.e.get("editaract");
            //        JDialog pu = (JDialog) this.poder;
            //        pu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No existe activo");
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
//        ImprimirInformeExcel(tm, jTextField2.getText());
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Lector dialog = new Lector(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}

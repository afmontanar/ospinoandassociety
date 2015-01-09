/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author OSPINO Y ASOCIADO
 */
                                             
 public class ModelosTablaU extends AbstractTableModel implements Cloneable{
    private ArrayList<Object[]> usua;  
    private List<Object[]> usuarios;
    private String TitleColums[];
    int numberColumn;
    private JTable jTable1;

    public List<Object[]> getUsuarios() {
        return usuarios;
    }
  
   
    //otras funciones miembro
    
    public void setUsuarios(List<Object[]> usuarios) {
        this.usuarios = usuarios;
        this.reload();
    }
    
        public ModelosTablaU(String[] TitleColums, JTable jTable1, String tabla) {          
            this.usuarios = new ArrayList<Object[]>();
            try {
            this.TitleColums = TitleColums;
            this.numberColumn = TitleColums.length;
            this.jTable1 = jTable1;
            String concat = "";
            for (int i = 0; i < TitleColums.length; i++) {
                String toLowerCase = TitleColums[i].toLowerCase();
                concat += toLowerCase + ",";
            }
            concat = concat.substring(0, concat.length() - 1);
            //            ResultSet Consulta = Ejercicio.co.Consulta("select " + concat + " from " + tabla);
            Statement sentencia;
            Connection Conec = (Connection) DriverManager.getConnection(("jdbc:mysql://localhost:3306/" + "atcivofijo"), "root", "1988");
            sentencia = Conec.createStatement();
            String sente = "select " + concat + " from " + tabla;
            ResultSet resultado1 = sentencia.executeQuery("select " + concat + " from " + tabla);
            try {
                while (resultado1.next()) {
//                    String n[] = {Consulta.getString("nombre"), Consulta.getString("apellido"), Consulta.getString("saldo"), Consulta.getString("estado"), Consulta.getString("cupo")};
                    ArrayList a = new ArrayList();
                    for (int i = 0; i < TitleColums.length; i++) {
                        a.add(resultado1.getString(TitleColums[i].toLowerCase()));
                    }
                    Object[] toArray = a.toArray();
                    this.ingresarUsuarioM(toArray);
                }
                jTable1.revalidate();
                jTable1.repaint();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la consulta ha la base de datos");
            }
            } catch (SQLException ex) {
                Logger.getLogger(ModelosTablaU.class.getName()).log(Level.SEVERE,null, ex);
            }
        }

    public ModelosTablaU(ArrayList<Object[]> usua, String[] TitleColums, JTable jTable1) {
        this.usua = usua;
        this.TitleColums = TitleColums;
        this.jTable1 = jTable1;
        this.numberColumn = TitleColums.length;
    }

//    public ModelosTabla(String[] TitleColums, JTable jTable1,int D) {
//        this.TitleColums = TitleColums;
//         this.usuarios = new LinkedList<Object[]>(); 
//        this.jTable1 = jTable1;
//        this.numberColumn = TitleColums.length;
//    }

    public ModelosTablaU(String[] columnas, JTable jTable1) {
        this.usuarios = new LinkedList<Object[]>();       
        this.TitleColums = columnas;
        this.jTable1 = jTable1;
        this.numberColumn = TitleColums.length;
    }
    
    public String getColumnName(int column) {
        String result=TitleColums[column];  
        return result;
    }
     public void ingresarUsuarioM(Object [] Usuario){
        usuarios.add(Usuario);
    }
    
     public void ingresarusuariomultiple(Object [] usuObjects){
    usuarios.add(usuObjects);
   
     
     }
     
     public boolean isCellEditable(int row, int col) {
            //Note that the data/cell address is constant,
            //no matter where the cell appears onscreen.
//            if (col < 1 || col == this.TitleColums.length-1){
//                return false;
//            } else {
                return true;
//            }
        }

        
    public void ingresarUsuario(Object [] Usuario){
        usuarios.add(Usuario);
        jTable1.revalidate();
        jTable1.repaint();
    }
    
    public void actualizarUsuario(Object [] UsuarioAactualizar, int seleccionado){
                usuarios.set(seleccionado, UsuarioAactualizar);
                jTable1.revalidate();
                jTable1.repaint();
         
     }
   public void actualizarUsuarioM(Object [] UsuarioAactualizar, int seleccionado){
                usuarios.set(seleccionado, UsuarioAactualizar);
     }
    
    @Override
    public int getRowCount() {
        return usuarios.size();
        }

    @Override
    public int getColumnCount() {
        return numberColumn;
        }
    @Override
     public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object resultado = usuarios.get(rowIndex)[columnIndex];
        return resultado;
    }
     
        public void eliminarUsuario(int seleccionado) {
                usuarios.remove(seleccionado);
                jTable1.revalidate();
                jTable1.repaint();
        }
        
        public void eliminarUsuarioM(int seleccionado) {
                usuarios.remove(seleccionado);
                
        }
        
         public void vaciarTabla() {
            usuarios.clear();
            this.reload();
        }
         
         public void reload(){
             jTable1.revalidate();
             jTable1.repaint();
         }
         
         public void setValueAt(Object value, int row, int col) {
            usuarios.get(row)[col] = value;
            fireTableCellUpdated(row, col);
        }
         
}
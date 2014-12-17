/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author andres
 */


import java.sql.*;
import javax.swing.JOptionPane;
/*
 * Esta es la clase de conexion con el motor de base de datos de mysql
 */
public class Connetion{
    
    private Connection miconexion;
    private Statement stSentencias;
    private ResultSet rsDatos;
    private PreparedStatement psPreparar;

    public Connection getMiconexion() {
        return miconexion;
    }

    public Statement getStSentencias() {
        return stSentencias;
    }

    public ResultSet getRsDatos() {
        return rsDatos;
    }

    public PreparedStatement getPsPreparar() {
        return psPreparar;
    }


    public Connetion(String host, String bd, String user,String pass){
        try{
            Object newInstance = Class.forName("com.mysql.jdbc.Driver").newInstance();
            miconexion=DriverManager.getConnection("jdbc:mysql://"+host+"/"+bd+"",user,pass);
            stSentencias=miconexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la conexion");
            e.printStackTrace();
        }
    }
    
    public ResultSet MysqlConsulta(String sql) throws SQLException{
        try{
            this.rsDatos=stSentencias.executeQuery(sql);
        }catch(SQLException e){
            e.printStackTrace();
            throw e;  
        }
        return rsDatos;
    }
    
     public void EjecutarMysql(String sql) throws SQLException{
        try{
            stSentencias.execute(sql);
        }catch(SQLException e){
            e.printStackTrace();
            throw e;         
        }   
    }
     //
    public void insertarfila(String tabla, String []valores) throws SQLException {
        this.rsDatos = stSentencias.executeQuery("SELECT * FROM "+tabla);
        rsDatos.moveToInsertRow();
        rsDatos.updateInt("idProvin", 30);
        rsDatos.updateString("Provincia", "Burgos");
        rsDatos.insertRow();
    }
     
     public Integer getInt(String col){
         try {
             return (rsDatos.getInt(col));
             
         } catch (Exception e) {
             return null;
         }
     }
     public Long getLong(String col){
         try {
             return (rsDatos.getLong(col));
             
         } catch (Exception e) {
             return null;
         }    
     }
    
             
}
     
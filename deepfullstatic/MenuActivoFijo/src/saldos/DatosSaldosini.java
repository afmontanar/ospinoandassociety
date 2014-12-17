/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldos;

import activosfijos.Imagen;
import activosfijos.ModelosTabla;
import activosfijos.ModelosTablaU;
import activosfijos.validaciones;
import areas.ClasArea;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import menuactivofijo.ValidarCamposVacios;
import productos.Producto;
import responsables.GrillaResponsable;

/**
 *
 * @author OSPINO Y ASOCIADO
 */
public class DatosSaldosini extends javax.swing.JDialog {

    ValidarCamposVacios va;
    ArrayList<Imagen> imagenes;
    Object poder;
    private ModelosTabla tm;
    private ModelosTablaU tm1;
    private boolean ingresaetool;
    private List<Object[]> usuarios;
    private boolean localz;
    private int sectedRox;
    private boolean deDonde;
    private boolean activateCaretupdate;
    private boolean puedeGuardar;
    private String autrespon;
    private int filaS2;
    private String ruta;
    private boolean filo;
    private Frame papa;

    /**
     * Creates new form DatosSaldosini
     */
    public DatosSaldosini(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.papa=parent;
        initComponents();
        setLocationRelativeTo(null);
        String[] columnas = {"Indice", "codecontable", "nameproducto", "cantidad", "valorTotal"};
        this.tm = new ModelosTabla(columnas, jTable2);
        jTable2.setModel(tm);
        String[] columna = {"nªdeitem", "codeactivofijo", "serie", "marca", "modelo", "estado", "fabricantedelproducto", "distribuidor", "garantia", "fechagarantia", "valorproducto"};
        this.tm1 = new ModelosTablaU(columna, jTable1);
        jTable1.setModel(tm1);
        this.usuarios = new LinkedList<Object[]>();
        ajustarPRow(false);
        Component[] c = {jTextField2, jTextField6, jLabel3, jLabel7, jLabel2, jTextField4, jLabel8, vidadutil, jTextField5};
        this.va = new ValidarCamposVacios(c);
        jTextField5.setEnabled(false);
    }

    private void guardarRow(int select) {
        try {
//            Object[] usuObjectsw = {usuarios.get(select)[0], depreciacion.getText(), valoracumulado.getText(), valorSalvamento.getText(), depreciacion.getText(), diasdepreciacion.getText(), documentodecompra.getText(), ((JTextField) fechaingreso.getDateEditor().getUiComponent()).getText(), ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText(), jTextArea1.getText(), "", totaldepreciacion.getText(), jLabel1.getIcon(),jTextField7.getText()};
            Object[] usuObjectsw = {usuarios.get(select)[0],
                depreciacion.getText(),
                valoracumulado.getText(),
                valorSalvamento.getText(),
                depreciacion.getText(),
                diasdepreciacion.getText(),
                documentodecompra.getText(),
                ((JTextField) fechaingreso.getDateEditor().getUiComponent()).getText(),
                ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText(),
                jTextArea1.getText(),
                this.ruta,
                totaldepreciacion.getText(),
                jLabel1.getIcon(),
                jTextField7.getText(),
                "",
                vp.getText(),
                "",
                "",
                ""
            };

            usuarios.set(select, usuObjectsw);
            this.ruta = "";
        } catch (java.lang.IndexOutOfBoundsException f) {
        }
    }

    public void enviar() {
        for (int i = 0, h = jTable2.getRowCount(); i < h; i++) {
            if (jTable2.getValueAt(i, 1).equals(jTextField4.getText())) {
                JOptionPane.showMessageDialog(this, "Este codigo ya esta insertado");
                return;
            }
        }
        this.localz = false;
        try {
            ResultSet resultado1 = Producto.c.MysqlConsulta("select nameproducto,vidautil from producto where codepreoducto='" + jTextField4.getText() + "'");
            if (resultado1.next()) {
                jLabel8.setText(resultado1.getString("nameproducto"));
                vidadutil.setText(resultado1.getString("vidautil"));
                String ii = ((JTextField) fechaingreso.getDateEditor().getUiComponent()).getText();
                if (!ii.equals("")) {
                    calcularDepreciacion(ii, resultado1.getString("vidautil"));
                    valoracumulado.setText(ii);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error este Code no existe");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR" + e);
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

        jPanel1 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jLabel31 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        fechadebaja = new javax.swing.JLabel();
        fechaingreso = new com.toedter.calendar.JDateChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        documentodecompra = new javax.swing.JTextField();
        vidadutil = new javax.swing.JTextField();
        diasdepreciacion = new javax.swing.JTextField();
        depreciacion = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        totaldepreciacion = new javax.swing.JTextField();
        valoracumulado = new javax.swing.JTextField();
        valorSalvamento = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jToolBar1 = new javax.swing.JToolBar();
        jButton5 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jButton6 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        jSeparator18 = new javax.swing.JToolBar.Separator();
        jSeparator16 = new javax.swing.JToolBar.Separator();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        jSeparator19 = new javax.swing.JToolBar.Separator();
        jSeparator17 = new javax.swing.JToolBar.Separator();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jSeparator20 = new javax.swing.JToolBar.Separator();
        jSeparator22 = new javax.swing.JToolBar.Separator();
        jSeparator21 = new javax.swing.JToolBar.Separator();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        vp = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        validaciones b= new validaciones(validaciones.DIGITS, 11);
        jTextField6.setDocument(b);
        jTextField6.setBorder(javax.swing.BorderFactory.createTitledBorder("Responsable:"));
        jTextField6.setName("Responsable:"); // NOI18N
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 40));

        validaciones a= new validaciones(validaciones.DIGITS, 10);
        jTextField2.setDocument(a);
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero Asociado al Responsable"));
        jTextField2.setName("Numero Asociado al Responsable"); // NOI18N
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 50));

        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 360, 40));

        jButton1.setText("jButton1");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 20, 40));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Area:"));
        jLabel2.setName("Area:"); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 140, 40));

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Departamento:"));
        jLabel3.setName("Departamento:"); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 140, 40));

        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 360, 40));

        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 360, 40));

        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 360, 40));

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
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable1FocusLost(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 1110, 100));

        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Nombre del Producto"));
        jLabel8.setName("Nombre del Producto"); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 360, 40));

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 20, 40));

        validaciones c= new validaciones(validaciones.DIGITS, 10);
        jTextField4.setDocument(c);
        jTextField4.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo Contable"));
        jTextField4.setEnabled(false);
        jTextField4.setName("Codigo Contable"); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 140, 40));

        validaciones d= new validaciones(validaciones.DIGITS, 4);
        jTextField5.setDocument(d);
        jTextField5.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad:"));
        jTextField5.setEnabled(false);
        jTextField5.setName("Cantidad:"); // NOI18N
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 140, 40));

        jButton3.setText("Siguiente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, -1));

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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 540, 100));

        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Direccion:"));
        jLabel7.setName("Direccion:"); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 40));

        jDesktopPane3.setBackground(new java.awt.Color(255, 250, 244));
        jDesktopPane3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setText("  Fecha de Ingreso:");
        jDesktopPane3.add(jLabel31);
        jLabel31.setBounds(0, 40, 110, 20);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("   Fecha de Baja:");
        jDesktopPane3.add(jLabel19);
        jLabel19.setBounds(120, 40, 110, 20);
        jDesktopPane3.add(fechadebaja);
        fechadebaja.setBounds(130, 60, 100, 20);

        fechaingreso.setDateFormatString("yyyy/MM/dd");
        fechaingreso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaingresoPropertyChange(evt);
            }
        });
        jDesktopPane3.add(fechaingreso);
        fechaingreso.setBounds(10, 60, 100, 19);

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setDateFormatString("yyyy/MM/dd");
        jDateChooser1.setEnabled(false);
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jDesktopPane3.add(jDateChooser1);
        jDateChooser1.setBounds(130, 60, 100, 19);

        jPanel1.add(jDesktopPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 250, 90));

        documentodecompra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        documentodecompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Documento de Compra:"));
        jPanel1.add(documentodecompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 170, 40));

        vidadutil.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        vidadutil.setText("0");
        vidadutil.setBorder(javax.swing.BorderFactory.createTitledBorder("Vida Util"));
        vidadutil.setEnabled(false);
        vidadutil.setName("Vida Util:"); // NOI18N
        jPanel1.add(vidadutil, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 80, -1));

        diasdepreciacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        diasdepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Dias Depreciaccion"));
        diasdepreciacion.setEnabled(false);
        jPanel1.add(diasdepreciacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 170, 40));

        depreciacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        depreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("% de Depreciaccion"));
        depreciacion.setEnabled(false);
        jPanel1.add(depreciacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 170, 40));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("preview");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 240));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, 310, 240));

        jButton4.setText("Abrir Imagen");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 630, 100, -1));

        totaldepreciacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        totaldepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Depreciacion"));
        totaldepreciacion.setEnabled(false);
        totaldepreciacion.setName("Tot Depreciaciones:"); // NOI18N
        jPanel1.add(totaldepreciacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 170, -1));

        valoracumulado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        valoracumulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor Acumulado"));
        valoracumulado.setEnabled(false);
        valoracumulado.setName("Valor acumuladad:"); // NOI18N
        jPanel1.add(valoracumulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 170, -1));

        valorSalvamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        valorSalvamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor de Salvamento"));
        valorSalvamento.setEnabled(false);
        valorSalvamento.setName("Valorizacion"); // NOI18N
        valorSalvamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                valorSalvamentoFocusLost(evt);
            }
        });
        jPanel1.add(valorSalvamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 130, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));
        jScrollPane3.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 540, 80));

        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setRollover(true);

        jButton5.setText("Guardar ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);
        jToolBar1.add(jSeparator6);

        jButton6.setText("Actualizar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);
        jToolBar1.add(jSeparator3);
        jToolBar1.add(jSeparator2);
        jToolBar1.add(jSeparator4);
        jToolBar1.add(jSeparator10);
        jToolBar1.add(jSeparator9);
        jToolBar1.add(jSeparator8);
        jToolBar1.add(jSeparator11);
        jToolBar1.add(jSeparator15);
        jToolBar1.add(jSeparator18);
        jToolBar1.add(jSeparator16);
        jToolBar1.add(jSeparator14);
        jToolBar1.add(jSeparator13);
        jToolBar1.add(jSeparator19);
        jToolBar1.add(jSeparator17);
        jToolBar1.add(jSeparator12);
        jToolBar1.add(jSeparator7);
        jToolBar1.add(jSeparator5);
        jToolBar1.add(jSeparator20);
        jToolBar1.add(jSeparator22);
        jToolBar1.add(jSeparator21);
        jToolBar1.add(jSeparator1);

        jButton7.setText("Salir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 830, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Item"));
        jLabel11.setEnabled(false);
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 170, 40));

        vp.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor del producto"));
        vp.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                vpCaretUpdate(evt);
            }
        });
        vp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vpFocusLost(evt);
            }
        });
        jPanel1.add(vp, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, 170, 40));

        jTextField3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 210, 40));

        jTextField7.setBorder(javax.swing.BorderFactory.createTitledBorder("% S"));
        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField7FocusLost(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, 90, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/afhce curso activo fijo1.jpg"))); // NOI18N
        jLabel9.setText("jLabel1");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 20, 1150, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        final JFileChooser elegirImagen = new JFileChooser();
        elegirImagen.setMultiSelectionEnabled(false);
        int o = elegirImagen.showOpenDialog(this);
        if (o == JFileChooser.APPROVE_OPTION) {
            this.ruta = elegirImagen.getSelectedFile().getAbsolutePath();
            guardarrowruta(ruta, this.sectedRox);
            Image preview = Toolkit.getDefaultToolkit().getImage(elegirImagen.getSelectedFile().getAbsolutePath());
            if (preview != null) {
                jLabel1.setText("");
                ImageIcon icon = new ImageIcon(preview.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
                jLabel1.setIcon(icon);

            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ajustarPRow(boolean r) {
//        totaldepreciacion.setEnabled(r);
//        valoracumulado.setEnabled(r);
//        valorSalvamento.setEnabled(r);
        jTextField7.setEnabled(r);
//        depreciacion.setEditable(r);
//        diasdepreciacion.setEnabled(r);
        documentodecompra.setEnabled(r);
//        jTextField3.setEditable(r);
        fechaingreso.setEnabled(r);
        fechadebaja.setEnabled(r);
        jTextArea1.setEnabled(r);
        vp.setEnabled(r);
    }

    private void ajustarPRow() {
        totaldepreciacion.setText("");
        valoracumulado.setText("");
        valorSalvamento.setText("");
        jTextField7.setText("");
        depreciacion.setText("");
        diasdepreciacion.setText("");
        documentodecompra.setText("");
//        jTextField3.setText("");
        fechaingreso.setDate(null);
        fechadebaja.setText("");
        jTextArea1.setText("");
        vp.setText("");
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (tm1.getUsuarios().size() > 0) {
            ingresaetool = false;
            fechaingresoPropertyChange(null);
            long e = 0;
            jTable1MouseClicked(null);
            int size = tm1.getUsuarios().size();
            for (int i = 0; i < size; i++) {
                try {
                    e += Long.parseLong(tm1.getValueAt(i, 10) + "");
                } catch (java.lang.NumberFormatException t) {
                }
            }
            try {
                Producto.c.EjecutarMysql("UPDATE  `detallesaldoactivo` SET  `codecontable` =  '" + jTable2.getValueAt(this.filaS2, 1) + "', `cantidad` =  '" + jTable2.getValueAt(this.filaS2, 3) + "', `valorTotal` =  '" + e + "' WHERE  `detallesaldoactivo`.`Indice` ='" + jTable2.getValueAt(this.filaS2, 0) + "'");
            } catch (SQLException ex) {
                Logger.getLogger(DatosSaldosini.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTextField3.setText(e + "");
            jTable2.setValueAt(e + "", this.filaS2, 4);
            if (tm.getUsuarios().size() > 0) {
                tm.setValueAt(e + "", tm.getUsuarios().size() - 1, 4);
            }
            ingresarBD(size);
            habilitarBSiguiente(true);
            tm1.vaciarTabla();
            vidadutil.setText("");
            jTextField5.setText("");
            jTextField3.setText("");
            totaldepreciacion.setText("");
            valoracumulado.setText("");
            valorSalvamento.setText("");
            jTextField7.setText("");
            depreciacion.setText("");
            diasdepreciacion.setText("");
            activateCaretupdate = true;
            documentodecompra.setText("");
            jTextArea1.setText("");
            jDateChooser1.setDate(null);
            fechaingreso.setDate(null);
            vp.setText("");
            jTextField3.setText("");
            vp.setEnabled(false);
            jTextField3.setEnabled(false);
            jTextField7.setEnabled(false);
            documentodecompra.setEnabled(false);
            jTextArea1.setEnabled(false);
            jLabel8.setText("");
            jTextField4.setText("");
            usuarios.clear();
            activateCaretupdate = false;
            jLabel1.setIcon(null);
            this.sectedRox = -1;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
//        if(this.va.validacionCamposNulosB()){
//            update();
//            this.setVisible(false);
//            code.setText("");
//            name.setText("");
//        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        enviar();
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (this.va.validacionCamposNulosB()) {
            String te = jTextField4.getText();//Codigo contable
            String text = jLabel8.getText();//Nombre del producto
            String text1 = jTextField5.getText();//Cantidad
            //si el codigo contable, el nombre del producto, la cantidad estan vacios y si por donde ingresa el evento es false
            if (!te.equals("") && !text.equals("") && !text1.equals("") && ingresaetool == false) {
                Object[] usuObjects = {indiceIngresar(), te, text, text1, ""};
                try {
                    Producto.c.EjecutarMysql("INSERT INTO `detallesaldoactivo` (`indiceRe`, `codecontable`, `nameproducto`, `cantidad`, `valorTotal`, `indice`) VALUES ('" + this.autrespon + "', '" + jTextField4.getText() + "', '" + jLabel8.getText() + "', '0', '0', NULL)");
                    this.filaS2 = tm.getUsuarios().size();
                } catch (SQLException ex) {
                    Logger.getLogger(DatosSaldosini.class.getName()).log(Level.SEVERE, null, ex);
                }
                tm.ingresarUsuario(usuObjects);
                ingresaetool = true;
            }
            int parseInt = Integer.parseInt(text1);
            if (parseInt >= usuarios.size()) {
                int rowCount = tm1.getRowCount();
                if (rowCount == 0) {
                    for (int i = 0; i < parseInt; i++) {
                        Object[] usuObjects = {"" + (i + 1), "", "", "", "", "", "", "", "", "", ""};
                        tm1.ingresarusuariomultiple(usuObjects);
                        tm1.isCellEditable(i, i);
                        Object[] usuObjectsw = {"",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            ""
                        };
                        usuarios.add(usuObjectsw);
                    }
                    tm1.reload();
                } else {
                    for (int i = rowCount; i < parseInt; i++) {
                        Object[] usuObjects = {"" + (i + 1), "", "", "", "", "", "", "", "", "", ""};
                        tm1.ingresarusuariomultiple(usuObjects);
                        Object[] usuObjectsw = {"",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            "",
                            ""
                        };

                        usuarios.add(usuObjectsw);
                    }
                    tm1.reload();
                }
            } else {
                if (JOptionPane.showConfirmDialog(rootPane, "¿Desea borrar algunos registros?") == 0) {
                    int rowCount = tm1.getRowCount();
                    if (rowCount != 0) {
                        for (int i = rowCount - 1; i >= parseInt; i--) {
                            tm1.eliminarUsuarioM(i);
//                        Object[] usuObjectsw = {"", "", "", "", "", "", "", "", "", "", "", ""};
                            usuarios.remove(i);
                        }
                        tm1.reload();

                        this.activateCaretupdate = true;
                        this.sectedRox = 0;
                        jLabel11.setText("");
                        totaldepreciacion.setText("");
                        valoracumulado.setText("");
                        valorSalvamento.setText("");
                        jTextField7.setText("");
                        vp.setText("");
                        depreciacion.setText("");
                        diasdepreciacion.setText("");
                        documentodecompra.setText("");
                        jTextField3.setText("");
                        fechaingreso.setDate(null);
                        jDateChooser1.setDate(null);
                        jTextArea1.setText("");

                        this.puedeGuardar = true;
                    }
                } else {
                    return;
                }
            }
            habilitarBSiguiente(false);
            try {
                String text2 = jTextField5.getText();
                int rowCount1 = tm.getUsuarios().size();
                if (rowCount1 > 0) {
                    jTable2.setValueAt(jTextField5.getText(), this.filaS2, 3);
                }
                this.activateCaretupdate = false;
            } catch (java.lang.IndexOutOfBoundsException w) {
                w.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        if (jTextField2.getText().equals("")) {
            pongaNumerOr();
            reiniciarFormulario(); 
        } else {
            reiniciarFormulario();
            consulte(consulteS());
            habilitarInsertar();
        }
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void fechaingresoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaingresoPropertyChange
        // TODO add your handling code here:
        if (!deDonde) {
            String ii = ((JTextField) fechaingreso.getDateEditor().getUiComponent()).getText();
            String text = vidadutil.getText();
            try {
                if (!ii.equals("") && !text.equals("")) {
                    calcularDepreciacion(ii, text);
                    long e = 0;
                    for (int i = 0; i < tm1.getUsuarios().size(); i++) {
                        try {
                            e += Long.parseLong(tm1.getValueAt(i, 10) + "");
                        } catch (java.lang.NumberFormatException t) {

                        }
                    }
                    jTextField3.setText(e + "");
                }
            } catch (java.lang.IndexOutOfBoundsException r) {
                System.out.println("Ocurrio el error bobo");
            }
        }
    }//GEN-LAST:event_fechaingresoPropertyChange

    public void odtenerDatoR(String calle) {
        this.autrespon = calle;
        try {
            if (estaEnEseLugar()) {
                Producto.c.EjecutarMysql("INSERT INTO `encabezadosaldoactivvo` (`NumeroAR`, `indiceRe`) VALUES (NULL, '" + calle + "')");
            } else {
                Producto.c.EjecutarMysql("UPDATE  `encabezadosaldoactivvo` SET  `indiceRe` =  '" + calle + "' WHERE  `encabezadosaldoactivvo`.`NumeroAR` ='" + jTextField2.getText() + "'");
//                  JOptionPane.showMessageDialog(rootPane, "Actualizo");
            }
            jTextField4.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(DatosSaldosini.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!jTextField2.getText().equals("")) {
            this.poder = ClasArea.are.get("grillarepons");
            GrillaResponsable pu = (GrillaResponsable) this.poder;
            pu.setVisible(true);
            pu.quienPide(1);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe poner un consecutivo");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //los errores estan ocurriendo aca despues de la vuelta se borrar el primer registro creo que es por el sectrox que se pone 
        //en cero y captura los vlores de todo lo que esta en blanco hay que corregir eso oik
        programacionInsercion();
        this.puedeGuardar = false;

    }//GEN-LAST:event_jTable1MouseClicked

    private void vpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vpFocusLost
        // TODO add your handling code here:
        jTextField7FocusLost(null);
        fechaingresoPropertyChange(null);
    }//GEN-LAST:event_vpFocusLost

    private void vpCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_vpCaretUpdate
        // TODO add your handling code here:
        if (!this.activateCaretupdate) {
            try{
            jTable1.setValueAt(vp.getText(), this.sectedRox, 10);
            }catch(java.lang.IndexOutOfBoundsException e){
                
            }
        }
    }//GEN-LAST:event_vpCaretUpdate

    private void valorSalvamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorSalvamentoFocusLost
        // TODO add your handling code here:
        fechaingresoPropertyChange(null);
    }//GEN-LAST:event_valorSalvamentoFocusLost


    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        jLabel1.setIcon(null);
        this.filaS2 = jTable2.getSelectedRow();
        tm1.vaciarTabla();
        limpiarCampos();
        usuarios.clear();
        if (evt.getClickCount() == 2 && this.filaS2 != -1) {
            try {
                ResultSet resultado1 = Producto.c.MysqlConsulta("SELECT * FROM  `saldoactivo` WHERE  `indiceDs` LIKE  '" + jTable2.getValueAt(this.filaS2, 0) + "'");
                filo = true;
                Hilo2 elHilo = new Hilo2(filo, papa);
                elHilo.start();
                
                filo = false;
                int i = 0;
                resultado1.beforeFirst();
                while (resultado1.next()) {
                    try {
                        Imagen imagen = new Imagen();
                        Blob blob = resultado1.getBlob("Imagen");
                        byte[] data = blob.getBytes(1, (int) blob.length());
                        BufferedImage img = null;
                        try {
                            img = ImageIO.read(new ByteArrayInputStream(data));
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(rootPane, "Ocurrio un error al traer las imagenes");
                        }
                        imagen.setImagen(img);
                        Object[] usuObjects = {resultado1.getString("identificador"), resultado1.getString("codeActivofijo"), resultado1.getString("serie"), resultado1.getString("marca"), resultado1.getString("modelo"), resultado1.getString("estado"), resultado1.getString("fabricantedelproducto"), resultado1.getString("distribuidor"), resultado1.getString("garantia"), resultado1.getString("fechagarantia"), resultado1.getString("valorproducto")};
                        tm1.ingresarusuariomultiple(usuObjects);
                        try {
                            Object[] usuObjectsw = {resultado1.getString("identificador"),
                                "",
                                "",
                                resultado1.getString("valorSalvamento"),
                                "",
                                "",
                                resultado1.getString("documentoCompra"),
                                resultado1.getString("fechaIngreso"),
                                resultado1.getString("fechadebaja"),
                                resultado1.getString("detalle"),
                                "",
                                "",
                                new ImageIcon(imagen.getImagen().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT)),
                                resultado1.getString("porcentajes"),
                                "",
                                resultado1.getString("valorproducto"),
                                "",
                                "",
                                ""};
//            
                            usuarios.add(usuObjectsw);
                            i += 1;
                        } catch (java.lang.NullPointerException iop) {
                            Object[] usuObjectsw = {resultado1.getString("identificador"),
                                "",
                                "",
                                resultado1.getString("valorSalvamento"),
                                "",
                                "",
                                resultado1.getString("documentoCompra"),
                                resultado1.getString("fechaIngreso"),
                                resultado1.getString("fechadebaja"),
                                resultado1.getString("detalle"),
                                "",
                                "",
                                "",
                                resultado1.getString("porcentajes"),
                                "",
                                resultado1.getString("valorproducto"),
                                "",
                                "",
                                ""};
//                      Object[] usuObjectsw = {depreciacion.getText(), valoracumulado.getText(), valorSalvamento.getText(), depreciacion.getText(), diasdepreciacion.getText(), documentodecompra.getText(), ((JTextField) fechaingreso.getDateEditor().getUiComponent()).getText(), ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText(), jTextArea1.getText(), jTextField1.getText(), vp.getText(), totaldepreciacion.getText(), jLabel1.getText(),jTextField7.getText()};
                            usuarios.add(usuObjectsw);
                            i += 1;
                        }

                    } catch (java.lang.NullPointerException e) {
                        Imagen imagen = new Imagen();
                        Blob blob = resultado1.getBlob("Imagen");
                        byte[] data = blob.getBytes(1, (int) blob.length());
                        BufferedImage img = null;
                        try {
                            img = ImageIO.read(new ByteArrayInputStream(data));
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(rootPane, "Ocurrio un error al traer las imagenes");
                        }
                        imagen.setImagen(img);
                        Object[] usuObjects = {resultado1.getString("identificador"), resultado1.getString("codeActivofijo"), resultado1.getString("serie"), resultado1.getString("marca"), resultado1.getString("modelo"), resultado1.getString("estado"), resultado1.getString("fabricantedelproducto"), resultado1.getString("distribuidor"), resultado1.getString("garantia"), resultado1.getString("fechagarantia"), resultado1.getString("valorproducto")};
                        tm1.ingresarusuariomultiple(usuObjects);
                        Object[] usuObjectsw = {resultado1.getString("identificador"),
                            "",
                            "",
                            resultado1.getString("valorSalvamento"),
                            "",
                            "",
                            resultado1.getString("documentoCompra"),
                            resultado1.getString("fechaIngreso"),
                            resultado1.getString("fechadebaja"),
                            resultado1.getString("detalle"),
                            "",
                            "",
                            new ImageIcon(imagen.getImagen().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT)),
                            resultado1.getString("porcentajes"),
                            "",
                            resultado1.getString("valorproducto"),
                            "",
                            "",
                            ""};

//                      Object[] usuObjectsw = {depreciacion.getText(), valoracumulado.getText(), valorSalvamento.getText(), depreciacion.getText(), diasdepreciacion.getText(), documentodecompra.getText(), ((JTextField) fechaingreso.getDateEditor().getUiComponent()).getText(), ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText(), jTextArea1.getText(), jTextField1.getText(), vp.getText(), totaldepreciacion.getText(), jLabel1.getText(),jTextField7.getText()};
                        usuarios.add(usuObjectsw);
                        i += 1;
                    }
                }
                tm1.reload();
                siguienteParseado();
                this.localz = true;
                this.ingresaetool = true;
                this.puedeGuardar = true;
//                value();
                jTextField5.setEnabled(true);
            } catch (SQLException ex) {
                Logger.getLogger(DatosSaldosini.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

//      public synchronized void value() {
//         Espere get = (Espere) ClasArea.are.get("espere");
//                get.setVisible(false);
//    }
//    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.poder = ClasArea.are.get("grillaproduc");
        JDialog pu = (JDialog) this.poder;
        pu.setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
        // TODO add your handling code here:
        try {
            int parseInt = Integer.parseInt(vp.getText());
            int parseInt1 = Integer.parseInt(jTextField7.getText());
            int yo = parseInt * parseInt1 / 100;
            valorSalvamento.setText(yo + "");
        } catch (NumberFormatException er) {
        }
    }//GEN-LAST:event_jTextField7FocusLost

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost
        // TODO add your handling code here:
        jTable1.removeEditor();
    }//GEN-LAST:event_jTable1FocusLost

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
        jTextField2ActionPerformed(null);
    }//GEN-LAST:event_jTextField2FocusLost

    public int diasHabiles(String fecha1, String fecha2) {     
        int mes1, dia1, año1;
        int mes2, dia2, año2;
        año1 = Integer.parseInt((fecha1.toString()).substring(0, 4));
        mes1 = Integer.parseInt((fecha1.toString()).substring(5, 7));
        dia1 = Integer.parseInt((fecha1.toString()).substring(8, 10));
        mes1 -= 1;
        año2 = Integer.parseInt((fecha2.toString()).substring(0, 4));
        mes2 = Integer.parseInt((fecha2.toString()).substring(5, 7));
        dia2 = Integer.parseInt((fecha2.toString()).substring(8, 10));
        mes2 -= 1;
        if(mes1<=mes2 || dia1<=dia2){
        Calendar fechaInicio = new GregorianCalendar();
        fechaInicio.set(año1, mes1, dia1);
        Calendar fechaFin = new GregorianCalendar();
        fechaFin.set(año2, mes2, dia2);
        String ff = "" + fechaFin.getTime();

        int diashabiles = 0;
        int añoc = fechaInicio.get(Calendar.YEAR);
        while (true) {
            if (fechaInicio.get(Calendar.YEAR) > añoc) {
                añoc += 1;
            }
            String fechai = "" + fechaInicio.getTime();
            if (ff.equals(fechai)) {
                break;
            }
            fechaInicio.add(Calendar.DAY_OF_YEAR, 1);
            diashabiles++;
        }
        
        return (diashabiles);
        }else{
            JOptionPane.showMessageDialog(this, "El calculo no podra hacerse correctamente, pues la fecha de ingreso es mayor a la actual");
        }
        return 0;
    }

//    Metodo malo..,
//    public long dias(Date fecha2, String fecha1) {
//        final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000; //Milisegundos al día 
//        int año1 = Integer.parseInt((fecha1.toString()).substring(0, 4));
//        int mes1 = Integer.parseInt((fecha1.toString()).substring(5, 7));
//        int dia1 = Integer.parseInt((fecha1.toString()).substring(8, 10));
//        Calendar calendar = new GregorianCalendar(año1, mes1 - 1, dia1);
//        java.sql.Date fecha = new java.sql.Date(calendar.getTimeInMillis());
//        long diferencia = (fecha2.getTime() - fecha.getTime()) / MILLSECS_PER_DAY;
//        return (diferencia);
//    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField depreciacion;
    public static javax.swing.JTextField diasdepreciacion;
    public static javax.swing.JTextField documentodecompra;
    public static javax.swing.JLabel fechadebaja;
    private com.toedter.calendar.JDateChooser fechaingreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDesktopPane jDesktopPane3;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator1;
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
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator20;
    private javax.swing.JToolBar.Separator jSeparator21;
    private javax.swing.JToolBar.Separator jSeparator22;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    public static javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JTextField totaldepreciacion;
    public static javax.swing.JTextField valorSalvamento;
    public static javax.swing.JTextField valoracumulado;
    public static javax.swing.JTextField vidadutil;
    private javax.swing.JTextField vp;
    // End of variables declaration//GEN-END:variables

    public void cambiarjt6S(String r) {
        this.jTextField6.setText(r);
    }

    private void calcularDepreciacion(String FechaF, String VidaUtil) {
        int parseInt = Integer.parseInt(VidaUtil);
        int diasU = parseInt * 365;
        String ii = ((JTextField) fechaingreso.getDateEditor().getUiComponent()).getText();
        SimpleDateFormat formatoDelTextois = new SimpleDateFormat("yyyy-MM-dd");
        long dias = diasHabiles(FechaF, formatoDelTextois.format(new Date()));
        diasdepreciacion.setText(dias + "");
        long calcularPorcentajeP = calcularPorcentajeP(diasU, dias);
        try {
            calcularDepreciacion(calcularPorcentajeP, (Long.parseLong(vp.getText()) - Long.parseLong(valorSalvamento.getText())));
        } catch (java.lang.NumberFormatException e) {
        }
        SimpleDateFormat formatoDelTextoi = new SimpleDateFormat("yyyy/MM/dd");
        try {
            String sumarfecha = sumarfecha(FechaF, diasU);
            Date datox = formatoDelTextoi.parse(sumarfecha);
//            calcularPorcentajeP(diasU,);
            jDateChooser1.setDate(datox);
        } catch (ParseException ex) {
            
        }
        if (!totaldepreciacion.getText().equals("") && !vp.getText().equals("")) {
            long e = Long.parseLong(vp.getText()) - Long.parseLong(totaldepreciacion.getText());
            valoracumulado.setText("" + e);
        }
    }

    public void guardarImagen(String rutax, int i, List<Object[]> usuarios1) {
        String p = "UPDATE  `saldoactivo` SET "
                + "`Imagen`=?"
                + " WHERE  `saldoactivo`.`identificador` ='" + usuarios1.get(i)[0] + "'";
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            Producto.c.getMiconexion().setAutoCommit(false);
            File file = new File(rutax);
            fis = new FileInputStream(file);
            ps = Producto.c.getMiconexion().prepareStatement(p);
            ps.setBinaryStream(1, fis, (int) file.length());
            ps.executeUpdate();
            Producto.c.getMiconexion().commit();
            return;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            ps.close();
            fis.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public String sumarfecha(String fechaini, int dias) {
        try {
            String fec = "";
            String a[] = fechaini.split("/");
            Calendar c = new GregorianCalendar();
            c.set(Integer.parseInt(a[0]), Integer.parseInt(a[1]) - 1, Integer.parseInt(a[2]));
            c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), (c.get(Calendar.DATE) + dias - 1));
            int dia, annio;
            int mes;
            dia = c.get(Calendar.DATE);
            mes = c.get(Calendar.MONTH) + 1;
            annio = c.get(Calendar.YEAR);
            if (mes < 10 && dia < 10) {
                fec = annio + "/0" + mes + "/0" + dia;
            } else if (mes < 10 && dia > 9) {
                fec = annio + "/0" + mes + "/" + dia;
            } else if (mes > 9 && dia < 10) {
                fec = annio + "/" + mes + "/0" + dia;
            }
            return fec;
        } catch (Exception e) {
            return "";
        }
    }

    private void habilitarBSiguiente(boolean b) {
        jLabel8.setEnabled(b);
        jTextField4.setEnabled(b);
        jButton1.setEnabled(b);
    }

    private void traerUsuarios(int selectedRows) {
        Object[] get = this.usuarios.get(selectedRows);
        depreciacion.setText(get[1] + "");
        valoracumulado.setText(get[2] + "");
        valorSalvamento.setText(get[3] + "");
        depreciacion.setText(get[4] + "");
        diasdepreciacion.setText(get[5] + "");
        documentodecompra.setText(get[6] + "");
        SimpleDateFormat formatoDelTextoi = new SimpleDateFormat("yyyy/MM/dd");
        Date datox = null;
        try {
            if (!get[7].equals("")) {
                datox = formatoDelTextoi.parse(get[7] + "");
            }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error al parsear la fecha");
        }
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy/MM/dd");
        Date datoxz = null;
        try {
            if (!get[8].equals("")) {
                datoxz = formatoDelTexto.parse(get[8] + "");
            }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error al parsear la fecha");
        }
        fechaingreso.setDate(datox);
        jDateChooser1.setDate(datoxz);

        jTextArea1.setText(get[9] + "");
        jTextField7.setText(get[13] + "");
        vp.setText(get[15] + "");
        totaldepreciacion.setText(get[14] + "");
        try {
            jLabel1.setIcon((Icon) get[12]);
        } catch (java.lang.ClassCastException i) {
            jLabel1.setIcon(null);
        }
        this.ruta = get[10] + "";
    }

    private long calcularPorcentajeP(long diasU, long parseInt) {
        long y = parseInt * 100 / diasU;
        depreciacion.setText(y + "");
        return y;
    }

    private void calcularDepreciacion(long calcularPorcentajeP, long parseInt) {
        long i = calcularPorcentajeP * parseInt / 100;
        totaldepreciacion.setText(i + "");
    }

    private void ingresarBD(int uios) {
        List<Object[]> usuarios1 = tm1.getUsuarios();
        for (int i = 0; i < uios; i++) {
            Object[] get = usuarios1.get(i);
            if (usuarios.get(i)[0].equals("")) {
                String p = "INSERT INTO `saldoactivo` "
                        + "(identificador,indiceDs,`codigoContable`, `codeActivofijo`,`serie`, `marca`, `modelo`, `estado`, `fabricantedelproducto`, `distribuidor`,"
                        + " `garantia`,"
                        + " `fechagarantia`, `valorproducto`, `documentoCompra`, `fechaIngreso`, `fechadebaja`, `detalle`, `valorSalvamento`,`Imagen`,`porcentajes`) "
                        + " VALUES (NULL,'" + jTable2.getValueAt(this.filaS2, 0) + "','" + jTextField4.getText() + "', '" + usuarios1.get(i)[1] + "','" + usuarios1.get(i)[2] + "', '" + usuarios1.get(i)[3] + "',"
                        + " '" + usuarios1.get(i)[4] + "', '" + usuarios1.get(i)[5] + "', '" + usuarios1.get(i)[6] + "', '" + usuarios1.get(i)[7] + "', '" + usuarios1.get(i)[8] + "',"
                        + " '" + usuarios1.get(i)[9] + "', '" + usuarios.get(i)[15] + "',"
                        + " '" + usuarios.get(i)[6] + "', '" + usuarios.get(i)[7] + "', '" + usuarios.get(i)[8] + "', '" + usuarios.get(i)[9] + "','" + usuarios.get(i)[3] + "','','" + usuarios.get(i)[13] + "')";

                try {
                    Producto.c.EjecutarMysql(p);
                    if (!usuarios.get(i)[10].equals("") && !usuarios.get(i)[10].equals("null")) {
                        guardarImagen(usuarios.get(i)[10].toString(), i, usuarios1);
                    }

                } catch (Exception ex) {
                    String se = "UPDATE  `saldoactivo` SET  `indiceDs` =  '" + jTable2.getValueAt(this.filaS2, 0) + "',"
                            + " `codigoContable`= '" + jTextField4.getText() + "',"
                            + " `codeActivofijo`= '" + usuarios1.get(i)[1] + "',"
                            + "`serie`='" + usuarios1.get(i)[2] + "',"
                            + "`marca`='" + usuarios1.get(i)[3] + "',"
                            + "`modelo`='" + usuarios1.get(i)[4] + "',"
                            + "`estado`='" + usuarios1.get(i)[5] + "',"
                            + "`fabricantedelproducto`='" + usuarios1.get(i)[6] + "',"
                            + "`distribuidor`='" + usuarios1.get(i)[7] + "',"
                            + "`garantia`='" + usuarios1.get(i)[8] + "',"
                            + "`fechagarantia`='" + usuarios1.get(i)[9] + "',"
                            + "`valorproducto`='" + usuarios.get(i)[15] + "',"
                            + "`documentoCompra`='" + usuarios.get(i)[6] + "',"
                            + "`fechaIngreso`='" + usuarios.get(i)[7] + "',"
                            + "`fechadebaja`='" + usuarios.get(i)[8] + "',"
                            + "`detalle`='" + usuarios.get(i)[9] + "',"
                            + "`valorSalvamento`='" + usuarios.get(i)[3] + "',"
                            + "`porcentajes`='" + usuarios.get(i)[13] + "'"
                            + " WHERE  `saldoactivo`.`identificador` =" + usuarios.get(i)[0] + "";
                    try {
                        Producto.c.EjecutarMysql(se);
                        if (!usuarios.get(i)[10].equals("") && !usuarios.get(i)[10].equals("null")) {
                            guardarImagen(usuarios.get(i)[10].toString(), i, usuarios1);
                        }
                    } catch (SQLException ex1) {
                        Logger.getLogger(DatosSaldosini.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            } else {
                if (!exits(usuarios.get(i)[0].toString())) {
                    String p = "INSERT INTO `saldoactivo` "
                            + "(identificador,indiceDs,`codigoContable`, `codeActivofijo`,`serie`, `marca`, `modelo`, `estado`, `fabricantedelproducto`, `distribuidor`,"
                            + " `garantia`,"
                            + " `fechagarantia`, `valorproducto`, `documentoCompra`, `fechaIngreso`, `fechadebaja`, `detalle`, `valorSalvamento`,`Imagen`,`porcentajes`) "
                            + " VALUES (NULL,'" + jTable2.getValueAt(this.filaS2, 0) + "','" + jTextField4.getText() + "', '" + usuarios1.get(i)[1] + "','" + usuarios1.get(i)[2] + "', '" + usuarios1.get(i)[3] + "',"
                            + " '" + usuarios1.get(i)[4] + "', '" + usuarios1.get(i)[5] + "', '" + usuarios1.get(i)[6] + "', '" + usuarios1.get(i)[7] + "', '" + usuarios1.get(i)[8] + "',"
                            + " '" + usuarios1.get(i)[9] + "', '" + usuarios.get(i)[15] + "',"
                            + " '" + usuarios.get(i)[6] + "', '" + usuarios.get(i)[7] + "', '" + usuarios.get(i)[8] + "', '" + usuarios.get(i)[9] + "','" + usuarios.get(i)[3] + "','','" + usuarios.get(i)[13] + "')";
                    try {
                        Producto.c.EjecutarMysql(p);
                        if (!usuarios.get(i)[10].equals("") && !usuarios.get(i)[10].equals("null")) {
                            guardarImagen(usuarios.get(i)[10].toString(), i, usuarios1);
                        }

                    } catch (Exception ex3) {
                        JOptionPane.showMessageDialog(this, "Ocurrio una locura");
                    }
                } else {
                    String se = "UPDATE  `saldoactivo` SET  `indiceDs` =  '" + jTable2.getValueAt(this.filaS2, 0) + "',"
                            + " `codigoContable`= '" + jTextField4.getText() + "',"
                            + " `codeActivofijo`= '" + usuarios1.get(i)[1] + "',"
                            + "`serie`='" + usuarios1.get(i)[2] + "',"
                            + "`marca`='" + usuarios1.get(i)[3] + "',"
                            + "`modelo`='" + usuarios1.get(i)[4] + "',"
                            + "`estado`='" + usuarios1.get(i)[5] + "',"
                            + "`fabricantedelproducto`='" + usuarios1.get(i)[6] + "',"
                            + "`distribuidor`='" + usuarios1.get(i)[7] + "',"
                            + "`garantia`='" + usuarios1.get(i)[8] + "',"
                            + "`fechagarantia`='" + usuarios1.get(i)[9] + "',"
                            + "`valorproducto`='" + usuarios.get(i)[15] + "',"
                            + "`documentoCompra`='" + usuarios.get(i)[6] + "',"
                            + "`fechaIngreso`='" + usuarios.get(i)[7] + "',"
                            + "`fechadebaja`='" + usuarios.get(i)[8] + "',"
                            + "`detalle`='" + usuarios.get(i)[9] + "',"
                            + "`valorSalvamento`='" + usuarios.get(i)[3] + "',"
                            + "`porcentajes`='" + usuarios.get(i)[13] + "'"
                            + " WHERE  `saldoactivo`.`identificador` =" + usuarios.get(i)[0] + "";
                    try {
                        Producto.c.EjecutarMysql(se);
                        if (!usuarios.get(i)[10].equals("") && !usuarios.get(i)[10].equals("null")) {
                            guardarImagen(usuarios.get(i)[10].toString(), i, usuarios1);
                        }
                    } catch (SQLException ex1p) {
                        Logger.getLogger(DatosSaldosini.class.getName()).log(Level.SEVERE, null, ex1p);
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Insertado correctamente");
    }

    private String indiceIngresar() {
        try {
            ResultSet resultado1 = Producto.c.MysqlConsulta("SELECT max(indice)+1 FROM  `detallesaldoactivo`");
            if (resultado1.next()) {
                String string = resultado1.getString("max(indice)+1");
                try {
                    if (string.equals("null")) {
                    }
                    return resultado1.getString("max(indice)+1");
                } catch (NullPointerException b) {
                    return "1";
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(DatosSaldosini.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private void pongaNumerOr() {
        try {
            ResultSet resultado1 = Producto.c.MysqlConsulta("SELECT max(NumeroAR)+1 FROM  `encabezadosaldoactivvo`");
            if (resultado1.next()) {
                String string = resultado1.getString("max(NumeroAR)+1");
                try {
                    if (string.equals("null")) {
                    }
                    jTextField2.setText("0000" + string + "");
                    this.autrespon = string;
                } catch (NullPointerException g) {
                    jTextField2.setText("0000" + 1 + "");
                    this.autrespon = "1";
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatosSaldosini.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void consulte(String kiko) {
        try {
            ResultSet resultado1 = Producto.c.MysqlConsulta("SELECT * "
                    + "FROM  `detallesaldoactivo` "
                    + "WHERE  `indiceRe` LIKE  '" + kiko + "'");
            while (resultado1.next()) {
                String k[] = {resultado1.getString("Indice"), resultado1.getString("codecontable"), resultado1.getString("nameproducto"), resultado1.getString("cantidad"), resultado1.getString("valorTotal")};
                tm.ingresarUsuario(k);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatosSaldosini.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String traerIndiceRe() {
        String consulte = "";
        try {
            ResultSet resultado1 = Producto.c.MysqlConsulta("SELECT indiceRe "
                    + "FROM  `encabezadosaldoactivvo` "
                    + "WHERE  `NumeroAR` ='" + jTextField2.getText() + "'");
            if (resultado1.next()) {
                return resultado1.getString("indiceRe");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatosSaldosini.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulte;
    }

    private String consulteS() {
        String traerIndiceRe = traerIndiceRe();
        this.autrespon = traerIndiceRe;

        try {
            ResultSet resultado1 = Producto.c.MysqlConsulta("SELECT * FROM `responsables` WHERE  `indiceRe` = '" + this.autrespon + "' ");
            if (resultado1.next()) {
                jTextField6.setText(resultado1.getString("idresponsable"));
                jLabel4.setText(resultado1.getString("nombrerespon"));
                jLabel7.setText(resultado1.getString("codedireccion"));
                jLabel6.setText(resultado1.getString("namedireccion"));
                jLabel2.setText(resultado1.getString("codearea"));
                jLabel10.setText(resultado1.getString("namearea"));
                jLabel3.setText(resultado1.getString("codedepartamento"));
                jLabel5.setText(resultado1.getString("namedepartamento"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatosSaldosini.class.getName()).log(Level.SEVERE, null, ex);
        }
        return traerIndiceRe;
    }

    private void reiniciarFormulario() {
        jTextField6.setText("");
        jLabel4.setText("");
        jLabel7.setText("");
        jLabel6.setText("");
        jLabel3.setText("");
        jLabel5.setText("");
        jLabel2.setText("");
        jLabel10.setText("");
        tm1.vaciarTabla();
        tm.vaciarTabla();
        vidadutil.setText("");
        jTextField5.setText("");
        jTextField3.setText("");
        totaldepreciacion.setText("");
        valoracumulado.setText("");
        valorSalvamento.setText("");
        jTextField7.setText("");
        depreciacion.setText("");
        diasdepreciacion.setText("");
//        activateCaretupdate = true;
        documentodecompra.setText("");
        jTextArea1.setText("");
        jDateChooser1.setDate(null);
        fechaingreso.setDate(null);
        if(this.activateCaretupdate){
        vp.setText("");}
        jTextField3.setText("");
        vp.setEnabled(false);
        jTextField3.setEnabled(false);
//        valorSalvamento.setEnabled(false);
        jTextField7.setEnabled(false);
        documentodecompra.setEnabled(false);
        jTextArea1.setEnabled(false);
        jLabel8.setText("");
        jTextField4.setText("");
        usuarios.clear();
//        activateCaretupdate = false;
        this.sectedRox = -1;
        jLabel1.setIcon(null);
    }

    private void programacionInsercion() {
        deDonde = true;
        if (!this.localz) {
            guardarRow(jTable1.getSelectedRow());
            this.localz = true;
        }
        if (!this.puedeGuardar) {
            guardarRow(this.sectedRox);
        }
        this.puedeGuardar = false;
        this.sectedRox = jTable1.getSelectedRow();
        if (this.sectedRox != -1) {
            ajustarPRow(true);
            traerUsuarios(this.sectedRox);
        }
        jLabel11.setText(jTable1.getSelectedRow() + "");
        deDonde = false;
        fechaingresoPropertyChange(null);
    }

    private void siguienteParseado() {
        jTextField4.setText(tm.getValueAt(jTable2.getSelectedRow(), 1).toString());
        enviar1();
        jTextField5.setText(usuarios.size() + "");
//        verifiqueParaFila2();
        if (this.va.validacionCamposNulosB()) {
//            verifiqueParaFila2();
            String te = jTextField4.getText();//Codigo contable
            String text = jLabel8.getText();//Nombre del producto
            String text1 = jTextField5.getText();//Cantidad
            //si el codigo contable, el nombre del producto, la cantidad estan vacios y si por donde ingresa el evento es false

            int parseInt = Integer.parseInt(text1);
            if (parseInt >= usuarios.size()) {
                int rowCount = tm1.getRowCount();
                if (rowCount == 0) {
                    for (int i = 0; i < parseInt; i++) {
                        Object[] usuObjects = {"" + i, "", "", "", "", "", "", "", "", "", ""};
                        tm1.ingresarusuariomultiple(usuObjects);
                        tm1.isCellEditable(i, i);
                        Object[] usuObjectsw = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                        usuarios.add(usuObjectsw);
                    }
                    tm1.reload();
                } else {
                    for (int i = rowCount; i < parseInt; i++) {
                        Object[] usuObjects = {"" + i, "", "", "", "", "", "", "", "", "", ""};
                        tm1.ingresarusuariomultiple(usuObjects);
                        Object[] usuObjectsw = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                        usuarios.add(usuObjectsw);
                    }
                    tm1.reload();
                }
            } else {
                if (JOptionPane.showConfirmDialog(rootPane, "¿Desea borrar algunos registros?") == 0) {
                    int rowCount = tm1.getRowCount();
                    if (rowCount != 0) {
                        for (int i = rowCount - 1; i >= parseInt; i--) {
                            tm1.eliminarUsuarioM(i);
                            usuarios.remove(i);
                        }
                        tm1.reload();
                        this.activateCaretupdate = true;
                        this.sectedRox = 0;
                        jLabel11.setText("");
                        totaldepreciacion.setText("");
                        valoracumulado.setText("");
                        valorSalvamento.setText("");
                        jTextField7.setText("");
                        vp.setText("");
                        depreciacion.setText("");
                        diasdepreciacion.setText("");
                        documentodecompra.setText("");
                        jTextField3.setText("");
                        fechaingreso.setDate(null);
                        jDateChooser1.setDate(null);
                        jTextArea1.setText("");
                        this.puedeGuardar = true;
                    }
                } else {
                    return;
                }
            }
            habilitarBSiguiente(false);
            try {
                String text2 = jTextField5.getText();
                int rowCount1 = tm.getUsuarios().size();
                if (rowCount1 > 0) {
                    jTable2.setValueAt(jTextField5.getText(), this.filaS2, 3);
                }
                this.activateCaretupdate = false;
            } catch (java.lang.IndexOutOfBoundsException w) {
            }
        }
    }

    private void enviar1() {
        this.localz = false;
        try {
            ResultSet resultado1 = Producto.c.MysqlConsulta("select nameproducto,vidautil from producto where codepreoducto='" + jTextField4.getText() + "'");
            if (resultado1.next()) {
                jLabel8.setText(resultado1.getString("nameproducto"));
                vidadutil.setText(resultado1.getString("vidautil"));
                String ii = ((JTextField) fechaingreso.getDateEditor().getUiComponent()).getText();
                if (!ii.equals("")) {
                    calcularDepreciacion(ii, resultado1.getString("vidautil"));
                    valoracumulado.setText(ii);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error este Code no existe");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR" + e);
        }
    }

    private void limpiarCampos() {
        jLabel11.setText("");
        totaldepreciacion.setText("");
        valoracumulado.setText("");
        valorSalvamento.setText("");
        jTextField7.setText("");
        this.activateCaretupdate = true;
        vp.setText("");
        depreciacion.setText("");
        diasdepreciacion.setText("");
        documentodecompra.setText("");
        jTextField3.setText("");
        jTextArea1.setText("");
        fechaingreso.setDate(null);
        jDateChooser1.setDate(null);
        this.activateCaretupdate = false;

    }

    private boolean estaEnEseLugar() {
        try {
            ResultSet MysqlConsulta = Producto.c.MysqlConsulta("SELECT * "
                    + "FROM  `encabezadosaldoactivvo`"
                    + "WHERE  `NumeroAR` = '" + jTextField2.getText() + "'");
            if (MysqlConsulta.next()) {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatosSaldosini.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    private boolean exits(String rere) {
        try {
            ResultSet MysqlConsulta = Producto.c.MysqlConsulta("SELECT * FROM  `saldoactivo` WHERE  `identificador` ='" + rere + "'");
            if (MysqlConsulta.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatosSaldosini.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void guardarrowruta(String ruta, int sectedRox) {
        try {
            Object[] usuObjectsw = {usuarios.get(sectedRox)[0],
                depreciacion.getText(),
                valoracumulado.getText(),
                valorSalvamento.getText(),
                depreciacion.getText(),
                diasdepreciacion.getText(),
                documentodecompra.getText(),
                ((JTextField) fechaingreso.getDateEditor().getUiComponent()).getText(),
                ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText(),
                jTextArea1.getText(),
                ruta,
                totaldepreciacion.getText(),
                jLabel1.getIcon(),
                jTextField7.getText(),
                "",
                vp.getText(),
                "",
                "",
                ""
            };

            usuarios.set(sectedRox, usuObjectsw);
        } catch (java.lang.IndexOutOfBoundsException f) {
        }
    }

    private int obtenerNfilas(ResultSet resultado1) {
        try {
            int current = resultado1.getRow();
            resultado1.last();
            int count = resultado1.getRow();
            resultado1.first();
            resultado1.relative(current);
            return count + 1;
        } catch (SQLException ex) {
            Logger.getLogger(DatosSaldosini.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public void produc(String copro) {
        jTextField4.setText(copro);
    }

    public void namjl8(String jl8) {
        jLabel8.setText(jl8);
    }

    public void vidautjt(String jt) {
        vidadutil.setText(jt);
    }

    public void habilitarInsertar() {
        String text = jTextField6.getText();
        if(text.equals("")){
            jTextField4.setEnabled(false);
            jButton1.setEnabled(false);   
        }else{
            jTextField4.setEnabled(true);
            jButton1.setEnabled(true);   
        }
    }
    
     public void habilitarInsertare() {
       
            jTextField4.setEnabled(true);
            jButton1.setEnabled(true);   
        
    }
    
    public void habilitarInserta() {
        jTextField4.setEnabled(true);
        jButton1.setEnabled(true);
        jTextField5.setEnabled(true);
    }

    
    public boolean estaPreoducto(String toString) {
         for (int i = 0, h = jTable2.getRowCount(); i < h; i++) {
            if (jTable2.getValueAt(i, 1).equals(toString)) {
                JOptionPane.showMessageDialog(this, "Este codigo ya esta insertado");
                return false;
            }
        }
         return true;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

import Datos.Conexion;
import Paneles.panelInicio;
import Paneles.panelVendedores;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Los Pibes
 */
public class RegistroGeneros extends javax.swing.JFrame {

    final Calendar calendar = Calendar.getInstance();
    final java.util.Date date = calendar.getTime();
    String fecha = new SimpleDateFormat("yyyyMMdd-hh.mm.ss").format(date);

    /**
     * Creates new form RegistroAdministradores
     */
    public RegistroGeneros() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        anchoColumnas();
        cargarData();
        bloquear();

        txtIDGenero.setEnabled(false);
        TextPrompt idGenero = new TextPrompt("ID", txtIDGenero);
        TextPrompt genero = new TextPrompt("GÉNERO", txtGeneros);

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/cinematixLogo.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        modificarGeneros = new javax.swing.JMenuItem();
        btnRegresar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGeneros = new javax.swing.JTable();
        txtIDGenero = new javax.swing.JTextField();
        txtGeneros = new javax.swing.JTextField();
        btnGuardar = new rojerusan.RSButtonHover();
        btnNuevo = new rojerusan.RSButtonHover();
        btnDeshabilitar = new rojerusan.RSButtonHover();
        btnActualizar = new rojerusan.RSButtonHover();
        lbFondo = new javax.swing.JLabel();

        modificarGeneros.setText("Modificar");
        modificarGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarGenerosActionPerformed(evt);
            }
        });
        jPopupMenu1.add(modificarGeneros);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 30));

        tablaGeneros.setBackground(new java.awt.Color(61, 61, 61));
        tablaGeneros.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        tablaGeneros.setForeground(new java.awt.Color(255, 255, 255));
        tablaGeneros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tablaGeneros.setComponentPopupMenu(jPopupMenu1);
        tablaGeneros.setOpaque(false);
        tablaGeneros.setRowHeight(25);
        tablaGeneros.setSelectionBackground(new java.awt.Color(29, 29, 29));
        tablaGeneros.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaGeneros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaGenerosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaGeneros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 430, 340));

        txtIDGenero.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        txtIDGenero.setForeground(new java.awt.Color(255, 255, 255));
        txtIDGenero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDGenero.setCaretColor(new java.awt.Color(255, 255, 255));
        txtIDGenero.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtIDGenero.setOpaque(false);
        txtIDGenero.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtIDGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 50, 40));

        txtGeneros.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        txtGeneros.setForeground(new java.awt.Color(255, 255, 255));
        txtGeneros.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGeneros.setCaretColor(new java.awt.Color(255, 255, 255));
        txtGeneros.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtGeneros.setOpaque(false);
        txtGeneros.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtGeneros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGenerosFocusGained(evt);
            }
        });
        getContentPane().add(txtGeneros, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 220, 220, 40));

        btnGuardar.setBackground(new java.awt.Color(81, 81, 81));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconoGuardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setColorHover(new java.awt.Color(61, 61, 61));
        btnGuardar.setFocusPainted(false);
        btnGuardar.setFont(new java.awt.Font("Garamond", 0, 11)); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 140, 40));

        btnNuevo.setBackground(new java.awt.Color(81, 81, 81));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconoNuevo.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setBorderPainted(false);
        btnNuevo.setColorHover(new java.awt.Color(61, 61, 61));
        btnNuevo.setFocusPainted(false);
        btnNuevo.setFont(new java.awt.Font("Garamond", 0, 11)); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 330, 140, 40));

        btnDeshabilitar.setBackground(new java.awt.Color(81, 81, 81));
        btnDeshabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconoDeshabilitar.png"))); // NOI18N
        btnDeshabilitar.setText("DESHABILITAR");
        btnDeshabilitar.setBorderPainted(false);
        btnDeshabilitar.setColorHover(new java.awt.Color(61, 61, 61));
        btnDeshabilitar.setFocusPainted(false);
        btnDeshabilitar.setFont(new java.awt.Font("Garamond", 0, 11)); // NOI18N
        btnDeshabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshabilitarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeshabilitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 140, 40));

        btnActualizar.setBackground(new java.awt.Color(81, 81, 81));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconoActualizar.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorderPainted(false);
        btnActualizar.setColorHover(new java.awt.Color(61, 61, 61));
        btnActualizar.setFocusPainted(false);
        btnActualizar.setFont(new java.awt.Font("Garamond", 0, 11)); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 390, 140, 40));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registroGeneros.png"))); // NOI18N
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                try {
                    log myLog = new log("Source Packages\\Logs\\RegistroGeneros " + fecha + ".txt");
                    myLog.logger.setLevel(Level.SEVERE);
                    myLog.logger.severe(e.getMessage() + " La causa fue: " + e.getCause());
                } catch (IOException ex) {
                    Logger.getLogger(RegistroGeneros.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_formWindowOpened

    ResultSet rs;
    PreparedStatement Pst;
    DefaultTableModel model;
    Conexion cc = new Conexion();
    Connection cn = cc.GetConexion();

    boolean guardar;

    void validarCamposVacios() {
        ImageIcon jPaneIcon = new ImageIcon("src/Iconos/iconoError.png");
        if (txtGeneros.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor rellene el campo género", "Error", JOptionPane.PLAIN_MESSAGE, jPaneIcon);
        } else {
            guardar = true;
        }
    }

    public boolean verificarCaracteres(String cadena) {
        String patron = "^[A-Z]((([A-Za-zñÑáéíóúÁÉÍÓÚ ,.\\s])\\3?(?!\\3)))+$";
        Pattern patt = Pattern.compile(patron);
        Matcher comparador = patt.matcher(cadena);
        if (!comparador.matches()) {
            ImageIcon jPanelIcono = new ImageIcon("src/iconos/iconoError.png");
            JOptionPane.showMessageDialog(null, "Al parecer estás cometiendo alguno de estos errores:\n•Asegurate de iniciar el párrafo con letras mayúsculas\n•No utilices caracteres especiales\n•No repitas letras de forma incorrecta", "Error", JOptionPane.PLAIN_MESSAGE, jPanelIcono);
            guardar = false;
        } else {
            guardar = true;
        }
        return guardar;
    }

    void cargarData() {
        String[] titulos = {"ID", "Género", "Estado"};
        String[] registros = new String[3];
        String sql = "SELECT IDGenero, Genero, Estado FROM generos INNER JOIN estados USING (IDEstado) WHERE IDGenero != 0 ORDER BY IDGenero";

        model = new DefaultTableModel(null, titulos);

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("IDGenero");
                registros[1] = rs.getString("Genero");
                registros[2] = rs.getString("Estado");
                model.addRow(registros);
            }

            tablaGeneros.setModel(model);
            anchoColumnas();
        } catch (SQLException ex) {
            Logger.getLogger(panelVendedores.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }

    void anchoColumnas() {
        TableColumnModel anchoColumnas = tablaGeneros.getColumnModel();
        anchoColumnas.getColumn(0).setPreferredWidth(30);
        anchoColumnas.getColumn(1).setPreferredWidth(200);
        anchoColumnas.getColumn(2).setPreferredWidth(120);
    }

    void limpiarCajas() {
        txtIDGenero.setText("");
        txtGeneros.setText("");
        tablaGeneros.clearSelection();
    }

    void bloquear() {
        txtGeneros.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnDeshabilitar.setEnabled(false);
        tablaGeneros.setEnabled(false);
    }

    void desbloquear() {
        txtGeneros.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnDeshabilitar.setEnabled(true);
        tablaGeneros.setEnabled(true);
    }

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        if (!txtIDGenero.getText().isEmpty() || !txtGeneros.getText().isEmpty()) {
            ImageIcon jPaneIcon = new ImageIcon("src/Iconos/iconoSalida.png");
            int salidaConfirmacion = JOptionPane.showConfirmDialog(null, "Al parecer tienes un proceso pendiente\n ¿Estás seguro que deseas salir?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, jPaneIcon);
            if (salidaConfirmacion == 0) {
                this.dispose();
                panelInicio.pantallaGeneros = false;
            }
        } else {
            this.dispose();
            panelInicio.pantallaGeneros = false;
        }
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void tablaGenerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaGenerosMouseClicked
        int fila = tablaGeneros.getSelectedRow();
        if (fila >= 0) {
            btnDeshabilitar.setEnabled(true);
            String estado = tablaGeneros.getValueAt(fila, 2).toString();

            if ("Habilitado".equals(estado)) {
                ImageIcon iconobtn = new ImageIcon("src/Iconos/iconoDeshabilitar.png");
                btnDeshabilitar.setIcon(iconobtn);
                btnDeshabilitar.setText("DESHABILITAR");
            } else if ("Deshabilitado".equals(estado)) {
                ImageIcon iconobtn = new ImageIcon("src/Iconos/iconoHabilitar.png");
                btnDeshabilitar.setIcon(iconobtn);
                btnDeshabilitar.setText("HABILITAR");
            }
        }
    }//GEN-LAST:event_tablaGenerosMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        desbloquear();
        ImageIcon iconoBoton = new ImageIcon("src/iconos/iconoCancelar.png");
        btnDeshabilitar.setIcon(iconoBoton);
        btnDeshabilitar.setText("CANCELAR");
        btnNuevo.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    public boolean verificaGenero = false;

    public boolean verificarGenero() {
        if (!txtGeneros.getText().isEmpty()) {
            Conexion cc = new Conexion();
            Connection cn = cc.GetConexion();
            String genero = txtGeneros.getText();
            String sql = "SELECT Genero FROM generos WHERE Genero = '" + genero + "'";

            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);

                if (rs.next()) {
                    if (rs.getString("Genero").equals(txtGeneros.getText())) {
                        ImageIcon jPanelIcon = new ImageIcon("src/iconos/iconoAdvertencia.png");
                        JOptionPane.showMessageDialog(null, "Este género ya existe, intenta con otro", "Advertencia", JOptionPane.PLAIN_MESSAGE, jPanelIcon);
                        ImageIcon x = new ImageIcon("src/iconos/iconoX.png");
                        guardar = false;
                    }
                } else {
                    guardar = true;
                    verificaGenero = true;
                }
            } catch (Exception e) {
                try {
                    log myLog = new log("Source Packages\\Logs\\RegistroGeneros " + fecha + ".txt");
                    myLog.logger.setLevel(Level.SEVERE);
                    myLog.logger.severe(e.getMessage() + " La causa fue: " + e.getCause());
                } catch (IOException ex) {
                    Logger.getLogger(RegistroGeneros.class.getName()).log(Level.SEVERE, null, ex);
                }
                ImageIcon jPanelIcon = new ImageIcon("src/iconos/iconoError.png");
                JOptionPane.showMessageDialog(null, "No se pudo verificar\n" + e.getMessage(), "Error", JOptionPane.PLAIN_MESSAGE, jPanelIcon);
            }
        }
        return verificaGenero;
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Conexion cn = new Conexion();
        Connection cc = cn.GetConexion();
        validarCamposVacios();
        verificarGenero();
        verificarCaracteres(txtGeneros.getText());
        if (!guardar == false) {
            String sql = "INSERT INTO generos (Genero) VALUES (?)";

            try {
                PreparedStatement pst = cc.prepareStatement(sql);
                pst.setString(1, txtGeneros.getText());

                int i = pst.executeUpdate();
                if (i > 0) {
                    ImageIcon jPanelIcono = new ImageIcon("src/iconos/iconoCorrecto.png");
                    JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Notificación", JOptionPane.PLAIN_MESSAGE, jPanelIcono);
                    cargarData();
                    bloquear();
                    limpiarCajas();
                    btnNuevo.setEnabled(true);
                }

            } catch (Exception e) {
                try {
                    log myLog = new log("Source Packages\\Logs\\RegistroGeneros " + fecha + ".txt");
                    myLog.logger.setLevel(Level.SEVERE);
                    myLog.logger.severe(e.getMessage() + " La causa fue: " + e.getCause());
                } catch (IOException ex) {
                    Logger.getLogger(RegistroGeneros.class.getName()).log(Level.SEVERE, null, ex);
                }
                ImageIcon jPanelIcono = new ImageIcon("src/iconos/iconoError.png");
                JOptionPane.showMessageDialog(null, "Hubo un error al intentar guardar", "Error", JOptionPane.PLAIN_MESSAGE, jPanelIcono);
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Conexion cn = new Conexion();
        Connection cc = cn.GetConexion();
        validarCamposVacios();
        verificarGenero();
        verificarCaracteres(txtGeneros.getText());
        if (!guardar == false) {
            String sql = "UPDATE generos SET Genero = ? WHERE IDGenero = '" + txtIDGenero.getText() + "'";

            try {
                PreparedStatement pst = cc.prepareStatement(sql);
                pst.setString(1, txtGeneros.getText());

                int i = pst.executeUpdate();
                if (i > 0) {
                    ImageIcon jPanelIcono = new ImageIcon("src/Iconos/iconoCorrecto.png");
                    JOptionPane.showMessageDialog(null, "El registro fue actualizado correctamente", "Notificación", JOptionPane.PLAIN_MESSAGE, jPanelIcono);

                    ImageIcon iconobtn = new ImageIcon("src/Iconos/iconoDeshabilitar.png");
                    btnDeshabilitar.setIcon(iconobtn);
                    btnDeshabilitar.setText("DESHABILITAR");
                }

            } catch (Exception e) {
                try {
                    log myLog = new log("Source Packages\\Logs\\RegistroGeneros " + fecha + ".txt");
                    myLog.logger.setLevel(Level.SEVERE);
                    myLog.logger.severe(e.getMessage() + " La causa fue: " + e.getCause());
                } catch (IOException ex) {
                    Logger.getLogger(RegistroGeneros.class.getName()).log(Level.SEVERE, null, ex);
                }
                ImageIcon jPanelIcono = new ImageIcon("src/Iconos/iconoCorrecto.png");
                JOptionPane.showMessageDialog(null, "Hubo un error al intentar actualizar", "Error", JOptionPane.PLAIN_MESSAGE, jPanelIcono);
                System.out.println(e.getMessage());
            }
        }
        cargarData();
        bloquear();
        limpiarCajas();
        btnNuevo.setEnabled(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnDeshabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshabilitarActionPerformed
        int fila = tablaGeneros.getSelectedRow();
        String habilitado = "1";
        String deshabilitado = "2";

        if (fila >= 0) {
            String id = tablaGeneros.getValueAt(fila, 0).toString();
            String genero = tablaGeneros.getValueAt(fila, 1).toString();

            if (btnDeshabilitar.getText().equals("CANCELAR")) {
                limpiarCajas();
                btnActualizar.setEnabled(false);
                btnNuevo.setEnabled(false);
                btnDeshabilitar.setEnabled(false);
                btnGuardar.setEnabled(true);

                ImageIcon iconobtn = new ImageIcon("src/Iconos/iconoDeshabilitar.png");
                btnDeshabilitar.setIcon(iconobtn);
                btnDeshabilitar.setText("DESHABILITAR");

            } else if (btnDeshabilitar.getText().equals("DESHABILITAR")) {
                ImageIcon jPanelIcon = new ImageIcon("src/iconos/iconoPregunta.png");
                int ventanaConfirmacion = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas deshabilitar este género?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, jPanelIcon);
                if (ventanaConfirmacion == 0) {
                    try {
                        String sqlEstado = "UPDATE `generos` SET `IDEstado` = ? WHERE `generos`.`IDGenero` = ? ";
                        PreparedStatement pst = (PreparedStatement) cn.prepareStatement(sqlEstado);
                        pst.setString(1, deshabilitado);
                        pst.setString(2, id);
                        pst.execute();

                        ImageIcon jPanelIcon2 = new ImageIcon("src/iconos/iconoCorrecto.png");
                        JOptionPane.showMessageDialog(null, "El género " + genero + " ha sido deshabilitado", "Confirmación", JOptionPane.PLAIN_MESSAGE, jPanelIcon2);
                    } catch (Exception e) {
                        try {
                            log myLog = new log("Source Packages\\Logs\\RegistroGeneros " + fecha + ".txt");
                            myLog.logger.setLevel(Level.SEVERE);
                            myLog.logger.severe(e.getMessage() + " La causa fue: " + e.getCause());
                        } catch (IOException ex) {
                            Logger.getLogger(RegistroGeneros.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            } else if (btnDeshabilitar.getText().equals("HABILITAR")) {
                ImageIcon jPanelIcon = new ImageIcon("src/iconos/iconoPregunta.png");
                int ventanaConfirmacion = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas habilitar este género?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, jPanelIcon);
                if (ventanaConfirmacion == 0) {
                    try {
                        String sqlEstado = "UPDATE `generos` SET `IDEstado` = ? WHERE `generos`.`IDGenero` = ? ";
                        PreparedStatement pst = (PreparedStatement) cn.prepareStatement(sqlEstado);
                        pst.setString(1, habilitado);
                        pst.setString(2, id);
                        pst.execute();

                        ImageIcon jPanelIcon2 = new ImageIcon("src/iconos/iconoCorrecto.png");
                        JOptionPane.showMessageDialog(null, "El género " + genero + " ahora está habilitado", "Confirmación", JOptionPane.PLAIN_MESSAGE, jPanelIcon2);
                    } catch (Exception e) {
                        try {
                            log myLog = new log("Source Packages\\Logs\\RegistroGeneros " + fecha + ".txt");
                            myLog.logger.setLevel(Level.SEVERE);
                            myLog.logger.severe(e.getMessage() + " La causa fue: " + e.getCause());
                        } catch (IOException ex) {
                            Logger.getLogger(RegistroGeneros.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }
        cargarData();
        bloquear();
        limpiarCajas();
        btnNuevo.setEnabled(true);
    }//GEN-LAST:event_btnDeshabilitarActionPerformed

    private void txtGenerosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGenerosFocusGained
        ImageIcon iconoBoton = new ImageIcon("src/iconos/iconoCancelar.png");
        btnDeshabilitar.setIcon(iconoBoton);
        btnDeshabilitar.setText("CANCELAR");
    }//GEN-LAST:event_txtGenerosFocusGained

    public int fila;

    void modificarRegistro() {
        fila = tablaGeneros.getSelectedRow();

        ImageIcon iconobtn = new ImageIcon("src/Iconos/iconoCancelar.png");
        btnDeshabilitar.setIcon(iconobtn);
        btnDeshabilitar.setText("CANCELAR");

        if (fila >= 0) {
            btnActualizar.setEnabled(true);
            btnDeshabilitar.setEnabled(true);
            btnNuevo.setEnabled(false);
            txtGeneros.setEnabled(true);
            btnGuardar.setEnabled(false);

            String id = tablaGeneros.getValueAt(fila, 0).toString();
            String genero = tablaGeneros.getValueAt(fila, 1).toString();

            txtIDGenero.setText(id);
            txtGeneros.setText(genero);

        } else {
            ImageIcon jPanelIcon = new ImageIcon("src/iconos/iconoAdvertencia.png");
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Advertencia", JOptionPane.PLAIN_MESSAGE, jPanelIcon);
        }
    }

    private void modificarGenerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarGenerosActionPerformed
        if (!txtGeneros.getText().isEmpty()) {
            ImageIcon jPanelIcono = new ImageIcon("src/iconos/iconoPregunta.png");
            int decision = JOptionPane.showConfirmDialog(null, "Los datos aún no se han guardado y podrían perderse\n "
                    + "¿Seguro que desea entrar en modo edición?", "Confirmación", JOptionPane.YES_NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE, jPanelIcono);
            if (decision == 0) {
                modificarRegistro();
            }
        } else {
            modificarRegistro();
        }
    }//GEN-LAST:event_modificarGenerosActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroGeneros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroGeneros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroGeneros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroGeneros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroGeneros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover btnActualizar;
    private rojerusan.RSButtonHover btnDeshabilitar;
    private rojerusan.RSButtonHover btnGuardar;
    private rojerusan.RSButtonHover btnNuevo;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JMenuItem modificarGeneros;
    private javax.swing.JTable tablaGeneros;
    public javax.swing.JTextField txtGeneros;
    private javax.swing.JTextField txtIDGenero;
    // End of variables declaration//GEN-END:variables
}

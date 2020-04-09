
package Sistema_Activos;

import Logica.ConexionMysql;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Registrar_Usuario extends javax.swing.JFrame {

    com.mysql.jdbc.PreparedStatement ps ;
    
    public Registrar_Usuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrardatos();
        bloquear();
        ocultar();
        btneditar.setEnabled(false);
    }

    void bloquear() {
        txtid.setEnabled(false);
        txtusuario.setEnabled(false);
        passw.setEnabled(false);
        cbselec.setEnabled(false);
        btnregistrar.setEnabled(false);
        btneliminar.setEnabled(false);
        btnaceptar.setEnabled(false);
        passwelim.setEnabled(false);

        passwelim.setText("");
        txtid.setText("");
        txtusuario.setText("");
        passw.setText("");
        cbselec.setSelectedIndex(0);
    }

    void habilitar() {
        txtid.setEnabled(true);
        txtusuario.setEnabled(true);
        passw.setEnabled(true);
        cbselec.setEnabled(true);
        btnregistrar.setEnabled(true);

    }

    void habilitar2() {
        btneditar.setEnabled(true);
        txtid.setEnabled(true);
        txtusuario.setEnabled(true);
        passw.setEnabled(true);
        cbselec.setEnabled(true);

    }

    void bloquear2() {
        btneditar.setEnabled(false);
        txtid.setEnabled(false);
        txtusuario.setEnabled(false);
        passw.setEnabled(false);
        cbselec.setEnabled(false);

        passwelim.setText("");
        txtid.setText("");
        txtusuario.setText("");
        passw.setText("");
        cbselec.setSelectedIndex(0);
    }

    void ocultar() {
        tablausuario.getColumnModel().getColumn(2).setMaxWidth(2);
        tablausuario.getColumnModel().getColumn(2).setMinWidth(2);
        tablausuario.getColumnModel().getColumn(2).setPreferredWidth(2);

    }

    
    String id = "";

    public Integer totalregistros;

    public void filtrar() {
        
    
        ConexionMysql cc = new ConexionMysql();
        Connection con = null;
        con = cc.conexion();
          try {
            
            DefaultTableModel modeloA = new DefaultTableModel();

            tablausuario.setModel(modeloA);
           

            String sqlA = "SELECT* FROM usuario WHERE id";
            ps.setString(1, txtid.getText());
            
            ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sqlA);
            ResultSet rs = ps.executeQuery();

            ResultSetMetaData rsMdA = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnasA = rsMdA.getColumnCount();

            modeloA.addColumn("ID");
            modeloA.addColumn("USUARIO");
            modeloA.addColumn("TIPO DE USUARIO");
           

            int[] anchosA = {50, 50, 50};
            for (int i = 0; i <  tablausuario.getColumnCount(); i++) {
                tablausuario.getColumnModel().getColumn(i).setPreferredWidth(anchosA[i]);
            }

            while (rs.next()) {
                Object[] filasA = new Object[cantidadColumnasA];
                for (int i = 0; i < cantidadColumnasA; i++) {
                    filasA[i] = rs.getObject(i + 1);
                }
                modeloA.addRow(filasA);
            }
     } catch (SQLException ex) {
            java.lang.System.err.println(ex.toString());
        }
}
    
    
    
    public void eliminar (){
        ConexionMysql cc = new ConexionMysql();
        Connection con = null;
        con = cc.conexion();
        try{
            
            ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement("DELETE FROM usuario WHERE id=?");
            ps.setString(1, txtid.getText());
            
            
            int res = ps.executeUpdate();

            if( res >0   ){
                
                JOptionPane.showMessageDialog(null, " Usuario Eliminado");
                limpiar();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al eliminar Usuario");
                 limpiar();
            }
            
            con.close();
            
        } catch(HeadlessException | SQLException e){
            
        }
        
        
        
        
        
    
        }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuEditar = new javax.swing.JMenuItem();
        btneliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        cbselec = new javax.swing.JComboBox();
        btnnuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablausuario = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        txtid1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        menuEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuEditar.setForeground(new java.awt.Color(204, 102, 0));
        menuEditar.setText("Editar");
        menuEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuEditar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btneliminar.setBackground(new java.awt.Color(255, 255, 0));
        btneliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 51, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Id:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Usuario:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Tipo de Usuario:");

        cbselec.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbselec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "seleccionar:", "ADMINISTRADOR", "INVITADO" }));

        btnnuevo.setBackground(new java.awt.Color(255, 255, 0));
        btnnuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevo.png"))); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbselec, javax.swing.GroupLayout.Alignment.LEADING, 0, 130, Short.MAX_VALUE)
                    .addComponent(txtusuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtid))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnnuevo)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbselec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        tablausuario.setBackground(new java.awt.Color(153, 204, 255));
        tablausuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablausuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tablausuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USUARIO", "TIPO DE USUARIO"
            }
        ));
        tablausuario.setComponentPopupMenu(jPopupMenu1);
        tablausuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablausuarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablausuarioMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablausuario);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("REGISTRAR USUARIOS");

        btnsalir.setBackground(new java.awt.Color(153, 255, 0));
        btnsalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(0, 51, 255));
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salirr.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(92, 92, 92)
                .addComponent(btnsalir)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btneditar.setBackground(new java.awt.Color(255, 255, 0));
        btneditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Editarr.png"))); // NOI18N
        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btnregistrar.setBackground(new java.awt.Color(255, 255, 0));
        btnregistrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardarR.png"))); // NOI18N
        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnregistrar)
                .addGap(69, 69, 69)
                .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btneliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtid1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(txtid1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnregistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
       eliminar();   
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
       
       registrar();

    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        habilitar();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void tablausuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablausuarioMousePressed

        //passwelim.setEnabled(true);
        //btnaceptar.setEnabled(true);
        //btneliminar.setEnabled(true);
    if (evt.getClickCount() == 2) {
            int fila = tablausuario.getSelectedRow();
            String cod;
            String valor;
            String val;

            cod = tablausuario.getValueAt(fila, 0 ).toString();
            valor = tablausuario.getValueAt(fila, 1).toString();
            val= tablausuario.getValueAt(fila, 2).toString();

            this.txtid.setText(cod);
            this.txtusuario.setText(valor);
            this.cbselec.setSelectedItem(val);
           
            this.dispose();
    }                                     
        
        
        
        
    }//GEN-LAST:event_tablausuarioMousePressed

    private void tablausuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablausuarioMouseClicked
        

    }//GEN-LAST:event_tablausuarioMouseClicked

    private void menuEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarActionPerformed
        
        int fila = tablausuario.getSelectedRow();
        if (fila >= 0) {
            txtid.setText(tablausuario.getValueAt(fila, 0).toString());
            txtusuario.setText(tablausuario.getValueAt(fila, 1).toString());
            passw.setText(tablausuario.getValueAt(fila, 2).toString());
            cbselec.setSelectedItem(tablausuario.getValueAt(fila, 3).toString());
            id = tablausuario.getValueAt(fila, 0).toString();
            habilitar2();
            btneliminar.setEnabled(false);
            passwelim.setEnabled(false);
            btnaceptar.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "No se ha Seleccionado Ninguna Fila", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuEditarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE USUARIO SET ID='" + txtid.getText() + "',usuario='" + txtusuario.getText()
                    + "',password='" + passw.getText() + "',Tipo_Usuario='" + cbselec.getSelectedItem().toString() + "' WHERE id='" + id + "' ");
            id = txtid.getText();
            pst.executeUpdate();
            mostrardatos("");
            bloquear2();
            btneditar.setEnabled(false);

            JOptionPane.showMessageDialog(null, "Datos del Usuario Editado Correctamente", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            java.lang.System.out.print(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al Editar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btneditarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        filtrar();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void registrar(){
    
    if (txtid.getText().equals("") || txtusuario.getText().equals("") || passw.getText().equals("")
                || cbselec.getSelectedItem().equals("seleccionar:")) {
        
    JOptionPane.showMessageDialog(null, "Complete todos los campos", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

        } else {
            try {

                PreparedStatement pst = cn.prepareStatement("INSERT INTO Usuario(id,usuario,password,Tipo_Usuario) VALUES(?,?,?,?)");
                pst.setString(1, txtid.getText());
                pst.setString(2, txtusuario.getText());
                pst.setString(3, passw.getText());
                pst.setString(4, cbselec.getSelectedItem().toString());

                int a = pst.executeUpdate();
                if (a > 0) {
                    JOptionPane.showMessageDialog(null, "Usuario Registrado Correctammente", "Guardando Registro", JOptionPane.INFORMATION_MESSAGE);
                    mostrardatos("");
                    bloquear();
                    ocultar();

                } else {
                    JOptionPane.showMessageDialog(null, "Error al agregar", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
            }
        }

    
    
    
    
    }
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Registrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox cbselec;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuEditar;
    private javax.swing.JTable tablausuario;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtid1;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}

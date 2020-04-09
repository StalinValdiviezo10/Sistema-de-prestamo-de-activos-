
package Sistema_Activos;
import Logica.ConexionMysql;
import com.mysql.jdbc.PreparedStatement;
import java.awt.HeadlessException;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroDocen extends javax.swing.JInternalFrame {
    PreparedStatement ps;
    ResultSet rs;
    ResultSet result;
    PreparedStatement pst;
    File fichero = null;
     
    
    public RegistroDocen() {
        initComponents();
         
        consultar();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        LBFOTO = new javax.swing.JLabel();
        txt_ruta = new javax.swing.JTextField();
        FOTO = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnsalir1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        MODIFICAR = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        BUSCAR1 = new javax.swing.JButton();
        TXTBUSCAR = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        DIRECCION = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TELEFONO = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        CORREO = new javax.swing.JTextField();
        APELLIDO_PATERNO = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        CI_DOCENTE = new javax.swing.JTextField();
        NOMBRES = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        APELLIDO_MATERNO = new javax.swing.JTextField();
        CARRERA = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        TITULO = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLA_DOCENTE = new javax.swing.JTable();

        setBackground(new java.awt.Color(215, 227, 215));
        setOpaque(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jPanel5.setBackground(new java.awt.Color(215, 227, 215));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));

        LBFOTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));

        txt_ruta.setEditable(false);
        txt_ruta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        txt_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rutaActionPerformed(evt);
            }
        });

        FOTO.setBackground(new java.awt.Color(210, 234, 236));
        FOTO.setText("FOTO");
        FOTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        FOTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FOTOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FOTO, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(txt_ruta)
                    .addComponent(LBFOTO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBFOTO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txt_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FOTO, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTA Y REGISTRO DE DOCENTES ");
        jLabel1.setOpaque(true);

        btnsalir1.setBackground(new java.awt.Color(153, 255, 0));
        btnsalir1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsalir1.setForeground(new java.awt.Color(0, 51, 255));
        btnsalir1.setText("Salir");
        btnsalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnsalir1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(215, 227, 215));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jButton1.setBackground(new java.awt.Color(210, 234, 236));
        jButton1.setText("GUARDAR");
        jButton1.setToolTipText("");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        MODIFICAR.setBackground(new java.awt.Color(210, 234, 236));
        MODIFICAR.setText("MODIFICAR");
        MODIFICAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICARActionPerformed(evt);
            }
        });

        ELIMINAR.setBackground(new java.awt.Color(210, 234, 236));
        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        buscar.setBackground(new java.awt.Color(210, 234, 236));
        buscar.setText("BUSCAR");
        buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        buscar.setPreferredSize(new java.awt.Dimension(81, 23));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        BUSCAR1.setBackground(new java.awt.Color(210, 234, 236));
        BUSCAR1.setText("MOSTRAR");
        BUSCAR1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        BUSCAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCAR1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTBUSCAR))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ELIMINAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BUSCAR1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUSCAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(215, 227, 215));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(14, 124, 167));
        jLabel13.setText("Apellido Materno:");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(14, 124, 167));
        jLabel14.setText("Titulo:");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(14, 124, 167));
        jLabel15.setText("Apellido Paterno:");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(14, 124, 167));
        jLabel16.setText("Correo:");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(14, 124, 167));
        jLabel17.setText("Telefono:");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(14, 124, 167));
        jLabel18.setText("Direccion:");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(14, 124, 167));
        jLabel19.setText("Carrera:");

        CARRERA.setBackground(new java.awt.Color(0, 102, 204));
        CARRERA.setForeground(new java.awt.Color(210, 234, 236));
        CARRERA.setToolTipText("");
        CARRERA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        CARRERA.setName(""); // NOI18N
        CARRERA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARRERAActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(14, 124, 167));
        jLabel11.setText("CI:");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(14, 124, 167));
        jLabel12.setText("Nombres:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(APELLIDO_MATERNO)
                    .addComponent(TITULO)
                    .addComponent(DIRECCION, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TELEFONO, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CORREO)
                    .addComponent(CI_DOCENTE)
                    .addComponent(APELLIDO_PATERNO)
                    .addComponent(NOMBRES)
                    .addComponent(CARRERA, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CI_DOCENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NOMBRES, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(APELLIDO_PATERNO, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(APELLIDO_MATERNO, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CORREO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CARRERA, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(215, 227, 215));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));

        TABLA_DOCENTE.setBackground(new java.awt.Color(153, 204, 255));
        TABLA_DOCENTE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        TABLA_DOCENTE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CI DOCENTE", "NOMBRES", "APELLIDO PATERNO", "APELLIDO MATERNO", "ESPECIALIDAD", "CARRERA", "DIRECCION", "TELEFONO", "CORREO"
            }
        ));
        jScrollPane2.setViewportView(TABLA_DOCENTE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CARRERAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARRERAActionPerformed

    }//GEN-LAST:event_CARRERAActionPerformed

    private void txt_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rutaActionPerformed

    private void FOTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FOTOActionPerformed

    }//GEN-LAST:event_FOTOActionPerformed

    private void btnsalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnsalir1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        guardar();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARActionPerformed
        modificar();
    }//GEN-LAST:event_MODIFICARActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        eliminar();
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        buscar();
    }//GEN-LAST:event_buscarActionPerformed

    private void BUSCAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCAR1ActionPerformed
        mostrar();
    }//GEN-LAST:event_BUSCAR1ActionPerformed

public void consultar( ){
  ConexionMysql cc = new ConexionMysql();
  Connection con = null;
  con = cc.conexion();
       
       try{
       
       Statement st = con.createStatement();
       ResultSet rs = st.executeQuery("SELECT codi_carr FROM carrera ");
       CARRERA.removeAllItems();
       while (rs.next()){
       CARRERA.addItem(rs.getString(1));
       }
     
        } catch(SQLException e){
            System.err.println(e);
        }
}
  
 public void guardar(){
      ConexionMysql cc = new ConexionMysql();
      Connection con = null;
      con = cc.conexion();
        
        try{
            
            
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO docente ( cedula_docen, nombre,apellido_paterno,apellido_materno,titulo_docen,correo_docen,telefono_docen,direccion_docen,codi_carr) VALUES(?,?,?,?,?,?,?,?,?)");  
            ps.setString(1, CI_DOCENTE.getText());
            ps.setString(2, NOMBRES.getText());
            ps.setString(3, APELLIDO_PATERNO.getText());
            ps.setString(4, APELLIDO_MATERNO.getText());
            ps.setString(5, TITULO.getText());
            ps.setString(6, CORREO.getText());
            ps.setString(7, TELEFONO.getText());
            ps.setString(8, DIRECCION.getText());
            ps.setString(9, CARRERA.getSelectedItem().toString());
            
            
           
           
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "INFORMACION GUARDADA");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR INFORMACION");
                limpiar();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
 }
  
 public void mostrar() {
 
       ConexionMysql cc = new ConexionMysql();
        Connection con = null;
        con = cc.conexion();
          try {
            
            DefaultTableModel modeloA = new DefaultTableModel();
            TABLA_DOCENTE.setModel(modeloA); 
                    
            String sqlA = "SELECT* FROM docente";
              ps = (PreparedStatement) con.prepareStatement(sqlA);
            ResultSet rs = ps.executeQuery();

            ResultSetMetaData rsMdA = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnasA = rsMdA.getColumnCount();

            modeloA.addColumn("CI DOCENTE");
            modeloA.addColumn("NOMBRES");
            modeloA.addColumn("APELLIDO PATERNO");
            modeloA.addColumn("APELLIDO MATERNO");
            modeloA.addColumn("ESPECIALIDAD");
            modeloA.addColumn("CARRERA");
            modeloA.addColumn("DIRECCION ");
            modeloA.addColumn("TELEFONO");
            modeloA.addColumn("CORREO");

            int[] anchosA = {50, 50, 50,50, 50, 50,50, 50, 50};
            for (int i = 0; i <  TABLA_DOCENTE.getColumnCount(); i++) {
                TABLA_DOCENTE.getColumnModel().getColumn(i).setPreferredWidth(anchosA[i]);
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
            JOptionPane.showMessageDialog(null, "No existe docente registrado");
        }
 }
 
 public void buscar(){
 
 ConexionMysql cc = new ConexionMysql();
      Connection con = null;
      con = cc.conexion();
        
        try{
            
           
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM docente WHERE cedula_docen = ?");
            ps.setString(1, TXTBUSCAR.getText());
            
            
            
            ResultSet rs = ps.executeQuery();
            
            
            if(rs.next()){

                CI_DOCENTE.setText(rs.getString("cedula_docen"));
                NOMBRES.setText(rs.getString("nombre"));
                APELLIDO_PATERNO.setText(rs.getString("apellido_paterno"));
                APELLIDO_MATERNO.setText(rs.getString("apellido_materno"));
                TITULO.setText(rs.getString("titulo_docen"));
                CORREO.setText(rs.getString("correo_docen"));
                TELEFONO.setText(rs.getString("telefono_docen")); 
                DIRECCION.setText(rs.getString("direccion_docen"));
                CARRERA.setSelectedItem(rs.getString("codi_carr"));
                
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe docente registrado");
            }
            
        } catch(HeadlessException | SQLException e){
            System.err.println(e);
            
        }
 
 
 }
 
 public void limpiar(){

             CI_DOCENTE.setText("");
             NOMBRES.setText("");
             APELLIDO_PATERNO.setText("");
             APELLIDO_MATERNO.setText("");
             TITULO.setText("");
             DIRECCION.setText("");
             TELEFONO.setText("");
             CORREO.setText("");
 }
 
 public void modificar(){
  ConexionMysql cc = new ConexionMysql();
  Connection con = null;
  con = cc.conexion();

        try{
            
     
            ps = (PreparedStatement) con.prepareStatement("UPDATE docente SET cedula_docen =?, nombre =?,apellido_paterno=?,apellido_materno=?,titulo_docen=?,correo_docen=?,telefono_docen=?,direccion_docen=?,codi_carr=?");
            ps.setString(1, CI_DOCENTE.getText());
            ps.setString(2, NOMBRES.getText());
            ps.setString(3, APELLIDO_PATERNO.getText());
            ps.setString(4, APELLIDO_MATERNO.getText());
            ps.setString(5, TITULO.getText());
            ps.setString(6, CORREO.getText());
            ps.setString(7, TELEFONO.getText());
            ps.setString(8, DIRECCION.getText());
            ps.setString(9, CARRERA.getSelectedItem().toString());

            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Informacion del Docente Modificada");
                limpiar();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al Modificar informacion del Docente");
                 limpiar();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        
        
    }                         
 
 public void eliminar(){
 
   ConexionMysql cc = new ConexionMysql();
  Connection con = null;
  con = cc.conexion();
        
        try{
            
            
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM docente WHERE cedula_docen=?");
             ps.setString(1, TXTBUSCAR.getText());
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Docente Eliminado");
                limpiar();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al eliminar Docente");
                 limpiar();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        
    }                                          

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField APELLIDO_MATERNO;
    private javax.swing.JTextField APELLIDO_PATERNO;
    private javax.swing.JButton BUSCAR1;
    private javax.swing.JComboBox<String> CARRERA;
    private javax.swing.JTextField CI_DOCENTE;
    private javax.swing.JTextField CORREO;
    private javax.swing.JTextField DIRECCION;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JButton FOTO;
    private javax.swing.JLabel LBFOTO;
    private javax.swing.JButton MODIFICAR;
    private javax.swing.JTextField NOMBRES;
    private javax.swing.JTable TABLA_DOCENTE;
    private javax.swing.JTextField TELEFONO;
    private javax.swing.JTextField TITULO;
    private javax.swing.JTextField TXTBUSCAR;
    private javax.swing.JButton btnsalir1;
    private javax.swing.JButton buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_ruta;
    // End of variables declaration//GEN-END:variables
}


package Sistema_Activos;

import Logica.ConexionMysql;
import com.mysql.jdbc.PreparedStatement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.vista_profe;


public class Prestamo extends javax.swing.JFrame {
    PreparedStatement a;
    PreparedStatement b;
    PreparedStatement c;

    public Prestamo() {
        initComponents();
        activo();
        prestamo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_EDITAR = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABLA_ACTIVO = new javax.swing.JTable();
        BTN_BUSCAR_PRESTAMO = new javax.swing.JButton();
        PrestamosProfesor = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TXT_ACTIVO = new javax.swing.JTextField();
        TXT_COD_RFID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        FECHA_PRESTAMO = new com.toedter.calendar.JDateChooser();
        TXT_CI_DOCEN = new javax.swing.JTextField();
        TXT_APELLIDO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TXT_COD_PREST = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TXT_HORA_PRESTAMO = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TXT_HORA_ENTREGA1 = new javax.swing.JTextField();
        TXT_DOCENTE = new javax.swing.JTextField();
        BT_DOCENTE = new javax.swing.JButton();
        BTN_GUARDAR = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        FECHA_PRESTAMO1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        JB_BUSCAR = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLA_HORARIO = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA_PRESTAMO = new javax.swing.JTable();
        TXT_BUSCAR = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTN_EDITAR.setBackground(new java.awt.Color(255, 204, 51));
        BTN_EDITAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN_EDITAR.setForeground(new java.awt.Color(204, 0, 0));
        BTN_EDITAR.setText("Editar");
        BTN_EDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EDITARActionPerformed(evt);
            }
        });

        TABLA_ACTIVO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO RFID", "ACTIVO", "ESTADO"
            }
        ));
        jScrollPane3.setViewportView(TABLA_ACTIVO);

        BTN_BUSCAR_PRESTAMO.setBackground(new java.awt.Color(255, 204, 51));
        BTN_BUSCAR_PRESTAMO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN_BUSCAR_PRESTAMO.setForeground(new java.awt.Color(204, 0, 0));
        BTN_BUSCAR_PRESTAMO.setText("BUSCAR");
        BTN_BUSCAR_PRESTAMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BUSCAR_PRESTAMOActionPerformed(evt);
            }
        });

        PrestamosProfesor.setBackground(new java.awt.Color(0, 153, 153));
        PrestamosProfesor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Realizar Préstamo Para Profesor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 0, 22), new java.awt.Color(102, 255, 0))); // NOI18N
        PrestamosProfesor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Activo:");
        PrestamosProfesor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        TXT_ACTIVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_ACTIVOActionPerformed(evt);
            }
        });
        PrestamosProfesor.add(TXT_ACTIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 100, -1));
        PrestamosProfesor.add(TXT_COD_RFID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 100, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Hora de entrega:");
        PrestamosProfesor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 120, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 0));
        jLabel15.setText("Fecha de Préstamo:");
        PrestamosProfesor.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 120, -1));
        PrestamosProfesor.add(FECHA_PRESTAMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 120, -1));
        PrestamosProfesor.add(TXT_CI_DOCEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 100, -1));
        PrestamosProfesor.add(TXT_APELLIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 100, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Codigo prestamo:");
        PrestamosProfesor.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("CI:");
        PrestamosProfesor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 20, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Profesor:");
        PrestamosProfesor.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        TXT_COD_PREST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_COD_PRESTActionPerformed(evt);
            }
        });
        PrestamosProfesor.add(TXT_COD_PREST, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 100, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Hora de prestamo:");
        PrestamosProfesor.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 120, -1));

        TXT_HORA_PRESTAMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_HORA_PRESTAMOActionPerformed(evt);
            }
        });
        PrestamosProfesor.add(TXT_HORA_PRESTAMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 120, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Codigo RFID:");
        PrestamosProfesor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jButton1.setText("RFID");
        PrestamosProfesor.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 100, -1));

        TXT_HORA_ENTREGA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_HORA_ENTREGA1ActionPerformed(evt);
            }
        });
        PrestamosProfesor.add(TXT_HORA_ENTREGA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 120, -1));
        PrestamosProfesor.add(TXT_DOCENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 100, -1));

        BT_DOCENTE.setText("DOCENTE");
        BT_DOCENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_DOCENTEActionPerformed(evt);
            }
        });
        PrestamosProfesor.add(BT_DOCENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 100, -1));

        BTN_GUARDAR.setBackground(new java.awt.Color(255, 204, 51));
        BTN_GUARDAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN_GUARDAR.setForeground(new java.awt.Color(204, 0, 0));
        BTN_GUARDAR.setText("Guardar");
        BTN_GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GUARDARActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HORARIO DE CLASES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("REALIZAR PRÉSTAMOS");

        btnsalir.setBackground(new java.awt.Color(153, 255, 0));
        btnsalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(0, 51, 255));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 623, Short.MAX_VALUE)
                .addComponent(btnsalir)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnsalir))
                .addContainerGap())
        );

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        JB_BUSCAR.setBackground(new java.awt.Color(255, 255, 255));
        JB_BUSCAR.setText("BUSCAR");
        JB_BUSCAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JB_BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BUSCARActionPerformed(evt);
            }
        });

        TABLA_HORARIO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "CI DOCENTE", "DIA ", "MATERIA", "HORA INICIO", "HORA FIN", "CURSO"
            }
        ));
        jScrollPane2.setViewportView(TABLA_HORARIO);

        TABLA_PRESTAMO.setBackground(new java.awt.Color(204, 255, 102));
        TABLA_PRESTAMO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        TABLA_PRESTAMO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TABLA_PRESTAMO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO PRESTAMO", "FECHA PRESTAMO", "HORA PRESTAMO", "HORA DE ENTREGA", "CI DOCENTE", "RFID ACTIVO"
            }
        ));
        TABLA_PRESTAMO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLA_PRESTAMOMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABLA_PRESTAMO);

        TXT_BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_BUSCARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN_GUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_EDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JB_BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TXT_BUSCAR))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(BTN_BUSCAR_PRESTAMO, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(FECHA_PRESTAMO1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PrestamosProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BTN_GUARDAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_EDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JB_BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(TXT_BUSCAR, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PrestamosProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FECHA_PRESTAMO1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_BUSCAR_PRESTAMO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EDITARActionPerformed
       editar();
    }//GEN-LAST:event_BTN_EDITARActionPerformed

    private void BTN_BUSCAR_PRESTAMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BUSCAR_PRESTAMOActionPerformed
    buscar_prest();      

    }//GEN-LAST:event_BTN_BUSCAR_PRESTAMOActionPerformed

    private void TXT_ACTIVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_ACTIVOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_ACTIVOActionPerformed

    private void TXT_COD_PRESTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_COD_PRESTActionPerformed

    }//GEN-LAST:event_TXT_COD_PRESTActionPerformed

    private void TXT_HORA_PRESTAMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_HORA_PRESTAMOActionPerformed

    }//GEN-LAST:event_TXT_HORA_PRESTAMOActionPerformed

    private void TXT_BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_BUSCARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_BUSCARActionPerformed

    private void BTN_GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GUARDARActionPerformed
            guardar();
    }//GEN-LAST:event_BTN_GUARDARActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
            dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void JB_BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BUSCARActionPerformed
            buscar();                 
    }//GEN-LAST:event_JB_BUSCARActionPerformed

    private void TABLA_PRESTAMOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLA_PRESTAMOMouseClicked

    }//GEN-LAST:event_TABLA_PRESTAMOMouseClicked

    private void TXT_HORA_ENTREGA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_HORA_ENTREGA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_HORA_ENTREGA1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            eliminar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BT_DOCENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_DOCENTEActionPerformed
       
        vista_profe vp = new vista_profe();
         vp.setVisible(true);
         
    }//GEN-LAST:event_BT_DOCENTEActionPerformed

    
    public void buscar (){
      ConexionMysql cc = new ConexionMysql();
      Connection con = null;
      con = cc.conexion();
        
        try{
            
           
            a = (PreparedStatement) con.prepareStatement("SELECT * FROM cabe_prestamo WHERE cedula_docen = ?");
            a.setString(1, TXT_BUSCAR.getText());
            ResultSet x = a.executeQuery();
            
            b = (PreparedStatement) con.prepareStatement("SELECT nombre,apellido_paterno FROM docente WHERE cedula_docen = ?");
            b.setString(1, TXT_BUSCAR.getText());
            ResultSet y = b.executeQuery();
            
            c = (PreparedStatement) con.prepareStatement("SELECT cod_rfid_acti FROM cativo WHERE cod_rfid_acti = ?");
            c.setString(1, TXT_BUSCAR.getText());
            ResultSet z = c.executeQuery();
            
            if(x.next() & y.next() & z.next() ){

                TXT_COD_PREST.setText(x.getString("cod_prestamo"));
                TXT_CI_DOCEN.setText(x.getString("cedula_docen"));
                TXT_COD_RFID.setText(x.getString("cod_rfid_acti"));
                //FECHA_PRESTAMO.setText(rs.getString("apellido_materno"));
                TXT_HORA_PRESTAMO.setText(x.getString("hr_prest"));
                TXT_HORA_ENTREGA1.setText(x.getString("hr_entrega"));
                
               TXT_DOCENTE.setText(y.getString("nombre")); 
               TXT_APELLIDO.setText(y.getString("apellido_paterno")); 
               TXT_ACTIVO.setText(z.getString("descrip_acti"));
               
                
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe docente con ese codigo");
            }
            
        } catch(HeadlessException | SQLException e){
            System.err.println(e);
        }
 
 
    
    
    
    
    
    
    }
    
    public void guardar(){
    ConexionMysql cc = new ConexionMysql();
      Connection con = null;
      con = cc.conexion();
        
        try{
            
            
            a = (PreparedStatement) con.prepareStatement("INSERT INTO cabe_prestamo( cod_prestamo,fech_prest,hr_prest,hr_entrega,cedula_docen,cod_rfid_acti) VALUES(?,?,?,?,?,?)");  
            a.setString(1, TXT_COD_PREST.getText());
            //a.setString(2, FECHA_PRESTAMO.getText());
            a.setString(2, TXT_HORA_PRESTAMO.getText());
            a.setString(3, TXT_HORA_ENTREGA1.getText());
            a.setString(4, TXT_CI_DOCEN.getText());
            a.setString(5, TXT_COD_RFID.getText());

            int res = a.executeUpdate();
            
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

    public void limpiar(){

             TXT_COD_PREST.setText("");
             TXT_CI_DOCEN.setText("");
             TXT_COD_RFID.setText("");
             TXT_HORA_PRESTAMO.setText("");
             TXT_HORA_ENTREGA1.setText("");
    }
 
    public void eliminar (){
        
    ConexionMysql cc = new ConexionMysql();
    Connection con = null;
    con = cc.conexion();
        try{

            a = (PreparedStatement) con.prepareStatement("DELETE FROM cabe_prestamo WHERE cedula_docen=?");
            a.setString(1, TXT_CI_DOCEN.getText());
            
            int r = a.executeUpdate();
            
            if(r > 0){
                
                JOptionPane.showMessageDialog(null, "Persona Eliminada");
                limpiar();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al eliminar persona");
                 limpiar();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        
    
    
    
    
    
    }
    
    public void editar(){
    
    ConexionMysql cc = new ConexionMysql();
    Connection con = null;
    con = cc.conexion();

        try{
            
     
            a = (PreparedStatement) con.prepareStatement("UPDATE cabe_prestamo SET cod_prestamo = ?,fech_prest= ?,hr_prest= ?,hr_entrega= ?,cedula_docen= ?,cod_rfid_acti= ?" );
            
           
            a.setString(1, TXT_COD_PREST.getText());
            //a.setString(2, FECHA_PRESTAMO.getText());
            a.setString(2, TXT_HORA_PRESTAMO.getText());
            a.setString(3, TXT_HORA_ENTREGA1.getText());
            a.setString(4, TXT_CI_DOCEN.getText());
            a.setString(5, TXT_COD_RFID.getText());
            
            int res = a.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Persona Modificada");
                limpiar();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al Modificar persona");
                 limpiar();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        
    
    
    
    
    
    
    }
    
    public void buscar_prest(){
    
        ConexionMysql cc = new ConexionMysql();
        Connection con = null;
        con = cc.conexion();
          try {
            
            DefaultTableModel modeloA = new DefaultTableModel();
           TABLA_PRESTAMO.setModel(modeloA); 
                    
            String sqlA = "SELECT* FROM cabe_prestamo WHERE fecha_prest";
              a = (PreparedStatement) con.prepareStatement(sqlA);
            ResultSet rs = a.executeQuery();

            ResultSetMetaData rsMdA = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnasA = rsMdA.getColumnCount();

            modeloA.addColumn("CODIGO_PRESTAMO");
            modeloA.addColumn("FECHA PRESTAMO");
            modeloA.addColumn("HORA PRESTAMO");
            modeloA.addColumn("HORA DE ENTREGA");
            modeloA.addColumn("CI DOCENTE");
            modeloA.addColumn("RFID ACTIVO");
            
            int[] anchosA = {50, 50, 50,50, 50, 50};
            for (int i = 0; i <  TABLA_PRESTAMO.getColumnCount(); i++) {
               TABLA_PRESTAMO.getColumnModel().getColumn(i).setPreferredWidth(anchosA[i]);
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
    
    public void horario(){
    
    ConexionMysql cc = new ConexionMysql();
    Connection con = null;
    con = cc.conexion();
          try {
            
            DefaultTableModel modeloA = new DefaultTableModel();
           TABLA_HORARIO.setModel(modeloA); 
                    
            String sqlA = "SELECT* FROM horario ";
              a = (PreparedStatement) con.prepareStatement(sqlA);
            ResultSet rs = a.executeQuery();

            ResultSetMetaData rsMdA = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnasA = rsMdA.getColumnCount();

            modeloA.addColumn("CODIGO");
            modeloA.addColumn("CI DOCENTE");
            modeloA.addColumn("DIA");
            modeloA.addColumn("MATERIA");
            modeloA.addColumn("HORA DE INICIO");
            modeloA.addColumn("HORA FIN");
            modeloA.addColumn("CURSO");
            
            int[] anchosA = {50, 50, 50,50, 50, 50,50};
            
            for (int i = 0; i <  TABLA_HORARIO.getColumnCount(); i++) {
               TABLA_HORARIO.getColumnModel().getColumn(i).setPreferredWidth(anchosA[i]);
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
    
    public void activo(){
    
    ConexionMysql cc = new ConexionMysql();
    Connection con = null;
    con = cc.conexion();
          try {
            
            DefaultTableModel modeloA = new DefaultTableModel();
           TABLA_ACTIVO.setModel(modeloA); 
                    
            String sqlA = "SELECT* FROM activo ";
              a = (PreparedStatement) con.prepareStatement(sqlA);
            ResultSet rs = a.executeQuery();

            ResultSetMetaData rsMdA = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnasA = rsMdA.getColumnCount();

            modeloA.addColumn("CODIGO RFID");
            modeloA.addColumn("ACTIVO");
            modeloA.addColumn("ESTDO");
            
            
            int[] anchosA = {50, 50, 50};
            
            for (int i = 0; i <  TABLA_ACTIVO.getColumnCount(); i++) {
               TABLA_ACTIVO.getColumnModel().getColumn(i).setPreferredWidth(anchosA[i]);
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
    
    public void prestamo(){
    
    ConexionMysql cc = new ConexionMysql();
    Connection con = null;
    con = cc.conexion();
          try {
            
            DefaultTableModel modeloA = new DefaultTableModel();
           TABLA_PRESTAMO.setModel(modeloA); 
                    
            String sqlA = "SELECT* FROM cabe_prestamo";
              a = (PreparedStatement) con.prepareStatement(sqlA);
            ResultSet rs = a.executeQuery();

            ResultSetMetaData rsMdA = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnasA = rsMdA.getColumnCount();

            modeloA.addColumn("CODIGO_PRESTAMO");
            modeloA.addColumn("FECHA PRESTAMO");
            modeloA.addColumn("HORA PRESTAMO");
            modeloA.addColumn("HORA DE ENTREGA");
            modeloA.addColumn("CI DOCENTE");
            modeloA.addColumn("RFID ACTIVO");
            
            int[] anchosA = {50, 50, 50,50, 50, 50};
            for (int i = 0; i <  TABLA_PRESTAMO.getColumnCount(); i++) {
               TABLA_PRESTAMO.getColumnModel().getColumn(i).setPreferredWidth(anchosA[i]);
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
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_BUSCAR_PRESTAMO;
    private javax.swing.JButton BTN_EDITAR;
    private javax.swing.JButton BTN_GUARDAR;
    private javax.swing.JButton BT_DOCENTE;
    private com.toedter.calendar.JDateChooser FECHA_PRESTAMO;
    private com.toedter.calendar.JDateChooser FECHA_PRESTAMO1;
    private javax.swing.JButton JB_BUSCAR;
    private javax.swing.JPanel PrestamosProfesor;
    private javax.swing.JTable TABLA_ACTIVO;
    private javax.swing.JTable TABLA_HORARIO;
    private javax.swing.JTable TABLA_PRESTAMO;
    public static javax.swing.JTextField TXT_ACTIVO;
    public static javax.swing.JTextField TXT_APELLIDO;
    private javax.swing.JTextField TXT_BUSCAR;
    public static javax.swing.JTextField TXT_CI_DOCEN;
    private javax.swing.JTextField TXT_COD_PREST;
    public static javax.swing.JTextField TXT_COD_RFID;
    public static javax.swing.JTextField TXT_DOCENTE;
    private javax.swing.JTextField TXT_HORA_ENTREGA1;
    private javax.swing.JTextField TXT_HORA_PRESTAMO;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}

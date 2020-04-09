
package Sistema_Activos;
import Logica.ConexionMysql;
import static Sistema_Activos.Prestamo.TXT_ACTIVO;
import static Sistema_Activos.Prestamo.TXT_APELLIDO;
import static Sistema_Activos.Prestamo.TXT_CI_DOCEN;
import static Sistema_Activos.Prestamo.TXT_COD_RFID;
import static Sistema_Activos.Prestamo.TXT_DOCENTE;
import com.mysql.jdbc.PreparedStatement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.vista_profe;

public class PrestamoDocen extends javax.swing.JInternalFrame {
    PreparedStatement a;
    PreparedStatement b;
    PreparedStatement c;

    
    public PrestamoDocen() {
        initComponents();
        activo();
        prestamo();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_EDITAR = new javax.swing.JButton();
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
        jButton2 = new javax.swing.JButton();
        JB_BUSCAR = new javax.swing.JButton();
        BTN_GUARDAR = new javax.swing.JButton();
        TXT_BUSCAR = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLA_HORARIO = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABLA_ACTIVO = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA_PRESTAMO = new javax.swing.JTable();
        BTN_BUSCAR_PRESTAMO = new javax.swing.JButton();
        FECHA_PRESTAMO1 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(215, 227, 215));
        setOpaque(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        BTN_EDITAR.setBackground(new java.awt.Color(210, 234, 236));
        BTN_EDITAR.setText("Editar");
        BTN_EDITAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));
        BTN_EDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EDITARActionPerformed(evt);
            }
        });

        PrestamosProfesor.setBackground(new java.awt.Color(215, 227, 215));
        PrestamosProfesor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));
        PrestamosProfesor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(14, 124, 167));
        jLabel4.setText("Activo:");
        PrestamosProfesor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 50, -1));

        TXT_ACTIVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_ACTIVOActionPerformed(evt);
            }
        });
        PrestamosProfesor.add(TXT_ACTIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 100, -1));
        PrestamosProfesor.add(TXT_COD_RFID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 100, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(14, 124, 167));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Hora de entrega:");
        PrestamosProfesor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 140, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(14, 124, 167));
        jLabel15.setText("Fecha de Préstamo:");
        PrestamosProfesor.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 150, -1));
        PrestamosProfesor.add(FECHA_PRESTAMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 140, 30));
        PrestamosProfesor.add(TXT_CI_DOCEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 100, -1));
        PrestamosProfesor.add(TXT_APELLIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 100, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(14, 124, 167));
        jLabel5.setText("Codigo prestamo:");
        PrestamosProfesor.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(14, 124, 167));
        jLabel3.setText("CI:");
        PrestamosProfesor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 30, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(14, 124, 167));
        jLabel8.setText("Profesor:");
        PrestamosProfesor.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        TXT_COD_PREST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_COD_PRESTActionPerformed(evt);
            }
        });
        PrestamosProfesor.add(TXT_COD_PREST, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 100, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(14, 124, 167));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Hora de prestamo:");
        PrestamosProfesor.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 140, -1));

        TXT_HORA_PRESTAMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_HORA_PRESTAMOActionPerformed(evt);
            }
        });
        PrestamosProfesor.add(TXT_HORA_PRESTAMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 140, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(14, 124, 167));
        jLabel6.setText("Codigo RFID:");
        PrestamosProfesor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jButton1.setBackground(new java.awt.Color(210, 234, 236));
        jButton1.setText("RFID");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));
        PrestamosProfesor.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 100, 30));

        TXT_HORA_ENTREGA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_HORA_ENTREGA1ActionPerformed(evt);
            }
        });
        PrestamosProfesor.add(TXT_HORA_ENTREGA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 140, -1));
        PrestamosProfesor.add(TXT_DOCENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 100, -1));

        BT_DOCENTE.setBackground(new java.awt.Color(210, 234, 236));
        BT_DOCENTE.setText("DOCENTE");
        BT_DOCENTE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));
        BT_DOCENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_DOCENTEActionPerformed(evt);
            }
        });
        PrestamosProfesor.add(BT_DOCENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 43, 100, 30));

        jButton2.setBackground(new java.awt.Color(210, 234, 236));
        jButton2.setText("Eliminar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        JB_BUSCAR.setBackground(new java.awt.Color(210, 234, 236));
        JB_BUSCAR.setText("BUSCAR");
        JB_BUSCAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));
        JB_BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BUSCARActionPerformed(evt);
            }
        });

        BTN_GUARDAR.setBackground(new java.awt.Color(210, 234, 236));
        BTN_GUARDAR.setText("Guardar");
        BTN_GUARDAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));
        BTN_GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GUARDARActionPerformed(evt);
            }
        });

        TXT_BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_BUSCARActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(14, 124, 167));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText(" PRÉSTAMOS DE ACTIVOS");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(371, 371, 371)
                .addComponent(btnsalir)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnsalir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(215, 227, 215));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));

        TABLA_HORARIO.setBackground(new java.awt.Color(153, 204, 255));
        TABLA_HORARIO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TABLA_HORARIO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TABLA_HORARIO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "CI DOCENTE", "DIA ", "MATERIA", "HORA INICIO", "HORA FIN", "CURSO"
            }
        ));
        TABLA_HORARIO.setInheritsPopupMenu(true);
        jScrollPane2.setViewportView(TABLA_HORARIO);

        jPanel2.setBackground(new java.awt.Color(14, 124, 167));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HORARIO DE CLASES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(103, 103, 103))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        TABLA_ACTIVO.setBackground(new java.awt.Color(153, 204, 255));
        TABLA_ACTIVO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TABLA_ACTIVO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO RFID", "ACTIVO", "ESTADO"
            }
        ));
        jScrollPane3.setViewportView(TABLA_ACTIVO);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(215, 227, 215));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));

        TABLA_PRESTAMO.setBackground(new java.awt.Color(153, 204, 255));
        TABLA_PRESTAMO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        TABLA_PRESTAMO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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

        BTN_BUSCAR_PRESTAMO.setBackground(new java.awt.Color(210, 234, 236));
        BTN_BUSCAR_PRESTAMO.setText("BUSCAR");
        BTN_BUSCAR_PRESTAMO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));
        BTN_BUSCAR_PRESTAMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BUSCAR_PRESTAMOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(BTN_BUSCAR_PRESTAMO, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FECHA_PRESTAMO1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTN_BUSCAR_PRESTAMO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FECHA_PRESTAMO1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addComponent(BTN_GUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTN_EDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JB_BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TXT_BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PrestamosProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JB_BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_EDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_GUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PrestamosProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PrestamosProfesor.getAccessibleContext().setAccessibleName("");
        PrestamosProfesor.getAccessibleContext().setAccessibleDescription("");

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

    private void TXT_HORA_ENTREGA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_HORA_ENTREGA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_HORA_ENTREGA1ActionPerformed

    private void BT_DOCENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_DOCENTEActionPerformed

        vista_profe vp = new vista_profe();
        vp.setVisible(true);

    }//GEN-LAST:event_BT_DOCENTEActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        eliminar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JB_BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BUSCARActionPerformed
        buscar();
    }//GEN-LAST:event_JB_BUSCARActionPerformed

    private void BTN_GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GUARDARActionPerformed
        guardar();
    }//GEN-LAST:event_BTN_GUARDARActionPerformed

    private void TABLA_PRESTAMOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLA_PRESTAMOMouseClicked

    }//GEN-LAST:event_TABLA_PRESTAMOMouseClicked

    private void TXT_BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_BUSCARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_BUSCARActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}

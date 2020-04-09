
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





public class RegistroDocente extends javax.swing.JFrame {

    
    PreparedStatement ps;
    ResultSet rs;
    ResultSet result;
    PreparedStatement pst;
    File fichero = null;
     
     
      public RegistroDocente() {
        initComponents(); 
        consultar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnsalir1 = new javax.swing.JButton();
        CI_DOCENTE = new javax.swing.JTextField();
        APELLIDO_PATERNO = new javax.swing.JTextField();
        NOMBRES = new javax.swing.JTextField();
        APELLIDO_MATERNO = new javax.swing.JTextField();
        TITULO = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DIRECCION = new javax.swing.JTextField();
        TELEFONO = new javax.swing.JTextField();
        CORREO = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        MODIFICAR = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        BUSCAR1 = new javax.swing.JButton();
        TXTBUSCAR = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        LBFOTO = new javax.swing.JLabel();
        txt_ruta = new javax.swing.JTextField();
        FOTO = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLA_DOCENTE = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        CARRERA = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(255, 204, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOMBRES ");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jLabel2.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(0, 153, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("C I");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(210, 234, 236));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DIRECCION");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jLabel5.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(210, 234, 236));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(" APELLIDO PATERNO");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jLabel7.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(210, 234, 236));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TITULO");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jLabel6.setOpaque(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTA Y REGISTRO DE DOCENTES ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnsalir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CI_DOCENTE.setBackground(new java.awt.Color(255, 255, 204));

        APELLIDO_PATERNO.setBackground(new java.awt.Color(255, 255, 204));

        NOMBRES.setBackground(new java.awt.Color(255, 255, 204));

        APELLIDO_MATERNO.setBackground(new java.awt.Color(255, 255, 204));

        TITULO.setBackground(new java.awt.Color(255, 255, 204));

        jLabel8.setBackground(new java.awt.Color(210, 234, 236));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(" APELLIDO MATERNO");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(210, 234, 236));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TELEFONO");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jLabel9.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(210, 234, 236));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CORREO");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jLabel10.setOpaque(true);

        DIRECCION.setBackground(new java.awt.Color(255, 255, 204));

        TELEFONO.setBackground(new java.awt.Color(255, 255, 204));

        CORREO.setBackground(new java.awt.Color(255, 255, 204));

        jButton1.setText("GUARDAR");
        jButton1.setToolTipText("");
        jButton1.setSelected(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        MODIFICAR.setText("MODIFICAR");
        MODIFICAR.setSelected(true);
        MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICARActionPerformed(evt);
            }
        });

        ELIMINAR.setBackground(new java.awt.Color(210, 234, 236));
        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.setSelected(true);
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        buscar.setBackground(new java.awt.Color(210, 234, 236));
        buscar.setText("BUSCAR");
        buscar.setPreferredSize(new java.awt.Dimension(81, 23));
        buscar.setSelected(true);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        BUSCAR1.setText("MOSTRAR");
        BUSCAR1.setSelected(true);
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
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(MODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(BUSCAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(100, Short.MAX_VALUE))
        );

        LBFOTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));

        txt_ruta.setEditable(false);
        txt_ruta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        txt_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rutaActionPerformed(evt);
            }
        });

        FOTO.setText("FOTO");
        FOTO.setSelected(true);
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
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBFOTO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FOTO, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(txt_ruta))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(LBFOTO, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txt_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FOTO, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TABLA_DOCENTE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        TABLA_DOCENTE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CI DOCENTE", "NOMBRES", "APELLIDO PATERNO", "APELLIDO MATERNO", "ESPECIALIDAD", "CARRERA", "DIRECCION", "TELEFONO", "CORREO"
            }
        ));
        jScrollPane2.setViewportView(TABLA_DOCENTE);

        jLabel3.setBackground(new java.awt.Color(210, 234, 236));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" CARRERA");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jLabel3.setOpaque(true);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(APELLIDO_MATERNO, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(TITULO, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(DIRECCION, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(TELEFONO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(CORREO, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(CI_DOCENTE, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(APELLIDO_PATERNO, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(NOMBRES, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(CARRERA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CI_DOCENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(NOMBRES, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(APELLIDO_PATERNO, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(APELLIDO_MATERNO, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CORREO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CARRERA, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        CARRERA.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleName("PanelDocente");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             
        guardar();
        
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CARRERAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARRERAActionPerformed
           
    }//GEN-LAST:event_CARRERAActionPerformed
    
    
    
    private void txt_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rutaActionPerformed

    
    private void FOTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FOTOActionPerformed
    
    }//GEN-LAST:event_FOTOActionPerformed
    
    
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
     buscar();        
    }//GEN-LAST:event_buscarActionPerformed

    private void MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARActionPerformed
      modificar();
    }//GEN-LAST:event_MODIFICARActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
     eliminar();  
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void btnsalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnsalir1ActionPerformed

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
                JOptionPane.showMessageDialog(null, "No existe docente con ese codigo");
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
            ps.setString(6, CARRERA.getSelectedItem().toString());
            ps.setString(7, DIRECCION.getText());
            ps.setString(8, TELEFONO.getText());
            ps.setString(9, CORREO.getText());
           
            
            int res = ps.executeUpdate();
            
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
 
 public void eliminar(){
 
   ConexionMysql cc = new ConexionMysql();
  Connection con = null;
  con = cc.conexion();
        
        try{
            
            
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM docente WHERE cedula_docen=?");
             ps.setString(1, TXTBUSCAR.getText());
            
            int res = ps.executeUpdate();
            
            if(res > 0){
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

 
 
 
 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDocente().setVisible(true);
            }
        });
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_ruta;
    // End of variables declaration//GEN-END:variables

}



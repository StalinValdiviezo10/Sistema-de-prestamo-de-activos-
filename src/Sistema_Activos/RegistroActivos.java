package Sistema_Activos;

import Logica.ConexionMysql;
import com.mysql.jdbc.PreparedStatement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class RegistroActivos extends javax.swing.JFrame {    
    PreparedStatement ps ; 
    PreparedStatement ds ; 
    PreparedStatement cs ;
  
    public RegistroActivos() {
        initComponents(); 
        consultar();
    }
    
 public void guardar(){
     
     
      ConexionMysql cc = new ConexionMysql();
      Connection con = null;
      con = cc.conexion();
        try{
            
            
            ds = (PreparedStatement) con.prepareStatement("INSERT INTO activo (cod_rfid_acti,descrip_acti,estado_acti) VALUES(?,?,?)");  
            
            ds.setString(1, TXT_RFID_ACTIVO.getText());
            ds.setString(2, ACTIVO.getText());
            ds.setString(3, ESTADO.getText());
            
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO deta_activo (modelo,color,observaciones,codi_carr,cod_rfid_acti) VALUES(?,?,?,?,?)");
            
            ps.setString(1, MODELO.getText());     
            ps.setString(2, COLOR.getText());
            ps.setString(3, OBSERVACIONES_ACTIVO.getText()); 
            ps.setString(4, CARRERA.getSelectedItem().toString());
            ps.setString(5, TXT_RFID_ACTIVO.getText());
            
            cs = (PreparedStatement) con.prepareStatement("INSERT INTO accesorios (cod_rfid_acce,nom_acce,estado_acce,descripcion_acce,cod_rfid_acti) VALUES(?,?,?,?,?)");
            cs.setString(1, TXT_RFID_ACCESORIO.getText());     
            cs.setString(2, ACCESORIO.getText());
            cs.setString(3, ESTADO_ACCESORIO.getText()); 
            cs.setString(4, OBSERVACIONES_ACCESORIO.getText());
            cs.setString(5, TXT_RFID_ACTIVO.getText());
            
            int res = ds.executeUpdate();
             int r = ps.executeUpdate();
             int rt = cs.executeUpdate();
            
            if(res > 0 & r >0& rt >0 ){
                JOptionPane.showMessageDialog(this, "INFORMACION GUARDADA");
                limpiar();
            } else {
                 JOptionPane.showMessageDialog(this, "ERROR AL GUARDAR INFORMACION");
                 limpiar();
            }
            
            con.close();
            
        } catch(HeadlessException | SQLException e){
            System.err.println(e);
        }
          

 }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        OBSERVACIONES_ACTIVO = new javax.swing.JTextField();
        COLOR = new javax.swing.JTextField();
        BESTADO1 = new javax.swing.JLabel();
        MODELO = new javax.swing.JTextField();
        ESTADO = new javax.swing.JTextField();
        TXT_RFID_ACCESORIO = new javax.swing.JTextField();
        ACCESORIO = new javax.swing.JTextField();
        ESTADO_ACCESORIO = new javax.swing.JTextField();
        OBSERVACIONES = new javax.swing.JLabel();
        OBSERVACIONES_ACCESORIO = new javax.swing.JTextField();
        CODIGO_RFID = new javax.swing.JButton();
        CARRERA1 = new javax.swing.JLabel();
        BACTIVO = new javax.swing.JLabel();
        TXT_RFID_ACTIVO = new javax.swing.JTextField();
        CARRERA = new javax.swing.JComboBox<>();
        ACTIVO = new javax.swing.JTextField();
        BOBSERVACIONES = new javax.swing.JLabel();
        CODIGO_RFID1 = new javax.swing.JButton();
        BMODELO_SERIE = new javax.swing.JLabel();
        BACTIVO1 = new javax.swing.JLabel();
        BCOLOR = new javax.swing.JLabel();
        BESTADO = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Activo = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_Detalle = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Accesorio = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        TXT_BUSCAR = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        MODIFICAR = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        MOSTRAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(222, 226, 229));

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO Y CONSULTA DE ACTIVOS");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(424, 48));

        jPanel1.setBackground(new java.awt.Color(222, 226, 229));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        OBSERVACIONES_ACTIVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OBSERVACIONES_ACTIVOActionPerformed(evt);
            }
        });

        COLOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COLORActionPerformed(evt);
            }
        });

        BESTADO1.setBackground(new java.awt.Color(210, 234, 236));
        BESTADO1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BESTADO1.setText("ESTADO");
        BESTADO1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        BESTADO1.setOpaque(true);

        MODELO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODELOActionPerformed(evt);
            }
        });

        ESTADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ESTADOActionPerformed(evt);
            }
        });

        TXT_RFID_ACCESORIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_RFID_ACCESORIOActionPerformed(evt);
            }
        });

        ACCESORIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACCESORIOActionPerformed(evt);
            }
        });

        ESTADO_ACCESORIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ESTADO_ACCESORIOActionPerformed(evt);
            }
        });

        OBSERVACIONES.setBackground(new java.awt.Color(210, 234, 236));
        OBSERVACIONES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OBSERVACIONES.setText("OBSERVACIONES");
        OBSERVACIONES.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        OBSERVACIONES.setOpaque(true);

        OBSERVACIONES_ACCESORIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OBSERVACIONES_ACCESORIOActionPerformed(evt);
            }
        });

        CODIGO_RFID.setBackground(new java.awt.Color(210, 234, 236));
        CODIGO_RFID.setText(" RFID ACTIVO");
        CODIGO_RFID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        CODIGO_RFID.setSelected(true);
        CODIGO_RFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODIGO_RFIDActionPerformed(evt);
            }
        });

        CARRERA1.setBackground(new java.awt.Color(210, 234, 236));
        CARRERA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CARRERA1.setText("CARRERA");
        CARRERA1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        CARRERA1.setOpaque(true);

        BACTIVO.setBackground(new java.awt.Color(210, 234, 236));
        BACTIVO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BACTIVO.setText("ACCESORIO");
        BACTIVO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        BACTIVO.setOpaque(true);

        TXT_RFID_ACTIVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_RFID_ACTIVOActionPerformed(evt);
            }
        });

        CARRERA.setBackground(new java.awt.Color(0, 102, 204));
        CARRERA.setForeground(new java.awt.Color(210, 234, 236));
        CARRERA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        CARRERA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARRERAActionPerformed(evt);
            }
        });

        ACTIVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTIVOActionPerformed(evt);
            }
        });

        BOBSERVACIONES.setBackground(new java.awt.Color(210, 234, 236));
        BOBSERVACIONES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BOBSERVACIONES.setText("OBSERVACIONES");
        BOBSERVACIONES.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        BOBSERVACIONES.setOpaque(true);

        CODIGO_RFID1.setBackground(new java.awt.Color(210, 234, 236));
        CODIGO_RFID1.setText("RFID ACCESORIO");
        CODIGO_RFID1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        CODIGO_RFID1.setSelected(true);
        CODIGO_RFID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODIGO_RFID1ActionPerformed(evt);
            }
        });

        BMODELO_SERIE.setBackground(new java.awt.Color(210, 234, 236));
        BMODELO_SERIE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BMODELO_SERIE.setText("MODELO ");
        BMODELO_SERIE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        BMODELO_SERIE.setOpaque(true);

        BACTIVO1.setBackground(new java.awt.Color(210, 234, 236));
        BACTIVO1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BACTIVO1.setText("ACTIVO");
        BACTIVO1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        BACTIVO1.setOpaque(true);

        BCOLOR.setBackground(new java.awt.Color(210, 234, 236));
        BCOLOR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BCOLOR.setText("COLOR");
        BCOLOR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        BCOLOR.setOpaque(true);

        BESTADO.setBackground(new java.awt.Color(210, 234, 236));
        BESTADO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BESTADO.setText("ESTADO");
        BESTADO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        BESTADO.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BOBSERVACIONES, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(BCOLOR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BMODELO_SERIE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BESTADO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BACTIVO1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CODIGO_RFID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(OBSERVACIONES_ACTIVO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(COLOR, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MODELO, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ESTADO, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ACTIVO, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXT_RFID_ACTIVO, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BESTADO1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OBSERVACIONES, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(CARRERA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ESTADO_ACCESORIO, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(OBSERVACIONES_ACCESORIO)
                            .addComponent(CARRERA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BACTIVO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CODIGO_RFID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXT_RFID_ACCESORIO, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(ACCESORIO))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CODIGO_RFID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TXT_RFID_ACTIVO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CODIGO_RFID1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TXT_RFID_ACCESORIO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ACCESORIO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BACTIVO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ACTIVO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BACTIVO1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ESTADO_ACCESORIO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BESTADO1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OBSERVACIONES_ACCESORIO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BMODELO_SERIE, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MODELO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(OBSERVACIONES, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCOLOR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(COLOR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CARRERA1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CARRERA, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOBSERVACIONES, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OBSERVACIONES_ACTIVO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 109, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ACTIVO");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DETALLES");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ACCESORIOS");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Tabla_Activo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Tabla_Activo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RFID ", "ACTIVO", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla_Activo);

        Tabla_Detalle.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Tabla_Detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MODELO", "COLOR", "OBSERVACION", "CARRERA"
            }
        ));
        jScrollPane3.setViewportView(Tabla_Detalle);

        Tabla_Accesorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RFID ", "ACCESORIO", "ESTADO", "DESCRIPCION"
            }
        ));
        jScrollPane1.setViewportView(Tabla_Accesorio);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(6, 6, 6)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jLabel12))
                    .addGap(9, 9, 9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(222, 226, 229));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton2.setBackground(new java.awt.Color(210, 234, 236));
        jButton2.setText("GUARDAR");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jButton2.setSelected(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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

        MODIFICAR.setBackground(new java.awt.Color(210, 234, 236));
        MODIFICAR.setText("MODIFICAR");
        MODIFICAR.setSelected(true);
        MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICARActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(210, 234, 236));
        jButton4.setText("BUSCAR");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jButton4.setMaximumSize(new java.awt.Dimension(51, 17));
        jButton4.setMinimumSize(new java.awt.Dimension(51, 17));
        jButton4.setPreferredSize(new java.awt.Dimension(51, 17));
        jButton4.setSelected(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        MOSTRAR.setBackground(new java.awt.Color(210, 234, 236));
        MOSTRAR.setText("MOSTRAR");
        MOSTRAR.setSelected(true);
        MOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOSTRARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(TXT_BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(ELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(MODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(MOSTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(MOSTRAR, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(MODIFICAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(ELIMINAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TXT_BUSCAR, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CODIGO_RFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODIGO_RFIDActionPerformed
        
    }//GEN-LAST:event_CODIGO_RFIDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        guardar();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CODIGO_RFID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODIGO_RFID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CODIGO_RFID1ActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
       eliminar();
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARActionPerformed
        modificar();
    }//GEN-LAST:event_MODIFICARActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       buscar();        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CARRERAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARRERAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CARRERAActionPerformed

    private void TXT_RFID_ACTIVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_RFID_ACTIVOActionPerformed
        // TODO add your handling code here:
        TXT_RFID_ACTIVO.transferFocus();
    }//GEN-LAST:event_TXT_RFID_ACTIVOActionPerformed

    private void ACTIVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTIVOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ACTIVOActionPerformed

    private void OBSERVACIONES_ACTIVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OBSERVACIONES_ACTIVOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OBSERVACIONES_ACTIVOActionPerformed

    private void COLORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COLORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COLORActionPerformed

    private void MODELOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODELOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MODELOActionPerformed

    private void ESTADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ESTADOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ESTADOActionPerformed

    private void TXT_RFID_ACCESORIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_RFID_ACCESORIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_RFID_ACCESORIOActionPerformed

    private void ACCESORIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACCESORIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ACCESORIOActionPerformed

    private void ESTADO_ACCESORIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ESTADO_ACCESORIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ESTADO_ACCESORIOActionPerformed

    private void OBSERVACIONES_ACCESORIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OBSERVACIONES_ACCESORIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OBSERVACIONES_ACCESORIOActionPerformed

    private void MOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOSTRARActionPerformed
       mostrar();
    }//GEN-LAST:event_MOSTRARActionPerformed

  
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
  
  public void limpiar(){
 
    TXT_RFID_ACTIVO.setText("");
    ACTIVO.setText("");
    ESTADO.setText("");
    MODELO.setText("");
    COLOR.setText("");
    OBSERVACIONES_ACTIVO.setText("");
     TXT_RFID_ACCESORIO.setText("");
    ACCESORIO.setText("");
     ESTADO_ACCESORIO.setText("");
    OBSERVACIONES_ACCESORIO.setText("");
    
    
  }

 public void modificar (){
        ConexionMysql cc = new ConexionMysql();
        Connection con = null;
        con = cc.conexion();
        
        try{
                         
            
            ps = (PreparedStatement) con.prepareStatement("UPDATE activo SET cod_rfid_acti=?, descrip_acti=?, estado_acti=? WHERE cod_rfid_acti=?");
            ps.setString(1, TXT_RFID_ACTIVO.getText());
            ps.setString(2, ACTIVO.getText());
            ps.setString(3, ESTADO.getText());
             ps.setString(4,TXT_RFID_ACTIVO.getText());
            
            ds =  (PreparedStatement) con.prepareStatement("UPDATE deta_activo SET modelo = ?,color= ?,observaciones = ?,codi_carr = ? WHERE cod_rfid_acti=? ");
            ds.setString(1, MODELO.getText());
            ds.setString(2, COLOR.getText());
            ds.setString(3, OBSERVACIONES_ACTIVO.getText());
            ds.setString(4, CARRERA.getSelectedItem().toString());
            ds.setString(5, TXT_RFID_ACTIVO.getText());
            
            cs = (PreparedStatement) con.prepareStatement("UPDATE accesorios SET cod_rfid_acce = ?,nom_acce = ?,estado_acce = ?,descripcion_acce = ? WHERE cod_rfid_acti=? ");
            cs.setString(1, TXT_RFID_ACCESORIO.getText());
            cs.setString(2, ACCESORIO.getText());
            cs.setString(3, ESTADO_ACCESORIO.getText());
            cs.setString(4, OBSERVACIONES_ACCESORIO.getText());
            cs.setString(5, TXT_RFID_ACTIVO.getText());
           
            
            int res = ps.executeUpdate();
            int r =  ds.executeUpdate();
            int rt = cs.executeUpdate();
           
            
            if(res > 0 ){
                JOptionPane.showMessageDialog(null, "activo Modificado");
                limpiar();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al Modificar activo");
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
            
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM activo WHERE cod_rfid_acti=?");
            ps.setString(1, TXT_RFID_ACTIVO.getText());
            
            
            int res = ps.executeUpdate();

            if( res >0   ){
                
                JOptionPane.showMessageDialog(null, " Activo Eliminado");
                limpiar();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al eliminar Activo");
                 limpiar();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
 }

 public void buscar (){
      ConexionMysql cc = new ConexionMysql();
      Connection con = null;
      con = cc.conexion();
        
        try{
            
           
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM activo WHERE cod_rfid_acti = ?");
            ps.setString(1, TXT_BUSCAR.getText());
            
            ds  = (PreparedStatement) con.prepareStatement("SELECT modelo,color,observaciones,codi_carr  FROM deta_activo WHERE cod_rfid_acti =? ");
            ds.setString(1, TXT_BUSCAR.getText());  
            
            cs =  (PreparedStatement) con.prepareStatement("SELECT  cod_rfid_acce, nom_acce, estado_acce, descripcion_acce FROM accesorios WHERE cod_rfid_acti =? ");
            cs.setString(1, TXT_BUSCAR.getText());
            
            ResultSet rs = ps.executeQuery();
            ResultSet res = ds.executeQuery();
            ResultSet rt = cs.executeQuery();
            
            if(rs.next() & res.next() & rt.next()){
                TXT_RFID_ACTIVO.setText(rs.getString("cod_rfid_acti"));
                ACTIVO.setText(rs.getString("descrip_acti"));
                ESTADO.setText(rs.getString("estado_acti"));
                MODELO.setText(res.getString("modelo"));
                COLOR.setText(res.getString("color"));
                OBSERVACIONES.setText(res.getString("observaciones"));
                CARRERA.setSelectedItem(res.getString("codi_carr"));
                TXT_RFID_ACCESORIO.setText(rt.getString("cod_rfid_acce"));
                ACCESORIO.setText(rt.getString("nom_acce"));
                ESTADO_ACCESORIO.setText(rt.getString("estado_acce"));
                OBSERVACIONES_ACCESORIO.setText(rt.getString("descripcion_acce"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con ese codigo");
            }
            
        } catch(HeadlessException | SQLException e){
            System.err.println(e);
        }

 }
  
 public void mostrar(){
        ConexionMysql cc = new ConexionMysql();
        Connection con = null;
        con = cc.conexion();
          try {
            
            DefaultTableModel modeloA = new DefaultTableModel();
            DefaultTableModel modeloD = new DefaultTableModel();
            DefaultTableModel modeloAC = new DefaultTableModel();
            
            Tabla_Activo.setModel(modeloA);
            Tabla_Detalle.setModel(modeloD);
            Tabla_Accesorio.setModel(modeloAC);

            String sqlA = "SELECT* FROM activo";
            String sqlD =  "SELECT  modelo, color,observaciones,codi_carr FROM deta_activo";
            String sqlAC =  "SELECT cod_rfid_acce,nom_acce,estado_acce, descripcion_acce FROM accesorios";
            
            
            ps = (PreparedStatement) con.prepareStatement(sqlA);
            ResultSet rs = ps.executeQuery();

         
            ResultSetMetaData rsMdA = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnasA = rsMdA.getColumnCount();

            modeloA.addColumn("RFID ACTIVO");
            modeloA.addColumn("ACTIVO");
            modeloA.addColumn("ESTADO");
           

            int[] anchosA = {50, 50, 50};
            for (int i = 0; i <  Tabla_Activo.getColumnCount(); i++) {
                Tabla_Activo.getColumnModel().getColumn(i).setPreferredWidth(anchosA[i]);
            }

            while (rs.next()) {
                Object[] filasA = new Object[cantidadColumnasA];
                for (int i = 0; i < cantidadColumnasA; i++) {
                    filasA[i] = rs.getObject(i + 1);
                }
                modeloA.addRow(filasA);
            }
         
         //-------------------------------------------------------------------------------------------------
            cs = (PreparedStatement) con.prepareStatement(sqlD);
            ResultSet res = cs.executeQuery();
            
            ResultSetMetaData rsMdD = (ResultSetMetaData) res.getMetaData();
            int cantidadColumnasD = rsMdD.getColumnCount();
            
           
            modeloD.addColumn("MODELO");
            modeloD.addColumn("COLOR");
            modeloD.addColumn("OBERVACIONES");
            modeloD.addColumn("CARRERA");
            
           int[] anchosD = {50, 50, 50,50};
            for (int j = 0; j <  Tabla_Detalle.getColumnCount(); j++) {
                Tabla_Detalle.getColumnModel().getColumn(j).setPreferredWidth(anchosD[j]);
            }
            
            while (res.next()) {
                Object[] filasD = new Object[cantidadColumnasD];
                for (int j = 0; j < cantidadColumnasD; j++) {
                    filasD[j] = res.getObject(j + 1);
                }
                modeloD.addRow(filasD);
            }
            
           //----------------------------------------------------------------------------------------------------------- 
            ds = (PreparedStatement) con.prepareStatement(sqlAC);
            ResultSet rst = ds.executeQuery();
            
            ResultSetMetaData rsMdAC = (ResultSetMetaData) rst.getMetaData();
            int cantidadColumnasAC = rsMdAC.getColumnCount();
            
            modeloAC.addColumn("RFID ACCESORIO");
            modeloAC.addColumn("ACCESORIO");
            modeloAC.addColumn("ESTADO");
            modeloAC.addColumn("DESCRIPCION");
 
           int[] anchosAC = {50, 50, 50,50};
            for (int A = 0; A <  Tabla_Accesorio.getColumnCount(); A++) {
                Tabla_Accesorio.getColumnModel().getColumn(A).setPreferredWidth(anchosAC[A]);
            }
            
            while (rst.next()) {
                Object[] filasAC = new Object[cantidadColumnasAC];
                for (int B = 0; B < cantidadColumnasAC; B++) {
                    filasAC[B] = rst.getObject(B + 1);
                }
                modeloAC.addRow(filasAC);
            }
            
        } catch (SQLException ex) {
            java.lang.System.err.println(ex.toString());
        }

  }
 
 

public static void main(String[] args) {
    
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroActivos().setVisible(true);
            }
        });
  
 }   
    
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ACCESORIO;
    private javax.swing.JTextField ACTIVO;
    private javax.swing.JLabel BACTIVO;
    private javax.swing.JLabel BACTIVO1;
    private javax.swing.JLabel BCOLOR;
    private javax.swing.JLabel BESTADO;
    private javax.swing.JLabel BESTADO1;
    private javax.swing.JLabel BMODELO_SERIE;
    private javax.swing.JLabel BOBSERVACIONES;
    private javax.swing.JComboBox<String> CARRERA;
    private javax.swing.JLabel CARRERA1;
    private javax.swing.JButton CODIGO_RFID;
    private javax.swing.JButton CODIGO_RFID1;
    private javax.swing.JTextField COLOR;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JTextField ESTADO;
    private javax.swing.JTextField ESTADO_ACCESORIO;
    private javax.swing.JTextField MODELO;
    private javax.swing.JButton MODIFICAR;
    private javax.swing.JButton MOSTRAR;
    private javax.swing.JLabel OBSERVACIONES;
    private javax.swing.JTextField OBSERVACIONES_ACCESORIO;
    private javax.swing.JTextField OBSERVACIONES_ACTIVO;
    private javax.swing.JTextField TXT_BUSCAR;
    private javax.swing.JTextField TXT_RFID_ACCESORIO;
    private javax.swing.JTextField TXT_RFID_ACTIVO;
    private javax.swing.JTable Tabla_Accesorio;
    private javax.swing.JTable Tabla_Activo;
    private javax.swing.JTable Tabla_Detalle;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}

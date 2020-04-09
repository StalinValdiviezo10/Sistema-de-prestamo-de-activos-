
package vista;

import Logica.ConexionMysql;
import Sistema_Activos.PrestamoDocen;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class vista_profe extends javax.swing.JFrame {
    PreparedStatement a;
    PreparedStatement b;
    PreparedStatement c;
    
    public vista_profe() {
        initComponents();
        mostrardatos();
        consultar();
        setLocationRelativeTo(null);
        
        CB_CARRERA.setEnabled(false);
        BT_BUSCAR.setEnabled(false);
        TXT_CI_DOCEN.setEnabled(false);
    }

    
    ConexionMysql cc = new ConexionMysql();
    Connection cn = cc.conexion();

    public Integer totalregistros;

   public void mostrardatos(){
        ConexionMysql cc = new ConexionMysql();
        Connection con = null;
        con = cc.conexion();
          try {
            
            DefaultTableModel modeloA = new DefaultTableModel();
            TABLA_DOCENTE.setModel(modeloA); 
                    
            String sqlA = "SELECT* FROM docente";
              a = (PreparedStatement) con.prepareStatement(sqlA);
            ResultSet rs = a.executeQuery();

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
   
    public void buscar() {
        
        ConexionMysql cc = new ConexionMysql();
        Connection con = null;
        con = cc.conexion();
        
        String carrera = CB_CARRERA.getSelectedItem().toString();
        String ci = TXT_CI_DOCEN.getText();
        String nombre = TXT_NOMBRE.getText();

        if (RD_CARRERA.isSelected() == true) {
         try {        
        DefaultTableModel modeloA = new DefaultTableModel();
        TABLA_DOCENTE.setModel(modeloA); 
        
        String sqlA = "SELECT * FROM docente WHERE codi_carr='" + carrera + "'";
        a = (PreparedStatement) con.prepareStatement(sqlA);
        ResultSet rs = a.executeQuery();
        
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
        CB_CARRERA.setSelectedIndex(0);
        CB_CARRERA.setEnabled(false);    
            
    }
            

        if (RD_CI_DOCENTE.isSelected() == true) {
             try {        
        DefaultTableModel modeloA = new DefaultTableModel();
        TABLA_DOCENTE.setModel(modeloA); 
        
        String sqlA = "SELECT * FROM docente WHERE cedula_docen='" + ci + "'";
        a = (PreparedStatement) con.prepareStatement(sqlA);
        ResultSet rs = a.executeQuery();
        
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
          
            TXT_CI_DOCEN.setText("");
            TXT_CI_DOCEN.setEnabled(false);
        }
        
        

        if (RD_NOMBRE.isSelected() == true) {
            try {        
        DefaultTableModel modeloA = new DefaultTableModel();
        TABLA_DOCENTE.setModel(modeloA); 
        
        String sqlA = "SELECT * FROM docente WHERE nombre='" + nombre + "'";
        a = (PreparedStatement) con.prepareStatement(sqlA);
        ResultSet rs = a.executeQuery();
        
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
            TXT_NOMBRE.setText("");
            TXT_NOMBRE.setEnabled(false);
        }

    }
    
    
    
   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoprofesores = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        BT_SALIR = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        TXT_CI_DOCEN = new javax.swing.JTextField();
        RD_CARRERA = new javax.swing.JRadioButton();
        RD_CI_DOCENTE = new javax.swing.JRadioButton();
        RD_NOMBRE = new javax.swing.JRadioButton();
        CB_CARRERA = new javax.swing.JComboBox();
        TXT_NOMBRE = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        BT_BUSCAR = new javax.swing.JButton();
        BT_MOSTRAR = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLA_DOCENTE = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(215, 227, 215));

        jPanel1.setBackground(new java.awt.Color(14, 124, 167));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DATOS DEl DOCENTE");

        BT_SALIR.setBackground(new java.awt.Color(153, 255, 0));
        BT_SALIR.setText("Salir");
        BT_SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SALIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(247, 247, 247)
                .addComponent(BT_SALIR)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BT_SALIR)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(215, 227, 215));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));

        jPanel2.setBackground(new java.awt.Color(215, 227, 215));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153)));

        grupoprofesores.add(RD_CARRERA);
        RD_CARRERA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RD_CARRERA.setForeground(new java.awt.Color(0, 0, 102));
        RD_CARRERA.setText("Buscar por Carrera");
        RD_CARRERA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));
        RD_CARRERA.setBorderPainted(true);
        RD_CARRERA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RD_CARRERAActionPerformed(evt);
            }
        });

        grupoprofesores.add(RD_CI_DOCENTE);
        RD_CI_DOCENTE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RD_CI_DOCENTE.setForeground(new java.awt.Color(0, 0, 102));
        RD_CI_DOCENTE.setText("Buscar por CI");
        RD_CI_DOCENTE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));
        RD_CI_DOCENTE.setBorderPainted(true);
        RD_CI_DOCENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RD_CI_DOCENTEActionPerformed(evt);
            }
        });

        grupoprofesores.add(RD_NOMBRE);
        RD_NOMBRE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RD_NOMBRE.setForeground(new java.awt.Color(0, 0, 102));
        RD_NOMBRE.setText("Buscar por nombre");
        RD_NOMBRE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));
        RD_NOMBRE.setBorderPainted(true);
        RD_NOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RD_NOMBREActionPerformed(evt);
            }
        });

        CB_CARRERA.setBackground(new java.awt.Color(210, 234, 236));
        CB_CARRERA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CB_CARRERA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar:" }));
        CB_CARRERA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));
        CB_CARRERA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_CARRERAActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(215, 227, 215));

        BT_BUSCAR.setBackground(new java.awt.Color(210, 234, 236));
        BT_BUSCAR.setText("BUSCAR");
        BT_BUSCAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));
        BT_BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_BUSCARActionPerformed(evt);
            }
        });

        BT_MOSTRAR.setBackground(new java.awt.Color(210, 234, 236));
        BT_MOSTRAR.setText("MOSTRAR");
        BT_MOSTRAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 124, 167)));
        BT_MOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_MOSTRARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BT_BUSCAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_MOSTRAR, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BT_BUSCAR, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(BT_MOSTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RD_NOMBRE)
                    .addComponent(RD_CARRERA)
                    .addComponent(RD_CI_DOCENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TXT_CI_DOCEN)
                        .addComponent(CB_CARRERA, 0, 110, Short.MAX_VALUE))
                    .addComponent(TXT_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RD_CARRERA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CB_CARRERA, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_CI_DOCEN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RD_CI_DOCENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RD_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))))
        );

        TABLA_DOCENTE.setBackground(new java.awt.Color(153, 204, 255));
        TABLA_DOCENTE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        TABLA_DOCENTE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TABLA_DOCENTE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CI DOCENTE", "NOMBRES", "APELLIDO PATERNO", "APELLIDO MATERNO", "ESPECIALIDAD", "CARRERA", "DIRECCION", "TELEFONO", "CORREO"
            }
        ));
        TABLA_DOCENTE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLA_DOCENTEMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TABLA_DOCENTEMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(TABLA_DOCENTE);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void consultar( ){
  ConexionMysql cc = new ConexionMysql();
  Connection con = null;
  con = cc.conexion();
       
       try{
       
       Statement st = con.createStatement();
       ResultSet rs = st.executeQuery("SELECT codi_carr FROM carrera ");
       CB_CARRERA.removeAllItems();
       while (rs.next()){
       CB_CARRERA.addItem(rs.getString(1));
       }
     
        } catch(SQLException e){
            System.err.println(e);
        }
}
    
    
    private void RD_CARRERAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RD_CARRERAActionPerformed
        
        if (RD_CARRERA.isSelected() == true) {
            CB_CARRERA.setSelectedItem(0);
            CB_CARRERA.setEnabled(true);
            BT_BUSCAR.setEnabled(true);
            

        }
    }//GEN-LAST:event_RD_CARRERAActionPerformed

    private void RD_CI_DOCENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RD_CI_DOCENTEActionPerformed
        
        if (RD_CI_DOCENTE.isSelected() == true) {
            CB_CARRERA.setSelectedIndex(0);
            TXT_CI_DOCEN.setEnabled(true);
            TXT_CI_DOCEN.requestFocus();
            BT_BUSCAR.setEnabled(true);
        }
    }//GEN-LAST:event_RD_CI_DOCENTEActionPerformed

    private void RD_NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RD_NOMBREActionPerformed
        // TODO add your handling code here:
        if (RD_NOMBRE.isSelected() == true) {
            CB_CARRERA.setSelectedIndex(0);
            TXT_NOMBRE.setEnabled(true);
            TXT_NOMBRE.requestFocus();
            BT_BUSCAR.setEnabled(true);
        }
    }//GEN-LAST:event_RD_NOMBREActionPerformed

    private void BT_SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SALIRActionPerformed
        dispose();
    }//GEN-LAST:event_BT_SALIRActionPerformed

    private void BT_BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_BUSCARActionPerformed
        buscar();
    }//GEN-LAST:event_BT_BUSCARActionPerformed

    private void BT_MOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_MOSTRARActionPerformed
        mostrardatos();
    }//GEN-LAST:event_BT_MOSTRARActionPerformed

    private void CB_CARRERAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_CARRERAActionPerformed
       
    }//GEN-LAST:event_CB_CARRERAActionPerformed

    private void TABLA_DOCENTEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLA_DOCENTEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TABLA_DOCENTEMouseClicked

    private void TABLA_DOCENTEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLA_DOCENTEMousePressed
        if (evt.getClickCount() == 2) {
            int fila = TABLA_DOCENTE.getSelectedRow();
            String cod;
            String valor;
            String val;

            cod = TABLA_DOCENTE.getValueAt(fila, 0 ).toString();
            valor = TABLA_DOCENTE.getValueAt(fila, 1).toString();
            val= TABLA_DOCENTE.getValueAt(fila, 2).toString();

            PrestamoDocen.TXT_CI_DOCEN.setText(cod);
            PrestamoDocen.TXT_DOCENTE.setText(valor);
            PrestamoDocen.TXT_APELLIDO.setText(val);
           
            this.dispose();
    }//GEN-LAST:event_TABLA_DOCENTEMousePressed
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
            java.util.logging.Logger.getLogger(vista_profe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista_profe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista_profe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista_profe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista_profe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_BUSCAR;
    private javax.swing.JButton BT_MOSTRAR;
    private javax.swing.JButton BT_SALIR;
    private javax.swing.JComboBox CB_CARRERA;
    private javax.swing.JRadioButton RD_CARRERA;
    private javax.swing.JRadioButton RD_CI_DOCENTE;
    private javax.swing.JRadioButton RD_NOMBRE;
    private javax.swing.JTable TABLA_DOCENTE;
    private javax.swing.JTextField TXT_CI_DOCEN;
    private javax.swing.JTextField TXT_NOMBRE;
    private javax.swing.ButtonGroup grupoprofesores;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

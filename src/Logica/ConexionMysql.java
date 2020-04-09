
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionMysql {

    Connection conectar = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/activos_networking_ug", "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos");

        } catch (ClassNotFoundException ex) {
        }
        return conectar;
    }

}

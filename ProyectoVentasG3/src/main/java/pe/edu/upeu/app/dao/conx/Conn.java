package pe.edu.upeu.app.dao.conx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conn {

    public static final String DEFAULT_DATE_STRING_FORMAT_PE = "dd/MM/yyyy";
    public static final String DEFAULT_DATE_STRING_FORMAT = "yyyy-MM-dd HH:mm:ss";
    static Connection conn = null;

    public static Connection connectSQLite() {
        try {
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:data/db_ventas.db?foreign_keys=on;";
            if (conn == null) {
                conn = DriverManager.getConnection(dbURL);
            }
            System.out.println("Conexion Exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión" + e);
        }
        return conn;
    }

    public static void closeSQLite(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /*public static void main(String[] args) {
        connectSQLite();

        try ( PreparedStatement stmt = connectSQLite().prepareStatement("SELECT * FROM cliente")) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("nombrers")+"\t"+rs.getString("dniruc"));
            }

        } catch (SQLException sqle) {
            System.out.println("Error en la ejecución:"
                    + sqle.getErrorCode() + " " + sqle.getMessage());
        }
    }*/
}

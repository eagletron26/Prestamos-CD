
package PrestamoCD_Daniel_Calderon;

//Clase para conectarse a la base de datos

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Conexion {
    
    // Declara la conexión a nivel de clase
    private Connection conn;

    // Conectarse a SQLite y crear la tabla si no existe
    public Conexion() {
        String url = "jdbc:sqlite:BaseDeDatos.db";

        try {
            // Cargar el controlador JDBC
            Class.forName("org.sqlite.JDBC");

            // Establecer la conexión y crear la tabla
            conn = DriverManager.getConnection(url);
            try (Statement stmt = conn.createStatement()) {
                // Crear la tabla

                String sql = "CREATE TABLE IF NOT EXISTS cd (\n"
                        + "    id SERIAL PRIMARY KEY,\n"
                        + "    artista VARCHAR,\n"
                        + "    numPistas INTEGER,\n"
                        + "    titulo VARCHAR,\n"
                        + "    duracion INTEGER,\n"
                        + "    anioLanzamiento INTEGER,\n"
                        + "    prestado INTEGER\n"
                        + ");";
                stmt.execute(sql);

                System.out.println("Base de datos y tabla creadas con éxito.");
                //JOptionPane.showMessageDialog(null, "Base de datos creada");
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
           JOptionPane.showMessageDialog(null, "Base de datos NO creada" + e.getMessage());
        }
    }

    // Insertar instrucción que no retorne datos en SQLite
    public int ejecutarSentenciaSQL(String strSentenciaSQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }

    // Para hacer consultas, devuelve información.
    public ResultSet consultarRegistros(String strSentenciaSQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
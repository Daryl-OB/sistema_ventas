package Configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://161.132.38.110/sistema_ventas_java?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "sincrona", "Sincrona2024.");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }

}

import aplicacion.Empresa;
import aplicacion.Ingreso;
import aplicacion.funcionalidades.Ventas;
import java.sql.*;

/**
 * Created by Papa Frita on 31/12/2014.
 */
public class Principal {

    public static void main(String[] args) {

        Empresa fempresa = new Empresa();


        // Esto es temporal, para prueba de formularios con acceso no creado
        Ventas fVentas = new Ventas();

        //////////// Prueba de base de datos /////////////
        Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");            //????????
            c = DriverManager.getConnection("jdbc:sqlite:C:\\SQLite\\prueba.db");       //Driver y ruta de la base
            System.out.println("Conexion a la base de datos realizada correctamente.");
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.out.println("Conexion a la base de datos NO pudo ser realizada.");
            System.exit(0);
        }

    }
}

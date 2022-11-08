
package bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USRVI-LC2
 */
public class Conexion {
    
    public Connection obtenerConexion(){
        
        
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/duoc", "root", "");
            
            System.out.println("Conexion correcta! ");
            
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }
    
    
    
}

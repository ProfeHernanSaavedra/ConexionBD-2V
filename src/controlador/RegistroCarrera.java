package controlador;

import bd.Conexion;
import modelo.Carrera;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author USRVI-LC2
 */
public class RegistroCarrera {

    public boolean agregarCarrera(Carrera carrera) {
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO carrera(nombre) VALUES(?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, carrera.getNombre());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {

            System.out.println("Error SQL al agregar carrera " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(String nombre) {

        boolean flag = false;
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM carrera WHERE nombre = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, nombre);

            int resp = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar? ", "Elminar", 1);

            if (resp == 0) {
                stmt.executeUpdate();
                stmt.close();
                cnx.close();
                flag =  true;
            }

        } catch (SQLException e) {

            System.out.println("Error SQL al eliminar carrera " + e.getMessage());
            flag = false;
        }
        return flag;
    }
    
    
    public boolean actualizarCarrera(String nombre, String nombreNew)
    {
        try {

            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "UPDATE carrera SET nombre = ? WHERE nombre =?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1,nombreNew );
            stmt.setString(2, nombre);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {

            System.out.println("Error SQL al agregar carrera " + e.getMessage());
            return false;
        }
    }
    

    public Carrera buscarPorNombre(String nombre)
    {
        Carrera car = new Carrera();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM Carrera WHERE nombre = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, nombre);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                
                car.setIdCarrera(rs.getInt("idCarrera"));
                car.setNombre(rs.getString("nombre"));

                
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {

            System.out.println("Error SQL al consultar carrera por nombre" + e.getMessage());
        }
        return car;
        
    }
    
    public List<Carrera> buscarTodos() {
        List<Carrera> lista = new ArrayList<>();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM Carrera order by idCarrera";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Carrera car = new Carrera();
                car.setIdCarrera(rs.getInt("idCarrera"));
                car.setNombre(rs.getString("nombre"));

                lista.add(car);
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {

            System.out.println("Error SQL al consultar carrera " + e.getMessage());
        }
        return lista;
    }

}

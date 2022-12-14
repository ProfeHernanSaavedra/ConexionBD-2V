
package modelo;

/**
 *
 * @author USRVI-LC2
 */
public class Alumno {
    
    private int rut;
    private String nombre;
    private String direccion;
    private int idCarrera;

    public Alumno() {
    }

    public Alumno(int rut, String nombre, String direccion, int idCarrera) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.idCarrera = idCarrera;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    @Override
    public String toString() {
        return "Alumno{" + "rut=" + rut + ", nombre=" + nombre + ", direccion=" + direccion + ", idCarrera=" + idCarrera + '}';
    }
    
    
    
    
    
}

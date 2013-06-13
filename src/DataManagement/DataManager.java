/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataManagement;

/**
 *
 * @author casa
 */

public class DataManager {
    static String contraseña;
    static String documento;
    static String nombre;
    static String apellido;
    static String fechaNac;
    static String eps;
    static String estado;
    
    DataManager(){
       
    }

    public static String getContraseña() {
        return contraseña;
    }

    public static void setContraseña(String contraseña) {
        DataManager.contraseña = contraseña;
    }

    public static String getDocumento() {
        return documento;
    }

    public static void setDocumento(String documento) {
        DataManager.documento = documento;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        DataManager.nombre = nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        DataManager.apellido = apellido;
    }

    public static String getFechaNac() {
        return fechaNac;
    }

    public static void setFechaNac(String fechaNac) {
        DataManager.fechaNac = fechaNac;
    }

    public static String getEps() {
        return eps;
    }

    public static void setEps(String eps) {
        DataManager.eps = eps;
    }

    public static String getEstado() {
        return estado;
    }

    public static void setEstado(String estado) {
        DataManager.estado = estado;
    }

    
    
    
}

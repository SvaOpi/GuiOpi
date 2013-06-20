/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DataManagement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
/**
 *
 * @author casa
 */
@ManagedBean
@SessionScoped
public class Usuario{
    String documento;
    String nombre;
    String fechaNac;
    String eps;
    String estado;
    
    
    public Usuario(){
        
                
    }
    public String getDocumento() {
        return DataManager.getDocumento();
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return DataManager.getNombre();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return DataManager.getFec_nac();
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEps() {
        return DataManager.getEps();
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = DataManager.getEstado();
    }
    
}

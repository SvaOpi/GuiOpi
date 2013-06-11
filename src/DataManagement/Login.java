/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataManagement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author casa
 */
@ManagedBean
@SessionScoped
public class Login {
    String contraseña;
    String documento;
    String mensaje="login";
    String mensaje2="";

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    DataManager m=new DataManager();
    
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
        m.setCadena(contraseña);
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;        
        m.setCadena(documento);
    }
    public String validar(){
        if(documento!= null && (Long.parseLong(documento)<0||Long.parseLong(documento)>999999999)){
            mensaje="login";
            mensaje2="documento no valido.";
        }
        else{
            mensaje="usuario";
            mensaje2="";
        }
        m.setCadena(mensaje);
        return mensaje;
    }

    public String getMensaje2() {
        return mensaje2;        
    }

    public void setMensaje2(String mensaje2) {
        this.mensaje2 = mensaje2;
    }
    
}

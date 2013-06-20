/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataManagement;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author casa
 */
@ManagedBean
@SessionScoped
public class Login{
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
        return DataManager.getContraseña();
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;        
    }

    public String getDocumento() {
        return DataManager.getDocumento();
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String validar(){
        if(documento!= null && (Long.parseLong(documento)<0||Long.parseLong(documento)>999999999)){
            mensaje="login";
            mensaje2="documento no valido.";
        }
        else{
            if(contraseña.length()>15 || contraseña.length()<5){
                mensaje="login";
                mensaje2="contraseña no valida.";
            }else{
                
                mensaje="usuario";
                mensaje2="";
                DataManager.setDocumento(documento);
                DataManager.setContraseña(contraseña);
            }
           
        }
        
        return mensaje;
    }

    public String getMensaje2() {
        return mensaje2;        
        
    }

    public void setMensaje2(String mensaje2) {
        this.mensaje2 = mensaje2;
    }
    
    
    
}

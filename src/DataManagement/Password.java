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
public class Password {
    String pass1;
    String pass22;
    String pass2;
    String mensaje1="password";
    String mensaje2="";

    public String getPass1() {
        return pass1;
    }

    public void setPass1(String pass1) {
        this.pass1 = pass1;
    }

    public String getPass22() {
        return pass22;
    }

    public void setPass22(String pass22) {
        this.pass22 = pass22;
    }

    public String getPass2() {
        return pass2;
    }

    public void setPass2(String pass2) {        
        this.pass2 = pass2;
    }
    public String validar(){
        if (!pass22.equals(pass2)){
            mensaje2="las contraseñas no son iguales.";            
        }else{
            if(DataManager.validateLogin(DataManager.getDocumento(),pass1).getData()!=null){
               if(pass2.length()<15 && pass2.length()>5){
                   mensaje1="usuario";
                }else{
                   mensaje2="la nueva contraseña no es valida.";
               }
            }                      
        }
        
        return mensaje1;
    }

    public String getMensaje1() {
        return mensaje1;
    }

    public void setMensaje1(String mensaje1) {
        this.mensaje1 = mensaje1;
    }

    public String getMensaje2() {
        return mensaje2;
    }

    public void setMensaje2(String mensaje2) {
        this.mensaje2 = mensaje2;
    }
}

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

public class DataManager {
    String cadena;
    
    DataManager(){
        cadena="";
    }

    public String getCadena() {
        System.out.println(cadena);
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
        System.out.println(cadena);
    }
    
    
}

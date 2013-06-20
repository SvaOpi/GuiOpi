/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataManagement;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author casa
 */
@ManagedBean
@SessionScoped
public class Pin {
    
    List<com.dataejbopi.ws.Pin> pins;

    public List<com.dataejbopi.ws.Pin> getPins() {        
        return DataManager.getPins();
    }

    public void setPins(List<com.dataejbopi.ws.Pin> pins) {
        pins = pins;
    }
    
    
}

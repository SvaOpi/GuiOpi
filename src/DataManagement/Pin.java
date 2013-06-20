/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataManagement;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author casa
 */
@ManagedBean
@SessionScoped
public class Pin {
    
    List<com.dataejbopi.ws.Pin> pins;    
    String pinid="-----------";
    String pincreationdate="------";
    String pinlimitdate="-------";
    String pinstate="-----";
    String pinopiservicevalue="------";
    String pinhealthservicevalue="-------";
    String mensaje;
    

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getPinid() {
        if(DataManager.getNuevopin()!=null){            
            pinid=DataManager.getNuevopin().getId().toString();
        }
        return pinid;
    }

    public void setPinid(String pinid) {
        this.pinid = pinid;
    }

    public String getPincreationdate() {
        if(DataManager.getNuevopin()!=null){
            pincreationdate=DataManager.getNuevopin().getCreationdate().toString();
        }
        return pincreationdate;
    }

    public void setPincreationdate(String pincreationdate) {
        this.pincreationdate = pincreationdate;
    }

    public String getPinlimitdate() {
        if(DataManager.getNuevopin()!=null){
            pinlimitdate=DataManager.getNuevopin().getLimitdate().toString();
        }
        return pinlimitdate;
    }

    public void setPinlimitdate(String pinlimitdate) {
        this.pinlimitdate = pinlimitdate;
    }

    public String getPinstate() {
        if(DataManager.getNuevopin()!=null){
            pinstate=DataManager.getNuevopin().getPinstate();
        }
        return pinstate;
    }

    public void setPinstate(String pinstate) {
        this.pinstate = pinstate;
    }

    public String getPinopiservicevalue() {
        if(DataManager.getNuevopin()!=null){
            pinopiservicevalue=DataManager.getNuevopin().getPayment().getOpiServiceValue().toString();
        }
        return pinopiservicevalue;
    }

    public void setPinopiservicevalue(String pinopiservicevalue) {
        this.pinopiservicevalue = pinopiservicevalue;
    }

    public String getPinhealthservicevalue() {
        if(DataManager.getNuevopin()!=null){
            pinhealthservicevalue=DataManager.getNuevopin().getPayment().getHealtServiceValue().toString();
        }
        return pinhealthservicevalue;
    }

    public void setPinhealthservicevalue(String pinhealthservicevalue) {
        this.pinhealthservicevalue = pinhealthservicevalue;
    }

    public List<com.dataejbopi.ws.Pin> getPins() {        
        return DataManager.getPins();
    }

    public void setPins(List<com.dataejbopi.ws.Pin> pins) {
        this.pins = pins;
    }
     public void submit(){
         if(DataManager.registerPin(Long.parseLong(DataManager.getDocumento()))){
             mensaje="nuevo PIN:";
         }else{
             mensaje="no se creo el nuevo PIN";
         }
     }
    public void verDetallesLista(){
        
    }
}

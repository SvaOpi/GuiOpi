/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataManagement;

import com.dataejbsra.ws.ROb;
import com.dataejbsra.ws.Person;
//import com.dataejbopi.ws.Person;//cambiar nombre variable
import com.dataejbopi.ws.Pin;
import java.util.List;
/**
 *
 * @author casa
 */

public class DataManager {
    static String documento;
    static String nombre;
    static String apellido;
    static String fec_nac;   
    static String eps;
    static String estado;
    static com.dataejbsra.ws.Person persona;
    static com.dataejbopi.ws.Person personaopi;
    static List<Pin> pins;
    static com.dataejbopi.ws.Pin nuevopin;
    DataManager(){
       persona=new com.dataejbsra.ws.Person();
       personaopi= new com.dataejbopi.ws.Person();
    }

    public static Pin getNuevopin() {
        return nuevopin;
    }

    public static void setNuevopin(Pin nuevopin) {
        DataManager.nuevopin = nuevopin;
    }

    public static List<Pin> getPins() {
        //pins=findAllPins(); //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXxXXXXXXXXXXXXXXXXXXX
        return pins;
    }

    public static void setPins(List<Pin> pins) {
        DataManager.pins = pins;
    }

    public static String getDocumento() {
        return documento;
        
    }

    public static void setDocumento(String documento) {
        DataManager.documento = documento;
    }
    
     public static String getNombre() {
        return persona.getName();
    }

    public static void setNombre(String nombre) {
        DataManager.nombre = nombre;
    }

    public static String getFec_nac() {
        return persona.getBirth().toString();
    }

    public static void setFec_nac(String fec_nac) {
        DataManager.fec_nac = fec_nac;
    }

    public static String getEps() {
        return personaopi.getEps().getName();
    }

    public static void setEps(String eps) {
        DataManager.eps = eps;
    }

    public static String getEstado() {
        return "null";//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    }

    public static void setEstado(String estado) {
        DataManager.estado = estado;
    }

    public static com.dataejbopi.ws.ROb validateLogin(java.lang.String userName, java.lang.String userPassword) {
        com.dataejbopi.ws.PersonOpiWs_Service service = new com.dataejbopi.ws.PersonOpiWs_Service();
        com.dataejbopi.ws.PersonOpiWs port = service.getPersonOpiWsPort();
        if(port.validateLogin(userName, userPassword).getData()!=null){
            findByCedule(Long.parseLong(userName));
            personaopi=(com.dataejbopi.ws.Person)port.validateLogin(userName, userPassword).getData();
        }
        return port.validateLogin(userName, userPassword);
    }

    public static void findByCedule(java.lang.Long cedule) {
        com.dataejbsra.ws.PersonWS_Service service = new com.dataejbsra.ws.PersonWS_Service();
        com.dataejbsra.ws.PersonWS port = service.getPersonWSPort();
        if(port.findByCedule(cedule).getData()!=null){
            persona=(com.dataejbsra.ws.Person)port.findByCedule(cedule).getData();
        }        
    }

    public static java.util.List<com.dataejbopi.ws.Person> findAllPins() {
        com.dataejbopi.ws.PinWs_Service service = new com.dataejbopi.ws.PinWs_Service();
        com.dataejbopi.ws.PinWs port = service.getPinWsPort();
        return port.findAll();
    }

    public static com.dataejbopi.ws.ROb createPaymentForPin(java.lang.Long idPin, java.lang.Double salary) {
        com.dataejbopi.ws.PaymentWs_Service service = new com.dataejbopi.ws.PaymentWs_Service();
        com.dataejbopi.ws.PaymentWs port = service.getPaymentWsPort();
        return port.createPaymentForPin(idPin, salary);
    }

    public static boolean registerPin(java.lang.Long personCedule) {
        com.dataejbopi.ws.PinWs_Service service = new com.dataejbopi.ws.PinWs_Service();
        com.dataejbopi.ws.PinWs port = service.getPinWsPort();
        System.out.println("aaaaaaaaaaaaaaaa");
        if(port.registerPin(personCedule).getData()!=null){
            nuevopin=(com.dataejbopi.ws.Pin)port.registerPin(personCedule).getData();
            return true;
        }
       
        return false;
    }

    private static com.dataejbopi.ws.ROb onlinePayment(java.lang.Long cedule, java.lang.Long personAccount, java.lang.String passwordAccount) {
        com.dataejbopi.ws.PaymentWs_Service service = new com.dataejbopi.ws.PaymentWs_Service();
        com.dataejbopi.ws.PaymentWs port = service.getPaymentWsPort();
        return port.onlinePayment(cedule, personAccount, passwordAccount);
    }

    
    
}

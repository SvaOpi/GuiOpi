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
public class Pin {
    String numPin;
    String fechaCreacion;
    String estado;
    String fechaLimite;
    String FechaDePago;
    String ValorTotal;

    public String getNumPin() {
        return numPin;
    }

    public void setNumPin(String numPin) {
        this.numPin = numPin;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getFechaDePago() {
        return FechaDePago;
    }

    public void setFechaDePago(String FechaDePago) {
        this.FechaDePago = FechaDePago;
    }

    public String getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(String ValorTotal) {
        this.ValorTotal = ValorTotal;
    }
    
}

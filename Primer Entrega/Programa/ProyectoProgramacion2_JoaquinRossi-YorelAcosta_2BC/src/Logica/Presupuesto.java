//@authors: | Joaquin_Rossi | Yorel_Acosta | 2°BC | ESI-BUCEO
package Logica;

import Logica.Constantes;

public abstract class Presupuesto {
    //ATRIBUTOS:
    protected String idPresupuesto = Constantes.idPresupuesto;
    protected String idCliente = Constantes.idCliente;
    protected String nomCliente = Constantes.nomCliente;
    protected double manoObra = Constantes.manoObra;
    protected double  iva = Constantes.iva;
    protected double subTotal = Constantes.subTotal;   
    protected double total = Constantes.total;
    protected double horasTrabajadas = Constantes.horasTrabajadas;


    
    
    
    //CONSTRUCTOR:    
    public Presupuesto(String idPresupuesto, double manoObra, double iva,double subTotal, double total, double horasTrabajadas, String idCliente, String nomCliente) {
        this.idPresupuesto = idPresupuesto;
        this.manoObra = manoObra;
        this.iva = iva;
        this.subTotal = subTotal;        
        this.total = total;        
        this.horasTrabajadas = horasTrabajadas;  
        this.idCliente = idCliente;
        this.nomCliente = nomCliente;
    }// End constructor completo
    
    //GETTERS:  
    public String getIdPresupuesto() {
        return idPresupuesto;
    }
    public double getIva() {
        return iva;
    }
    public double getSubTotal() {
        return subTotal;
    }
    public double getTotal() {
        return total;
    }
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
    //SETTERS:
    public void setIdPresupuesto(String idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }
    public void setIva(double iva) {
        this.iva = iva;
    }
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    //LIBRERIA DE COMPORTAMIENTOS:
    
    
}// End class

//@authors Joaquin_Rossi,Yorel_Acosta | 2°BC
package Logical;

import Logical.Constantes;

public abstract class Presupuesto {
    //ATRIBUTOS:
    private String idPresupuesto = Constantes.idPresupuesto;
    private int cantIns = Constantes.cantIns;
    private double manoObra = Constantes.manoObra;
    private double  iva = Constantes.iva;
    private double subTotal = Constantes.subTotal;   
    private double total = Constantes.total;
    private double horasTrabajadas = Constantes.horasTrabajadas;
    
    //CONSTRUCTOR:    
    public Presupuesto(String idPresupuesto, int cantIns, double manoObra, double iva,double subTotal, double total, double horasTrabajadas) {
        this.idPresupuesto = idPresupuesto;
        this.cantIns = cantIns;
        this.manoObra = manoObra;
        this.iva = iva;
        this.subTotal = subTotal;        
        this.total = total;        
        this.horasTrabajadas = horasTrabajadas;        
    }// End constructor completo
    
    //GETTERS:  
    public String getIdPresupuesto() {
        return idPresupuesto;
    }
    public int getCantIns() {
        return cantIns;
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
    public void setCantIns(int cantIns) {
        this.cantIns = cantIns;
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

//@authors Joaquin_Rossi,Yorel_Acosta | 2°BC
package Logical;

public abstract class InsumoInformatico {
    //ATRIBUTOS:
    private String idInsumo = Constantes.idIns;
    private String descripcion = Constantes.descripcion;
    private double precioIns = Constantes.precioIns;
    
    //CONSTRUCTOR:
    public InsumoInformatico(String idInsumo, String descripcion, double precioIns) {
    this.idInsumo = idInsumo;
    this.descripcion = descripcion;
    this.precioIns = precioIns;
    }// End constructor completo
    
    //GETTERS:
    public String getIdInsumo() {
        return idInsumo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getPrecioIns() {
        return precioIns;
    }
   
    //SETERS:
    public void setIdInsumo(String idInsumo) {
        this.idInsumo = idInsumo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecioIns(double precioIns) {
        this.precioIns = precioIns;
    }
    
    
    //LIBRERIA DE COMPORTAMIENTOS:
    
    
    
    
}// End class

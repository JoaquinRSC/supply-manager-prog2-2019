//@authors: | Joaquin_Rossi | Yorel_Acosta | 2°BC | ESI-BUCEO
package Logica;

public abstract class InsumoInformatico {
    //ATRIBUTOS:
    protected String idInsumo = Constantes.idIns;
    protected String descripcion = Constantes.descripcion;
    protected double precioIns = Constantes.precioIns;
    protected double precioBase = Constantes.precioBase;

        
    //CONSTRUCTOR:
    public InsumoInformatico(String idInsumo, String descripcion, double precioIns,double precioBase) {
    this.idInsumo = idInsumo;
    this.descripcion = descripcion;
    this.precioIns = precioIns;
    this.precioBase = precioBase;
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

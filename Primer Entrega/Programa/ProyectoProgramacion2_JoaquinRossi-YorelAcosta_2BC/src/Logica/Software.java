//@authors: | Joaquin_Rossi | Yorel_Acosta | 2°BC | ESI-BUCEO 
package Logica;

public class Software extends InsumoInformatico{
    //ATRIBUTOS:
    private boolean pago = Constantes.pago;
    private String version = Constantes.version;
    private String desarrollador = Constantes.desarrollador;
    
    //CONSTRUCTOR:
    public Software(String idInsumo, String descripcion, double precioIns,double precioBase ,boolean pago, String version, String desarrollador) {
        super(idInsumo, descripcion, precioIns,precioBase);
        this.pago = pago;
        this.version = version;
        this.desarrollador = desarrollador;
    }// End constructor completo

    //GETTERS:
    public boolean isPago() {
        return pago;
    }
    public String getVersion() {
        return version;
    }
    public String getDesarrollador() {
        return desarrollador;
    }
    
    //SETTERS:
    public void setPago(boolean pago) {
        this.pago = pago;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }
    
    //LIBRERIA DE COMPORTAMIENTOS:
    
    
}// End class

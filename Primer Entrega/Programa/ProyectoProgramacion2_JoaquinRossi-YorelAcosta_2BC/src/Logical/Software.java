//@authors Joaquin_Rossi,Yorel_Acosta | 2°BC
package Logical;

public class Software extends InsumoInformatico{
    //ATRIBUTOS:
    private boolean pago = Constantes.pago;
    private String version = Constantes.version;
    private String desarrollador = Constantes.desarrollador;
    
    //CONSTRUCTOR:
    public Software(String idInsumo, String descripcion, double precioIns, boolean pago, String version, String desarrollador) {
        super(idInsumo, descripcion, precioIns);
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

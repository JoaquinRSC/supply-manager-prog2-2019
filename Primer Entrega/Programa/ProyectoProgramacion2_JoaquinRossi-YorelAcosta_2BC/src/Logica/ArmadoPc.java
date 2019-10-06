//@authors: | Joaquin_Rossi | Yorel_Acosta | 2°BC | ESI-BUCEO
package Logica;

public class ArmadoPc extends Presupuesto {
    //ATRIBUTOS:
    private String proposito = Constantes.proposito;

    //CONSTRUCTOR SIN SO:
    public ArmadoPc(String idPresupuesto, double manoObra,double subTotal, double total, double horasTrabajadas,String idCliente, String nomCliente,String proposito) {       
        super(idPresupuesto, manoObra, subTotal, total, horasTrabajadas, idCliente, nomCliente);
        this.manoObra =
        this.proposito = proposito;
    }// End constructor SIN SO
    

    
    
    //GETTER & SETTER:
    public String getProposito() {
        return proposito;
    }
    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    
    //LIBRERIA DE COMPORTAMIENTOS:
    
    
    
}// End class


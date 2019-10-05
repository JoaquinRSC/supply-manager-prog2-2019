//@authors: | Joaquin_Rossi | Yorel_Acosta | 2°BC | ESI-BUCEO
package Logical;

public class ArmadoPc extends Presupuesto {
    //ATRIBUTOS:
    private String proposito = Constantes.proposito;

    
    //CONSTRUCTOR:
    public ArmadoPc(
            String idPresupuesto, int cantIns, double manoObra, double iva, 
            double subTotal, double total, double horasTrabajadas,String proposito,
            String techRAM, String fromFactorCase, int capacidadRAM, int wattsFuente,
            int capacidadAlmacenamiento, int capacidadGrafica
                   ) {       
        super(idPresupuesto, cantIns, manoObra, iva, subTotal, total, horasTrabajadas);
        this.proposito = proposito;

    }// End constructor completo
    
    //LIBRERIA DE COMPORTAMIENTOS:
    
    
    
}// End class


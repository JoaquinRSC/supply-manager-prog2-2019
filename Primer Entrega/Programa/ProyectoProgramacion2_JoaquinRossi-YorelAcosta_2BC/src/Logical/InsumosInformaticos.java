//@authors: | Joaquin_Rossi | Yorel_Acosta | 2°BC | ESI-BUCEO
package Logical;
import java.util.ArrayList;

public class InsumosInformaticos {
    //COLECCION:
    private ArrayList <InsumoInformatico> insumos;
    
    //CONSTRUCTOR
    public InsumosInformaticos () {
        insumos = new ArrayList<>();
    }// End constructor
    
    //GETTER & SETTER:
    public ArrayList<InsumoInformatico> getPresupuestos() {
        return insumos;
    }
    public void setPresupuestos(ArrayList <InsumoInformatico> insumos) {
        this.insumos = insumos;
    }
    
    //LIBRERIA DE COMPORTAMIENTOS:
    
    
    
}// End class

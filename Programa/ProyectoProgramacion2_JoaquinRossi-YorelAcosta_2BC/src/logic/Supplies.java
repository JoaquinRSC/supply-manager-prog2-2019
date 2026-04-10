//@authors: | Joaquin_Rossi | Yorel_Acosta | 2°BC | ESI-BUCEO
package Logica;
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
    public InsumoInformatico obtenerObjetoI (int posicion) {
        InsumoInformatico I1_Aux = insumos.get(posicion);
        return I1_Aux;
    }// End method
    public int obtenerCantidadIns(){
        return insumos.size();
    }// End method
    public String obtenerIDIns(int posicion){
        InsumoInformatico I1_Aux = insumos.get(posicion);
        return I1_Aux.getIdInsumo();
    }
    public void elimiarIns(int posicion){
        insumos.remove(posicion);
    }
    public void insertarIns(InsumoInformatico I1_Aux){
        insumos.add(I1_Aux);
    }

}// End class

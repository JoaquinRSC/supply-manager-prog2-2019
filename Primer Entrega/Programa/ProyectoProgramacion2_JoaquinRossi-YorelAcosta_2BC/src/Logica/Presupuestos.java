//@authors: | Joaquin_Rossi | Yorel_Acosta | 2°BC | ESI-BUCEO 
package Logica;
import java.util.ArrayList;

public class Presupuestos {
    //COLECCION:
    private ArrayList <Presupuesto> presupuestos;
    
    //CONSTRUCTOR
    public Presupuestos () {
        presupuestos = new ArrayList<>();
    }// End constructor
    
    //GETTER & SETTER:
    public ArrayList<Presupuesto> getPresupuestos() {
        return presupuestos;
    }
    public void setPresupuestos(ArrayList <Presupuesto> presupuestos) {
        this.presupuestos = presupuestos;
    }
    
    //LIBRERIA DE COMPORTAMIENTOS:
    public Presupuesto obtenerObjetoP (int posicion) {
        Presupuesto P1_Aux = presupuestos.get(posicion);
        return P1_Aux;
    }// End method
    public int obtenerCantidadP(){
        return presupuestos.size();
    }// End method
    public String obtenerIDPre(int posicion){
        Presupuesto P1_Aux = presupuestos.get(posicion);
        return P1_Aux.getIdPresupuesto();
    }
    public void elimiarPre(int posicion){
        presupuestos.remove(posicion);
    }
    public void insertarPre(Presupuesto P1_Aux){
        presupuestos.add(P1_Aux);
    }    
    
}// End class

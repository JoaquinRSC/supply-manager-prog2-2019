//@authors: | Joaquin_Rossi | Yorel_Acosta | 2°BC | ESI-BUCEO 
package Logical;
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
    
    
}// End class

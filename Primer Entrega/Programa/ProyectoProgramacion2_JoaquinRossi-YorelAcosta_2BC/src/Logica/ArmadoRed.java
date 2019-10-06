//@authors: | Joaquin_Rossi | Yorel_Acosta | 2°BC | ESI-BUCEO
package Logica;

public class ArmadoRed extends Presupuesto{
    //ATRIBUTOS:
    private String dataPlan = Constantes.dataPlan;
    private String speedUp = Constantes.speedUp;
    private String speedDown = Constantes.speedDown;
    private String isp = Constantes.isp;
    private int cantRouters = Constantes.cantRouters;
    private double tiradasCable = Constantes.tiradasCable;
    
    //CONSTRUCTOR:

    public ArmadoRed(String idPresupuesto, double manoObra, double subTotal, double total, double horasTrabajadas, String dataPlan, String speedUp, String speedDown, String isp, int cantRouters, double tiradasCable) {
        super(idPresupuesto, manoObra, subTotal, total, horasTrabajadas);
        this.dataPlan = dataPlan;
        this.speedUp = speedUp;
        this.speedDown = speedDown;
        this.isp = isp;
        this.cantRouters = cantRouters;
        this.tiradasCable = tiradasCable;
    }// End constructor completo

    //GETTERS:
    public String getDataPlan() {
        return dataPlan;
    }
    public String getSpeedUp() {
        return speedUp;
    }
    public String getSpeedDown() {
        return speedDown;
    }
    public String getIsp() {
        return isp;
    }
    public int getCantRouters() {
        return cantRouters;
    }
    public double getTiradasCable() {
        return tiradasCable;
    }
    
    //SETTERS:
    public void setDataPlan(String dataPlan) {
        this.dataPlan = dataPlan;
    }
    public void setSpeedUp(String speedUp) {
        this.speedUp = speedUp;
    }
    public void setSpeedDown(String speedDown) {
        this.speedDown = speedDown;
    }
    public void setIsp(String isp) {
        this.isp = isp;
    }
    public void setCantRouters(int cantRouters) {
        this.cantRouters = cantRouters;
    }
    public void setTiradasCable(double tiradasCable) {
        this.tiradasCable = tiradasCable;
    }
    
    //LIBRERIA DE COMPORTAMIENTOS:
    
            
    
}// End class

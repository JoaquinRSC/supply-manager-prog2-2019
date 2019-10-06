//@authors: | Joaquin_Rossi | Yorel_Acosta | 2°BC | ESI-BUCEO
//IMPORTANTE: 

package Logica;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    public static void main (String [] args) {
        ArrayList <Presupuestos> presupuestos = new ArrayList<>(); //ArrayL de la coleccion de objetos Presupuesto
        ArrayList <InsumoInformatico> insumos = new ArrayList<>(); //ArrayL de la coleccion de objetos Insumo
        double precio = 0.0;
        
        //Como una PC ordinaria tiene al menos 7 Insumos (MotherBoard,RAM,HDD,CPU,GPU;Case;Fuente) 
        //entonces como minimo debo tener 7 insumos
      
        for (int i=0 ; i<7 ; i++) {
            ArrayList <InsumoInformatico> ins = new ArrayList<>();
            switch (i) {
                case 0:
                    InsumoInformatico I1_Aux = new Hardware(String.valueOf(i+1), "Mmemoria RAM", 0.0, 30.0, 2400, 8, "HyperX", "DDR4", "xA23");
                    ins.add(I1_Aux);
                    break;
                case 1:
                    InsumoInformatico I2_Aux = new Hardware(String.valueOf(i+1), "Almacenamiento", 0.0, 20.0, 1000, "M2", "WD", "7200SSW");
                    ins.add(I2_Aux);
                    break;
                case 2:
                    InsumoInformatico I3_Aux = new Hardware(String.valueOf(i+1), "Case", 0.0, 19.0, "MG23", "AORUS", 1);
                    ins.add(I3_Aux);
                    break;
                case 3:
                    InsumoInformatico I4_Aux = new Hardware(String.valueOf(i+1),"Fuente",0.0,15.2,"Thermaltake","USP23FULLY",500);
                    ins.add(I4_Aux);
                    break;
                case 4:
                    InsumoInformatico I5_Aux = new Hardware(String.valueOf(i+1),"Grafica",0.0,14.66,"MSI","WTR200",4);
                    ins.add(I5_Aux);
                    break;
                case 5:
                    InsumoInformatico I6_Aux = new Hardware(String.valueOf(i+1),"CPU",0.0,48.0,"AMD",6,3.2,"R5 1600");
                    ins.add(I6_Aux);
                    break;
                case 6:
                    InsumoInformatico I7_Aux = new Hardware(String.valueOf(i+1),"Motherboard",0.0,20.3,true);
                    ins.add(I7_Aux);
                    break;
            }// End SW "i"
            insumos.add(ins);
        }//End FOR "i"

        
        
        //Presupuesto P1_Aux = new ArmadoPc(String.valueOf(1), 7, calcularManoObra, 0.21, 0, 0, 0, idCliente, nomCliente, proposito);
        
    }//End main
}//End class

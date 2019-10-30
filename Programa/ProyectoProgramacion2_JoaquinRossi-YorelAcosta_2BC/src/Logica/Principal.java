//@authors: | Joaquin_Rossi | Yorel_Acosta | 2°BC | ESI-BUCEO

package Logica;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    public static void main (String [] args) {
        ArrayList <Presupuestos> presupuestos = new ArrayList<>(); //ArrayL de la coleccion de objetos Presupuesto
        ArrayList <InsumoInformatico> insumos = new ArrayList<>(); //ArrayL de la coleccion de objetos Insumo
        
        //Como una PC ordinaria tiene al menos 7 Insumos (MotherBoard,RAM,HDD,CPU,GPU;Case;Fuente) 
        //entonces como minimo debo tener 7 insumos
      
        for (int i=0 ; i<7 ; i++) {
            switch (i) {
                case 0://MEMORIAS RAM
                    InsumoInformatico RAM1_Aux = new Hardware("R001", "Mmemoria RAM", 0.0, 30.0, 2400, 8, "HyperX", "DDR4", "xA23");
                    //Su precio es 19.529999999999998
                    insumos.add(RAM1_Aux);
                    InsumoInformatico RAM2_Aux = new Hardware("R002", "Mmemoria RAM", 0.0, 30.0, 2666, 16, "TridentZ", "DDR4", "x1G3");
                    //Su precio es 24.36
                    insumos.add(RAM2_Aux);
                    break;
                case 1://ALMACENAMIENTO
                    InsumoInformatico Almacenamiento1_Aux = new Hardware("DSK001", "Almacenamiento", 0.0, 20.0, 500, "SSD", "WD", "7dA0SSW");
                    //Su precio es 11.34
                    insumos.add(Almacenamiento1_Aux);
                    InsumoInformatico Almacenamiento2_Aux = new Hardware("DSK002", "Almacenamiento", 0.0, 20.0, 160, "M2", "SMG", "0FSSW");
                    //Su precio es 10.08
                    insumos.add(Almacenamiento2_Aux);
                    InsumoInformatico Almacenamiento3_Aux = new Hardware("DSK003", "Almacenamiento", 0.0, 20.0, 4000, "HDD", "WD", "7200SSW");
                    //Su precio es 15.959999999999999
                    insumos.add(Almacenamiento3_Aux);
                    break;
                case 2://CASE
                    InsumoInformatico CASE1_Aux = new Hardware("CAS001", "Case", 0.0, 19.0, "MG23", "AORUS", 1);
                    //Su precio es 7.14
                    insumos.add(CASE1_Aux);
                    break;
                case 3://FUENTE
                    InsumoInformatico FUENTE1_Aux = new Hardware("SPL001","Fuente",0.0,15.2,"KJF","31AAS",650);
                    //Su precio es 6.972
                    insumos.add(FUENTE1_Aux);
                    InsumoInformatico FUENTE2_Aux = new Hardware("SPL002","Fuente",0.0,15.2,"Thermaltake","USP23FULLY",500);
                    //Su precio es 6.342
                    insumos.add(FUENTE2_Aux);
                    break;
                case 4://GPU
                    InsumoInformatico GPU1_Aux = new Hardware("GPU001","Grafica",0.0,14.66,"NVDIA","QCYO",6);
                    //Su precio es 6.2286
                    insumos.add(GPU1_Aux);
                    InsumoInformatico GPU2_Aux = new Hardware("GPU002","Grafica",0.0,14.66,"MSI","WTR200",4);
                    //Su precio es 6.2286
                    insumos.add(GPU2_Aux);
                    break;
                case 5://CPU
                    InsumoInformatico CPU1_Aux = new Hardware("CPU001","CPU",0.0,48.0,"Intel",8,4.0,"IG89");
                    //Su precio es 32.655
                    insumos.add(CPU1_Aux);
                    InsumoInformatico CPU2_Aux = new Hardware("CPU002","CPU",0.0,48.0,"AMD",6,3.2,"R5 1600");
                    //Su precio es 24.1836
                    insumos.add(CPU2_Aux);
                    break;
                case 6://MB
                    InsumoInformatico MB1_Aux = new Hardware("MB001","Motherboard",0.0,20.3,true);
                    //Su precio es 8.421
                    insumos.add(MB1_Aux);
                    InsumoInformatico MB2_Aux = new Hardware("MB002","Motherboard",0.0,20.3,false);
                    //Su precio es 4.263
                    insumos.add(MB2_Aux);
                    break;
            }// End SW "i"
 
        }//End FOR "i"

        //Se arma un presupuesto con los siguientes insumos seleccionados:
            //R002 ; DSK003 ; CAS001 ; SPL001 ; GPU001 ; CPU001 ; MB001 = 7INSUMOS (Minimo e indispensable para armadoPC) 
            //Al estar seleccionados obtengo sus respectivos id de cada uno
            //Se debe de sumar los precios de los insumos seleccionados y dividirlo entre el 10% para obtener la mando de obra
        double precioManoObra = 0.0;
        //Son todos mis ID que tengo seleccionado, los usare para obtener el precio de cada uno.
        String idInsumosSeleccioandos [] = {"R002","DSK003","CAS001","SPL001","GPU001","CPU001","MB001"};
       
        //Se verifica si El ID del Insumo seleccionado es igual a algun objeto que tenga ese ID que se selecciono, 
        //cuando se encuentre: que se traiga el precio de ese objeto que coincide con con el ID seleccionado, asi luego
        //se suma al precioManoObra
        
         for ( int x=0 ; x<idInsumosSeleccioandos.length ; x++ ) {
                String idIns = idInsumosSeleccioandos [x]; //Me traigo un ID respecto del indice del FOR
                for ( int i=0 ; i<insumos.size() ; i++ ) {
                    InsumoInformatico Ins1_Aux = insumos.get(i); //Me traigo un insumo de la coleccion
                    if ( idIns.equals(Ins1_Aux.getIdInsumo()) ) {
                        precioManoObra = (precioManoObra + Ins1_Aux.getPrecioIns() );
                    }           
                }//End for "i"                
            }//End for "x"            
        double precioTotalInsumosSeleccionados = precioManoObra;
        precioManoObra = ( precioManoObra * 0.10 ) * 21;
        
        //Para calcular el subTotal se debe de saber la cantidad de Insumo de cada tipo
        //Si se selecciona el Insumo R001, se debe espcificar la cantidad de este
        double cantInsRAM=0;
        double cantInsHDD=0;
        double cantInsCASE=0;
        double cantInsGPU=0;
        double cantInsCPU=0;
        double cantInsMB=0;
        double cantInsFUENTE=0;
        
        for ( int x=0 ; x<idInsumosSeleccioandos.length ; x++ ) {
                String idIns = idInsumosSeleccioandos [x]; //Me traigo un ID respecto del indice del FOR
                for ( int i=0 ; i<insumos.size() ; i++ ) {
                    InsumoInformatico Ins1_Aux = insumos.get(i); //Me traigo un insumo de la coleccion
                    if ( idIns.equals(Ins1_Aux.getIdInsumo()) ) {
                        switch(x) {
                            case 0://HACE REF AL ID R001
                                cantInsRAM= Ins1_Aux.getPrecioIns() *2; //Quiero 2 Insumos con el codigo R002
                                break;
                            case 1://HACE REF AL ID DSK003
                                cantInsHDD= Ins1_Aux.getPrecioIns() *4; //Quiero 4 Insumos con el codigo DSK003
                                break;  
                            case 2://HACE REF AL ID CAS001
                                cantInsCASE= Ins1_Aux.getPrecioIns() *1; //Quiero 1 Insumos con el codigo CAS001
                                break;
                            case 3://HACE REF AL ID SPL001
                                cantInsFUENTE= Ins1_Aux.getPrecioIns() *1; //Quiero 1 Insumos con el codigo SPL001
                                break;
                            case 4://HACE REF AL ID GPU001
                                cantInsGPU= Ins1_Aux.getPrecioIns() *1; //Quiero 1 Insumos con el codigo GPU001
                                break;
                            case 5://HACE REF AL ID CPU001
                                cantInsCPU= Ins1_Aux.getPrecioIns() *1; //Quiero 1 Insumos con el codigo CPU001
                                break;
                            case 6://HACE REF AL ID MB001
                                cantInsMB= Ins1_Aux.getPrecioIns() *1; //Quiero 1 Insumos con el codigo MB001
                                break;
                           
                        }
                    }           
                }//End for "i"                
            }//End for "x" 
        double subTotal = cantInsRAM + cantInsHDD + cantInsCASE + cantInsFUENTE + cantInsGPU + cantInsCPU + cantInsMB;
       Presupuesto P1_Aux = new ArmadoPc("PSTO#001", precioManoObra, subTotal, 0.0, precioManoObra, "001", "Tobias", "Modding");
        
        
        
        
        
        
    }//End main
}//End class

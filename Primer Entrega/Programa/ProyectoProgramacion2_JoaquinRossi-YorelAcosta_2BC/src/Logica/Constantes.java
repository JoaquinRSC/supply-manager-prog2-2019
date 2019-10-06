//@authors: | Joaquin_Rossi | Yorel_Acosta | 2°BC | ESI-BUCEO
package Logica;

public class Constantes {
    //---------------------------------------------------------Insumo:
    public static final String idIns = "A0";
    public static final String descripcion = "Componente";
    public static final double precioIns = 1.0; //USD
    public static final double precioBase = 1.0; //USD
    public static final int cantIns = 1; //USD

    //---------------------------------------------------------Presupuesto:
    public static final String idPresupuesto = null;
    public static final String idCliente = null;
    public static final String nomCliente = null;
    public static final double subTotal = 0.0; //USD; Es el Precio por la cantidad 
    public static final double total = 1.0; //USD
    public static final double manoObra = 0.30; //USD
    public static final double horasTrabajadas = 0.30; //Horas: 1.30= 1H y 30M

    //---------------------------------------------------------ArmadoRed:
    public static final String dataPlan = "Estandar"; //El cual esta asociado con los valores: ParaBajada=60 ParaSubida=10 [en Mbits/seg]
    public static final String speedUp = "10"; //Unidad en Mb/s
    public static final String speedDown = "60"; //Unidad en Mb/s
    public static final String isp = "Antel"; //ISP = Proveedor de la coneccion al Internet
    public static final int cantRouters = 1;
    public static final double tiradasCable = 1.0; //Unidad en metros
    
    //---------------------------------------------------------ArmadoPc:
    public static final String proposito = "Workstation"; //Puede ser [Gaming;Standar]
    
    //---------------------------------------------------------Hardware:
    public static final String modelo = null;
    public static final String fabricante = null;
    public static final String techRAM = "DDR3"; //Tambien puede ser DDR4
    public static final int capacidadRAM = 512; //Unidad en MB
    public static final int frecRAM = 1333; //Unidad en MHz
    public static final short fromFactorCase = 3; //Puede ser [1=Rack;2=Modding;3=Sobremesa;4=Mini Torre]
    public static final int wattsFuente = 500; //Unidad en watts
    public static final int capacidadHDD = 1000; //Unidad en GB 1TB = 1000GB
    public static final String techHDD = "HDD";
    public static final short capaciadGrafica = 1; //Unidad en GB
    public static final int nucleoCPU = 1; //Es la cantidad de nucleos que pude tener un CPU
    public static final double frecCPU = 1.0; //Es la frecuencaia de un CPU medidad en GHz
    public static final boolean rgbMB = false;
            
    
    //---------------------------------------------------------Software:
    public static final boolean pago = true;
    public static final String version = "10:Pro";
    public static final String desarrollador = "Windows";
    
    

}// End class

//@authors: | Joaquin_Rossi | Yorel_Acosta | 2°BC | ESI-BUCEO
package Logical;

public class Hardware extends InsumoInformatico {
    //ATRIBUTOS:
    private String marca = Constantes.fabricante;
    private String modelo = Constantes.modelo;
    private String techRAM = Constantes.techRAM;
    private short fromFactorCase = Constantes.fromFactorCase;
    private int frecRAM = Constantes.frecRAM;
    private int capacidadRAM = Constantes.capacidadRAM;
    private int wattsFuente = Constantes.wattsFuente;
    private int capacidadHDD = Constantes.capacidadHDD;
    private String techHDD = Constantes.techHDD;
    private short capaciadGrafica = Constantes.capaciadGrafica;
    private int nucleoCPU = Constantes.nucleoCPU;
    private double frecCPU = Constantes.frecCPU;
    private boolean rgbMB = Constantes.rgbMB;

    //CONSTRUCTOR: MEMORIA RAM
    public Hardware(String idInsumo, String descripcion, double precioIns,double precioBase,int frecRAM,int capacidadRAM,String marca,String techRAM, String modelo) {
        super(idInsumo, descripcion, precioIns,precioBase);
        this.precioIns=calcularPrecioRAM(techRAM,capacidadRAM,frecRAM,precioBase);
        this.frecRAM = frecRAM;
        this.capacidadRAM = capacidadRAM;
        this.marca = marca;
        this.techRAM = techRAM;
        this.modelo = modelo;
    }// End constructor MEMORAIA RAM
    
    //CONSTRUCTOR: MEMORIA HDD
    public Hardware(String idInsumo, String descripcion, double precioIns,double precioBase,int capacidadHDD, String techHDD,String marca, String modelo) {
        super(idInsumo, descripcion, precioIns,precioBase);
        this.precioIns=calcularPrecioHDD(capacidadHDD,techHDD,precioBase);
        this.techHDD = techHDD;
        this.capacidadHDD = capacidadHDD;
        this.marca = marca;
        this.modelo = modelo;
    }// End constructor MEMORIA HDD

    //CONSTRUCTOR: CASE
    public Hardware(String idInsumo, String descripcion, double precioIns,double precioBase,short fromFactorCase, String marca, String modelo) {
        super(idInsumo, descripcion, precioIns,precioBase);
        this.precioIns = calcularPrecioCASE(fromFactorCase,precioBase);
        this.fromFactorCase = fromFactorCase;
        this.marca = marca;
        this.modelo = modelo;
    }// End constructor CASE
    
    //CONSTRUCTOR: FUENTE
    public Hardware(String idInsumo, String descripcion, double precioIns,double precioBase,String marca, String modelo, int wattsFuente) {
        super(idInsumo, descripcion, precioIns,precioBase);
        this.precioIns = calcularPrecioFUENTE(wattsFuente,precioBase);
        this.marca = marca;
        this.modelo = modelo;
        this.wattsFuente = wattsFuente;
    }// End constructor FUENTE
    
    //CONSTRUCTOR: GPU
    public Hardware(String idInsumo, String descripcion, double precioIns,double precioBase,String marca,short capaciadGrafica,String modelo) {
        super(idInsumo, descripcion, precioIns,precioBase);
        this.precioIns = calcularPrecioGPU(capaciadGrafica,precioBase);
        this.marca = marca;
        this.capaciadGrafica=capaciadGrafica;
        this.modelo = modelo;
    }// End constructor GPU
    
    //CONSTRUCTOR: CPU
    public Hardware(String idInsumo, String descripcion, double precioIns,double precioBase,String marca,int nucleoCPU,double frecCPU,String modelo) {
        super(idInsumo, descripcion, precioIns,precioBase);
        this.marca = marca;
        this.nucleoCPU = nucleoCPU;
        this.frecCPU = frecCPU;
        this.modelo = modelo;
    }// End constructor CPU
    
    //CONSTRUCTOR: MB
    public Hardware(String idInsumo, String descripcion, double precioIns, double precioBase, boolean rgbMB) {
        super(idInsumo, descripcion, precioIns, precioBase);
        this.rgbMB = rgbMB;
    }
    
    
    //GETTERS:
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }

    //SETTERS:
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    //LIBRERIA DE COMPORTAMIENTOS:

    //METODOS PARA INDICAR EL VALOR DE UN INSUMO EN FUNCION A SUS VALORES DE LOS ATRIBUTOS
        //EJEMPLO: RAM (x1) DDR3|2GB|1333Mhz|
        //                  +11 |+4 |  +14  | = 29USD (Valores caracteristicas) + precioBase de una [x1] RAM = 40USD
        //         TOTAL= (29 + 40) * IVA

    
    public double calcularPrecioRAM(String techRAM, int capacidadRAM, int frecRAM, double precioBase) {
        double precioTotal = 0.0;
        double aumentoPrecioTech = 0.0;
        double aumentoPrecioCapacidad = 0.0;
        double aumentoPrecioFrec = 0.0;

        //SEGUN LA TECNOLOGIA:
        switch (techRAM) {
            case "DDR3":
                aumentoPrecioTech=18.0;
                break;
            case "DDR4":
                aumentoPrecioTech=25.0;
                break;
            default:
                aumentoPrecioTech=18.0;
                break;
        }// End SW "techRAM"
        
        //SEGUN LA CAPACIDAD:
        switch (capacidadRAM) {
            case 4:
                aumentoPrecioCapacidad=14.0;
                break;
            case 8:
                aumentoPrecioCapacidad=18.0;
                break;
            case 16:
                aumentoPrecioCapacidad=36.0;
                break;
                
            default:
                aumentoPrecioCapacidad=14.0;
                break;
        }// End SW "capacidadRAM"        
        
         //SEGUN LA FRECUENCIA:
        switch (frecRAM) {
            case 1600:
                aumentoPrecioFrec=9.0;
                break;
            case 1866:
                aumentoPrecioFrec=12.0;
                break;
            case 2400:
                aumentoPrecioFrec=20.0;
                break;
            case 2666:
                aumentoPrecioFrec=25.0;
                break;    
            case 3000:
                aumentoPrecioFrec=36.0;
                break;               
            default:
                if (techRAM.equals("DDR3"))aumentoPrecioFrec=9.0;
                if (techRAM.equals("DDR4"))aumentoPrecioFrec=20.0;
                break;
        }// End SW "frecRAM"         
        precioTotal= (aumentoPrecioTech + aumentoPrecioCapacidad + aumentoPrecioFrec + precioBase) * 0.21;
        return precioTotal;
    }// End method
    public double calcularPrecioHDD(int capacidadHDD,String techHDD,double precioBase) {
        double precioTotal = 0.0;
        double aumentoPrecioTech = 0.0;
        double aumentoPrecioCapacidad = 0.0;
        //SEGUN LA TECNOLOGIA:
        switch (techHDD) {
            case "HDD":
                aumentoPrecioTech=8.0;
                break;
            case "SSD":
                aumentoPrecioTech=12.0;
                break;
            case "M2":
                aumentoPrecioTech=18.0;
                break;
            case "EXT":
                aumentoPrecioTech=22.0;
                break;
            default:
                aumentoPrecioTech=8;
        }// End SW "techHDD"

        //SEGUN LA CAPACIDAD:
        switch (capacidadHDD) {
            case 160:
                aumentoPrecioCapacidad=10.0;
                break;
            case 250:
                aumentoPrecioCapacidad=14.0;
                break;
            case 360:
                aumentoPrecioCapacidad=20.0;
                break;
            case 500:
                aumentoPrecioCapacidad=22.0;
                break;
            case 1000:
                aumentoPrecioCapacidad=35.0;
                break;
            case 2000:
                aumentoPrecioCapacidad=42.0;
                break;
            case 4000:
                aumentoPrecioCapacidad=48.0;
                break;
            default:
                aumentoPrecioCapacidad=10.0;
                break;
        }// End SW "capacidadHDD"
        
        precioTotal=(aumentoPrecioTech + aumentoPrecioCapacidad + precioBase) * 0.21;
        return precioTotal;
    }// End method
    public double calcularPrecioCASE(short fromFactorCase, double precioBase) {
        double precioTotal = 0.0;
        double aumentoPrecioFromF = 0.0;    
        switch (fromFactorCase) {
            case 1://Sobremesa
                aumentoPrecioFromF = 19.0;  
                break;
            case 2://Modding
                aumentoPrecioFromF = 24.99;  
                break;
            case 3://Rack
                aumentoPrecioFromF = 17.89;  
                break;
            case 4://Minitorre
                aumentoPrecioFromF = 11.19;  
                break;                
        }//End SW "fromFactorCase"
                
        precioTotal=(aumentoPrecioFromF + precioBase) * 0.21;
        return precioTotal;
    }// End method
    public double calcularPrecioFUENTE(int wattsFuente, double precioBase){
        double precioTotal = 0.0;
        double aumentoPrecioWatts = 0.0; 
        
        //SEGUN EL WATAJE:
        switch (wattsFuente) {
            case 500:
                aumentoPrecioWatts = 15.0;
                break;
            case 650:
                aumentoPrecioWatts = 18.0;
                break;
            case 850:
                aumentoPrecioWatts = 33.0;
                break;
            case 1000:
                aumentoPrecioWatts = 49.0;
                break;
            default:
                aumentoPrecioWatts = 15.0;
                break;
        }// End SW "wattsFuente"
        precioTotal=(aumentoPrecioWatts + precioBase) * 0.21;
        return precioTotal;
    }//End method
    public double calcularPrecioGPU(short ){
        double precioTotal = 0.0;
        double aumentoPrecioWatts = 0.0; 
        
        precioTotal=(aumentoPrecioWatts + precioBase) * 0.21;
        return precioTotal;
    }//End method
    
}// End class

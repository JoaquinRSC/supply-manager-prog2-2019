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
    private int capacidadAlmacenamiento = Constantes.capacidadAlmacenamiento;
    private int capaciadGrafic = 1;
    private int nucleoCPU = Constantes.nucleoCPU;
    private double frecCPU = Constantes.frecCPU;
    private boolean rgbMB = Constantes.rgbMB;

    //CONSTRUCTOR: MEMORIA RAM
    public Hardware(String idInsumo, String descripcion, double precioIns,double precioBase,int frecRAM,int capacidadRAM,String marca,String techRAM, String modelo) {
        super(idInsumo, descripcion, precioIns,precioBase);
        this.precioIns=calcularPrecioRAM(techRAM,capacidadRAM,frecRAM);
        this.techRAM = techRAM;
        this.frecRAM = frecRAM;
        this.capacidadRAM = capacidadRAM;
        this.marca = marca;
        this.modelo = modelo;
    }// End constructor MEMORAIA RAM
    
    //CONSTRUCTOR: MEMORIA HDD
    public Hardware(String idInsumo, String descripcion, double precioIns,double precioBase,int capacidadAlmacenamiento,String marca, String modelo) {
        super(idInsumo, descripcion, precioIns,precioBase);
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.marca = marca;
        this.modelo = modelo;
    }// End constructor MEMORIA HDD

    //CONSTRUCTOR: CASE
    public Hardware(String idInsumo, String descripcion, double precioIns,double precioBase,short fromFactorCase, String marca, String modelo) {
        super(idInsumo, descripcion, precioIns,precioBase);
        this.fromFactorCase = fromFactorCase;
        this.marca = marca;
        this.modelo = modelo;
    }// End constructor CASE
    
    //CONSTRUCTOR: FUENTE
    public Hardware(String idInsumo, String descripcion, double precioIns,double precioBase,String marca, String modelo, int wattsFuente) {
        super(idInsumo, descripcion, precioIns,precioBase);
        this.marca = marca;
        this.modelo = modelo;
        this.wattsFuente = wattsFuente;
    }// End constructor FUENTE
    
    //CONSTRUCTOR: GPU
    public Hardware(String idInsumo, String descripcion, double precioIns,double precioBase,String marca,int capacidadGrafic,String modelo) {
        super(idInsumo, descripcion, precioIns,precioBase);
        this.marca = marca;
        this.capaciadGrafic=capacidadGrafic;
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

    
    public double calcularPrecioRAM(String techRAM, int capacidadRAM, int frecRAM) {
        
        
        
        
        
        
        return 1.0;
    }
    
    
    
}// End class

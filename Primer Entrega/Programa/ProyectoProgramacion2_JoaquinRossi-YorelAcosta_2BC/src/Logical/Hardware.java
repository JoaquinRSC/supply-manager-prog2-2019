//@authors Joaquin_Rossi,Yorel_Acosta | 2°BC
package Logical;

public class Hardware extends InsumoInformatico {
    //ATRIBUTOS:
    private String marca = Constantes.fabricante;
    private String modelo = Constantes.modelo;

    //CONSTRUCTOR:
    public Hardware(String idInsumo, String descripcion, double precioIns,String marca, String modelo) {
        super(idInsumo, descripcion, precioIns);
        this.marca = marca;
        this.modelo = modelo;
    }// End constructor completo

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
    
    
    
}// End class

package POO_Electrodomesticos;

public class Televisor extends Electrodomestico{
	private int resolucion = K.resolucion;
	private boolean sintonizadorTDT = K.sintonizadorTDT;
	
	public Televisor() {
		super();	
	}//end
	public Televisor(int preccioBase, int peso) {
		super(preccioBase, peso);
	}//end
	public Televisor(int resolucion, boolean sintonizador ,int precioBase, int peso, String color, char consumoEnergetico) {
		super(precioBase, peso, color, consumoEnergetico);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizador;
		int Televisor = precioFina(consumoEnergetico, peso);
	}//end

//-----------------------
	//------------GETER
	public int getResolucion() {
		return resolucion;
	}
	public boolean getSintonizadorTDT( ) {
		return sintonizadorTDT;
	}
//-----------------------
	//------------SETER
//-----------------------

	@Override
	public int precioFina(char letra, int pesos) {
		int precioResol = 0, precioTDT = 0, precioTelevisor=0;

		if ( resolucion == 30 && sintonizadorTDT == true) {
			precioTelevisor= (int) (precioTelevisor * 0.30) + 50; 
		}

		return super.precioFina(letra, pesos) + precioTelevisor;
	}




}//end class

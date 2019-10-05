package POO_Electrodomesticos;

public class Lavadora extends Electrodomestico {
	private int carga = K.carga;

	public Lavadora() {
		super();
		
	}
	public Lavadora(int preccioBase, int peso) {
		super(preccioBase, peso);
		
	}
	public Lavadora(int carga, int precioBase, int peso, String color, char consumoEnergetico) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;
	}

//-----------------------
	//------------GETER
	public int getCarga() {
		return carga;
	}
//-----------------------
	//------------SETER
//-----------------------
	

	@Override
	public int precioFina(char letra, int pesos) {
		int precioCarga = 0;
		if (carga > 30) {
			precioCarga = 50;
		} else {
			precioCarga = 0;
		}
		
		return  super.precioFina(letra, pesos) + precioCarga;
	}
	
	
}//end class Lavadora

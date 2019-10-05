package POO_Electrodomesticos;

import java.util.*;

public class Electrodomestico {
	protected int precioBase = K.precio;
	protected int peso = K.peso;
	protected String color = K.color;
	protected char consumoEnergetico = K.gradoConsumo;
	
	
	public Electrodomestico () { //Constructor Vacio	
	}
	public Electrodomestico (int preccioBase, int peso) { //Constructor con Precio y Peso
		this.precioBase = preccioBase;
		this.peso = peso;
	}
	public Electrodomestico(int precioBase, int peso, String color,char consumoEnergetico) { // Constructor Completo
		this.precioBase = precioBase;
		this.color = color;
		int precioFin = precioFina(consumoEnergetico,peso);
	}



//-----------------------
	//------------GETER
	public String getColor() {
		return color;
	}
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public int getPeso() {
		return peso;
	}
	public int getPrecioBase() {
		return precioBase;
	}
//-----------------------
	//------------SETER
//-----------------------	
	//------------METHOD
	public int a(char letra){
		char letraUser='0';
		
		if (letra< 'A' || letra>'F'){
			letraUser = K.gradoConsumo;
			
		}
		
		return letraUser;
	}//end Method comprobarConsumoEnergetico
	
	public int precioFina(char letra, int pesos){
		int precioFin=0;
		int precioConsumo=0;
		int precioPeso=0;
		switch (letra) {
		case 'A':
			precioConsumo = 100;
			break;
		case 'B':
			precioConsumo = 80;
			break;
		case 'C':
			precioConsumo = 60;
			break;
		case 'D':
			precioConsumo = 50;
			break;
		case 'E':
			precioConsumo = 30;
			break;
		case 'F':
			precioConsumo = 10;
			break;
		default: 
			letra=K.gradoConsumo;
			precioConsumo = 10;
			break;
		}//end sw letra
		
		if (pesos >= 0 && peso <= 19){
			precioPeso = 10;	
		}
		if (pesos >= 20 && peso <= 49){
			precioPeso = 50;	
		}
		if (pesos >= 50 && peso <= 79){
			precioPeso = 80;	
		}
		if (pesos >= 80){
			precioPeso = 100;	
		}
		precioFin = K.precio + precioConsumo + precioPeso;
		return precioFin;
	}//end method PrecioFina
	
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", peso=" + peso + ", color=" + color
				+ ", consumoEnergetico=" + consumoEnergetico + "]";
	}

	


	
	
	
}//end Class Electrodomestico

package POO_Electrodomesticos;
import java.util.*;

public class Exe {
	public static void main(String[] args) {
		
		ArrayList <Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
		
		
		
		
		//ELECTRODOMESTICO
		Electrodomestico E1 = new Electrodomestico(70,50,"azul",'B'); 
		Electrodomestico E2 = new Electrodomestico(10,25,"rojo",'V');
		Electrodomestico E3 = new Electrodomestico(12,5,"Violeta",'K'); 
		//LAVADORA
		Lavadora L1 = new Lavadora(7,60,40,"Amarillo",'J');
		Lavadora L2 = new Lavadora(66,32,61,"Morado",'H');
		Lavadora L3 = new Lavadora(8,2,100,"Cián",'H');
		//TELEVISOR
		Televisor T1 = new Televisor(42,false,216,10,"Plateado",'Z');
		Televisor T2 = new Televisor(92,true,430,20,"Azul",'A');
		Televisor T3 = new Televisor(55,false,170,15,"Ccarmesí",'D');
		Televisor T4 = new Televisor(22,true,43,15,"Negro",'E');
		
		
		
		
		electrodomesticos.add(E1);
		electrodomesticos.add(E2);
		electrodomesticos.add(E3);
		electrodomesticos.add(L1);
		electrodomesticos.add(L2);
		electrodomesticos.add(L3);
		electrodomesticos.add(T1);
		electrodomesticos.add(T2);
		electrodomesticos.add(T3);
		electrodomesticos.add(T4);
		
		for (int i=0 ; i < 10 ; i++) {
			electrodomesticos[i];
		}
	}//end main
}

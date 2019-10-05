package RepartidoProgII_Ejercicio2.ModeloBanco;

public class auxiliar {

	/*
	System.out.println("| - - - - - - - - - - - - - - - - - - - - - -  - - - - - - |");
	System.out.println("|                DATOS DEL CLIENTE ALMACENADOS             |");
	System.out.println("| - - - - - - - - - - - - - - - - - - - - - - - - - - - -  |");
	System.out.println("|                                                          |");
	System.out.println("|               Ahora procederemos a tomar los             |");
	System.out.println("|               datos para su cuenta bancaria:             |");
	do {
	System.out.println("| -------------------------------------------------------- |");
	System.out.println("|           [/] Indique que tipo de cuenta quiere:         |");
	System.out.println("|  Cuenta Corriente || Cuenta Vivienda || FondoInversión   |");
	System.out.println("|     (  1  )              (  2  )           (  3  )       |");
	System.out.print  ("| Escoga un tipo de Cuenta con los números que aparecen: "   );
	opCuentaBancaria=sc.next().charAt(0);
	System.out.println("|[]------------------------------------------------------[]|");
	
		switch (opCuentaBancaria){
	case '1':
			cuenta.setInteresCuenta(0.1);
			comisionCuenta=0.6;
		break;
	case '2':
		interesCuenta=0.2;
		comisionCuenta=0.6;
		break;
	case '3':
		interesCuenta=0.34;
		comisionCuenta=0.6;
		break;
	default:
		System.out.println("| ---");
		System.out.println("| Opción ingresada no válida. |");
		System.out.println("| ---");
		break;
	}//end SW opCuentaBancaria.
	} while (opCuentaBancaria != '1' || opCuentaBancaria != '2' || opCuentaBancaria != '3');
	
	do {
	System.out.println("|                                                           |");
	System.out.println("| Desea ver la información detallada de cada Cuenta Bancaria:");
	System.out.println("|   1) Si, quiero ver los valores de comisión e intereses.  |");
	System.out.println("|   2) No, ya conozco los valores de comisión e interes.    |");
	System.out.print  ("|  [/] Su opción: ");
	opInfoCuenta=sc.next().charAt(0);
	System.out.println("|[]-------------------------------------------------------[]|");
		switch (opInfoCuenta) {
	case '1':
	System.out.println(" ");	
	System.out.println("|-----------------------[ INFORMACIÓN ]--------------------|");
	System.out.println("| [CUENTA CORRIENTE] :                                     |");
	System.out.println("|               [#]El valor de la Comisíon actual es: 0,6€ |");
	System.out.println("|               [#]El valor del interés es de: 0,1€        |");
	System.out.println("| [CUENTA VIVIENDA]  :                                     |");
	System.out.println("|               [#]El valor de la Comisíon actual es: 0,6€ |");
	System.out.println("|               [#]El valor del interés es de: 0,2€        |");
	System.out.println("| [FONDO INVERSION]  :                                     |");
	System.out.println("|               [#]El valor de la Comisíon actual es: 0,6€ |");
	System.out.println("|               [#]El valor del interés es de: 0,34€       |");
	System.out.println("|[]------------------------------------------------------[]|");
	System.out.println(" ");
		break;
		
	case '2'://Hacer nada.
		System.out.println(" ");
		System.out.println(" ");
		break;
	default:
		System.out.println("| ---");
		System.out.println("Opción ingresada no reconocida.");
		System.out.println("| ---");
		break;
	}//end switch opInfoCuenta
	} while (opInfoCuenta != '1' || opInfoCuenta != '2' );
	do {	
	System.out.println("|                                                          |");
	System.out.println("|           [/] Indique que tipo de moneda quiere:         |");
	System.out.println("|         Dolar Americano || Euros || Peso Uruguayo        |");
	System.out.println("|             (  1  )       (  2  )     (  3  )            |");
	System.out.print  ("| Escoga un tipo de Moneda con los números que aparecen: "   );
	opTipoMoneda = sc.next().charAt(0);
	System.out.println("|[]------------------------------------------------------[]|");
		switch (opTipoMoneda){
		case '1':
			monedaCuenta="USD";
			break;
		case '2':
			monedaCuenta="U$$";
			break;
		case '3':
			monedaCuenta="€";
			break;
		default:
			System.out.println("| ---");
			System.out.println("| Opción ingresada no válida. |");
			System.out.println("| ---");
			break;
		}//end SW opCuentaBancaria.	
	} while (opTipoMoneda != '1' || opTipoMoneda != '2' || opTipoMoneda != '3');
	System.out.println("| ---------------------[PIN DE SEGURIDAD]----------------- |");	
	System.out.println("|                                                          |");
	System.out.println("|        A continuación ingrese un código de seguridad     |");
	System.out.println("|                   para su cuenta bancaria.               |");
	System.out.print  ("|      Registre un nuevo PIN: ");
	pinCuenta=sc.nextInt();
	System.out.println("|                                                          |");
	cliente.getCuentas().add(cuenta);
	*/
	
	
	
	
	
	
	/*
	short pinCliente=0;
	do {
	System.out.println(" ");	
	System.out.println(" | -------------------------------------------------SISTEMA|");	
	System.out.println(" |               Ingrese su número de PIN:                 |");
	System.out.print  (" |               Número PIN: ");
	pinCliente=sc.nextShort();
	System.out.println(" |---------------------------------------------------------|");
	System.out.println(" ");
	
	if ( pinCliente == numPin ) {
		System.out.println(" | --");
		System.out.println(" | Vienvenido al Sistema " + cliente.getNomCliente() + " |");
		System.out.println(" | --");
	} else {
		System.out.println(" | --");
		System.out.println(" | El PIN: '" + pinCliente + "' no se reconoció en el Sistema. |");
		System.out.println(" | Por favor, intente nuevamente: ");
		System.out.println(" | --");
	}//end if
	}while ( pinCliente != numPin);
	*/
	
	
}

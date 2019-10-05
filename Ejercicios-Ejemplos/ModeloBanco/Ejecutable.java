package RepartidoProgII_Ejercicio2.ModeloBanco;

/*
 * @Author YorelAcosta
*/


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Ejecutable {
	public static ArrayList <Cliente> clientes = new ArrayList <Cliente>(); 
	public static ArrayList<Cuenta> cuentas= new ArrayList<Cuenta>();
	
	public static String mensajeError = "\n La cédula y/o contraseña no son válidas. \n"; 
	public static String mensajeError2= "\n Dato ingresado no registrado. \n";
	
	public static void main(String[] args) {
		menuInicio();
	}//end Main
	
    
	//---------------------------------------------------------------------------------------
    public static int menuInicio() {
        int opcion = 0;
        do{
            String[] opciones = {"Iniciar sesión", "Registrar nuevo usuario"};
            opcion = menuGenerico("MENU DE INICIO", opciones, "Salir del Programa");

            switch(opcion){
                case 1: menuInicioSesion(); break;
                case 2: menuRegistroUsuario(); break;
                case 0: break;
            }
        } while(opcion != 0);
        return opcion;
    }//end method

    //---------------------------------------------------------------------------------------
    public static void menuInicioSesion(){
    	
        String[] parametros = {"Cédula", "Contraseña"};
        String[] valores = menuParametros(parametros);
        boolean valido=false;
        
        int cedula = Integer.parseInt(valores[0]);
        String contraseña = valores[1];
        
        valido = verificarSesion(cedula,contraseña,clientes);
        if(valido == true){
        	System.out.println("");
        	System.out.println(" Has iniciado sesión correctamente.");
        	menuOperaciones(cedula);
        } else {
        	System.out.println(mensajeError);
        }//end if
        
       
    }//end method

    //---------------------------------------------------------------------------------------
    public static void menuRegistroUsuario(){
    	
    	//me tomo todos los valores para String y luego cuando lo almacene en los atributos del ojecto cliente
    	//los paso a numero entero (en caso de que lo necesite)
    	
        String[] parametros = {"Cédula:", "Nombre:", "Apellido:", "Teléfono:", "Ciudad:", "Calle:", "Nro puerta:", "Contraseña:"};
        String[] valores = menuParametros(parametros);
        
        Cliente cliente = new Cliente();
        cliente.setCi(Integer.parseInt(valores[0])); //paso el valor de la cedula a enteros ya que si me introducen un caracter no alfanumérico mi programa se cierra.
        cliente.setNombre(valores[1]);
        cliente.setApellido(valores[2]);
        cliente.setTelefono(Integer.parseInt(valores[3]));
        cliente.setCiudad(valores[4]);
        cliente.setCalle(valores[5]);
        cliente.setNumPuerta(valores[6]);
        cliente.setContraseña(valores[7]);
        
        clientes.add(cliente); //agrego  el cliente a una coleccion de clientes llamada "clientes"
        System.out.println("");
        System.out.println("  Datos del cliente almacenados.");
    }//end method
    
    //---------------------------------------------------------------------------------------
    
    public static void menuOperaciones(int cedula){
    	int opcion=0;
    	 
    	
    	String [] opciones={"Crear una nueva cuenta.","Gestionar una cuenta."};    	
    	opcion=menuGenerico("MENU DE LA CUENTA", opciones,"Regresar al Menú Principal");
    
    	switch (opcion) {
		case 1:crearCuenta(cedula);break;
		case 2:menuInicioCuenta(cedula);break;
		case 0:break;
		default:System.out.println(mensajeError2); ;break;
		}
    	
    }//End method
    
    //---------------------------------------------------------------------------------------
    
    public static void crearCuenta(int cedula){
    	String[] parametros={"Tipo de Cuenta:","Moneda:","Saldo:","Nro código:"};
    	String[] valores=menuParametros(parametros);
    	
    	Cuenta cuenta=new Cuenta();
    	
    	char c=valores[0].charAt(0);
    	switch (c) {
		case 'c':valores[0]="Cuenta Corriente.";cuenta.setInteresCuenta(0.1);break;
		case 'C':valores[0]="Cuenta Corriente.";cuenta.setInteresCuenta(0.1);break;
		case 'v':valores[0]="Cuenta Vivienda.";cuenta.setInteresCuenta(0.2);break;
		case 'V':valores[0]="Cuenta Vivienda.";cuenta.setInteresCuenta(0.2);break;
		case 'f':valores[0]="Fondo Inversion.";cuenta.setInteresCuenta(0.34);break;
		case 'F':valores[0]="Fondo Inversion.";cuenta.setInteresCuenta(0.34);break;
		case ' ':System.out.println(mensajeError2);break;
		default:valores[0]="Cuenta Corriente.";cuenta.setInteresCuenta(0.1);break;
		}//end sw
    	
    	
    	char ch=valores[1].charAt(0);
    	switch (ch) {
		case 'd':valores[1]=" $$S";break;
		case 'D':valores[1]=" $$S";break;
		case 'e':valores[1]=" €";break;
		case 'E':valores[1]=" €";break;
		case 'p':valores[1]=" UYU";break;
		case 'P':valores[1]=" UYU";break;
		default:valores[1]=" UYU";break;
		}//end sw
    	
    	cuenta.setComisionCuenta(0.6);
    	cuenta.setTipoCuenta(valores[0]);
    	cuenta.setMonedaCuenta(valores[1]);
    	cuenta.setPinCuenta(valores[3]);
    	cuenta.setSaldoCuenta(Double.parseDouble(valores[2]));
    	
    	
    	Cliente cliente = obtenerCliente(cedula, clientes);
    	cuentas.add(cuenta);
    	cliente.setCuentas(cuentas);
    	System.out.println(" Datos de la cuenta almacenados.");
    	
    	menuOperaciones(cedula);
    }//end method
    
    //---------------------------------------------------------------------------------------

    public static void menuInicioCuenta(int cedula){
    	 
    	String[] parametros={" Código de la cuenta: "};
    	String[] valores=menuParametros(parametros);
    	
    	boolean valido= verificarCuenta(valores[0],cedula,clientes);
    	
    	if (valido){
    		menuGestionCuenta(valores[0],cedula);
    	} else {
    		System.out.println(mensajeError2);
    	}
    }//end method
    
    //---------------------------------------------------------------------------------------
    
    public static void menuGestionCuenta(String codigo,int cedula){
    	Scanner b = new Scanner(System.in);
    	
    	int opcion=0;
    	String[] opciones={"Ver toda la información de mi cuenta.","Ver el Saldo de la Cuenta.","Depositar dinero.","Retirar dinero."};
    	opcion=menuGenerico("GESTION DE LA CUENTA", opciones, "Regresar");
    	
    	Cuenta cuenta=obtenerCuenta(codigo, cedula, cuentas);
    	
    	
    	switch (opcion) {
		case 1:
			System.out.println("\n "+ cuenta.toString() +"\n ");
			menuGestionCuenta(codigo,cedula);
			break;
		case 2:
			double  revisionMensual=cuenta.revisionMensual(cuenta.getSaldo(), cuenta.getInteres(), cuenta.getComision());
			System.out.println("\n Le quedan aún: " + cuenta.getMoneda() + revisionMensual + " en el mes. \n ");
			menuGestionCuenta(codigo,cedula);
			break;
		case 3:
			System.out.print  (" [Monto a ingresar]: ");
			double ingresa=cuenta.depositarDinero(b.nextDouble());
			System.out.println("\n Su saldo actual es de: " + (cuenta.getMoneda()) + cuenta.depositarDinero(ingresa) + " . \n");
			menuGestionCuenta(codigo,cedula);
			break;
		case 4:
			System.out.print  (" [Monto a retirar]: ");
			double retirar=cuenta.retirarDinero(b.nextDouble());
			System.out.println("\n Se retiraron " + cuenta.getMoneda() + retirar +" de la cuenta. \n");
			menuGestionCuenta(codigo,cedula);
			break;
		case 0:break;
		default:
			System.out.println(mensajeError2);
			menuGestionCuenta(codigo,cedula);
			break;
		}
    	
    
    }//end method
    
    //---------------------------------------------------------------------------------------
		public static Cliente obtenerCliente(int cedula, ArrayList<Cliente> clientes){
			//met
			int i=0;
			boolean encontre = false;
			Cliente cliente = null;
			//recoro la coleccion de Clientes y verfico la cedula que me dan con la que se supone que debe estar en dicho cliente
			//cuando la encuentro cambio valor de "encontre" a verdadero y retorno el cliete que tiene esa cedula para luego trabajar con el
			while (i<clientes.size() && !encontre){
				//almaceno el objeto que esta en la pos 0 de clientes y lo guardo en un objeto aux llamado cliente
				cliente = clientes.get(i);
				if (cliente.getCi() == cedula){
					encontre = true;
				}//end if
			}//end while
			return cliente;
		}//end method.

		public static boolean verificarSesion(int cedula, String contraseña, ArrayList<Cliente> clientes){
			int i=0;
			boolean valido=false;
			Cliente cliente = obtenerCliente(cedula, clientes);
			if (cliente!=null){
				if (cliente.getContraseña().equals(contraseña)){
					valido = true;
				}
			}
			return valido;
		}//end method.
		
		public static Cuenta obtenerCuenta(String codigo, int cedula,ArrayList<Cuenta> cuentas){
			int i=0;
			boolean encontre = false;
			Cuenta cuenta = null;
			Cliente cliente=obtenerCliente(cedula, clientes);
			
			while (i<cuentas.size() && !encontre){
				cuenta = cuentas.get(i);
				if (cuenta.getPin().equals(codigo) && cliente.getCi() == cedula){
					encontre = true;
				}//end if
			}//end while
			
			return cuenta;
		}//end method
		
		
		public static boolean verificarCuenta(String codigo, int cedula, ArrayList<Cliente> clientes){
			Cliente cliente= obtenerCliente(cedula, clientes);
			Cuenta cuenta= obtenerCuenta(codigo, cedula, cuentas);
			boolean valido=false;
			if ( cuenta.getPin().equals(codigo) && cliente.getCi() == cedula){
				valido=true;
			}
			return valido;
		}//end method

		//---------------------------------------------------------------------------------------
		

	    //*********************************************************************************************
	    //  FUNCIONES GENERICAS PARA MOSTRAR/PEDIR INFORMACION
	    //*********************************************************************************************

	    public static int menuGenerico(String titulo, String[] opciones, String opcionRetorno){

	        Scanner b = new Scanner(System.in);
	        int opcion = 0;
	        //Se imprime los menúes genéricos:
	        System.out.println("");
	        System.out.println(" ======================================= ");
	        System.out.println("   " + titulo);
	        System.out.println(" ======================================= ");	        
	        //Se imprime las opciones de los menúes:
	        System.out.println("");
	        for (int i=1; i<=opciones.length; i++){
	            System.out.println(" [ " + i + " ] - " + opciones[i-1]);
	        }
	        System.out.println(" [ 0 ] - " + opcionRetorno);

	        System.out.println("");
	        System.out.print  (" [ Escoja una opción: ");

	        opcion = b.nextInt();

	        return opcion;
	    }//end method

	    //---------------------------------------------------------------------------------------

	    public static String[] menuParametros(String[] parametros){

	        Scanner b = new Scanner(System.in);
	        String[] valores = new String[parametros.length];

	        System.out.println("");
	        System.out.println(" ======================================= ");
	        System.out.println("   Ingrese la siguiente información");
	        System.out.println(" ======================================= ");

	        System.out.println("");
	        for (int i=0; i<parametros.length; i++){
	            System.out.print(" [ "+ parametros[i] + " ]: ");
	            valores[i] = b.nextLine();
	        }

	        return valores;
	    }//end method

	    //---------------------------------------------------------------------------------------

	    
	    public static void menuTexto(String titulo, String texto){

	        Scanner b = new Scanner(System.in);
	        String opcion = null;

	        System.out.println("");
	        System.out.println(" ======================================= ");
	        System.out.println("  " + titulo);
	        System.out.println(" ======================================= ");
	        System.out.println(" ");

	        System.out.println(texto);
	        System.out.println(" ");

	        System.out.println(" [ 0 ] - Volver");

	        System.out.println("");
	        System.out.print  (" Escoja una opción: ");
	        opcion = b.next();

	    }//end method


}//end calss Ejecutable

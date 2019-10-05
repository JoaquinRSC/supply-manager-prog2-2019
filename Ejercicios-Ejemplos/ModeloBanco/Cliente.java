package RepartidoProgII_Ejercicio2.ModeloBanco;

import java.util.ArrayList;

/*
 * @Author YorelAcosta
*/

public class Cliente {
	private int ci=C.CI;
	private int telefono=C.TELEFONO;
	private String numPuerta=C.NUM_PUERTA;
	private String nombre=C.NOMBRE;
	private String apellido=C.APELLIDO;
	private String ciudad=C.CIUDAD;
	private String calle=C.CALLE;
	private String contraseña=C.CONTRASEÑA;
	private ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>(); 
	
	public Cliente () {
	}
	
//------------------------------------------------------
	//------------SETER & GETER-------------------------
	public ArrayList<Cuenta> getCuenta() {
		return cuentas;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getNumPuerta() {
		return numPuerta;
	}
	public void setNumPuerta(String numPuerta) {
		this.numPuerta = numPuerta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	//---------FUNCIONES
	

	
}//end class Cliente

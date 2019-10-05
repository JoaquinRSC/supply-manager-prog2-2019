package RepartidoProgII_Ejercicio2.ModeloBanco;

/*
 * @Author YorelAcosta
*/

public class Cuenta {
	private String tipoCuenta=C.CUENTA;
	private String moneda=C.MONEDA;
	private String pin=C.PIN;
	private double saldo=C.SALDO;
	private double interes=C.INTERES;
	private double comision=C.COMISION;
	
	
	public Cuenta () {   //Constructor Vacío.

	}
	
//---------------------
//-------------GETER
	public double getComision() {
		return comision;
	}
	public double getInteres() {
		return interes;
	}
	public double getSaldo() {
		return saldo;
	}
	public String getTipo() {
		return tipoCuenta;
	}
	public String getMoneda() {
		return moneda;
	}
	public String getPin() {
		return pin;
	}
//---------------------
//-------------SETER	
	public void setPinCuenta(String pinCuenta) {
		this.pin = pinCuenta;
	}
	public void setComisionCuenta(double comision) {
		this.comision = comision;
	}
	public void setInteresCuenta(double interes) {
		this.interes = interes;
	}
	public void setSaldoCuenta(double saldo) {
		this.saldo = saldo;
	}
	public void setTipoCuenta(String tipo) {
		this.tipoCuenta = tipoCuenta;
	}
	public void setMonedaCuenta(String moneda) {
		this.moneda = moneda;
	}
//---------------------
//---------FUNCIONES
	public double revisionMensual(double saldo, double interes, double comision){
		double saldoMensual= ((saldo + interes) - comision) ; 
		return saldoMensual;
	}//end method
	
	public double retirarDinero(double cantRetira){
		if ( this.saldo > cantRetira ){
			this.saldo= this.saldo-cantRetira;
		} else {
			cantRetira=0;
		}
		return cantRetira;
	}//end method

	public double depositarDinero(double cantIngreso){
		double deposita=0.0;
		deposita= (cantIngreso + this.saldo);
		this.saldo= deposita;
		return deposita;
	}//end method
	
	@Override
	public String toString() {
		return "\n | TIPO DE CUENTA: " + tipoCuenta + "\n | MONEDA: " + moneda +"\n | PIN: " + pin + "\n | SALDO: " + saldo + "\n | INTERES:" + interes + "\n | COMISION:" + comision ;
	}
	
}//end class Cuenta

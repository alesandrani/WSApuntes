package _08_Visibilidades.relaciones;

public class cuentaBancaria {
	private String iban;
	private double saldo;
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public cuentaBancaria() {
		super();
	}
	@Override
	public String toString() {
		return "cuentaBancaria [iban=" + iban + ", saldo=" + saldo + "]";
	}
	
	
	
}

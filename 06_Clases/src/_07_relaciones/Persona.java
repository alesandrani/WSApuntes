package _07_relaciones;

import java.util.Arrays;

public class Persona {
	String nombre;
	int edad;
	double peso;
	boolean estaCasado;
	Direccion direccion;
	cuentaBancaria[] cuentasBancarias;// 1- N
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", estaCasado=" + estaCasado
				+ ", direccion=" + direccion + ", cuentasBancarias=" + Arrays.toString(cuentasBancarias) + "]";
	}
	
	
	
}



package _01_basico;

public class Docente extends Persona {
	public double salario;
	public double calcularSalarioNeto() {
		double salarioNeto = salario * 0.85;
		return salarioNeto;
	}
}

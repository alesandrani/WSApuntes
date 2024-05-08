package _01_basico.vehiculos;

import java.util.Objects;

public abstract class VehiculoTerrestre {
	private double peso;
	private int numeroRuedas;
	private String matricula;
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehiculoTerrestre other = (VehiculoTerrestre) obj;
		return Objects.equals(matricula, other.matricula);
	}
	@Override
	public String toString() {
		return "VehiculoTerrestre [peso=" + peso + ", numeroRuedas=" + numeroRuedas + ", matricula=" + matricula + "]";
	}
	
	

}

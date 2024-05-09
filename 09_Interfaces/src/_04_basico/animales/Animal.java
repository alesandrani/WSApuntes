package _04_basico.animales;

import java.util.Objects;

import _04_basico.interfaz.Movible;

/*
 * Las clases abstractas so las clases que no se pueden instanciar.
 * Las utilizaremos para que otras clases se heredan de ellos y tambien
 * podemos usar sus referencias para poder uardar
 * cualquier objeto que extienda de esta clase y ademas para aplicar polimorfismo
 * 
 * Una clase abstracta puede tener o no metodos abstractos
 * pero en cuanto la clase tenga un solo metodo abstracto
 * la clase debe ser abstracta
 */
public abstract class Animal implements Movible {
	private Sexo sexo;
	private double peso;
	private int edad;
	private String nombre;
	
	/**
	 * Los metodos abstractos son metodos que sabemos que todos
	 * los objetos que hereden de esta clase lo tendran, pero el como 
	 * lo van a hacer corresponse a la implementacion del metodo de la clase hija
	 * 
	 * En este ejemplo sabemos que todos los animales pueden comer, pero lamentablemente
	 * todavia no sabemos como comen, por lo que respondera en la clases hijas implementar dicho metodo
	 * 
	 *A PARTIR DE AQUI HACEMOS DOCUMENTACION
	 *
	 * Este metodo hace que el animal gane peso segun la comida que reciba por 
	 * parametro
	 * @param o representa el objeto que se va a comer el animal
	 */
	public abstract void comer(Object o);
	// una clase abstracta puede tener metodos no abstractos

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre, peso, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso) && sexo == other.sexo;
	}

	@Override
	public String toString() {
		return "Animal [sexo=" + sexo + ", peso=" + peso + ", edad=" + edad + ", nombre=" + nombre + "]";
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}

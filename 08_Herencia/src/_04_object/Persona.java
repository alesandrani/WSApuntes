package _04_object;

import java.util.Objects;

/**
 * Las clases en java  heredan de la clase object
 * por lo tanto todas las clases van a heredar sus metodos
 */
public class Persona extends Object {//poner esto no importa,siempre se hereda de object
	private String nombre;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void presentarse() {
		System.out.println("Hola me llamo: " + nombre);
	}
}

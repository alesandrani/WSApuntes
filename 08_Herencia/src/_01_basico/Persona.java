package _01_basico;
/**
 * La herencia es una de las propiedades mas importantes que podemos encontrar en POO.
 * Mediante la herencia podemoa hacer que una clase tenga todos los atributos y metodos de otra.
 * La clase de la cual heredamos se llama la clase padre y la clase que hereda se llama clase "hija".
 * Es decir la clase "hija" tendra todos los atributos y metodos de la clase "padre".
 */
public class Persona {
	public String nombre;
	public int edad;
	
	public void presentarse() {
		System.out.println("Hola me llamo: " + nombre);
	}
}

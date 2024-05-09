package _05_listas;

import java.util.ArrayList;
import java.util.List;

import _04_basico.vehiculos.Coche;

public class Persona {
	private String nombre;
	//Si ponemos el tipo de atributo como la interface dejamos abierto
	//a que los programadores puedan poner el tipo de lista que quiera (ArrayList y LinkedList)
	//y no permitiendo solo un tipo
	
	//Es muy buena practica de programacion usar interfaces en lugar de clases concretas
	private List<Coche> listaCoches;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Coche> getListaCoches() {
		return listaCoches;
	}
	public void setListaCoches(List<Coche> listaCoches2) {
		this.listaCoches = listaCoches2;
	}
	

}

package _04_object;

import java.util.ArrayList;

public class MainObject {

	public static void main(String[] args) {
		//cin una referencia de tipo object podemos
		//apuntar a culquier object
		Object o = new Persona();
		o = new Alumno();
		o = new ArrayList<Docente>();
		o = new int[5];
		o = 5;
		//esto es una lista de objeto generica
		//las listas en java hasta v1.5 eran asi
		ArrayList<Object> listaObjetos = new ArrayList<Object>();
		listaObjetos.add(new Persona());
		listaObjetos.add(new Alumno());
		listaObjetos.add(new ArrayList<Docente>());
		listaObjetos.add(5);
		
		//algunos metodos de la clase object
		Persona p1 = new Persona();
		p1.setEdad(25);
		p1.setNombre("Anton");
		
		System.out.println(p1.toString());
		o = p1;
		System.out.println(o.toString());//Polimorfismo , siempre se va ejecutar el metodo del objeto al
		//que estamos apuntando, no importa la referencia, es un mero apuntador
		
		Persona p2 = new Persona();
		p2.setNombre("ANTON");
		p2.setEdad(25);
		
		if(p1 == p2) {
			System.out.println("==:igual");
		}else {
			System.out.println("==:diferentes");
		}
		
		
		p1 = p2;
		if(p1.equals(p2)) {
			System.out.println("igual equials");
		}else {
			System.out.println("diferentes equils");
		}
		//Para java 2 objetos son iguales solamente cuando 
		//ambas referencias apuntan al mismo objeto
		
		//lo que tendriamos que hacer para compaprar en un momemonto
		/* es por el valor de los atributos
		 * 
		 * para comparar objetos con atributos, se suele sobreescribir el metodo equials
		 * y el metodo hashcode(),ambos van de la mano
		 */
	}

}

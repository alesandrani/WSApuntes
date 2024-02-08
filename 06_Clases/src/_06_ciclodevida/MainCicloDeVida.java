package _06_ciclodevida;

import java.util.Random;

public class MainCicloDeVida {
	public static void main(String[] args) {
		
		//Un objeto nace cuando instanciamos la clase con la
		//palabra"new"
		new Persona();
		new Persona().edad = 45;
		//Normalmente si queremos guardar información en los atributos
		//de un objeto, debemos de crear tambien una referencia para
		//poder acceder a dichos atributos. No tiene mucho sentido
		//almacenar información que no podemos acceder a ella.
		
		//Si que puede tener sentido crear un objeto sin referencia
		//para acceder a sus métodos en un momento dado, pero hay que
		//tener claro que no podemos volver a acceder a dicho objeto.
		int numero = new Random().nextInt(1, 10);
		System.out.println("El número aleatorio es: " + numero);
		
		//¿Cuánto tiempo viven los objetos en el Heap de memoria?
		//En Java tenemos un programa dentro de la JVM que se llama
		//Recolecor de Basura o Garbage Collector(GC). Este programa
		//pasa aleatoriamente por el Heap de memoria para borrar
		//objetos. La condición para que un objeto dea eliminado
		// del Heap es que no tenga ninguna referencia.
		
		//En este caso, mientras que los 3 objetos creados arriba
		//seran borrados por el GC, este objeto NO será borrado
		//ya que tiene una referencia apuntándole
		Persona p = new Persona();
		p.edad = 35;
		
		//TEORICAMENTE la JVM tiene un método para ayudar a pasar
		//el recolector de basura, que es el método "gc()" de la 
		//clase "Sysrem"
		//(Pero no tiene por qué hacerle caso!!!!
		//De hecho la JVM Hotspot NO le hace caso)
		System.gc();
		
		//En POO existe el concepto de null. Null representa "vacio",
		//nulo, ausencia de valor y se usa la palabra reservada "null"
		//Solamente pueden ser nulos las referencias
		Persona p2 = null;
		String s = null;
		Random rd = null;
		//int i = null;//Solo pueden ser null las referencias
		
		p2 = new Persona();
		p2.edad = 22;
		
		Persona p3 = p2;
		Persona p4 = p3;
		p2 = null;
		p3 = null;
		
		System.out.println(p4.edad);
		//IMPORTANTE, Pesadilla de los programadores
		//Siempre que una referencia esté apuntando a null e intentemos acceder
		//a alguno de sus atributos o métodos, nos dará el error
		//"NullPointerException" y se nos parará el programa
		//System.out.println(p2.edad);
		System.out.println(p4.nombre);
		//p4.nombre = "Manolos";
		System.out.println(p4.nombre.charAt(6));
		p4 = dameNulo();
		System.out.println(p4.edad);
	}
	public static Persona dameNulo() {
		return null;
	}
}

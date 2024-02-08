package _01_basico;

public class MainBasico {

	public static void main(String[] args) {
		// a partir de una clase poderemos crear los objetos
		// un objeto es una estancia de una clase
		//los objetos se crean en JVM en un espacio de memoria
		// llamado HEAP
		
		// para crear un objeto en java usaremos la palabra reservada "new"
		// un programa java tendra ( a priori) tantos objetos como
		//"news" hayamos creado
		// normalmente necesitamos una variable para apuntar
		// al objeto creado.
		// las variables de clase se lllaman referencias
		// IMPORTANTE!!
		//1. una variable contiene el valor
		// ej: una variable de tipo int contiene el valor 5
		//2. una referencia contiene una posicion de memosria de donde se encuntra el objeto
		// ej: una ref tipo string contiene la poscion de memoria "0x123EAF"
		// y en esta memoria estara el objeto de tipo string con su valor
		
		// las variable se crean en un espacio de memoria llamado STACK
		
		int numero = 5;
		
		// las referencias se crean tambien en el "stack"
		// objeto se crea en el "heap"
		String cadena = new String("Pepe");
		// cuando creamos un objeto por defecto los primitivos
		// se inicializan a 0(booleanos a false), y las referencias a "null"
		Persona p1 = new Persona();
		
		//podemos acceder a las propiedades de un objeto mediante la referencia y un"."
		System.out.println(p1.nombre);
		System.out.println(p1.edad);
		System.out.println(p1.peso);
		System.out.println(p1.estaCasado);
		
		// podemos tambien modificar los valeres de los atributos de un objeto
		p1.nombre = "Thor";
		p1.edad = 167;
		p1.peso = 105.6;
		p1.estaCasado = true;
		
		
		
		
		// se llaman "estado de un objeto" al valor de los atributos en un instante de tiempo
		// si imprimimos la referencia, en principio nos da la direccion de memoria
		System.out.println(p1);
		
		// un objeto puede estar referenciado "apuntado" por muchas referencias
		Persona p3 = p1;
		//con el codigo de arriba estamos diciendo que p3 apunte 
		//al mismo objeto al que apunte p1
		
		p1.edad = 65;
		int n1= 5;
		int n2 = n1;
		n1 = 10;
		
		 Persona p4 = new Persona();
		p4.edad = 50;
		cambiarEdad(p4);
		p4.edad = 30;
		cambiarEdad2(p4);
		System.out.println(p4.edad);

	}
	public static void cambiarEdad(Persona p) {
		p.edad = 100;
		
	}
	public static void cambiarEdad2(Persona p) {
		p= new Persona();
		p.edad = 100;
	
	}
}

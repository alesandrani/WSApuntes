package _01_basico;
	// una clase es un molde para la creacion de objetos
	// pordemos entenderla como molde , planos, ecquemas y etc
	// las clases tienen unos atributos comunes a todos los objetos
	// es decir cuando creamos un atributo todos los objetos de dicha clase tendra el dicho atributo
	// ojo!! tendran que tener distintos valores
	// java es un lenguaje tipado, por lo que  los atributos tendran un tipo

	//esta clase sera usada por otras clases, no sera arrancada pq no tiene el metodo main
public class Persona {
	// los atributos se declaran dentro de la clase pero fuera de las funciones
	// normalmente se declaran al principio
	// el ciclo de vida de un atributo es igyal al ciclo de vida de un objeto
	//
	String nombre; // referencia
	int edad;	//valor
	double peso;
	boolean estaCasado;
}

package _01_basico;
/**
 * Las interfaces es un tipo especial de clase en la que todos sus metodos son abstractos
 * Estan pensadas para que sean implementadas para otras clases
 * 
 * Las interfaces definen el que queremos hacer,mientras que las clases que implementan las interfaces
 * representan el como
 * 
 * Las intefaces son un contrato que tiene que cumplirse en las clases que implementan dicha interfaz
 * 
 * 
 * Cuando una clase implementa una interfaz tiene la obligacion de implementar los metodos de dicha interface. 
 * una exepcion seria la clase que omplementa la interface seria la abstracta.
 * Las intefaces mo son instanciables debido a que todos sus metodos son abstractos.
 * Pero OJO! podemos crear clases anonimas a partir de las interfaces
 * 
 * Una propiedad muy importante de las intefaces es que mediante una referencua de una interfaz podemos
 * apuntar  cualquier objeto que implementa dicha interfaz.
 * 
 * Una intefaz puede tenemos atributos y pero siempre seran contantes(no se puede cambiar)
 * 
 * cuando se crea una inteface suele ser importante buena documentacion
 * 
 * Todos los metodos de una interface son public, no importa que lo pongais explicitamente en el metodo
 */
public interface InterfaceBasica1 {
	//esto seria un atributo contante (final)y publico
	//no suelen tener atributos los interfaces
	int ATRIBUTO_1 = 5;
	//public final int = ATRIBUTO_1 = 5; // esto seria equivalente a lo de arriba
	
	//Lo realmente importante de las intefaces son los METODOS
	//siempre son publicos y abstractos
	void metodo1();
	//public abstract void metodo1(); equivalente a lo de arriba
	
	public abstract String metodo2(Object o);
	int operacion (int a, int b);
}

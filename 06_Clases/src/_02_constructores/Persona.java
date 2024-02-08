package _02_constructores;
	
//siempre que queramos contruir un obketo necesitas de la ayuda que
// lo que se conoce como "constructor"
// un constructor en programacion orientada a objetos es un metodo especial
//el cual se usa para la creacion de los objetos 
// es imperativo usar siempre algun constructor para crear un objeto

// en java se permite crear mas de un constructor. Esta manera sigue la convencion
//  el constructor de un objeto en java sigue la misma regla que los metodos
// es decir la firma de un metodo o funcion se puede extrapolar al constructor
// pero nopodemos cambiar el nombre del constructor

// el nombre del constructor siempre tendra que ser el nombre de la clase
// los constructores cuando se crean no te devulven nada, ni siquiera VOID
public class Persona {
	
	String nombre; 
	int edad;
	double peso;
	boolean estaCasado;
	
	//en java si no creamos un constructor la JVM de java nos proporcionara llamado constructor por defecto 
	// que es un constructor sin parametros de entrada
	
	// el constructor por defecto es el siguinte
	public Persona() {
		// este seria el constructor por defecto que crea java automaticamente,
		// un constructor vacio
		//OJO!!! siempre y cuando no creemos mas constructores
		//dicho de otra manera si nosotros no creamos constructor java creara uno por defecto
		// en cuanto creamos un constructor java no creara ningun constructor mas
		
		// podemos alterar el comportamiento de un constructor cuando queremos que todos los valores de los objetos
		// empiecen igual
		System.out.println("objeto creado");
		edad = 18; // de esa manera todos los objetos dentran la edad de 18 cuando invoquemos este constructor
		
		this.edad =18;
	}
	//podemos tener todos los constructores que queramos, es decir
	// los constructores se puede sobrecargar
	
	public Persona(String nombre, int edad, double peso, boolean estaCasado) {

		//aqui tenemos un problema,cuando declaramos una variable dentro de un constructorcon el mismo nobre que el atributo
		//tapamos la visibilidad de atributo.aqui no estamos accediendo
		// al atributo nombre , estamos accediendo al parametro de entrada nombre
		
		//nombre ="Felix";
		//edad =18;
		
		// para romper esta problematica podemos usar la palabra reservada "this"
		
		//"this" es una referencia al propio objeto
		// vamos a usar this para acceder a los atributos de un objeto
		
		this.nombre= nombre;
		
		//el primero nombre es el atributo el segundo es el parametro de entrada
		// se concsidera buena practica de programacion referirse a los atributos con this
		
		this.edad= edad;
		this.estaCasado = estaCasado;
		this.peso= peso;
		 
	
	}
	
	public Persona(String nombre) {

		this.nombre= nombre;
		
	}
	
	// aunque el atributo apellido existiera este constructor no se podria crear
	//pq tiene la misma firma que el constructor de arriba
	/*
	 * public Persona(String apellido){
	 * this.apellido = apellido;
	 * }*/
	
	 
}



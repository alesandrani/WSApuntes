package _04_ayuda_eclipse;
	
public class Persona {
	
	String nombre; 
	int edad;	
	double peso;
	boolean estaCasado;
	public Persona(String nombre, int edad, double peso, boolean estaCasado) {
		super();// esa palabra esta relacionada con la herencia
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.estaCasado = estaCasado;
	}
	
	
	// los IDEs en general nos ayudan mucho a la creacion de codigo
	//en concreto eclipse nos puede ayudar en la creacion de los constructores
	// para crear ese constructor -> boton derecho sobre donde queremos crearlo
	//->sourse ->generate constructor using fields
	
	//podemos crear todos los constructores que queramos
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		
	}


	public Persona() {
		super();
	}
	// sobreescribimos el motodo toString
	/*public String toString() {
		return "me llamo: " + this.nombre;
	}
	*/
	//eclipse tambien nos ayuda para ecribir el metodo toString
	//Eclipse tambien nos ayuda en sobrescribir el método toString()
		//Para crear este método
		//-> boton derecho sobre donde queremos crearlo
		//-> seleccionamos "source"
		//-> seleccionarmos "Generate toString()"
		//A continuación elegimos los atributos con los que queremos crear
		//el método


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", estaCasado=" + estaCasado + "]";
	}
	
}

package _08_Visibilidades;
// con las visibilidades establecemos desde donde podemos  acceder
//a nuestros atributos y metodos

//en java tenemos 4 tipos de vibilidades.

//1. private --> solo tenemos visibilidad dentro de la propia clase
//2.(default) --> solo tenemos visibilidad dentro de la propia clase
//y de las clases dentro del mismo paquete
//3.protected --> solo tenemos visibilidad dentro de la propia clase,
//de las clases dentro del mismo paquete, y de las clases que hereden de esta
//4.public --> tenemos visibilidad en todas las artes de nuestro proyecto

//a efectos practicos los atributos, normalmente, los atributos
//siempre se declaran como private, y se crean sus metodos accesores y modificadores
public class Estudiante {
	private String nombre;
	int edad;
	protected double peso;
	public String dni;
	
	
	
	public Estudiante() {
		super();
	}

	public Estudiante(String nombre, int edad, double peso, String dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.dni = dni;
		
	}
	//normalmente si creamos un atributo privado tenemos que darle metodos
	//modificadores y accsesores unicos
	//la ventaja es wue en elos metodos podemos aplicar logica mientras que 
	// en un atributo no
	// por convenio es super mega importante seguir los convenios de java
	//para estos metodos.los modificadores empiezan por set y luego el nombre del atributo
	//metodos accesores empiezan por get y luego nombre del atributo
	public void setNombre(String nombre) {
		if(nombre.length()> 1) {
			this.nombre = nombre;
		}
		
	}
	public String getNombre() {
		if(this.nombre!=null) {
			return convertirNombreAMiniscula() ;
		}
		return this.nombre;
	}
	private String convertirNombreAMiniscula() {
		return this.nombre.toLowerCase();
	}
}

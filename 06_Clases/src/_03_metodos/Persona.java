package _03_metodos;
	

public class Persona {
	
	String nombre; 
	int edad;
	double peso;
	boolean estaCasado;
	//Dentro de una clase, ademas de atributos, pueden realizar funcionalidades
	//que se declaran como "METODOS" en POO, a las funciones se le llaman 
	//"metodos". Siguen las mismas reglas de las funciones que vimos en el 
	//ejemplo "02_IntroduccionJava".

	//Para crear un metodo en Java, se crea igual que una funcion pero se 
	//quita la palabra "static". Cuando creamos un metodo, el metodo esta
	//dentro de un objeto, si creamos una funcion (un metodo con la palabra
	//"static"), la funcion estara fuera del objeto.

	
	
	public Persona() {
		
		System.out.println("objeto creado");
		edad = 18; 
		
		this.edad =18;
	}

	
	public Persona(String nombre, int edad, double peso, boolean estaCasado) {

	
		
		this.nombre= nombre;
		
		
		
		this.edad= edad;
		this.estaCasado = estaCasado;
		this.peso= peso;
		 
	
	}
	
	public Persona(String nombre) {

		this.nombre= nombre;
		
	}
	//Los metodos van dentro de la clase, y normalmente se ponen despues
		//de los atributos y los constructores
	
	public void presentarse() {
		System.out.println("Mi nombre es: "+ this.nombre);
		System.out.println("Mi edad es :"+ edad); 
		//la edad sin this siempre y cuando no se haya declarado
		//una variable o un parametro de entrada cin el nombre edad
		System.out.println("mi peso es :"+ this.peso);
		System.out.println("Estoy casado?:"+ this.estaCasado);
	}
	
	public void ponerEdad(int edad) {
		if(edad< 0){
			this.edad =0;
		}else {
			this.edad= edad;
			
		}
		
	}
	
	public double obtenerPesoEnLibras() {
		int pesoEnLibras= 0;
		pesoEnLibras =(int) (this.peso * 2.205);
		return pesoEnLibras;
	}
	 
}



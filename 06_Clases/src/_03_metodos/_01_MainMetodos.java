package _03_metodos;

public class _01_MainMetodos {

	public static void main(String[] args) {
		//vamos a crear objetos y a ejecutar su metodo "presentarse"
		Persona p1 = new Persona("tony", 45, 67.15, true);
		//para invocar un metodo normalmente necesitamos una referencia
		//al objeto y pondremos un "." para acceder al metodo
		p1.presentarse();
		
		p1 = new  Persona("Natasha", 35, 70, true);
		p1.presentarse();
		
		p1.ponerEdad(50);
		p1.presentarse();
		
		p1.ponerEdad(-69);
		p1.presentarse();
		
		System.out.println("el peso en libras es :"+ p1.obtenerPesoEnLibras());
		p1 = new Persona("Hulk", 40, 635, false);
		System.out.println(p1.obtenerPesoEnLibras());
		p1.presentarse();
		
	}

}

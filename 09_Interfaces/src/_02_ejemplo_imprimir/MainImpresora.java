package _02_ejemplo_imprimir;

public class MainImpresora {

	public static void main(String[] args) {
		// Con una interfaz puedo apuntar
		//a cualquier objeto que implemente la interfaz
		
		// de hecho se considera nuena practica de programacion el orientar
		//tu codigo siempre que se pueda a interface
		//asi como utilizar referencias de la intefaz
		//usar intefaces para apuntar a objetos hacen que las
		//dependencias de tu codigo sean dependencias debiles
		//mientras que usar las referencias propias de objeto
		//hacen que sean dependencias fuertes
		
		Imprimible impPantalla = new ImprimirPantalla();
		Imprimible impFichero = new ImprimirFichero();
		Imprimible impImpresora = new ImprimirImpresora();
		
				String cadena = "Hola intefaz";
				impPantalla.imprimir(cadena);
				impFichero.imprimir(cadena);
				impImpresora.imprimir(cadena);
		//Invocamos metodos concretos
				//esta manerano estaria bien hecha ya que es mejor 
				//utilizar el codigo orientado a interfaces
				/**metodoImprimirFichero(impFichero);
				metodoImprimirImpresora(impImpresora);
				metodoImprimirPantalla(impPantalla);
				*/
		//Invocamos metodo con la interfaz
				metodoImprimir(impPantalla);
				metodoImprimir(impImpresora);
				metodoImprimir(impFichero);
				

	}
	
	public static void metodoImprimirPantalla(ImprimirPantalla ip) {
		ip.imprimir("Manolo cabezabolo");
	}
	
	public static void metodoImprimirFichero(ImprimirFichero ip) {
		ip.imprimir("Manolo cabezabolo");
	}
	public static void metodoImprimirImpresora(ImprimirImpresora ip) {
		ip.imprimir("Manolo cabezabolo");
	}
	
	//aplicando polimorfismo
	public static void metodoImprimir(Imprimible i) {
		i.imprimir("El chivi");
	}
}


public class _04_Constant {

	public static void main(String[] args) {
		// Las constantes en java es un tipo especial de "variable", el cual
		//el valor que almacenemos NO se puede cambiar durante todo el ciclo
		//de vida del programa
		
		//Las constantes puede ser de cualquer tipo de datod
		
		// Las contantes en java se declaran con palabra reservada
		//"final"
		
		// Las constantes en java se suelen declarar en UpperSnakeCase
		//EJ:CONSTANTE NUMERICA
		final double NUMERO_PI = 3.1416;
		
		System.out.println(NUMERO_PI);
		
		//Si intentamos cambiar el valor de una constante, no dará
		// un error en tiempo de compilacion
		//NUMERO_PI = 2.79; // Error
		
		final String TITULO_WEB = "bienvenidos a mi pagina web";
		System.out.println(TITULO_WEB);

	}

}

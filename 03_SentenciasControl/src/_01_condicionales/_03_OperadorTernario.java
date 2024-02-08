package _01_condicionales;

public class _03_OperadorTernario {

	public static void main(String[] args) {
		//operador ternario
		//-------------------------------------
		//Con este operador solo buscamos hacer una sentencia "if else" de una menera
		//rapida y en una sola linea
		
		// la estructira es la siguente
		//(EXPRESION_BOOLEAN) ? CASO_VERDADERO: CASO_FALSO:
		//el casi seera lo que devuelva la exprecion
		// que normalmente lo almacenaremos un una variable
		
		//ejemplo
		int numero = 5;
		String cadena =( numero <= 5) ? "menor o igual que 5": " mayor que 5";
		System.out.println(cadena);
		//es lo mismo que:
		if(numero<=5) {
			System.out.println("menor o igual que 5");
		}else {
			System.out.println("mayor que 5");
		}
		// otro ejemplo
		String texto = (numero % 2 == 0) ? "el numero es par": "el numero es impar";
		System.out.println(texto);
		
		//ejemplo
		//las variablea booleanas normalmente empiezan por "es"o por "is"
		//tambien puede empezar por "tiene" o "has"
		//ojo, no se recomienda llamar a las variables negadas
		//ej: es mejor tomar el nombre"esPar" que "noEsPar"
		boolean esPar = (numero % 2 == 0) ? true: false;
		if(esPar) {
			System.out.println("la variable es par");
		}else {
			System.out.println("la variable es impar");
		}
		// si queremos usar la negacion es mejor usar el operador "!"
		if(!esPar) {
			System.out.println("es impar");
		}else {
			System.out.println("es par");
		}
	}
	

}

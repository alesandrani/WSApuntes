
public class _02_Literales {

		//un proyecto java puede tener varias clases con
		//metodos "main". El main que se ejutará será
		//sobreaquel fichero que hagamos en el "run us"
	public static void main(String[] args) {
		System.out.println("Literales en java");
		
		// En java como en todos los lenguajes de programacion
		//tenemos los que llamamos literales
		//Una literal es un valor constante formado por una secuencia de caracteres. 
		//Cualquier declaración en Java que defina un valor constante 
		//-un valor que no pueda ser cambiado durante la ejecución del programa- 
		//es una literal.
			
		// Tenemos los siguentes tipos literales en java
		// Literal de cadena de texto van entre comillas dobles
		System.out.println("Esto es un literal de cadena");
		
		// Literales de caracter, van entre comillas simples y solo puede haber uno
		System.out.println('a');
		
		//Literales booleanos, pueden ser de dos tipis, verdadera (true)
		//y falso (false). Se utilizanlas palabras reservadas 'true y false'
		//respectivamente
		System.out.println(true);
		System.out.println(false);
		
		//Literales de numeros enteros (int) , son literales numericos que van desde 
		//-2,147,483,648 a 2,147,483,647
		//Los numeros enteros van sin coma y sin punto
		System.out.println(2147483647);
		//Podemos utilizar "_" para separar los numeros y leerlo mejor
		System.out.println(1000000000);
		System.out.println(1_000_000_000); //equivalente a la anterior,pero se lee mejor
		//Literales de numeros enteros largos (long), el rango es mucho mayor
		//Se poner con una 'L' mayuscula o menuscula al final.
		System.out.println(2147483648L);
		System.out.println(2_147_483_648L);
		//Literales de numeros en coma flotante, numeros decimales grandes (float)
		// la parte decimar se separa de la parte entera con un punto
		//Este tipo de literal es el mas usado para hacer numeros decimales en java.
		System.out.println(1200.235);
		System.out.println(1_200.235);
		
		//Literales de numeros decimales pequeños (floay), que se tratan igual que los
		// 'double' pero se pone una 'F' mayuscula o menuscula al final.
		//La diferencia con los double es que el rango es mas pequeño.
		//Apenas se usan hoy en dia, es mejor usar siempre 'double'para los numeros 
		//decimales.
		System.out.println(1200.235F);
		System.out.println(1_200.235F);
		
	
	}
	
}
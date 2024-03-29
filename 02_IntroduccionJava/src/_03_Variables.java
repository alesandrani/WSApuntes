
public class _03_Variables {

	public static void main(String[] args) {
		
		//Las variables son "cajas" donde vamos a guardar informacion
		//que podrá ser cambiada en el tiempo
		/*
		 * Todo programa de ordenador persigue ofrecer una funcionalidad 
		 * determinada para la que, por regla general, necesitará almacenar 
		 * y manipular información. Dicha información, que son los datos 
		 * sobre los que operaremos, deben almacenarse temporalmente en la 
		 * memoria del ordenador. 
		 * 
		 * Para poder almacenar y recuperar fácilmente información en la 
		 * memoria de un ordenador los lenguajes de programación ofrecen 
		 * el concepto de variables
		 */
		
		/*
		 * En Java, una variable es un espacio en la memoria que se utiliza para 
		 * almacenar un valor específico (generalmente un literal). 
		 * Las variables tienen un nombre, un tipo y un valor.
		 *  
		 * El nombre de una variable es un identificador único que se 
		 * utiliza para hacer referencia al valor almacenado en esa variable. 
		 * El tipo de una variable especifica qué tipo de valores pueden 
		 * almacenarse en ella y el valor es el dato que se guarda.

		   Java es un lenguaje de tipado estático, lo que significa que el tipo de 
		   una variable debe ser especificado al momento de declararla.
		 */
		
		// Lamamos "declaracion de una variable" cuando creamos una variable por primera vez 
		//para usarla durante su ciclo de vida
		//Para declarar una variable en java primero especificamos el tipo,
		//luegoel nombre y lo igualamos a un valor
		//TIPO_VARIABLE NOMBRE_VARIABLE=VALOR_VARIABLE
		
		//Ejemplo de variable entera
		int numero1 = 1;
		
		// Una vez declarada una variable no podemos volver a declararla mientras
		//exista
		//int numero1 = 5;// Esto da error, la variable ya ha sido 'creada'
		
		// Lo que si podemos hacer es cambiar el valor de las variables
		numero1 = 5;
		// Podemos imprimir por pantalla valores de variables llamandolas por
		// su nombre
		System.out.println(numero1);
		
		numero1 = 20;
		System.out.println(numero1); //notese que ahora el valor de numero1 ha cambiado
		numero1 = 1340;
		System.out.println(numero1);
		
		// Podemos crear variables de distintos tipos
		// Variables booleanas
		boolean variableBooleana = true;
		System.out.println(variableBooleana);
		
		variableBooleana = false;
		System.out.println(variableBooleana);
		// Notese que el nombre de las variables en java van en notacion
		//lowerCamelCase
		
		//OJO!!! El nombre de las variables es sensible a mayusculas y
		//minusculas
		int estoEsUnaVariable = 0;
		int ESTOESUNAVARIABLE = 0;
		
		// Las variables en java no puden empezar por numeros
		//int 1numero = 0;//error
		// las variable en java DEBEN empezar por:
		//1. caracter alfabetico
		//2. guion bajo '_'
		//3. simbolo del dolar '$'
		//int %numero = 9;// error
		
		// variable del tipo doble
		double variableDouble = 12.34;
		
		//Variable de tipo long
		long variableLarga = 23L;//ojo 'L' al final
		variableLarga = 3_000_000_000L;//si no ponemos la 'L' daria error pot el literal
		System.out.println(variableLarga);
		//Variables de tipo float
		float variableFloat = 23.56F;
		
		//Existen otros tipos de variables menos usados, como por ejemplo
		//byte, que es para numeros muy pequeños, entre -128 y 127
		byte variebleByte = 127;
		
		// Tipo char
		char variableChar = 'c';
		
		// Tipo String o cadena. OJO!! En este caso se capitaliza la primera
		//palabra
		String variableCadena = "esto es una variable en cadena";
		System.out.println(variableCadena);
		
		variableCadena = "Acabo de cambiar variablecadena";
		System.out.println(variableCadena);
		
		}

}

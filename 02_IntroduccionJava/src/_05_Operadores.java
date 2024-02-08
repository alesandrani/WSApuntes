
public class _05_Operadores {

	public static void main(String[] args) {
		 
			
			//Operadores ariteméticos
			//-----------------------
			System.out.println(5 + 7);//'+' suma
			System.out.println(17 - 7);//'-' resta
			System.out.println(5 * 7);//'*' multiplicación
			System.out.println(10 / 2);//'/' división
			
			// Si dividimos dos numeros enteros, el resultado sera
			// un número entero, es decir, se elimina la parte decimal
			System.out.println(11 / 2);//5
			
			//Si en la división usamos algún numero double, entonces
			//el resultado sera un numero decimal o double.
			System.out.println(11.0 / 2);//5.5
			System.out.println(11 / 2.0);//5.5
			
			//'%' modulo de la división, es decir, el resto de la división
			//entera
			System.out.println(10 % 2);//0
			System.out.println(11 % 2);//1
			System.out.println(12 % 2);//0
			
			//Operadores de asignación
			//------------------------
			//'=', se utiliza para asignar valores a variables
			int numero1 = 5;
			numero1 = 10;
			
			// Podemos usar operadores aritmeticos para cambiar el valor
			// de variables
			int numero2 = 10;
			System.out.println(numero2);
			//En la siguiente expresión estamos asignando un nuevo valor
			//a la variable 'numero2'. Estamos cogiendo el antiguo valor
			//de la variable 'numero2' (10) y le estamos sumando el valor
			//'5', es decir, cuando ejecutemos la expresión el nuevo valor
			//que tendrá la varialbe 'numero2' será '15'
			numero2 = numero2 + 5;//5 + 10 = 15
			System.out.println(numero2);
			
			// '+=', se utiliza para incrementar un valor a una variable
			// de manera más rápida de escribir
			int numero3 = 10;
			numero3 += 5;// Esto es equivalente a 'numero3 = numero3 + 5;'
			System.out.println(numero3);
			
			// '-=', se utiliza para decrementar una valor a una variable
			// de una manera más rapida de escribir
			int numero4 = 10;
			numero4 -= 4;//Esto es equivalente a 'numero4 = numero4 - 4;'
			System.out.println(numero4);
			
			// '*=', igual pero para la multiplicación
			int numero5 = 10;
			numero5 *= 5;//Esto es equivalente a 'numero5 = numero5 * 5;'
			System.out.println(numero5);
			
			// '/=', igual pero para la división
			int numero6 = 10;
			numero6 /= 5;//Esto es equivalente a 'numero6 = numero6 / 5;'
			System.out.println(numero6);
			
			// '%=', igual pero para el módulo
			int numero7 = 10;
			numero7 %= 5;//Esto es equivalente a 'numero7 = numero7 % 5;'
			System.out.println(numero7);//0
			
			// Operador especial de incremento en UNA unidad
			// El operador '++' incrementa la variable entera en uno!
			int variableIncremental = 0;
			variableIncremental++;//Equivalente a 'variableIncremental = variableIncremental + 1'
			System.out.println(variableIncremental);//1
			variableIncremental++;
			System.out.println(variableIncremental);//2
			
			// Operador especial de decremento en UNA unidad
			// El operador especial '--' decrementa la variable entera en uno!
			int variableDecremental = 0;
			variableDecremental--;//Equivalente a 'variableDecrementa = variableDecremental - 1'
			System.out.println(variableDecremental);//-1
			variableDecremental--;
			System.out.println(variableDecremental);//-2
			//OJO precedencia de operadores
			int numero8 = 0;
			System.out.println(numero8++); //imprimira 0, pero luego incrementara el valor en 1
			System.out.println(numero8); // 1
			
			// si ponemos el ++ al principio, se incrementara primero
			int numero9 = 0;// valor 0
			System.out.println(++numero9); //1, su valor sera 1
			System.out.println(numero9++);//1, su valor sera 2
			System.out.println(numero9); //2, valor 2
			 // operadores relacionales
			//--------------------------------------------------------------------
			// son operadores que comparan valores y duvuelven simpre un valor booleano.
			//operdor ==, compara si dos valores son iguales
			System.out.println(5 == 5);
			System.out.println(5 == 7);
			//normalmente no se utiliza con literales sino con variables
			int numero10 = 5;
			int numero11 = 8;
			System.out.println(numero10 == numero11);
			numero10 = 8;
			System.out.println(numero10 == numero11);
			
			// operador menor < compara sin valor es menor que otro
			System.out.println(5 < 5);
			System.out.println(5 < 4);
			System.out.println(5 < 7);
			System.out.println(numero10 < numero11);
			// operador >, compara si un valor es mayor que otro
			System.out.println(5 > 5);
			System.out.println(5 > 4);
			// operador ">=" compara si un valor es mayor o igual que otro
			System.out.println(5 >= 5);
			System.out.println(5 >= 4);
			
			// operado " <=" compara si un valor menor o igual que el otro
			System.out.println(5 <= 5);
			System.out.println(numero10 <= numero11);
			// operador "!=" compara si un valor es distinto a otro
			System.out.println(5 != 4);
			System.out.println(numero10 != numero11);
			 // podemos utilizar generalmente otros tipos de datos
			System.out.println(false == false);
			System.out.println(true != false);
			System.out.println(34.66 <= 34.57);
			System.out.println(456L <= 234.56); // a veces podemos comparar entre diferentes tipos
			//System.out.println(false < 10);// error
			
			// operador especial de agrupacion "()"
			// hay que tener clse que los operadores tienen precedencia para
			//ejecutarse
			
			// operadores lógicos
			//----------------------------------------
			//Los operadores lógicos se usan para combinar dos valores Booleanos 
			//y devolver un resultado Booleano, es decir, verdadero o falso
			// operador logico "AND" , se representa por los simbolos '&&'
			//este operador devuelve TRUE solamente cuando los dos valores booleanos
			// que se comparan son TRUE
			// tabla "AND"
			//1-false y false = false
			// 2- false y true == false
			// 3- true y false = falsa
			// 4- true y true = true
			System.out.println(true && false);
			boolean bool1 = true;
			boolean bool2 = true;
			System.out.println(bool1 && bool2);
			
			//Operador lógico "OR", se representa por los símbolos '||'
			//El símbolo'|' se suele llamar "pipe"
			//Este símbolo se escribe pulsando "altGr + 1"
			//Este operador devuelve TRUE cuando alguno de los dos valores booleanos
			//que se comparan sea TRUE
			//Tabla "AND"
			//1- false y false = false
			//2- false y true = true
			//3- true y false = true
			//4- true y true = true

			System.out.println(true || false);
			System.out.println(bool1 || bool2);
			bool1 = false;
			System.out.println(bool1 || bool2);
			
			
			// operador logico negacion, se representa con el simbolo "!"
			// este operador duevuelve TRUE cuando el valor es falso
			// y devulve falso cuando el valor es true
			// es decir, cambiar el valor booleano
			System.out.println(!true);// false
			System.out.println(!false); // true
			System.out.println(!bool1);// true
			
			//ejemplos
			// si tenemos muchas condiciones booleanas es mejor usar
			// el operador de agrupacion
			System.out.println((true && false)|| true);
			System.out.println(true && false || true);// true
			System.out.println(false || false && true);
			System.out.println(!bool1 || bool2); // true
			
			// operador especial de contratenacion de cadenas, se representa por
			//el simbolo ' +' notese que es el mismo operador que es para la suma
			// de arifmetica.
			System.out.println("cadena" + "concadena");
			// tambien se puede utilizar otra cadena con otra 
			// variable de otro tipo
			int numero12 = 5;
			int numero13 = 7;
			int resultado = numero12 + numero13;
			System.out.println("el resultado de la operacion es : " + resultado);
			numero13 = 12;
			resultado = numero12 + numero13;
			System.out.println("el resultado de la operacion es : " + resultado);
			
			System.out.println(10 + 2* 5);// 20
			System.out.println((10 + 2) * 5);// 60
			// si pponemos el ++ al fina, se incrementara el valor 
			//despues de imprimirlo por pantalla por lo tanto
			


		// Las constantes en java es un tipo especial de 'variable', el cual
		// el valor que almacenemos NO se puede cambiar durante todo el ciclo
		// de vida del programa

		// Las constantes pueden ser de cualquier tipo de datos

		// Las constantes en java se declaran con la palabra reservada
		// 'final'

		// Las constantes en java se suelen declarar en UpperSnakeCase
		// Ej: CONSTANTE_NUMERICA
		final double NUMERO_PI = 3.1416;

		System.out.println(NUMERO_PI);

		// Si intentamos cambiar el valor de una constante, nos dará
		// un error en tiempo de compilación
		// NUMERO_PI = 2.79; //Error

		final String TITULO_WEB = "Bienvenidos a  mi página web";
	}

}
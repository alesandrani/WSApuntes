package _02_bucles;

import java.util.Scanner;

public class _02_WHILE {
			//los bucle for estan pensados principalmente para realizar 
			//un numero determinado de saltos ej: 1-30.30-1:etc
			//tenemos otro tipo de bucles que estan pensados para hacer
			//un numero indeterminado de saltos,es decir
			//no estamos muy seguros del numero de interaciones que vamos a realizar
			//para este tipo de bucles utilizaremos el llamado bucle "WHILE"	
			//ESTE TIPO DE BUCLE ES UNA MEZCLA ENTRE UN 'FOR' Y UN 'IF'
			// para utilizar este tipo de bucle utilizaremos la sigiente sentencia:
			//while(EXPRESION_BOOLEAN)
			
			//el while se ejecutara siempre y cuando la expresion boolean de
			//dentro del parentesis sea "true"
			
			//ojo!! este tipo de bucles es mucho mas facil hacer bucles infinitos
			
	public static void main(String[] args) {
		//el ejemplo mas facil seria un bucle infinito
		//while(true)
			//System.out.println("esto es un bucle infinito");
		
		//normalmente ponemos siempre un bloque dentro del while
		// y debemos de concluir el bucle en algun momento
		
		//imprimir los 10 primeros numeros mediante un bucle while
		int numero= 1;
		while(numero<=10) {
			System.out.println(numero++);
			
		}
		//todo el algoritmo tiene su equivalente de "for" a "while"
		//incluso a la inversa aunque no sea algo habitual
		
		//la filosofia de un bucle while es ejecutar una serie de sentencias entre 0 y n veces
		//si no cumple la condicion ni una sola vez, mo entraria en el bucle
		numero = 11;
		while(numero<=10) {
			System.out.println("esto no se ejecutaria ni una sola vez");
		}
		
		//lo mas habitual es usar un while cuando no sabemos el numero de 
		//interacciones que vamos a realizar
		
		//vamos a pedirle un numero al usuario hasta que este entre los valores 1 y 10
		Scanner sc= new Scanner(System.in);
		System.out.println("introduzca el numero entre 1 y el 10");
		numero= sc.nextInt();
		while(numero < 1 || numero > 10) {
			System.out.println("el numero es incorrecto");
			System.out.println("introduzca el numero entre 1 y el 10");
			numero= sc.nextInt();
		}
		System.out.println("el numero esta entre1 y 10");
		
		// esto es equivalente con una variable booleana que hace eñ efecto de "flag"
		
		
		boolean correcto = true;// esta variable hace efecto de flag
								//es decir, va a hacer que se siga ejecutando el bucle
								//while o no.
								// en este caso parto de la base que el usuario va a introducir
								// mal los datos, por 
		while(!correcto) {
			System.out.println("introduzca un numero entre un 1 y el 10");
			numero= sc.nextInt();
				if(numero<=10 && numero>=1) {
					System.out.println("el numero esta entre 1 y 10");
					correcto= true;
				} else {
					System.out.println("el numero es incorrecto");
				}	
		}

	}

}

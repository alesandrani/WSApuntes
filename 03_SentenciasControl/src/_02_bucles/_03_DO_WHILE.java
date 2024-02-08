package _02_bucles;

import java.util.Scanner;

public class _03_DO_WHILE {
			//existe una variante del bucle while , que se llama "do while"
	
			//la filosofia es la misma que la del bucle while
			// pero esta vez en vez de ejecutarse entre 0 y N, se jecutara entre
			//1 y N veces. es decir, al menis el bloque de sentencias se ejecutara una vez

	public static void main(String[] args) {
		//la sentencia do-while tiene el siguente formato
		/*
		 * do{
		 * 		//sentencias a ejecutar
		 * }while(EXPRECION_BOOLEANA);
		 */
		//vamos a pedirle un numero al usuario hasta que este entre los valores 1 y 10
		int numero = 0;
		Scanner sc= new Scanner(System.in);
		
		do {
			System.out.println("introduzca un numero entre 1 y el 10");
			numero = sc.nextInt();
		}while(numero < 1|| numero> 10);
		//manera similar pero avisando al usuario
		System.out.println("numero entre 1 y 10");
		do {
			System.out.println("introduzca un numero entre 1 y el 10");
			numero = sc.nextInt();
			if(numero> 10) {
				System.out.println("te pasaste");
			}
			if(numero<1) {
				System.out.println("te quedaste corto");
			}
		}while(numero < 1|| numero> 10);
		
		System.out.println("numero entre 1 y 10");
		
		
		
		
	}

}

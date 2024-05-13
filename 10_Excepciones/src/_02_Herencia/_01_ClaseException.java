package _02_Herencia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01_ClaseException {

	public static void main(String[] args) {
		// aunque la clase padre de todas las clases sea la clase object
		//Para las excepciones se coincidera la clase exception
		//todas las excepciones que hemos trabajado
		//todas ellos tienen como padre la clase exception
		//con esto queremos decir que con una referencia de la clase exception podemos apuntar a culquier exception
		//esto nos puede servir para agrupar excepciones
		
		//vamos a utilizar el ejemplo anterior
		boolean estaCorrecto = false;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Introduzca el numerador : ");
				int numerador = sc.nextInt();
				System.out.println("Introduzca el denominador : ");
				int denominador = sc.nextInt();
				int resultado = numerador/denominador;
				System.out.println(resultado);
				estaCorrecto = true;
				//si usamos la clase exception al ser la clase padre
				//cuilquier exception que ocurra la controlaremos
			}catch(Exception e) {
				System.out.println("Ha ocurrido algun error");
				
			}
		}while(!estaCorrecto);
		
		
		
	}


	}



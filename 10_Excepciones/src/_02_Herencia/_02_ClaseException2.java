package _02_Herencia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02_ClaseException2 {

	public static void main(String[] args) {
		
		
		//vamos a utilizar el ejemplo anterior
		//vamos controlar genericas y las especificas
		
		//est puede ser una buena practica de programacion
		//capturar las excepciones que conozcas y liego tener un bloque catch generico para las que no conozcas
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
			}catch(InputMismatchException ime) {
				System.out.println("Ha introducido una cadena en vez de un numero");
				
			}catch(ArithmeticException ae) {
				//Podemos tener tantos bloques catch como queramos, y en cada bloque
				//capturar el tipo de excepcion que necesitemos
				System.out.println("No aceptamos divisiones por cero");
				//si usamos la clase exception al ser la clase padre
				//cuilquier exception que ocurra la controlaremos
			}catch(Exception e) {
				System.out.println("Ha ocurrido algun error");
				
			}
		}while(!estaCorrecto);
		
		
		
	}


	}



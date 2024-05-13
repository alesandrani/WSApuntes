package _01_basico;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Las excepciones en java son situaciones
 * Cuando ocurre un excepcion se abre un nuevo hilo de ejecucion paralelo
 * 
 */
public class _01_IntroduccionExcepciones {

	public static void main(String[] args) {
		String s = null;
		//s.charAt(0); //excepcion,concretamente mullpointerException
		
		//La opcion que tenemos en java para controlar excepciones 
		//es mediante los llamados bloques "try-catch
		//en la parte try ponemos el codigo el cual queremos capturar las posibles excepciones
		//en la parte catch ponemos el codigo que queremos ejecutar en caso de que ocurra alguna exception y por lo tanto no se parara el programa
		//es obligatorio poner en la parte catch el tipo de excepcion que queremos capturar
		//el programa continuara con su ejecucion de manera normal cuando salga del bloque try-catch
		
		try {
			s.charAt(0);
		}catch(NullPointerException npe) {
			//aqui ejecutamos las sentencias que queramos
			System.out.println("ojo! esta apuntando a null");
		}
			System.out.println("continuamos con la ejecucion del programa");
	
	//OJO! esto no aregla el problema, esto lo unico que hace , solo evita que el programa se pare
			
			//este codigo de aqui si el usuario introduce "trece", el programa
			//se parara, porque ocurre la excepcion InputMismatchException. y como
			//se para el rpograma no puedo decir al usuario que ha hecho mal
			
			//System.out.println("Introduzca un numero : ");
			//Scanner sc = new Scanner (System.in);
			//Integer n1 = sc.nextInt();
			//System.out.println("el numero introducido es : "+ n1);
			
			/**try {
				System.out.println("Introduzca un numero : ");
				Scanner sc = new Scanner (System.in);
				Integer n1 = sc.nextInt();
				System.out.println("el numero introducido es : "+ n1);
				
			}catch(InputMismatchException ime) {
				System.out.println("el valor debe ser numerico");
			}
			*/
			//OJo!esto no se aregla el programa, pero al menos da opcion
			//de intentar arreglarlo
			boolean numeroCorrecto = false;
			do {
				try {
					System.out.println("Introduzca un numero : ");
					Scanner sc = new Scanner (System.in);
					Integer n1 = sc.nextInt();//aqui se lanza la excepcion
					System.out.println("el numero introducido es : "+ n1);
					//si llegamos a esta linea no hubo una excepcion
					numeroCorrecto = true;
				}catch(InputMismatchException ime) {
					System.out.println("el valor debe ser numerico");
				}
			}while(!numeroCorrecto);
			// en esta ultima parte hemos usado los bloques try-catch para ayudarnos a controlar las excepciones
			//y poder aplicar logica para solucionarlo
			//Muchas veces podemos controlarlas con IF, lo que suele ser a nivel
			//de codigo mas optimo
			String s2 = null;
			if(s2 != null) {
				s2.charAt(0);
			}
			
			
	}
}

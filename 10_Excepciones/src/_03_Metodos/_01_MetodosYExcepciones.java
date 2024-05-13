package _03_Metodos;

import java.util.Scanner;

public class _01_MetodosYExcepciones {

	public static void main(String[] args) {
		System.out.println("Introduzca un numero");
		//cuando usamos un metodo que arroja exceptiones de tipo exception
		//se llaman excepciones "checked" y tenemos que poner un bloque try/catch obligatoriamente
		int numero = 0;
		try {
			numero = recogerNumeroException();
		} catch (Exception e) {
			//este bloque ha sido generado automaticamente con eclipse y te invoca
			//automaticamente al metodo "e.printStackTrace"
			e.printStackTrace();//utiliza la salida System.err
		}
		System.out.println("el numero es :" + numero);
		
		//Invocamos a otra exception
		//las exceptiones de tipo runtimeException
		//son exceptiones que se llaman un "checkecd"
		//esto quuiere decir que no tenemos porque capturar las exceptiones con un bloque try catch
		//aunque muchas veces tengamos que hacerlo
		System.out.println("Introduzca otro numero");
		int numero2 = recogerNumeroRuntimeException();
		//hay que tener claro en java si ocurre una exception y no la controlamos(no usamos try catch)
		// el programa se parara
		
		//las excepciones "unchecked"tambien las podemos controlar con bloque try catch ecplipse -> surround with -> try catch
		try {
			int numero3 = recogerNumeroRuntimeException();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Nos podriamos preguntar cuando arrojar exceptiones checked o unchecked.
		//con checked es cuando queremos dar mucha importancia a la excepcion y queremos obligar al programador a poner el
		//bloque try-catch
		//con unchecked no queremos darle tanta importancia a la excepcion y no hace falta poner el bloque try-catch
		//digamos que las checked pueden tener mas probabiblidad de ocurrir

	}
	//Hay veces que nos interesa avisar a quien llame a este metodo
	//de que ha habido exceptoin
	//para ello podemos usar la palabra reservada "throws" al final del metodo
	//y a continuacion el tipo de exception que queremos devolver
	// en este caso usaremos la clase exception para arrojar cualquier exception
	//de hecho se debe documentar
	/**
	 * Recoger un numero pasado por consola
	 * @return el numero recogido
	 * @throws Exception si el valor introducido no es numero entero
	 */
	public static int recogerNumeroException() throws Exception {
		Scanner sc = new Scanner(System.in);
		int numero =sc.nextInt();
		return numero;
	}
	
	public static int recogerNumeroRuntimeException() throws RuntimeException{
		Scanner sc = new Scanner(System.in);
		int numero =sc.nextInt();
		return numero;
	}
	int numero2 = recogerNumeroRuntimeException();
}

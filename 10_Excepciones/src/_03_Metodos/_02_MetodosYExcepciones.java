package _03_Metodos;

import java.util.Scanner;

public class _02_MetodosYExcepciones {

	public static void main(String[] args) {
		System.out.println("Introduzca un numero");

		int numero = 0;
		try {
			numero = recogerNumeroException();
		} catch (Exception e) {
			// este bloque ha sido generado automaticamente con eclipse y te invoca
			// automaticamente al metodo "e.printStackTrace"
			System.out.println("ha ocurrido un error llmando al metodo");
		}
		System.out.println("el numero es :" + numero);
	}
	// es posible que ademas de arrojar la excepcion queramos capturarla para
	// tratarla
	// en este mpmento, y ademas arrojarla hasta arriba
	// en este ejemplo vamos a capturarla y arrojar

	/**
	 * Recoger un numero pasado por consola
	 * 
	 * @return el numero recogido
	 * @throws Exception si el valor introducido no es numero entero
	 */
	public static int recogerNumeroException() throws Exception {
		Scanner sc = new Scanner(System.in);
		int numero;
		try {
			numero = sc.nextInt();
			return numero;
		} catch (Exception e) {
			System.out.println("Valor incorrecto");
			// para arrojar un error podemos usar la palabra throw
			throw e;
		} finally {
			//este bloque se ejecuta siempre sin importar haya entrado o no por el catch
			System.out.println("esto siempre se ejecuta haya o no error");
		}
	}

}

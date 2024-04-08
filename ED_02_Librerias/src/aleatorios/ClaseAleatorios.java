package aleatorios;

import java.util.Random;


/**
 * Clase para generar numeros aleatorios
 * @author  Muñon lider & CO
 */
public class ClaseAleatorios {

/**
* Método que genera<b> un número  aleatorio </b> entre dos números
* pasados por parámetro
* @param n1 el minimo valor posible del rango(incluido)
* @param n2 el maximo valor posible(inluidoo)
* @return
*/

	public int numeroAleatorioEntreDosNumeros (int n1, int n2) {
		Random rn = new Random ();
		//ponemos n2 + 1 para incluir en n2
		int nAleatorio = rn.nextInt(n1, n2 +1);
		return nAleatorio;

	}

	/**
	 * Método que genera un número aleatorio entre el 0
	 * y 2^32
	 * @return el numero pseudoaleatorio :)
	 */
	public int numeroAleatorio() {
		Random rn = new Random ();
		int nAleatorio = rn.nextInt();
		return nAleatorio;

		}

}


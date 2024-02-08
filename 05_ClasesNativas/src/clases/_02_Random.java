package clases;

import java.util.Random;

public class _02_Random {

	public static void main(String[] args) {
		// Con la clase random podemos generar primitivos aleatorios de manera sencilla

		Random rd = new Random();

		//Mirar documentación para ver lo que hace

		int numeroEntero = rd.nextInt(1, 11);//generando un número entre el 1 y el 10

		System.out.println("Número aleatorio: " + numeroEntero);

		double numeroDouble = rd.nextDouble(1, 100);

		System.out.println("Número double aleatorio: " + numeroDouble);

		//Son llamadas números pseudoaleatorios ya que se basan siempre en una semilla

		//inicial.

		Random rdSemilla = new Random(1000);

		//En este caso, como la semilla es igual en el objeto Random

		//siempre generará los mismos números aleatorios

		numeroEntero = rdSemilla.nextInt(1, 11);

		System.out.println("Número aleatorio: " + numeroEntero);

		numeroDouble = rdSemilla.nextDouble(1, 100);

		System.out.println("Número double aleatorio: " + numeroDouble);

		}



		



	}



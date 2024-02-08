package _02_bucles;

public class _05_BreakContinue {

	public static void main(String[] args) {
		// hay veces que tenemos que alterar el flujo de ejecucion de los bucles
		// esta practica conviene evitar sobre todo al principio
		// cuando estamos aprendiendo algoritmos

		// para alterar el flujo tenemos 2 palabras reservadas
		// 1. BREAK
		// 2. CONTINUE

		// BREAK
		// con esta palabra rompe la ejecucion el bucle donde se encuentra, es decir,
		// sale inmediatamente

		// vpy a imprirmir todo los numero naturales de 1-7

		for (int i = 1; i <= 10; i++) {
			System.out.println("numero: " + i);
			if (i == 7) {
				break;// cuando el numero valga 7 dejo de ejecutar el bucle
			}
		}

		// el ejemplo de aqui arriba se puede hacer sin break mejorando
		// la candicion de parada de bucle(i<=7)

		// ojo!! rompe la ejecucion del bucle donde se ejecuta, pero si esta el bucle
		// anidado, no rompe el bucle exterior

		// vamos a imprirmir la tabla de multiplicar de loa 10 primeros numeros pero
		// solo de 1 al 5

		for (int i = 1; i <= 10; i++) {
			System.out.println("tabla de multiplicar de 1 " + i);

			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "x" + j + "es igual a" + (j * i));
				if (j == 5) {
					break;// este break rompe de la "j" y no de la "i"
				}
			}
			if (i == 5) {
				break;
			}
		}

		// CONTINUE

		// esta palabra se usa cuando queremos dejar de ejecutar el codigo del bucle y
		// queremos pasar
		// a la siguente iteraccion
		// ojo!! no rompe completamente la ejecucion del bucle

		// imprimir todo los numeros pares de 1-10
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {

			}
			System.out.println("numero par: " + i);
			System.out.println("---------------------------------------");
		}
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;// saltamos a la sigiente iteracion del bucle
				// por lo tanto no se ejecutaria la linea 65
			}
			System.out.println("numero par: " + i);

		}
		// Vamos a imprimir la tabla de multiplicar de los 6 primeros
		// numeros pares pero solo los resultados del 1 al 6 pares
		for (int i = 1; i <= 6; i++) {
			if (i % 2 != 0) {
				continue;// volveriamos a la linea 73
			}
			System.out.println("Tabla de multiplicar del " + i);
			for (int j = 1; j <= 6; j++) {
				if (j % 2 != 0) {
					continue;// volveriamos a la línea 78
				}
				System.out.println(j + " x " + i + " es igual a " + (i * j));
			}
		}
	}

}

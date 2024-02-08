package _02_bucles;

public class _01_FOR_01 {
		// existen otro tipo de sentencias de control que sirven para alterar el flujo
		//normal de ejecucion de un programa.
	
		// que son los bucles o sentencias repetitivas.
		//con la sentencias "for" podemos repetir un bloque de codigo de 1 -N veces
	
			
	public static void main(String[] args) {
		System.out.println("Hola en este tema vamos a hablar de bucles");
		// para hacer repeticiones mejor usar un bucle
		// en este caso lo vamos a hacer con el bucle FOR
		// para hacer un bucle FOR  usaremos la palabra reservada
		//dentro de la estructura for podemos encontrar las siguentes partes:
		//1. inicio de la variable de control del bucle, normalmente es un (int)
		//2. condicion de ejecucion del bucle, es decir cuando se tiene que seguir ejecutando el bucle
		//es una exprecion boolean
		//3, incrementro de la variable de control del bucle
		//estas 3 partes van entre parentesis y separadas por ";"
		System.out.println("-----------------------------------");
		for(int i = 1; i <= 10;i++)
			System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("-----------------------------------");
		for(int i = 1; i <= 10_000;i++)
			System.out.println("Hola en este tema vamos a hablar de bucles");
		// es habitual
		System.out.println("-------------FOR CON BLOQUE-----------------");
		for(int i = 1; i <= 1_000;i++) {
			System.out.println("hola esto es un bucle");
			System.out.println("Hola en este bucle vamos a ejecutar varias sentencias");
	}
		System.out.println("-------------FOR USANDO LA VARIABLE DE CONTROL-----------------");
		for(int i = 1; i <= 1_000;i++) {
			System.out.println("hola esto es un bucle lo hemos ejecutado "+ i);
			
	}
		//cuando salgamos del bucle, la variable de control que hayamos
		//creado , morira
		//System.out.println("no puedo acceder a la variable 'i'" + i); //
		
		// imprimir solo los pares
		for(int i = 0; i<= 1_000; i+=2) {
			System.out.println("hola este bucle lo hemos ejecutado" + i);
		}
		//normalmente usamos la palabla 'iteracion' para referirnos a cada salto 
		// del bucle
		
		// todas las partes del "for" son optativas
		//for(;;) {
			//ojo cuidado con bucles que no paran pq podemos hacer
			//un bucle infinito
			System.out.println("esto es un bucle infinito");
		//}
		// a veces hacemos bucles infinitos por error 
		for(int i = 0; i > 1_000; i += 2) {
			System.out.println("esto no se imprime nunca " + i);
		}
		// a veces hacemos bucles infinitos por error 
				//for(int i = 1001; i > 1_000; i += 2) {
				//	System.out.println("esto  se imprime muchas veces");
				// recomendaciones
				//1.escribir la variable de control en un papel y ver como
				// se va incrementando respecto al tiempo
				// 2. siempre hacer bloques aunque solo sea una sentencia
				
				// podemo declarar la variable de control del bucle fuera del bucle
		int i = 0;
		for( i = 0; i<= 1_000; i+=2) {
			System.out.println("hola este bucle lo hemos ejecutado" + i);
			//i ++;// no es buena practica alterar la variable de control de bucle fuera del  " for"
		}
		System.out.println("ahora si puedo acceder a la variable de control:"+ i);
		
		// usando bucles podemos resolver de varias maneras los ejercicios
		//jugando con la variable de control y las condiciones de ejecucion
		for(int j = 0; j<= 9;j++) {
			System.out.println("hola a todos");
		}
		for(int j = 1; j<= 10;j++) {
			System.out.println("hola a todos");
		}
		for(int j = 10; j<= 20;j++) {
			System.out.println("hola a todos");
		}
		//las tres maneras anteriores son equvalentes, imprimen 10 veces por pantalla
		
		//podemos seguir usando variables para las condiciones de bucle
		int numero =10;
		for(int j=1; j<= numero;j++) {
			System.out.println("hola 10 veces");
		}
		//podemos invocar funciones dentro del bucle
		for(int j=1; j<= numero; j++) {
			imprimirNumero(j);
		}
		//de igual manera podemos invocar funciones que hagan bucles for
		imprimirXVecesNumero(10);
	}
	public static void imprimirNumero(int numero) {
		System.out.println("el numero: "+ numero);
		
	}
	public static void imprimirXVecesNumero(int numero) {
		for(int j=1; j<= numero; j++) {
			imprimirNumero(j);
		}
	}
}
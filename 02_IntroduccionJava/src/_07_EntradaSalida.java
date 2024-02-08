import java.util.Scanner;

import javax.swing.filechooser.FileNameExtensionFilter;

public class _07_EntradaSalida {

	public static void main(String[] args) {
		//es muy habitual en las app tener entradas de datos de 
		//usuario y salidas de datos una vez procesada la informacion
		
		// en java tenemos dos maneras de presentar la informacion:
		//1.system.out-> salida estandar de consola
		//2.system.err -> salida de errores de consola
		//una vez trabajemos con una salida,podemos usar algun metodo
		//para imprimir por ella, como por ejemplo metodo printin
		System.out.println("salida estandar de consola");
		System.err.println("salida de errores de consola");// syserr + cntrl espacio
		
		//OJO!! system .out y system.error ytabajan con flujos diferentes
		//de salidas, pot lo tanto si dos sestencias estan muy juntas
		//puede que salgan de manera diferente
		
		// en java tenemos una manera de recojer la unformacion a travez de
		//la consola, es mediante "system.in"
		//lamentablemente debemos de apoyarnos en otras clases para
		// recoger la info a partir de este "system,in"
		//el caso mas habitual es mediante la clase "scanner"
		
		//para ellos tenemos que crear variable de tipo Scanner 
		//y su correspondente objeto,diciendole que lea de "system.in"
		Scanner sc = new Scanner(System.in);
		//para utilizar esta clase debemos de importar el paquete domde se encuentra 
		//y las importaciones de paquetes se ponen al princio de la clase import 
		//eje: java.util.Scanner;
		// el concepto de pequete es muy similar al concepto de directorio 
		// si ponemos scan y pulsamos "cntrl + espacio" no debe importar automaticamente la clase
		// una vez creada la variable y el objeto, podemos empezar a usar metodos del objeto
		// para captirar la informacion. Los metodos son funcionalidades
		//que puede aplicar los objetos
		//invocamos un metodo de un objeto mediante operador ".2
		// mediante el metodo" nextline"
		//(notese como al fianl hay un parentesis)
		//El programa se quedara parado en esaa linea hasta que el usuario
		// introduzca una frase para leer y pulse ENTER
		//nota: podemos observar como el programa sigue en ejecucion 
		//porque hay un cuadrado rojo en eclipse
		System.out.println("introduzca una frase para leer:");
		// normalmente el valor que introduzca el usuario debemos
		// de almacenarla en algun lugar, como puede ser una variable
		// en esrte caso como queremos leer una frase, vamos a utilizar
		// un string
		// el metodo "nextline" duevuelve un string, es por ello que
		//usanios una variable " string" para almacenar el resultado
		String frase = sc.nextLine();
		System.out.println("el usuario a introducido la frase"+ frase);
		
		// una vez creada el scanner no es necesario crearlo mas 
		frase = sc.nextLine();
		System.out.println("La segunda frase introducida por el usuario es:"+ frase);
		// la clase scanner tiene metodos para recoger distintos tipos de datos
		//si queremos recoger un entero, debemos utilizar "nextInt()"
		// mo podemos guardar un int en una variable string s4 = 4; error
		System.out.println("introduzca un numero");
		String s1 = sc.nextLine();
		System.out.println("introduzca otro numero");
		String s2 = sc.nextLine();
		String s3 = s1 + s2;
		System.out.println("la concatenacion de s1 y s2 es:"+ s3);
		int n1 = sc.nextInt();
		System.out.println("introduzca un numero");
		int n2 = sc.nextInt();
		int n3 = n1 + n2; //suma
		System.out.println("el resultado de la suma de n1 y n2 es" + n3);
		
		// otros metodos 
		System.out.println("introduzca un long");
		long l1 = sc.nextLong();
		System.out.println("el primero long es:"+ l1);
		// ojo porteclado se pone el punto flotante por ','
		// pero en java se guarda con '.'
		System.out.println("introduzca un double ( la coma flotante va separada por ',')");
		double d1 = sc.nextDouble();
		System.out.println("el numero doble es"+ d1);
		
		// tenemos un metodo para cada uno de los tipos primitivos
		// float f1 = sc.nextFloat();
		// OJO!! si recoges un tipo de dato y lo guardas en otro diferente
		// puede dar error
		System.out.println("introduzca un numero; ojo!un numero!");
		// si deecis a java que quereis un numero y es un string
		// daria una excepcion en tiempo de ejecicion, concretamente
		//"java.util.inputMismatchExepttion
		// puede tambien ocurrir si poneis un " nextInt()" y poneis un doble
		
		
		int n4 = sc.nextInt(); // solo podemos poner por teclado un int
		System.out.println(" el nuemro es :" + n4);
		
		
		
	}

}

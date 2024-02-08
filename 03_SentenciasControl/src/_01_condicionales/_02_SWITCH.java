package _01_condicionales;

import java.util.Scanner;

public class _02_SWITCH {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//LA SENTENCIA SWITCH es equivalente a un 'else if-if-else'
		//tiene la siguente estructura que podemos hacer poniendo
		//swi y pulsando "cntrl + espacio"
		// podemos encontrar las siguemntes partes
		//parte switch , entre parentesis ponemos la variable booleana a valorar
		int numero= 5;
		switch (numero) {
		//podemos tener de 1 a N "case", que seran cada uno de los valores
		//que puede tomar la variable switch
		case 0:
			System.out.println("el numero es 0");
			break;//esta palanra reservada hace que dejemos de ejecutar la sentencia
			//"switch", y no entre por otros "case" o por el "default"
		case 1:
			System.out.println("el numero es 1, no es 0");
			break;
		case 2:
			System.out.println("el numero es 2, no es ni 0,ni 1");
			break;
		default:// equivalente a else// i no cumple ninguno de los casos anteriores
			//entaria por la sentencia "default"
			System.out.println("el numero no es ni 0, ni 1, ni 2");
			break;
		}
		
		
		//Otro ejemplo
		
		System.out.println("introduzca un numero del 1 al 7:");
		
		numero= sc.nextInt();
		switch(numero) {
		case 1:
			System.out.println("el dia es lunes");
			break;
			
			case 2:
				System.out.println("el dia es martes");
				break;
						
				case 3:
					System.out.println("el dia es miercoles");
					break;
				case 4:
					System.out.println("el dia es jueves");
					break;
				case 5:
					System.out.println("el dia es viernes");
					break;
				case 6:
					System.out.println("el dia es sabado");
					break;
				case 7:
					System.out.println("el dia es domingo");
					break;
					default:
						System.out.println("el numero introducido no corresponde a un dia de la semana");
						break;
		}
		// en que casos puede se interesante no poner el break
		//normalmente cuando queremos que varios casos se comporten de la misma manera
		// en este ejemplo vamos a detectar si el numero introducudo pertenece a un dia lectivo o 
		//un fin de semana
		System.out.println("introduzca un numero del 1 al 7:");
			
		
		
		numero= sc.nextInt();
		switch(numero) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			//podemo poner varias sentencias en el case para ejecutar 
			//sin necesidad de crear "bloques"
			System.out.println("el numero introducido es de 1 -5");
			System.out.println("el dia es lectivo");
			break;
		case 6:
		case 7:
			System.out.println("el dia es fin de semana");
			break;
		default:
				System.out.println("el numero introducido no corresponde a un dia de la semana");
						break;
		}
		
		System.out.println("Fin del programa");
	}

}

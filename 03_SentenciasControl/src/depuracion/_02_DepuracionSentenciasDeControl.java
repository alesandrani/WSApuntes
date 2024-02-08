package depuracion;

import java.util.Scanner;

public class _02_DepuracionSentenciasDeControl {

	public static void main(String[] args) {
		// podemos depurar sentencias de controlcon la misma
		//metodologia
		
		Scanner sc=new Scanner(System.in);
		System.out.println("introduzca un numero");
		int numero1 = sc.nextInt();
		if(numero1==0) {
			int numero2 =56;
			System.out.println("el numero es 0");
		}
		
		for(int i = 0;i <= 100;i++) {
			System.out.println("la variable de control de bucle es :"+ i);
			if(i==50) {
				if(numero1 !=0) {
					
				}
				System.out.println(12/numero1);
			}else {
				System.out.println("no se puede dividir por 0");
			}
		}
		System.out.println("fin del programa");
		
	}

}

package _02_bucles;

public class _04_AnidamientoBucles {

	public static void main(String[] args) {
		//es muy habitual anidar tambien bucles al igual que anidamos bloques if
		//se suele usar para recorrer o implementar matrices bidimencionales
		//por ejemplo, si se pidiera imprimir por pantalla la tabla de multiplicar de los 10 primeros numeros naturales
		
		System.out.println("tabla de multiplicar del 1");
		for(int i=1;i<=10;i++) {
			System.out.println("1x"+i+"es igual a"+(i*1));
		}
		System.out.println("tabla de multiplicar del 1");
		for(int i=1;i<=10;i++) {
			System.out.println("2x"+i+"es igual a"+(i*1));
		}
		//de esta manera si nos pidieran imprimir las tablas de multiplicar
		//de los 1000 numeros,tendriamos repetirlo 1000 veces
		//por eso usamos anidiamiento de bucles
		
		//este bucle va a llevar el control del numero de veces que queremos repetir
		
		for(int i=1;i<= 10;i++) {
			System.out.println("tabla de multiplicar "+ i);
			for(int j=1; j<=10;j++) {
				System.out.println(j+"x"+ i+ " es igual a "+ (j*i));
			}
		}
		
		//podemos   
		 //trabajar con 3 dimenciones
		
		for(int i=1;i<= 10;i++) {
			
			for(int j=1; j<=10;j++) {
				for(int k=1; k<=10;k++) {
					System.out.println("coordenadas: "+"("+i+","+j+","+ k +")");
				}
			}
		}
		
		
	}

}

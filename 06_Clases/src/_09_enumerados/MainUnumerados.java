package _09_enumerados;

import java.util.Scanner;

public class MainUnumerados {

	public static void main(String[] args) {
		//para acceder para un enumerado en concreto lo haremos a travez de su clase
		//con un punto y luego el nombre del enumerado
		System.out.println(TipoVia.CALLE);
		System.out.println(TipoVia.AVENIDA);
		//podemos recorrer todos los tipos como un array
		//con el metodo values
		System.out.println("Accediendo recoriendo el array");
		for(int i=0;i<TipoVia.values().length;i++) {
			System.out.println(TipoVia.values()[i]);
		}
		System.out.println("Accediendo recoriendo el array");
		
		for(TipoVia tv : TipoVia.values()) {
			
			System.out.println(tv);
		}
		//podemos utilizar los enumerados para mostrarlos al usurio
		Scanner sc = new Scanner(System.in);
		System.out.println("seleccione el tipo de via");
		for(int i=0;i<TipoVia.values().length;i++) {
			System.out.println(i+"-"+TipoVia.values()[i]);
	}
		int seleccion = sc.nextInt();
		TipoVia tv = TipoVia.values()[seleccion];
		System.out.println("ud ha seleccionado: " + tv);
		
		//trabajando con enumerados dentro de la clase
		Direccion d1 = new Direccion();
		Persona p1 = new Persona();
		d1.setTipoVia(TipoVia.AVENIDA);
		p1.setDireccion(d1);
		System.out.println(p1);
		d1.setTipoVia(TipoVia.CAÑADA_REAL);
		System.out.println(p1);
	}
}

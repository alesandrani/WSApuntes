package _01_basico;

import java.util.LinkedList;
import java.util.List;

public class MainInterface {

	public static void main(String[] args) {
		//una intefaz no se puede intanciar
		//InterfaceBasica1 ib1 = new InterfaceBasica1();
		ClaseBasica1 cb1 = new ClaseBasica1();
		cb1.metodo1();
		String cadena = cb1.metodo2("soy un objeto tipo String");
		System.out.println(cadena);
				 int resultado = cb1.operacion(3,5);//suma 8
				 System.out.println("--------------------------------");
				 
				 ClaseBasica2 cb2 = new ClaseBasica2();
				 cb2.metodo1();
				cadena = cb2.metodo2("soy otro objeto de tipo to string");
				 System.out.println(cadena);
				 resultado = cb2.operacion(3,5);
				 System.out.println(resultado);
				 
				 System.out.println("______________________");
				 List<InterfaceBasica1> listaInterfaces = new LinkedList<InterfaceBasica1>();
				 listaInterfaces.add(cb1);
				 listaInterfaces.add(cb2);
				 
				 int numero1 = 4;
				 int numero2 = 6;
				 
				 for(InterfaceBasica1 ib1 : listaInterfaces) {
					 //Polimorfismo
					 System.out.println(ib1.operacion(numero1 ,numero2));
				 }
		

	}

}

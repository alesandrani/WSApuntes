package _01_basico;

public class ClaseBasica2 implements InterfaceBasica1 {

	@Override
	public void metodo1() {
	System.out.println("esto e el metodo 1 de la clase 2");

	}

	@Override
	public String metodo2(Object o) {
		String cadena = "Este seria el metodo 2 de la clase basica 2 que invocamos to string " + o.toString();
		return cadena;
	}
/**
 * operacion multiplicacion
 */
	@Override
	public int operacion(int a, int b) {
		int multi = a *b;
		
		return multi;
	}

}

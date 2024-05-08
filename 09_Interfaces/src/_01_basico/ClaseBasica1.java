package _01_basico;
/**
 * Para que una clase implemente una interfaz debemos de usar la palabra reservada "implements"
 */
public class ClaseBasica1 implements InterfaceBasica1{

	@Override
	public void metodo1() {
		System.out.println("esto seria el metodo 1");
		
	}

	@Override
	public String metodo2(Object o) {
		String cadena = " esto es el metodo 2 invocanto toString ver objeto pasado" + o.toString();
		return cadena;
	}
	/**
	 * Implementamos operacion suma
	 */
	@Override
	public int operacion (int a, int b) {
		int resultado = a + b;
		return resultado;
	}

}

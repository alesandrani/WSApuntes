package _02_ejemplo_imprimir;

public class ImprimirImpresora implements Imprimible{


	public void imprimir(String cadena) {
		String IP = "192.168.56.13";//supongamos que la impresora esta aqio
		//simulamos la impresion por impresora
		System.out.println("imprimiendo por impresora : "+ cadena);
		
	}

}
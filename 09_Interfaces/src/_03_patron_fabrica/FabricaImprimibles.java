package _03_patron_fabrica;

import _02_ejemplo_imprimir.Imprimible;
import _02_ejemplo_imprimir.ImprimirFichero;
import _02_ejemplo_imprimir.ImprimirImpresora;
import _02_ejemplo_imprimir.ImprimirPantalla;

/**
 * el patron fabrica es muy usado en la undustria y sirve como fabrica de objetos comunes
 * que normalmente  siguen una interfaz o clase abstracta
 * 
 *el objetivo de esta clase es hacer que estos objetos
 *creen otros objetos de tipo imprimible
 *
 *este seria el principio de la inyeccion de dependencias
 */
public class FabricaImprimibles {
	
	public Imprimible crearImprimible(String nombre) {
		Imprimible i = null;
		if(nombre.equals("Pantalla")) {
			i = new ImprimirPantalla();
			return i;
		}else if(nombre.equals("Fichero")) {
			i = new ImprimirFichero();
			return i;
			
		}else if(nombre.equals("Impresora")) {
			i = new ImprimirImpresora();
			return i;
		}else {
			return null;
		}
	}

}

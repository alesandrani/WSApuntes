package _05_listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import _04_basico.vehiculos.Coche;

public class MainListas {

	public static void main(String[] args) {
		//Java tiene ya muchas interfaces predefinidad
		//Una de las interfaces mas importantes "List"
		
		//en este intefaz se definen los metodos que tienen
		//implementar TODAS las clases que implementen
		//La interfaz "List", las mas importantes son:
		//La clase ArrayList y LinkedList
		//La implentacion de ArrayList es una implementacion que es muy buena
		//cuando queremos reccorer la lista muchas veces ,pero no suele cambiar de tamaño
		
		//La implementacion LinkedList cuando la lista cambia mucho de tamaño pero en cambio no la recorremos demasiado
		
		List<Coche> listaArrayCoches = new ArrayList<>();
		listaArrayCoches.add(new Coche());
		
		LinkedList <Coche> listaLinkedCoches = new LinkedList<>();
		//como ambas listas implementan interfaz list tenemos los mismos metodos
		// por lo tanto para nosotros no habra diferencia de como vamos a usar ambas listas
		
		listaLinkedCoches.add(new Coche());
		recorrerLista(listaLinkedCoches);
		recorrerLista(listaArrayCoches);
		
		//creamos la persona con sus coches
		 Persona p = new Persona();
		 p.setNombre("Guillermo cumpleañero");
		 Coche c1 = new Coche();
		 Coche c2 = new Coche();
		List<Coche>listaCoches = new ArrayList<>();
		 listaArrayCoches.add(c1);
		 listaArrayCoches.add(c2);
		 p.setListaCoches(listaCoches);

	}
	public static void recorrerLista(List<Coche>lista) {
		System.out.println(lista);
	}

}

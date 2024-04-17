package _02_basico;

import java.util.ArrayList;

public class MainVehiculos {

	public static void main(String[] args) {
		Avion avion = new Avion();
		avion.setFechaFabricacion("23/12/2009");
		System.out.println(avion.esAntiguo());
		
		Moto moto = new Moto();
		moto.setFechaFabricacion("23/12/2009");
		System.out.println(moto.esAntiguo());
		
		Barco barco = new Barco();
		barco.setEsPirata(true);
		barco.setFechaFabricacion("23/12/2003");
		barco.setMarca("La sirena feliz");
		barco.setPeso(3500);
		barco.setVelocidad(20);
		
		//La capoacidad de que una referencia ejecute un metodou otro
		//dependiendo del objeto al que estamos apuntando se llama polimorfismo
		
		System.out.println(avion);
		System.out.println(barco);
		System.out.println(moto);
		
		//Con una una referencia de una clase padre(superirio) podemoa apuntar
		//a cualquier objeto inferior o hijo
		//OJO! No podemos hacerlo al reves, con una referencia inferior hija no podemos
		//apuntar a un objeto superior(padre)
		
		Vehiculo v1 = new Coche();
		//VehiculoTerrestre vt = new Moto();//SI
		//Moto m1 = new Coche();//NO
		
		// Importante! aunque con una referencia superiror podemos apuntar a los objetos inferirores
		//SOLO podemos usar los metodos o
		//atributos que tenga la referencia
		//Vehiculo v2 = new VehiculoTerrestre();//si
		//v2.get.moto();// NO
		//v2,get,matricula();NO
		Vehiculo v3 = new Moto();
		//v3.getVelocidad();SI
		//v3.getTipoMOto();//NO
		
		//Nos podriamos preguntar para que vamos a usar una referencia padre en vez de la hija?
		//La respuesta es aunque no podamos usar todos los metodos del objeto hijo ganamos en versatilidad
		//es decir podemos apuntar con todo lo que conlleva y utilizar todos los metodos de la referencia.
		
		//Imaginaos que os pido gurdar todos los objetos que pide el usuario en memoria
			ArrayList<Moto> listaMotos = new ArrayList<>();
			listaMotos.add(moto);
			//listaMotos.add(avion);NO
			
			ArrayList<Avion> listaAviones = new ArrayList<>();
			listaAviones.add(avion);
			
			ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
			listaVehiculos.add(moto);
			listaVehiculos.add(barco);
			listaVehiculos.add(avion);
			System.out.println("***********************");
			for(Vehiculo v : listaVehiculos) {
				//Mediante polimorfismo el metodo que se ejecutara sera
				//el del objeta al que estamos apuntando No el metodo de la referencia
				
				//en este caso,segun dependiendo del objeto al que estemos apuntando se ejecutara su metodo toString o esAntiguo
				System.out.println(v.toString());
				System.out.println(v.esAntiguo());
			//System.out.println(v.esPirata());
			}
	}

}

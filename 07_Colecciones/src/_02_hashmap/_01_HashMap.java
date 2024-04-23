package _02_hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class _01_HashMap {

	public static void main(String[] args) {
		// Tenemos otro tipo de estructuras muy importantes que son
		// las llamadas hash, diccionarios o arrays asociativos,
		// segun el lunguaje que estemos usando

		// este tipo de estructuras se caracterizan por tener una clave y un valor
		// asociado, a partir de una clave podemos acceder o modificar un valor

		// Solamente puede haber una clave.En caso de se pongan dos claves iguales el
		// valor se sobreescribe
		// para crear una esctructura tipo hash podemos usar la clase

		HashMap<String, Double> hashmapCuidadTemperatura = new HashMap<>();
		// podemos establecer claves y valores con el metodo put()
		hashmapCuidadTemperatura.put("Madrid", 10.0);
		hashmapCuidadTemperatura.put("Barcelona", 11.0);

		// podemos acceder a los valores con el metodo get()
		Double temperatura = hashmapCuidadTemperatura.get("Madrid");
		System.out.println(temperatura);
		temperatura = hashmapCuidadTemperatura.get("Barcelona");
		System.out.println(temperatura);
		// Si accedemos a una clave que no existe te devulve NULL
		temperatura = hashmapCuidadTemperatura.get("Zaragoza");
		System.out.println(temperatura);

		// Las claves son CASE SENSITIVE
		// no es lo mismo "Madrid" que "MADRID"
		temperatura = hashmapCuidadTemperatura.get("MADRID");
		System.out.println(temperatura);

		// el objetivo de los haspmap es diferente a lo de los array
		// sirven para hacer la busqueda rapida
		// no suele servir para recorrerlos

		// si se quiere recorrer lo mejor es una funcion lambda
		hashmapCuidadTemperatura.forEach((k, v) -> {
			System.out.println("clave: " + k.toString());
			System.out.println("valor: " + v.toString());
		});

		ArrayList<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Gallego");
		listaNombres.add("Marquitos");
		listaNombres.add("Guillermo");

		// con funciones
		listaNombres.forEach( v -> System.out.println("Nombre: "+ v));
		
		//Si ponemos la misma clave se sobreescribe el valor
		hashmapCuidadTemperatura.put("Madrid", (double)7);
		System.out.println(hashmapCuidadTemperatura.get("Madrid"));
		
		//Java soporta la inferencia de tipos
		//esta caracteristica permite definir el tipo de la variable
		//en el momemnto de asignar el primer valor, pero ojo!! wl tipo de la variable
		//siempre sera del tipo del valor _ no se puede cambiar
		// no confundir con los lenguajes no tipados
		var numero1 = 34.0;//el tipo de sta variable sera double y lo sera siempre
		System.out.println(numero1);
		//numero1 = true; no podemos apuntar con un double a un boolean
		numero1 = 45.0;
		var numero2 = 100; // el tipo sera Integer
		// Los tipos inferidos solo para variables, no se pueden usar en los atrubutos
		

	}
}

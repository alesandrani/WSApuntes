package _01_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_ArrayList {

	public static void main(String[] args) {
		//Los arrays "normales" en java, tienen un problema y es que son
				//estáticos, es decir, una vez creado el array, el tamaño no
				//puede cambiar nunca. Si creamos un array de 5 elementos
				//sólo podrá tener 5 elementos.
				
				String[] arrayStrings1 = new String [5];
				//auqneu no tenga ningún elemento el array si pregunto
				//por su tamaño, me dice 5.
				System.out.println(arrayStrings1.length);
				
				//Normalmente, este tipo de array NO se suele utilizar
				//en su lugar se utilizan arrays dinámicos, es decir
				//arrays que se amplia el tamaño en tiempo de ejecución.
				//Dicho de otra manera, nunca se llenan.
				
				//la clase ArrayList tiene que parametrizar
				//se pone entre <> el tipo de dato que queremos que contenga
				
				
				ArrayList<String> listaString1 = new ArrayList<String>();
			//si preguntamos por el tamaño del array
				System.out.println(listaString1.size());
				
				//con arrays normales tenemos que tener siempre en cuenta
				//la posicion del array que estsmos usando
				arrayStrings1[0]= "Tom Sawyer";
				arrayStrings1[1]= "Scooby Doo";
				
				//con arraylist no necesitamos controlar ultima posicion
				//usada,podemos usar el metodo ""add" que añade automaticamente
				//a la ultima posicion libre
				
				listaString1.add("Son goku");
				listaString1.add("Vegetal");
				
				//para recorrer arrays es igual con dif
				for(String s : arrayStrings1) {
					System.out.println(s);
				}
				for(String s : listaString1) {
					System.out.println(s);
				}
				
				//accediendo a elementos concretos
				System.out.println(arrayStrings1[0]);
				System.out.println(listaString1.get(0));
				
				//estas 2 sentencias dan excepciones
				//System.out.println(arrayStrings1[2]);ArrayIndexOutOfBoundsException
				//System.out.println(listaString1.get(2));IndexOutOfBoundsException
				
				//podemos rellenar posiciones concretas
				listaString1.set(1, "Broly");
				
				//notese la diferencia de imprimir directamente un array y un arrayList
				System.out.println(arrayStrings1);
				System.out.println(listaString1);
				System.out.println(Arrays.toString(arrayStrings1));
				//podemos añadir un elementoa una posicion dada y desplazaria los demas 
				//[Son goku, Freezer, Broly]

				
				listaString1.add(1,"Freezer");
				System.out.println(listaString1);
				
				//si queremos usar la parametrizacion de arraylist NO admiten primitivos
				//pero java invento los tipo "wrapper"de los primitivos
				//dicho de otra manera , todos los primitivis tienen su equivalente a objeto
				int numero1 =5;
				Integer numeroObjeto1 = new Integer(5);
				
				//normalmente esta el concepto de autowrapper que hace
				//que java convierta directamente un primitivo a un objeto
				Integer numeroObjeto = 5;
				// los objetos de tipo wrapper son inmutables . es un objeto el cual no se puede 
				//cambiar nunca del valor de sus atributos(( o el  tb llamado el stack)
				
				// la clase string tambien es inmutable
				String s = "Sherlok";
				s = "Dr Wattson";
				
				String s2 = "Sherlok";
				numeroObjeto = 6;
				
				//existen tipos wrapper para todos los primitivos que se suelen llamar igual 
				//que el primitivo, pero la primera letra en mayuscula
				double d1 = 4.5;
				Double d2 = 5.6;
				Boolean b1 = true;
				Float f1 = 5.6F;
				Character c1 = 'f';
				Byte byte1 = 23;
				
				//arraylist<int> listaEnteros =new ArrayList<>();
				ArrayList<Integer> listaEnteros = new ArrayList<>();
				//operador diamante, desde 1.7 y dice que no es
				//necesario crear el objeto con la parametrizacion
				//automaticamente coge la referencia
				ArrayList<Double> listaDoubles = new ArrayList<>(); 
				
 	}

	
}

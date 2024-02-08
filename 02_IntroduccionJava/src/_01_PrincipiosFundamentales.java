//Esto es un comentario en Java
//Los cometarios soexplicaciones que ponemos en nuesro codigo
//Para ciertas pates del mismo
//Son muy utiles para nosotros y para los futuros desarolladores que lean nuestro codigo
// los cometrarios en Java empiezan por"//"

//Las lineas en java no se recomiendan que rasen de 80 caracteres
/*poniendo los comentarios con este formayo podemos poner comemtarios
 *  de varias lineas sin necesidad
 *  de estar poniendo todo el rato "//"
 *  //el formato seria "* *"
// Java es un lenguajede programacion orientado a objetos, por lo que 
 //tenemos que usar clases para poder arrancar nuestro programa
 // las clases se escriben con notacion UpperCamerCase.es muy importante
 //seguir las convenciones de codigo en java
*/
public class _01_PrincipiosFundamentales {

	// Para hacer que un programa sea ejecutable, tenemos que crear una clase
	// y dentro e la clase tenemos que poner el metodo "main", es un metodo
	// que tiene que llamarse exactamente igual a como sigue.

	// Al crear la clase con el editor de java podemos seleccionar la casilla
	// de "crear el metodo main" para que no lo cree.

	// En caso de que se nos olvide. Podemos escribir la palabra "main" y a
	// continuacion pulsar "cntrl+espacio"para que la ayuda de eclipse nos
	// ayude a complementarlo

	public static void main(String[] args)	{
		// un problema en java empieza en la linea siguente al metodo "main"
		// y acaba cuando salga del dicho metodo. notese que los metodos siempre
		// tienen bloques asociados, los bloques de unmetodo estan dilimitados
		// por los simbolos "´{ }"

		// los programas en java se ejecutan se manera secuencial
		// es decir, van en linea ejecutando las sentencias que se van encontrando
		// una sentencia es un comando, una orden o una instruccion que le damos
		// al programma.

		// la sentencia mas simple que podemos ejecutar en java es la de imprimir
		// por pantalla
		// OJO! las sentencias en java acaban con ";"
		System.out.println("este literal se imprimira por pantalla cuando lo ejecutemos");
		// notese es que la sintencia de arriba imprime por pantalla y LUEGO hace un
		// salto
		// de linea
		// si queremos imrirmir por pantalla sin hacer salto de linea, usaremos la
		// sintencia:
		System.out.println("esto seria imprimir sin salto de linea");
		System.out.println("podemos observar como lo imprime seguido");
		System.err.println("ahora lo imprimimos seguido");

		// es muy importante que seais ordenados en el codigo FUNTAMENTAL,debeis
		// de respetar la tabulaciones, los saltos de linea, etc.
		// eclipse tiene manera de para ayudaros a mantener el orden simpre que
		// el codigo no contenga errores.
		// para ello selecionamos todo el codigo que queremos poner el orden.
		// con el raton tambien podemos pulsar "contrl + a " a continuacion pulsamos boton derecho
		// y vamos a "source" y luego a "format"
		//OJO! siempre que cambiemos algo de nuestro codigo debemos de guardarlo para que
		// el compilador de java se de cuenta de dichos cambios. podemos guardar los cambios
		// con el "cntrl+s"
		
	// IMPORTANTE! Si cometemos un error al escribir el cogigo, nos dará un error en tiempo
	// de complicacion, y probablemente no se permita la ejecucion del programma
	// Por ejemplo, si no ponemos ";" al final de una sentencia, o escribimos mal el nombre
	// de una sentencia.. Hay muchas maneras de cometer estos errores.
	// poniendo el cursor del mouse sobre el error podemos intentar sacar informacion del mismo
	//System.out.println("esto seria un error por no poner ";" al final")
	}// Fin del metodo "MAIN". Aqui acabaria nuestro programa de java
	
	// Las sentencias van siempre dentro de metodos, si poneis sentencia fuera de los
	// metodos no van a funcionar.
}	// Fin de la clase.

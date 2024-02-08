package clases;

import java.util.Date;

public class _04_Date {

	public static void main(String[] args) {
		// la manera mas basica de trabajar con fechas en java
		//es con la clase date.
		
		//la clase date toma como referencia de la hora la del sistema operativo
		//cuando intanciamos(crear)la clase date obtendremos la hora del sistema
		//donde estemos ejecutando el programa
		
		// ojo la clase date que normalmente usaremos sera la
		//del paquete java.util
		Date fecha= new Date();
		System.out.println(fecha);
		
		//internamente la clase date loq ue guarda es el numero de milisegundos que
		//han pasado desde el 01/01/1970 a las 00:00:00
		// tambien llama hora UNIX. Se guarda en una variable de tipo long
		//podemos acceder a ella
		System.out.println(fecha.getTime());
		
		// si queremos manejar fechas debemos de basarnos en otras clases
		//la clase date tiene casi todos sus metodos OBSOLETOS(deprecated)
		//los metodos obsoletos se matienen para hacer retrocompatibilidad
		//entre versiones superiores de java frente a las inferiores,pero
		//nos dicen que hay otras maneras mejores de gacer la funcionalidad
		System.out.println(fecha.getDay()); // los dias del 0 al 6
		System.out.println(fecha.getMonth()); // los meses van del 0 al 11
		System.out.println(fecha.getYear());
		// hay una manera mas facil de obtener el numero de milisegundos
		System.out.println(System.currentTimeMillis());
		long tiempo= System.currentTimeMillis()- fecha.getTime();
		System.out.println(tiempo);
	}

}

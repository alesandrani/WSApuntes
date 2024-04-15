package _01_basico;
/**
 * En java, para heredar una clase de otra se usa la palabra reservada "extends" despues del nombre de la clase.
 * Y a continuacion el nombre de la clase padre
 */
public class Alumno extends Persona{
	//Automaticamente la clase alumno tiene todos los atributos de la clase Persona (nombre , edad)
	//asi como sus metodos (presentarse())
	
	public String curso;
	public boolean esCiencias() {
		if(curso.equals("DAM")) {
			return true;
		}else {
			return false;
		}
	}
	
	
	/*
	 * Existe un concepto muy importante en la herencia conocido como "la sobreescritura o override de metodos"
	 * Para sobreescribir un metodo debemos de crear un metodo en la clase "hija" con la misma firma que el metodo "padre"
	 * Cuando sobreescribimois un metodo queremos darle un comportamiento diferente al de la clase padre
	 * 
	 * 
	 * La anotacion @override sirve para comprobar que el metodo existe en la clase padre y lo estamos sobreescribiendo
	 * en caso de que el metodo no exista en la clase padre daria error en tirempo de compilacion
	 * 
	 */
	
	@Override
	public void presentarse() {
		System.out.println("hola soy el alumno muñon de nombre :" + this.nombre);
	}
}

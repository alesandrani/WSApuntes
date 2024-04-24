package _05_casting;
/**
 * Las clases en java  heredan de la clase object
 * por lo tanto todas las clases van a heredar sus metodos
 * 
 * 
 */
public class Alumno extends Persona{
	
	
	public String curso;
	public boolean esCiencias() {
		if(curso.equals("DAM")) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public void presentarse() {
		//como el nombre es private, solo podemos acceder a el mediante el metodo accesor o el metodo modificador
		
		System.out.println("hola soy el alumno muñon de nombre :" + this.getNombre());
		//como atributo edad es protective no necesitamos el metodo accesor, podemos acceder  a el directamente
		System.out.println("y tambien tengo " + this.getEdad());
	}
}

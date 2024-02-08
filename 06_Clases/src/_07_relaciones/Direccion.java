package _07_relaciones;
//esta clase tendra como atributos los valores que queriamos poner 
//si fuera una cadena
public class Direccion {
	String tipoVia;
	String nombreVia;
	String cuidad;
	String cp;
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", cuidad=" + cuidad + ", cp=" + cp + "]";
	}
	

}

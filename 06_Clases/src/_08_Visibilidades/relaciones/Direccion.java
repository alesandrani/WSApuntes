package _08_Visibilidades.relaciones;
//esta clase tendra como atributos los valores que queriamos poner 
//si fuera una cadena
public class Direccion {
	private String tipoVia;
	private String nombreVia;
	private String cuidad;
	private String cp;
	public Direccion() {
		super();
	}
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getCuidad() {
		return cuidad;
	}
	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", cuidad=" + cuidad + ", cp=" + cp + "]";
	}
	

}

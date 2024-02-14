package _08_Visibilidades;
//normalmente las clases que respresentan entidades en java
//siguien la convencion JavaBean, ya que muchas app la exigen para que funcione

//esta convencion dice :
//1. atributos privados
//2. metodos accsesores y modificadores (setter y getters)
//3.constructor por defecto
public class Pokemon {
	private int vida;
	private String nombre;
	private int experiencia;
	public Pokemon() {
		super();
	}
	public Pokemon(int vida, String nombre, int experiencia) {
		super();
		this.vida = vida;
		this.nombre = nombre;
		this.experiencia = experiencia;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		if(vida<0) {
			this.vida= 0;
		}else {
			this.vida = vida;
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	
}

package _01_basico.animales;
/**
 * Si heredamos de una clase que tiene metodos abstractos tenemos 3 opciones:
 * 
 * 1. declarar la clase como abstracta, esta opcion podemos hacer en caso
 * de que no sepamos implementar los metodos abstractos
 * 2. implementar los metoos abstractos, en ste caso debemos de saber hacerlo
 * 3. declarar la clase como abstracta y implementar sus metodos
 */
public abstract class Pez extends Animal {
	private int numeroAletas;

	@Override
	public void comer(Object o) {
		if(o instanceof Alga) {
			Alga alga = (Alga)o;
			double pesoAumentar = alga.getPeso() * 0.10;
			this.setPeso(this.getPeso() + pesoAumentar);
			System.out.println("Soy un/una " +this.getClass().getSimpleName()+"de nommbre" +  this.getNombre()+ " y voy a comerme"
					+ "y me voy a comerme un alga ñam ñam:):)");
		}else {
			System.out.println("PUAJ! Eso no me gusta:(");
		}
		
	}

	@Override
	public String toString() {
		return "Pez [numeroAletas=" + numeroAletas + ", getSexo()=" + getSexo() + ", getPeso()=" + getPeso()
				+ ", getEdad()=" + getEdad() + ", getNombre()=" + getNombre() + "]";
	}
}

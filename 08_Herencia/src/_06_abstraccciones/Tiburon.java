package _06_abstraccciones;

public class Tiburon extends Pez {

	@Override
	public void comer(Object o) {
		//super es una referencia a la clase padre
		//super.comer(o); invocando el comer del pez
		if(o instanceof Pez) {
			Pez pez = (Pez)o;
			double pesoGanado = pez.getPeso() * 0.30;//Aqui si aplicamos polimorfismo
			this.setPeso(this.getPeso() + pesoGanado);
			System.out.println("Soy el tiburon " + this.getNombre()+ "y me voy a " +
			"comer al pez "+ pez.getNombre());
		}else {
			System.out.println("Soy un tuburon y solo como peces:(");
		}
	}

}

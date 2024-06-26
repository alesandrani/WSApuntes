package _04_basico.animales;

public class Leon extends Animal {

	@Override
	public void comer(Object o) {
		if(this == o) {
			System.out.println("No me pienso comer a mi mismo :)");
			return;
		}
		if(o instanceof Animal) {
			Animal animal = (Animal) o;
			double pesoGanado = animal.getPeso();
			this.setPeso(this.getPeso() + pesoGanado);
			System.out.println("Soy el leon "+ this.getNombre() + " y me voy a comer " 
			+ "al tipo de animal "+ animal.getClass().getSimpleName());
		}else {
			System.out.println("Soy un leon y solo como animales:) arrrr");
		}
		
	}

	@Override
	public void moverseLento() {
		double movimiento = 150 - (getPeso() * 0.10);
		System.out.println("Soy un leon y me muevo " + movimiento);
		
	}

	@Override
	public void moverseRapido() {
		double movimiento = 300 - (getPeso() * 0.10);
		System.out.println("Soy un leon y me muevo " + movimiento);
		
	}

}

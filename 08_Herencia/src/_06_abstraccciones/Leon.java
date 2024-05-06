package _06_abstraccciones;

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

}

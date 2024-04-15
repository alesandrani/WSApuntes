package _02_basico;

public class Avion extends Vehiculo {
	private int numeroAlas;

	@Override
	public boolean esAntiguo() {
		//Como el etributo fechafabricacion es private no podemos acceder a el directamente
		// hay que usar ger
		
		String sAnio = this.getFechaFabricacion().split("/")[2];
		int iAnio = Integer.parseInt(sAnio);
		if(iAnio < 2010) {
			return true;
		}else {
			return false;
		}	}

	public int getNumeroAlas() {
		return numeroAlas;
	}

	public void setNumeroAlas(int numeroAlas) {
		this.numeroAlas = numeroAlas;
	}
	
	public boolean puedeVolar() {
		if(this.getPeso() < 100000 && this.numeroAlas <=2) {
			return true;
		}else {
			return false;
		}
	}

}

package _04_ayuda_eclipse;

public class _01_MainEclipse {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona("pepon");
		p2.peso = 123.89;
		Persona p3 = new Persona("Pepin", 15,56,false);
				System.out.println(p1);
				System.out.println(p2);
				System.out.println(p3);
				
				//por defecto los objeto se imprimen por defecto con ese formato
				//NOMBRE_COMPLETO_CLASE@CPDIGO_HASH
				//PERO, si sobreescribimos el metodo to SDtring() de la clase podemos
				//darle el formato que queramos
		

	}

}

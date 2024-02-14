package _08_Visibilidades;

public class MainVisibilidad {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante();
		//e1.nombre = "pepe";
		//e1.edad = 18;
		//e1.peso = 57,68;
		e1.dni ="456789";
		e1.setNombre("P");
		System.out.println(e1.getNombre());
		

	}

}

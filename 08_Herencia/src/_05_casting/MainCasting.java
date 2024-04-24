package _05_casting;

import java.util.ArrayList;

public class MainCasting {

	public static void main(String[] args) {
		Docente d1 = new Docente();
		d1.salario = 2000;
		d1.setNombre("DR. Bacterio");
		d1.setEdad(56);
		
		Alumno a1 = new Alumno();
		a1.setNombre("Felipe");
		a1.setEdad(21);
		a1.curso = "Entornos de desarollo";
		
		Persona p1 = d1;
		//System.out.println(p1.salario);
		System.out.println(d1.salario);
		
		ArrayList<Persona>listaPersonas = new ArrayList<>();
		listaPersonas.add(a1);
		listaPersonas.add(d1);
		
		//listaPersonas.forEach(v -> System.out.println(v.getNombre()));
		//listaPersonas.forEach(v -> v.presentarse());
		
		for(Persona p : listaPersonas) {
			p.presentarse();
		}
		
		metodoRecibirListas(listaPersonas);
		

	}

	private static void metodoRecibirListas(ArrayList<Persona> listaPersonas) {
		//queremos mostrar todos los datos de los objetos
		Persona p1 =listaPersonas.get(0);
		//System.out.println(p1.curso); Este mando a distancia no tiene curso
		//si queremos acceder a todos los metodos y atributos del objeto debemos
		//usar el mando a distancia del objeto para ellos 
		//aplicamos el casting que vimos en t1
		
		//Con el cating cambiamos una referencia de tipo
		Alumno a1 =(Alumno)p1;
		System.out.println(a1.curso);
		
		//Problema, java no sabe en tiempo de ejecucion a que objeto estas 
		//apuntando, por lo que queda a nuestra responsabilidad hacer el
		//"cating" bien
		
		//En este caso java te deja en tiempo de compilacion hacer un casting a una referencia de tipo docente
		//Lo que ocurre es que al ser un objeto tipo alumno, no podemos
		//usar una referencia de tipo "Docente" para apuntar, en este caso
		//dara una excepcion "ClassCastException"
		//Docente d1 = (Docente)p1;
		
		//Para saber la clase del objeto y evitar CLaSSCASTEXEPTION	
		//podemos usar la palabra "intance of"
		
		if(p1 instanceof Alumno) {
			//System.out.println(p1.curso);//NO
			Alumno a2 =(Alumno)p1;//Esto nunca me va a dar el error
			System.out.println(a2.curso);
		}
		
		//Dicho de otra manera, podemos reccorer el array preguntando de que tipo es cada objeto
		System.out.println("Entrando en forEach");
	
		for(Persona p : listaPersonas) {
			//mediante polimorfismo
			p.presentarse();
			if(p instanceof Alumno) {
				Alumno a = (Alumno)p;
				System.out.println(a.curso);
			}
			if(p instanceof Docente) {
				Docente d = (Docente)p;
				System.out.println(d.salario);
		}
		
		}
		
	}

}

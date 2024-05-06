package _06_abstraccciones;

import java.util.ArrayList;
import java.util.List;

public class MainZoologico {

	public static void main(String[] args) {
		//Animal animal = new Animal();
		//Pez pez = new Pez();
		Animal t = new Trucha();
		t.setNombre("Robustiana");
		t.setPeso(2.2);
		t.setSexo(Sexo.NO_BINARIO);
		t.setEdad(1);
		// normalmente cuando creamos un objeto usaremos
		//una referencia de su propio tipo, ya que si nno
		//debemos de hacer un casting
		//trucha.setNumeroAletas()
		Trucha trucha = (Trucha)t;
		trucha.setNumeroAletas(2);
		
		Cangrejo c = new Cangrejo();
		c.setNombre("Sebastian");
		c.setEdad(4);
		c.setNumeroAletas(0);
		c.setPeso(0.2);
		c.setSexo(Sexo.HERMAFRODITA);
		
		Leon l = new Leon();
		l.setNombre("Simba");
		l.setEdad(5);
		l.setPeso(180);
		l.setSexo(Sexo.MASCULINO);
		
		Tiburon tiburon = new Tiburon();
		tiburon.setNombre("Lorenzo");
		tiburon.setEdad(6);
		tiburon.setPeso(480);
		tiburon.setSexo(Sexo.FLUIDO);
		
		//Siempre mejor itilizar referencias interfaces
		//para apuntar a objetos
		List<Animal> listaAnimales = new ArrayList<>();
		listaAnimales.add(trucha);
		listaAnimales.add(c);
		listaAnimales.add(l);
		listaAnimales.add(tiburon);
		
		//Vamos a dar de comer a los animales mediante del polimorfismo
		Animal alimento1 = new Leon();
		alimento1.setPeso(1);
		alimento1.setNombre("comida");
		
		
		for(Animal animal : listaAnimales) {
			//aplicamos polimorfismo
			//cada objeto llamara su metodo comer
			animal.comer(alimento1);
			System.out.println("Mi nuevo peso :"+ animal.getPeso());
		}
		
		Alga alga = new Alga();
		alga.setPeso(0.8);
		listaAnimales.forEach(v ->{
			
			v.comer(alga);
		System.out.println("Mi nuevo peso : "+ v.getPeso());
		});
		//decimos al leonque se coma a si mismo
		System.out.println("----------------------------");
		l.comer(l);
		tiburon.comer(tiburon);
		System.out.println("Mi nuevo peso : "+ tiburon.getPeso());
		
		//Clases Anonimas
		//------------------------------
		//Son aquellas clases que se instancian a partir de una clase abstracta
		// o una interfaz. Se crean al mismo tiempo una clase que extiende de la clase abstracta
		//y el objeto
		
		//Este tipo de clases se utilizan cuando solo se va a crear un objeto de ese tipo de clase
		//Podemos crear la clase anonima, se crea a aprtir de la abstracta
		Animal pinguino = new Animal() {
			
			//Estamo creando una clase y un objeto al mismo tiempo y solo
			//se podra hacer esta vez y la clase no tiene nombre ( es anonima)
			@Override
			public void comer(Object o) {
				if(o instanceof Trucha) {
					System.out.println("me como la trucha");
				}else {
					System.out.println("solo como truchas");
				}
				//es una clase de usar y tirar
			}
		};
		listaAnimales.add(pinguino);
		for(Animal animal : listaAnimales) {
			//aplicamos polimorfismo
			//cada objeto llamara su metodo comer
			animal.comer(alimento1);
			System.out.println("Mi nuevo peso :"+ animal.getPeso());
		}
	}

}

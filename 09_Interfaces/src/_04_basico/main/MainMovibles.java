package _04_basico.main;

import java.util.ArrayList;
import java.util.List;

import _04_basico.animales.Animal;
import _04_basico.animales.Cangrejo;
import _04_basico.animales.Leon;
import _04_basico.animales.Sexo;
import _04_basico.animales.Tiburon;
import _04_basico.animales.Trucha;
import _04_basico.interfaz.Movible;
import _04_basico.vehiculos.Camion;
import _04_basico.vehiculos.Coche;
import _04_basico.vehiculos.Moto;
import _04_basico.vehiculos.VehiculoTerrestre;

public class MainMovibles {

	public static void main(String[] args) {
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
		
		VehiculoTerrestre vh1 = new Camion();
		vh1.setPeso(2500);
		
		VehiculoTerrestre vh2 = new Coche();
		vh2.setPeso(1000);
		
		VehiculoTerrestre vh3 = new Moto();
		vh3.setPeso(400);
		
		List<Movible> listaMovibles = new ArrayList<>();
		listaMovibles.add(trucha);
		listaMovibles.add(tiburon);
		listaMovibles.add(l);
		listaMovibles.add(c);
		listaMovibles.add(vh1);
		listaMovibles.add(vh2);
		listaMovibles.add(vh3);
		
		System.out.println("Movimiento lento a los objetos movibles");
		listaMovibles.forEach(v -> v.moverseLento());
		
		System.out.println("Movimiento rapido a los objetos movibles");
		//listaMovibles.forEach(v -> v.moverseRapido());
		//equivalente a:
		for(Movible m : listaMovibles) {
			m.moverseRapido();
		}
		
		//Las interfaces no se puede instanciar
		//Movible m1 = new Movible();NO
		
		//pero si podemos crear clases anonimas
		Movible m1 = new Movible() {
			//podemos cerar atributos,pero es muy dificil acceder a ellos desde fuera
			public int atrubuto1;
			//suponemos que objeto movible es un barco
			@Override
			public void moverseRapido() {
				System.out.println("soy un barco y me muevo a 345");
				
			}
			
			@Override
			public void moverseLento() {
				System.out.println("soy un barco y me muevo a 230");
				
			}
		};
		listaMovibles.add(m1);
	}

}

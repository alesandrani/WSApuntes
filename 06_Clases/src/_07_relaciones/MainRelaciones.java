package _07_relaciones;

public class MainRelaciones {
//import _06_cislodevida.Persona;
	public static void main(String[] args) {
		Persona p1 = new Persona();
		//Persona p06 = new Persona();
		//_03_metodos.Persona p03 = new _03_metodos.Persona();
		
		//p1.direccion ="calle orense 62 Madrid 28224";
		
		Persona p2 = new Persona();
		//p2.direccion = "orense 05789 plaza de españa 78";
		p1.nombre ="thor";
		//p1.direccion.cuidad= "Madrid";
		//System.out.println(p1.cuentasBancarias.length);//error en tiempo de ejecucion
		// los numeros que empiezan por 0 en java estan en base octal
		Direccion d1 = new Direccion();
		d1.cuidad = "Madrid";
		p1.direccion= d1;
		p1.direccion.cuidad= "Barcelona";
		System.out.println(d1.cuidad);
		cuentaBancaria[] arrayCb1 = new cuentaBancaria[2];
		p1.cuentasBancarias = arrayCb1;
		System.out.println(p1.cuentasBancarias.length);
		//System.out.println(p1.cuentasBancarias[0].iban); error null pointer
		cuentaBancaria cb1 = new cuentaBancaria();
		cb1.iban = "ES569368";
		p1.cuentasBancarias[0]= cb1;
		cb1.saldo = 5000;
		System.out.println(p1.cuentasBancarias[0].saldo);
		
		System.out.println(arrayCb1[0].saldo);
		
		cb1 = new cuentaBancaria();
		cb1.iban = "SZ676354";
		arrayCb1[1]=cb1;
		
		
		System.out.println(p1.cuentasBancarias[1].iban);
		System.out.println(p1.cuentasBancarias[0].iban);
		
		//p2=p1;
		//p2.direccion.cuidad = "New York";
		d1 = new Direccion();
		d1.cuidad = "new york";
		System.out.println(p1.direccion.cuidad);
		p2.direccion= new Direccion();
		System.out.println(p2.direccion.cuidad);
		
		
		//double cp= 0567;
		//int hexa = 0x123ABC;
		//int binario =0b101;
		//System.out.println(cp);
		p2.nombre= "Ironman";
		
		cuentaBancaria cb2 = new cuentaBancaria();
		cb2.iban = "PT56";
		//p2.cuentasBancarias = p1.cuentasBancarias;
		p2.cuentasBancarias = new cuentaBancaria[2];
		p2.cuentasBancarias[0]= cb2;
		
		cb2 = new cuentaBancaria();
		cb2.iban = "IT89";
		p2.cuentasBancarias[1] = cb2;
		System.out.println(p2.cuentasBancarias[1].iban);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}

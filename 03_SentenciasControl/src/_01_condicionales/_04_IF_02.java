package _01_condicionales;

public class _04_IF_02 {

	public static void main(String[] args) {
		//es muy habitual cuando trabajamos con sentencias de control
		//el ANIDAR bloques. se llama ANIDAR cuando ponemos sentencias de control ponemos  DENTRO sentencias de control
		
		// Ejemplo
		
		int numero1 = 5;
		int numero2 = 10;
		if(numero1 ==5) {
			System.out.println("el numero es igual"+ numero1);
			//puedo anidar para dar funcionalidad
			//es decir, poner un if dentro de otro if
			if(numero2==10) {
				System.out.println("el numero2 es igual a"+ numero2);
			}
		}

		//se podria hacer asi
		if(numero1 == 5 && numero2 == 10) {
			System.out.println("el numero1 es igual a "+ numero1);
			System.out.println("el numero2 es igual a "+ numero2 );
		}
			
		
	}

}

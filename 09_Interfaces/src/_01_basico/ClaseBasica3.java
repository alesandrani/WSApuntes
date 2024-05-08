package _01_basico;
/**
 * En java no se puede realizar herencias multiples entre clases
 * Pero una manera de implementar la herencia multiple en java es mediante interface
 * 
 * aunque una clase solo puede extender de una sola clase,
 * puede implementar n interface
 * 
 * De hecho puede extender de una clase y implementar en N clases
 */
public class ClaseBasica3 extends Object implements InterfaceBasica1, InterfaceBasica2 {

	@Override
	public void metodo4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodo5() {
		// TODO Auto-generated method stub
		
	}
	//no hay ningun problema pq este metodo este en dos intefaces
	//ya que en ninguno esta implementado
	@Override
	public void metodo1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String metodo2(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int operacion(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}

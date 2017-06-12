/**
 * 
 * @author Adolfo
 *
 */
public class Auto {

	private String _marca;
	private int _costo;

	public Auto(String marca, int costo) {
		_marca = marca;
		_costo = costo;
	}

	public void mostrar(){
		System.out.println("El auto introducido es:" + "Marca: "+_marca+" y Costo: "+_costo);
	}
	
	
}

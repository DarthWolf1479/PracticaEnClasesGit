/***
 * 
 * @author Mauricio
 *
 */
public class Motocicleta {

	public String marca;
	public String modelo;
	public int a�o;
	public double cilindrada;

	public void Motocicleta(String marca, String modelo, int a�o, double cilindrada) {
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
		this.cilindrada = cilindrada;
	}

	public String Mostrar() {
		String mostrar;
		mostrar = "Es una moto de marca " + marca + " modelo " + modelo
				+ " del a�o " + a�o + " de cilindrada " + cilindrada;
		return mostrar;
	}
}

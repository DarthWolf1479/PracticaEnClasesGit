/***
 * 
 * @author Mauricio
 *
 */
public class Motocicleta {

	public String marca;
	public String modelo;
	public int año;
	public double cilindrada;

	public void Motocicleta(String marca, String modelo, int año, double cilindrada) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.cilindrada = cilindrada;
	}

	public String Mostrar() {
		String mostrar;
		mostrar = "Es una moto de marca " + marca + " modelo " + modelo
				+ " del año " + año + " de cilindrada " + cilindrada;
		return mostrar;
	}
}

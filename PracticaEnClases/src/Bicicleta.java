
public class Bicicleta {

	public String a�o;
	public String color;
	public String tama�o;
	
	public Bicicleta(String a�o, String color, String tama�o){
		this.a�o=a�o;
		this.color=color;
		this.tama�o=tama�o;	
	}
	public String mostrar(){
		String mostrar;
		mostrar ="Es una bicicleta del a�o " + a�o + " de color "  + color + " y de tama�o " + tama�o;
		return mostrar;
	}
}


public class Bicicleta {

	public String año;
	public String color;
	public String tamaño;
	
	public Bicicleta(String año, String color, String tamaño){
		this.año=año;
		this.color=color;
		this.tamaño=tamaño;	
	}
	public String mostrar(){
		String mostrar;
		mostrar ="Es una bicicleta del año " + año + " de color "  + color + " y de tamaño " + tamaño;
		return mostrar;
	}
}

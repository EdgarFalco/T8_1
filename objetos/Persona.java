package objetos;

public class Persona {	
		
	//Atributos
	private String nombre = "";
	private int edat = 0;
	private char sexo ='H';
	private double peso = 0;
	private double altura = 0;
	
	//Contructores
	public Persona() {		
	}
	
	public Persona(String nombre, int edat, char sexo) {		
		this.nombre = nombre;
		this.edat = edat;
		this.sexo = sexo;
	}

	public Persona(String nombre, int edat, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edat = edat;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}	

	//toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edat=" + edat + ", sexo=" + sexo + ", peso=" + peso + ", altura="
				+ altura + "]";
	}	
}

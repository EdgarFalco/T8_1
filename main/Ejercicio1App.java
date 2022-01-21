package main;
import objetos.*;

public class Ejercicio1App {

	public static void main(String[] args) {
		//Cremos 3 objetos Persona
		
		//Usamos el contructor por defecto
		Persona persona1 = new Persona();
		//Usamos el contructor con 3 parametros
		Persona persona2 = new Persona("Luisa", 20, 'M');
		//Usams el contructor con todos los parametros
		Persona persona3 = new Persona("Raul", 30, 'H', 80.5, 1.90);		
		
		//Mostramos por pantalla los valores de los 3 objetos
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());
	}
}

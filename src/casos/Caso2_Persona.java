package casos;

public class Caso2_Persona {
	
	//ATRIBUTOS
	private String nombre;
	private int edad;
		
	//CONSTRUCTOR
	public Caso2_Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//METODO PARA MOSTRAR LOS DATOS
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre + " | Edad: " + edad + " años");
	}
	
	//MÉTODO PRINCIPAL
	public static void main(String[] args) {
		System.out.println("---REGISTRO PERSONAS---");
		//CREAMOS LOS OBJETOS
		Caso2_Persona persona1 = new Caso2_Persona("Leonel", 22);
		Caso2_Persona persona2 = new Caso2_Persona("Marcelo", 28);
		//LLAMAMOS AL MÉTODO
		persona1.mostrarDatos();
		persona2.mostrarDatos();
	}
}
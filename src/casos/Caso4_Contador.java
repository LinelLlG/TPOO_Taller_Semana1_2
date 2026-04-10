package casos;

public class Caso4_Contador {

	//VARIABLE STATIC DE LA CLASE
	private static int contador = 0;
	
	//CONSTRUCTOR
	public Caso4_Contador() {
		contador++;
	}
	
	//METODO PARA LEER EL CONTADOR
	public static int obtenerCantidad() {
		return contador;
	}
	
	public static void main(String[] args) {
		System.out.println("--- CANTIDAD DE OBJETOS CREADOS ---");
		System.out.println("Cantidad de objetos por el momento: " + Caso4_Contador.obtenerCantidad());
		//CREAMOS 1 OBJETO
		System.out.println("... Agregamos un objeto");
		Caso4_Contador objetos1 = new Caso4_Contador();
		System.out.println("Cantidad de objetos por el momento: " + Caso4_Contador.obtenerCantidad());
		//CREAMOS MÁS OBJETOS
		System.out.println("... Agregamos mas objetos");
		Caso4_Contador objetos2 = new Caso4_Contador();
		Caso4_Contador objetos3 = new Caso4_Contador();
		System.out.println("Cantidad de objetos en total: " + Caso4_Contador.obtenerCantidad());
	}

}

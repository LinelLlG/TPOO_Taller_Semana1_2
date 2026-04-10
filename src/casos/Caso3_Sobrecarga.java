package casos;

public class Caso3_Sobrecarga {
	
	//1ER MÉTODO
	public int sumar(int a, int b) {
		return a + b;
	}
	//2DO MÉTODO
	public double sumar(double a, double b) {
		return a + b;
	}
	
	//3ER MÉTODO
	public int sumar(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		System.out.println("--- SOBRECARGA DE MÉTODOS ---");
		
		//INSTANCIAMOS UN OBJETO DE LA CLASE
		Caso3_Sobrecarga sobrecarga = new Caso3_Sobrecarga();
		
		//1ERA PRUEBA ENTEROS
		int resultado1 = sobrecarga.sumar(10, 5);
		System.out.println("La suma es: " + resultado1);
		
		//2DA PRUEBA DECIMALES
		double resultado2 = sobrecarga.sumar(10.5, 5.5);
		System.out.println("La suma es: " + resultado2);
		
		//3ERA PRUEBA 3 ENTEROS
		int resultado3 = sobrecarga.sumar(10, 5, 2);
		System.out.println("La suma es: " + resultado3);
	}

}

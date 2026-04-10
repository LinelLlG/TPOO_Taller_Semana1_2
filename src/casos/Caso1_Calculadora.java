package casos;

import java.util.Scanner;

public class Caso1_Calculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("---CALCULADORA---");
		
		//INGRESAMOS LOS NUMEROS
		System.out.print("Ingresa el primer número: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Ingresa el segundo número: ");
		double num2 = entrada.nextDouble();
		
		//MENÚ PARA OPERACIONES
		System.out.print("\nElige una operación: ");
		System.out.print("\n1. Suma");
		System.out.print("\n2. Resta");
		System.out.print("\n3. Multiplicación");
		System.out.print("\n4. División");
		System.out.print("\nOpción(1-4): ");
		
		int opcion = entrada.nextInt();
		
		double resultado = 0;
		boolean operacionValida = true;
		
		//USAMOS SWITCH
		switch(opcion) {
		case 1:
			resultado = sumar(num1, num2);
			break;
		case 2:
			resultado = restar(num1, num2);
			break;
		case 3:
			resultado = multiplicar(num1, num2);
			break;
		case 4:
			if(num2 == 0) {
				System.out.println("Cuidado: No se puede dividir entre 0");
				operacionValida = false;
			}else {
				resultado = dividir(num1, num2);
			}
			break;
		}
		
		//MOSTRAMOS EL RESULTADO
		if(operacionValida) {
			System.out.println("\nEl resultado es: "+ resultado);
		}
		
		entrada.close();
		
	}
	
	//MÉTODOS PARA LA CALCULADORA
	public static double sumar(double a, double b) {
		return a + b;
	}
	public static double restar(double a, double b) {
		return a - b;
	}
	public static double multiplicar(double a, double b) {
		return a * b;
	}
	public static double dividir(double a, double b) {
		return a / b;
	}

}

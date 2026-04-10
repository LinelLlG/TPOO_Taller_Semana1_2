package casos;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Caso5_ListaEstudiantes {
	
	static class Estudiante{
		
		private String nombre;
		
		public Estudiante(String nombre) {
			this.nombre = nombre;
		}
		
		public String obtenerDatos() {
			return this.nombre;
		}
	
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
		
		System.out.println("--- REGISTRO DE ESTUDIANTES ---");
		System.out.println("Escribe 'registrar' para ingresar a los alumnos\n");
		
		//BUCLE
		while(true) {
			try {
				System.out.println("Ingrese el nombre del alumno o escribra registrar: ");
				String nombre = entrada.nextLine();
				
				//CONDICION PARA ROMPER EL BUCLE
				if(nombre.equalsIgnoreCase("registrar")) {
					break;
				}
				
				//DATOS INVALIDOS
				if(nombre.trim().isEmpty()) {
					System.out.println("ERROR: El nombre no puede estar vacío\n");
					continue;
				}
				
				//CREAMOS EL OBJETO
				Estudiante nuevoEstudiante = new Estudiante(nombre);
				listaEstudiantes.add(nuevoEstudiante);
			}catch (InputMismatchException e) {
				System.out.println("Hubo un error en el registro...");
				entrada.nextLine();
			}
		}
		
		System.out.println("\n--- LISTA DE ESTUDIANTES ---");
        
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No se registró ningún estudiante.");
        } else {
            for (int i = 0; i < listaEstudiantes.size(); i++) {
                Estudiante est = listaEstudiantes.get(i);
                System.out.println((i + 1) + ". " + est.obtenerDatos());
            }
        }
        
        System.out.println("----------------------------------");
        System.out.println("Registro completado!");
        
        entrada.close();
	}

}

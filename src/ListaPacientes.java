import java.util.ArrayList;
import java.util.Scanner;

public class ListaPacientes {

	ArrayList<Pacientes> arrayPacientes;
	static int idPacientes;

	public void eliminarPacienteAPartirDeCodigo(ArrayList<Pacientes> arrayPacientes) {
		String nombre;
		String apellidos;
		String respuesta = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del Paciente que quieres eliminar");
		nombre = sc.nextLine();
		System.out.println("Introduce los apellidos del Paciente que quieres eliminar");
		apellidos = sc.nextLine();
		System.out.println("El paciente  " + nombre + "  " + apellidos + " va a ser eliminado. Estas seguro?");
		respuesta = sc.nextLine();

		if (respuesta.equalsIgnoreCase("si")) {
			
			for (int i = 0; i < arrayPacientes.size(); i++) {
				
				if (nombre.equalsIgnoreCase(arrayPacientes.get(i).getNombrePaciente())
						&& (apellidos.equalsIgnoreCase(arrayPacientes.get(i).getApellidosPaciente()))) {
					arrayPacientes.remove(i);

					System.out.println("Se ha eliminado correctamente");

				} else {
					System.out.println("El paciente no existe");
				}
			}
		} else {

			System.out.println("Vale, no se elminará");
		}
	}

	public ListaPacientes() {
		arrayPacientes = new ArrayList<Pacientes>();
		idPacientes = 0;
	}

	public void anyadePaciente() {
		Pacientes i = new Pacientes(this.idPacientes++);
		arrayPacientes.add(i);
	}
}
